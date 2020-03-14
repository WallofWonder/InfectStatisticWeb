<template>
    <div id="mb">
        <el-row :gutter="20">
            <el-col :span="6" v-for="(item,index) in titles" :key="index">
                <div class="grid-content" :class="active==index?'bg-lightgreen':'bg-white'" align="center" @click="changeActive(index)">
                    <router-link :to="paths[index]">{{item}}</router-link>
                </div>
            </el-col>
        </el-row>
        <router-view></router-view>
    </div>
</template>

<script>
    import store from '@/store'
    export default {
        name: "Home",
        store,
        data () {
            return {
                titles: ['疫情地图', '疫情新闻', '同程查询', '谣言鉴别'],
                paths:['/','/news','/search','/identify'],
            }
        },
        computed: {
            active () {
                return store.state.active
            }
        },
        methods: {
            changeActive (index) {
                store.commit('changeActive',index)
                this.$router.push({path:this.paths[index]})
            }
        },
        created(){
            //在页面加载时读取sessionStorage里的状态信息
            if (sessionStorage.getItem("store") ) {
                this.$store.replaceState(Object.assign({}, this.$store.state,JSON.parse(sessionStorage.getItem("store"))))
            }

            //在页面刷新时将vuex里的信息保存到sessionStorage里
            window.addEventListener("beforeunload",()=>{
                sessionStorage.setItem("store",JSON.stringify(this.$store.state))
            })
        },
    }
</script>

<style scoped>
    messages {
        min-height: 360px;
    }
    el-col {
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
        vertical-align: middle;
    }
    .grid-content {
        border-radius: 4px;
        min-height: 36px;
    }
    #mb {
        width: 40%;
        margin: 0 auto;
    }
</style>
