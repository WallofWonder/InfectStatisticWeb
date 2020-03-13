<template>
    <div class="round tg">
        <el-row>
            <div id="myChart" :style="{width:'auto',height:'483px'}"></div>
        </el-row>
        <el-row>
            <div align="center" class="bg">
                <el-button @click="getData(currentUrl)">新增确诊趋势</el-button>
                <el-button @click="getData(confirmedUrl)">累计确诊趋势</el-button>
                <el-button @click="getData(cureddeadUrl)">累计治愈/死亡</el-button>
            </div>
        </el-row>
    </div>
</template>

<script>
    export default {
        name: 'echart',
        data () {
            return {
                mydata: [],
                myChart: '',
                option: '',
                legend:[],
                xdata:[],
                series:[],
                currentUrl: 'http://localhost:8888/statistics/provinces/one/tends/'+encodeURI(encodeURI(this.province))+'/confirmedincr',
                confirmedUrl: 'http://localhost:8888/statistics/provinces/one/tends/'+encodeURI(encodeURI(this.province))+'/confirmed',
                cureddeadUrl: 'http://localhost:8888/statistics/provinces/one/tends/'+encodeURI(encodeURI(this.province))+'/cureddead'
            }
        },
        props: ['province'],
        mounted () {
            this.drawLine()
            this.getData(this.currentUrl)
        },
        methods: {
            getData (url) {
                let that = this
                this.axios.get(url)
                    .then(function (response) {
                        let datas = response.data
                        for(var i=0;i<datas.dates.length;++i){
                            that.xdata.push(datas.dates[i])
                        }
                        let sseries =response.data.series
                        for(var j=0;j<sseries.length;++j){
                            that.legend.push(sseries[j].name)
                            that.series.push({
                                name: sseries[j].name,
                                data: sseries[j].data,
                                type: 'line',
                                smooth: true
                            })
                        }
                        that.drawLine()
                        that.myChart.setOption(that.option)
                        that.myChart.hideLoading()
                    }, function (err) {
                        console.log(err)
                    }).finally(function () {
                        //清空原有数据，防止再次渲染图表时数据堆叠
                        that.xdata=[]
                        that.legend=[]
                        that.series=[]
                })
            },
            drawLine () {
                let that = this
                // 基于准备好的dom，初始化echarts实例
                that.myChart = this.$echarts.init(document.getElementById('myChart'))
                //销毁原有图表，防止数据残留污染画布
                that.myChart.dispose()
                that.myChart = this.$echarts.init(document.getElementById('myChart'))
                that.myChart.showLoading()
                // 设置相关参数
                that.option = {
                    // backgroundColor: 'aliceblue',
                    legend: {
                        data: that.legend
                    },
                    tooltip: {
                        trigger: 'axis'
                    },
                    xAxis: {
                        type: 'category',
                        data: that.xdata,
                        axisTick:{
                            interval:0
                        }
                    },
                    yAxis: {
                        type: 'value',
                    },
                    series: that.series
            }
            }
        }
    }
</script>

<style scoped>
    .bg {
        margin-bottom: 20px;
    }
</style>
