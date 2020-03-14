import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import axios from 'axios'
import echarts from 'echarts'
import { Button,Row,Col,Table,TableColumn } from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css';
import '../node_modules/echarts/map/js/china.js' // 引入中国地图数据

Vue.use(Button)
Vue.use(Row)
Vue.use(Col)
Vue.use(Table)
Vue.use(TableColumn)

Vue.prototype.$echarts = echarts
Vue.prototype.axios = axios
Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App),
}).$mount('#app')
