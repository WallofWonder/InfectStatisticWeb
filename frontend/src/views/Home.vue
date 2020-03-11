<template>
    <div id="bg">
        <el-row :gutter="80">
            <el-col :span="6" v-for="(item,index) in titles" :key="index">
                <div class="grid-content" :class="active==index?'bg-lightgreen':'bg-white'" align="center" @click="active=index">{{item}}</div>
            </el-col>
        </el-row>
        <div align="center">{{"更新至"+time}}</div>
        <div>
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
    import messageshower from "../components/messageshower";
    import Map from "../components/Map";

    export default {
        name: "Home",
        components: { messageshower,Map },
        data () {
            return {
                titles: ['疫情地图', '疫情新闻', '同程查询', '谣言鉴别'],
                active: 0,
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
    .messages {
        min-height: 360px;
    }
    .el-col {
        border-radius: 4px;
    }
    .bg-white {
        background: white;
    }
    .bg-lightgreen {
        background: #42B983;
    }

    .grid-content {
        border-radius: 4px;
        min-height: 36px;
    }
</style>
