<template>
    <div>
        <el-row>
            <el-col  :offset="10" class="tg">
                <el-button @click="getData('http://localhost:8888//statistics/provinces/currentconfirmed')">现有确诊</el-button>
                <el-button @click="getData('http://localhost:8888//statistics/provinces/confirmed')">累计确诊</el-button>
            </el-col>
            <el-col :offset="4">
                <div id="myChart" :style="{width:'1280px',height:'960px'}"></div>
            </el-col>
        </el-row>
    </div>
</template>

<script>
    export default {
        name: "Map",
        data () {
            return {
                mydata: [],
                myChart: '',
                option: ''
            }
        },
        props: ['data'],
        mounted () {
            this.drawLine()
            this.getData('http://localhost:8888//statistics/provinces/currentconfirmed')
        },
        methods: {
            getData (url) {
                let that = this
                this.axios.get(url)
                    .then(function (response) {
                        let datas = response.data.provinces
                        for(var i=0;i<datas.length;++i){
                            that.mydata.push({
                                name: datas[i].name,
                                value: datas[i].value
                            })
                        }
                        //重要步骤，再次初始化option以刷新数据
                        that.drawLine()
                        that.myChart.setOption(that.option)
                    }, function (err) {
                        console.log(err)
                    }).finally(function () {
                        //清空原有数据
                    that.mydata=[]
                })
            },
            drawLine () {
                let that = this
                // 基于准备好的dom，初始化echarts实例
                that.myChart = this.$echarts.init(document.getElementById('myChart'))
                // that.myChart.off('click')
                // 设置相关参数
                that.option = {
                    backgroundColor: 'transparent',
                    dataRange: {
                        x: 'left',
                        y: '70%',
                        splitList: [
                            {start: 10000},
                            {start: 1000, end: 9999},
                            {start: 100, end: 999},
                            {start: 10, end: 99},
                            {start: 1, end: 9},
                            {start: 0, end: 0},
                        ],
                        color: ['#660208', '#8c0d0d', '#cc2929', '#ff7c80', '#ffaa85', '#d9d9d9']
                    },
                    tooltip:{
                        trigger:'item',
                        formatter: '{b}<br/>{c} 个'
                    },
                    series: [{
                        x:'center',
                        y:'top',
                        type: 'map',
                        map: 'china',
                        // roam: true,
                        label: {
                            normal: {
                                position: 'inside',
                                show: true,
                                fontsize: '10',
                                color: 'rgba(0,0,0,0.7)'
                            }
                        },
                        data: that.mydata
                    }]
                }
            },
        }
    }
</script>

<style scoped>
    .tg {
        padding-top: 30px;
    }
</style>
