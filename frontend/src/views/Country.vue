<template>
    <div>
        <div align="center">{{"数据更新至"+time}}</div>
        <div class="round">
            <el-row  class="messages">
                <messageshower  v-for="(item,index) in message" :key="index" :title="item.title" :sum="item.num" :changenum="item.changenum" :styles="Styles[index]" :span="8">
                </messageshower>
            </el-row>
        </div>
        <Map></Map>
    </div>
</template>

<script>
    import messageshower from "../components/Messageshower";
    import Map from "../components/Map";

    export default {
        name: "Country",
        components: { messageshower,Map },
        data () {
            return {
                time:'',
                message: [
                    { title: '现有确诊', num: '', changenum: ''},
                    { title: '现有疑似', num: '', changenum: ''},
                    { title: '现有重症', num: '', changenum: ''},
                    { title: '累计确诊', num: '', changenum: ''},
                    { title: '累计治愈', num: '', changenum: ''},
                    { title: '累计死亡', num: '', changenum: ''}
                ],
                Styles: [
                    { color: '#ff6a57' },
                    { color: '#ed9620' },
                    { color: '#476da0' },
                    { color: '#e83132' },
                    { color: '#20b3ba' },
                    { color: '#101010' },
                ]
            }
        },
        created() {
            this.getData('http://localhost:8888/nations/all')
        },
        methods: {
            getData (url) {
                let that = this
                this.axios.get(url)
                    .then(function (response) {
                        let datas=response.data
                        that.time=datas.modifytime
                        that.message[0].num=datas.currentconfirmedcount
                        that.message[0].changenum=datas.currentconfirmedincr
                        that.message[1].num=datas.suspectedcount
                        that.message[1].changenum=datas.suspectedincr
                        that.message[2].num=datas.seriouscount
                        that.message[2].changenum=datas.seriousincr
                        that.message[3].num=datas.confirmedcount
                        that.message[3].changenum=datas.confirmedincr
                        that.message[4].num=datas.curedcount
                        that.message[4].changenumnum=datas.curedincr
                        that.message[5].num=datas.deadcount
                        that.message[5].changenum=datas.deadincr
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
</style>
