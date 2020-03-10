<template>
    <div id="myChart" :style="{width:'1280px',height:'720px'}"></div>
</template>

<script>
    export default {
        name: 'Echarts',
        data () {
            return {
                msg: 'My first Echart',
                mydata: []
            }
        },
        mounted () {
            this.drawLine()
        },

        methods: {
            // getData () {
            //     let that = this
            //     this.axios.get('http://localhost:8888//statistics/provinces/confirmed')
            //         .then(function (response) {
            //             // return response.data.provinces
            //             console.log(response.data.provinces)
            //             let datas = response.data.provinces
            //             for(var i=0;i<datas;++i){
            //                 that.mydata.push({
            //                     name: datas[i].name,
            //                     value: datas[i].value
            //                 })
            //             }
            //         }, function (err) {
            //             console.log(err)
            //         })
            // },
            // convertData (data) {
            //     let res = []
            //     for(var i=0;i<data.length;++i){
            //         res.push({
            //             name: data[i].name,
            //             value: data[i].value
            //         })
            //     }
            //     return res
            // },
            drawLine () {
                let that = this
                // 基于准备好的dom，初始化echarts实例
                const myChart = this.$echarts.init(document.getElementById('myChart'))
                // 设置相关参数

                function getData() {
                    that.axios.get('http://localhost:8888//statistics/provinces/confirmed')
                        .then(function (response) {
                            // return response.data.provinces
                            // console.log(response.data.provinces)
                            let datas = response.data.provinces
                            for(var i=0;i<datas.length;++i){
                                that.mydata.push({
                                    name: datas[i].name,
                                    value: datas[i].value
                                })
                            }
                            console.log(that.mydata)
                            myChart.setOption(option)
                        }, function (err) {
                            console.log(err)
                        })
                }


                var option = {
                    backgroundColor: 'transparent',
                    visualMap: {
                        show: true,
                        min: 0,
                        max: 100,
                        text: ['High', 'Low'],
                        calculable: true,
                        inRange: {
                            // colorLightness: [0, 1]
                            color: ['lightskyblue', 'yellow', 'orangered']
                        }
                    },
                    title: {
                        text: '中国地图',
                        x: 'center',
                        textStyle: {
                            fontSize:24
                        }
                    },
                    tooltip:{
                        trigger:'item',
                        formatter: '{b}<br/>{c} 个'
                    },
                    series: [{
                        type: 'map',
                        map: 'china',
                        roam: true,
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
                // console.log(option.series.data)
                // 绘制图表
                getData()
            }
        }
    }
</script>

<style scoped>

</style>
