<template>
    <div>
        <echart></echart>
        <button @click="showMes">测试是否收到数据</button>
    </div>
</template>

<script>
    import echart from "../components/Echart";
    export default {
        name: "Province",
        components: { echart },
        methods: {
            showMes () {
                console.log(this.$route.query.name)
            }
        }
    }
</script>

<style scoped>

</style>
