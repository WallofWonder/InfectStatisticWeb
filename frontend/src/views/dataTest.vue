<template>
    <button @click="getData">获取数据</button>
</template>

<script>
    export default {
        name: "dataTest",
        methods: {
            getData () {
                // let that = this
                this.axios.get('http://localhost:8888//statistics/provinces/confirmed')
                    .then(function (response) {
                        console.log(response)
                    }, function (err) {
                        console.log(err)
                    })
            }
        }
    }
</script>

<style scoped>

</style>
