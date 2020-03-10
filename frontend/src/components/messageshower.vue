<template>
    <div>
        <el-col :span="8">
            <div align="center" class="Title">{{title}}</div>
            <div align="center" class="Sum" :style="styles">{{sum}}</div>
            <div align="center">{{"昨日" + changenum}}</div>
        </el-col>
    </div>
</template>

<script>
    export default {
        name: "messageshower",
        props: ['title', 'sum', 'changenum', 'styles']
    }
</script>

<style scoped>
    div {
       padding: 2px;
    }
    .Title {
        font-size: 24px;
    }
    .Sum {
        font-size: 32px;
    }
</style>
