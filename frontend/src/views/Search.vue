<template>
    <div class="notfoud-container round tg">
        <div class="img-404">
        </div>
        <p class="notfound-p">404 Not Found.</p>
        <div class="notfound-reason">
            此页面正在制作中，敬请期待
        </div>
    </div>
</template>

<script>
    export default {
        name: "Search"
    }
</script>

<style scoped>
    a {
        text-decoration: none
    }

    .notfoud-container .img-404 {
        height: 155px;
        background: url(../assets/jump.gif) center center no-repeat;
        -webkit-background-size: 150px auto;
        margin-top: 40px;
        margin-bottom: 20px;
        padding-top: 20px;
    }

    .notfoud-container .notfound-p {
        line-height: 22px;
        font-size: 17px;
        padding-bottom: 15px;
        border-bottom: 1px solid #f6f6f6;
        text-align: center;
        color: #262b31
    }

    .notfoud-container .notfound-reason {
        color: #9ca4ac;
        font-size: 13px;
        line-height: 13px;
        text-align: center;
        width: 210px;
        margin: 0 auto;
        padding-bottom: 20px;
    }

    .notfoud-container .notfound-reason p {
        margin-top: 13px
    }
</style>
