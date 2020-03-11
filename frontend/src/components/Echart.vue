<template>
    <div id="myChart" :style="{width:'1280px',height:'720px'}"></div>
</template>

<script>
    export default {
        name: 'echart',
        data () {
            return {
                mydata: [],
                myChart: '',
                option: ''
            }
        },
        mounted () {
            this.drawLine()
            // this.getData()
        },

        methods: {
            // getData () {
            //     let that = this
            //     this.axios.get('http://localhost:8888//statistics/provinces/confirmed')
            //         .then(function (response) {
            //             // return response.data.provinces
            //             // console.log(response.data.provinces)
            //             let datas = response.data.provinces
            //             for(var i=0;i<datas.length;++i){
            //                 that.mydata.push({
            //                     name: datas[i].name,
            //                     value: datas[i].value
            //                 })
            //             }
            //             that.myChart.setOption(that.option)
            //         }, function (err) {
            //             console.log(err)
            //         })
            // },
            drawLine () {
                let that = this
                // 基于准备好的dom，初始化echarts实例
                that.myChart = this.$echarts.init(document.getElementById('myChart'))
                // 设置相关参数
                that.option = {
                    backgroundColor: 'transparent',
                    xAxis: {
                        type: 'category',
                        data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
                    },
                    yAxis: {
                        type: 'value'
                    },
                    series: [{
                        data: [820, 932, 901, 934, 1290, 1330, 1320],
                        type: 'line',
                        smooth: true
                    }]
            }
            that.myChart.setOption(that.option)
            }
        }
    }
</script>

<style scoped>

</style>
