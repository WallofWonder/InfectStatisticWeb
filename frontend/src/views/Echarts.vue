<template>
    <div id="myChart" :style="{width:'1280px',height:'720px'}"></div>
</template>

<script>
    export default {
        name: 'Echarts',
        data () {
            return {
                msg: 'My first Echart'
            }
        },
        mounted () {
            this.drawLine()
        },

        methods: {
            drawLine () {
                // 基于准备好的dom，初始化echarts实例
                const myChart = this.$echarts.init(document.getElementById('myChart'))
                // 设置相关参数
                function randomData() {
                    return Math.round(Math.random()*100)
                }

                var mydata = [
                    {name: '福建',value: randomData() }, {name: '天津',value: randomData() },
                    {name: '上海',value: randomData() },{name: '重庆',value: randomData() },
                    {name: '河北',value: randomData() },{name: '河南',value: randomData() },
                    {name: '云南',value: randomData() },{name: '辽宁',value: randomData() },
                    {name: '黑龙江',value: randomData() },{name: '湖南',value: randomData() },
                    {name: '安徽',value: randomData() },{name: '山东',value: randomData() },
                    {name: '新疆',value: randomData() },{name: '江苏',value: randomData() },
                    {name: '浙江',value: randomData() },{name: '江西',value: randomData() },
                    {name: '湖北',value: randomData() },{name: '广西',value: randomData() },
                    {name: '甘肃',value: randomData() },{name: '山西',value: randomData() },
                    {name: '内蒙古',value: randomData() },{name: '陕西',value: randomData() },
                    {name: '吉林',value: randomData() }, {name: '北京',value: randomData() },
                    {name: '贵州',value: randomData() },{name: '广东',value: randomData() },
                    {name: '青海',value: randomData() },{name: '西藏',value: randomData() },
                    {name: '四川',value: randomData() },{name: '宁夏',value: randomData() },
                    {name: '海南',value: randomData() },{name: '台湾',value: randomData() },
                    {name: '香港',value: randomData() },{name: '澳门',value: randomData() }
                ]

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
                        data: mydata
                    }]
                }
                // 绘制图表
                myChart.setOption(option)
            }
        }
    }
</script>

<style scoped>

</style>
