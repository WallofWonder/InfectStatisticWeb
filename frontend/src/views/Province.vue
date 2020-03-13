<template>
    <div>
        <div class="P">{{province}}</div>
        <div class="round">
            <el-row>
                <messageshower  v-for="(item,index) in message" :key="index" :title="item.title" :sum="item.num" :changenum="item.changenum" :styles="Styles[index]" :span="6">
                </messageshower>
            </el-row>
        </div>
        <div align="center" class="tg">
            <echart :province="province"></echart>
        </div>
        <div align="center" class="tg">
            <Table :province="province"></Table>
        </div>
    </div>
</template>

<script>
    import echart from "../components/Echart";
    import messageshower from "../components/Messageshower";
    import Table from "../components/Table";
    export default {
        name: "Province",
        components: { echart,messageshower,Table },
        data () {
            return {
                message: [
                    { title: '现有确诊', num: '', changenum: ''},
                    { title: '累计确诊', num: '', changenum: ''},
                    { title: '累计治愈', num: '', changenum: ''},
                    { title: '累计死亡', num: '', changenum: ''}
                ],
                Styles: [
                    { color: '#ff6a57' },
                    { color: '#e83132' },
                    { color: '#20b3ba' },
                    { color: '#101010' },
                ],
                province: this.$route.query.name
            }
        },
        created() {
            this.getData('http://localhost:8888/statistics/provinces/one/')
        },
        methods: {
            getData (url) {
                let that = this
                this.axios.get(url + encodeURI(encodeURI(that.$route.query.name)))
                    .then(function (response) {
                        let datas=response.data
                        that.message[0].num=datas.currentConfirmedCount
                        that.message[0].changenum=datas.currentconfirmedincr
                        that.message[1].num=datas.confirmedCount
                        that.message[1].changenum=datas.confirmedincr
                        that.message[2].num=datas.curedCount
                        that.message[2].changenum=datas.curedincr
                        that.message[3].num=datas.deadCount
                        that.message[3].changenum=datas.deadincr
                        for(var i=0;i<that.message.length;++i){
                            if(that.message[i].changenum>0){
                                that.message[i].changenum='+'+that.message[i].changenum
                            }
                        }
                    }, function (err) {
                        console.log(err)
                    })
            }
        }
    }
</script>

<style scoped>
    .round {
        border-radius: 20px;
        background: aliceblue;
    }
    .tg {
        margin-top: 20px;
    }
    .P {
        font-size: 32px;
        margin-left: 5%;
    }
</style>
