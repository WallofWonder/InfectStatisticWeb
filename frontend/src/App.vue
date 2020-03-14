<template>
  <div id="app">
      <router-view/>
    </div>
</template>

<script>

export default {
  name: 'App'
}
</script>

<style lang="scss">
    body {
        background: aliceblue;
    }
* {
    padding: 0;
    margin: 0;
}
.round {
    border-radius: 20px;
    background: white;
    /*#E5E5E5*/
}
.tg {
    margin-top: 30px;
}
</style>
