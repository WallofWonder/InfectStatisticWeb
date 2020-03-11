<template>
    <div id="bg">
        <el-row :gutter="80">
            <el-col :span="6" v-for="(item,index) in titles" :key="index">
                <div class="grid-content" :class="active==index?'bg-lightgreen':'bg-white'" align="center" @click="active=index">
                    <router-link to="/">{{item}}</router-link>
                </div>
            </el-col>
        </el-row>
        <router-view></router-view>
    </div>
</template>

<script>
    export default {
        name: "Home",
        data () {
            return {
                titles: ['疫情地图', '疫情新闻', '同程查询', '谣言鉴别'],
                active: 0,
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
    a {
        text-decoration: none;
        color: black;
    }
    .grid-content {
        border-radius: 4px;
        min-height: 36px;
    }
</style>
