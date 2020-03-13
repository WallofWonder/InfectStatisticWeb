<template>
    <div>
        <el-table
                :data="tableData"
                style="width: 100%"
                :header-cell-style="{ background:'#eef1f6',color:'#606266' }" >
            <el-table-column
                    prop="cityname"
                    label="城市"
                    width="120">
            </el-table-column>
            <el-table-column
                    prop="currentconfirmedcount"
                    label="新增感染"
                    width="120">
            </el-table-column>
            <el-table-column
                    prop="confirmedcount"
                    label="累计感染"
                    width="120">
            </el-table-column>
            <el-table-column
                    prop="curedcount"
                    label="累计治愈"
                    width="120">
            </el-table-column>
            <el-table-column
                    prop="deadcount"
                    label="累计死亡"
                    width="120">
            </el-table-column>
        </el-table>
    </div>
</template>

<script>
    export default {
        name: "Table",
        props:['province'],
        data () {
            return {
                tableData: []
            }
        },
        mounted () {
            this.getData('http://localhost:8888/cities/list/')
        },
        methods: {
            getData (url) {
                let that = this
                this.axios.get(url+encodeURI(encodeURI(that.province)))
                    .then(function (response) {
                        let datas = response.data
                        console.log(datas)
                        for(var i=0;i<datas.length;++i){
                            that.tableData.push({
                                cityname: datas[i].cityname,
                                currentconfirmedcount: datas[i].currentconfirmedcount,
                                confirmedcount: datas[i].confirmedcount,
                                curedcount: datas[i].curedcount,
                                deadcount: datas[i].deadcount
                            })
                        }
                    }, function (err) {
                        console.log(err)
                    }).finally(function () {
                })
            }
        }
    }
</script>

<style scoped>

</style>
