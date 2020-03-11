<template>
    <div>
        <div align="center">{{"更新至"+time}}</div>
        <div class="round">
            <el-row  class="messages">
                <messageshower  v-for="(item,index) in message" :key="index" :title="item.title" :sum="item.num" :changenum="item.changenum" :styles="Styles[index]">
                </messageshower>
            </el-row>
        </div>
        <div>
        <Map></Map>
        </div>
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
                    { title: '现有确诊', num: 10, changenum: 5},
                    { title: '现有疑似', num: 10, changenum: 5},
                    { title: '现有重症', num: 10, changenum: 5},
                    { title: '累计确诊', num: 10, changenum: 5},
                    { title: '累计治愈', num: 10, changenum: 5},
                    { title: '累计死亡', num: 10, changenum: 5}
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
        }
    }
</script>

<style scoped>
    .round {
        border-radius: 20px;
        background: aliceblue;
    }
</style>
