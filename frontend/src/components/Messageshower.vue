<template>
    <div>
        <el-col :span="span">
            <div align="center" class="Title sp">{{title}}</div>
            <div align="center" class="Sum sp" :style="styles">{{sum}}</div>
            <div align="center" class="sp">昨日<span :style="styles">{{changenum}}</span></div>
        </el-col>
    </div>
</template>

<script>
    export default {
        name: "messageshower",
        props: ['title', 'sum', 'changenum', 'styles', 'time', 'span']
    }
</script>

<style scoped>
    .sp {
       padding: 16px;
        /*background: chartreuse;*/
    }
    .Title {
        font-size: 24px;
    }
    .Sum {
        font-size: 32px;
    }
</style>
