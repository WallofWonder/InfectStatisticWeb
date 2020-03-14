import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from "../views/Home"

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    redirect: 'country',
    name: 'Home',
    component: Home,
    children: [
      {
        path: 'country',
        name: 'country',
        component: () => import(/* webpackChunkName: "country" */ '../views/Country.vue')
      },
      {
        path: 'province',
        name: 'province',
        component: () => import(/* webpackChunkName: "province" */ '../views/Province.vue')
      },
      {
        path: 'news',
        name: 'news',
        component: () => import(/* webpackChunkName: "news" */ '../views/News.vue')
      },
      {
        path: 'search',
        name: 'search',
        component: () => import(/* webpackChunkName: "search" */ '../views/Search.vue')
      },
      {
        path: 'identify',
        name: 'identify',
        component: () => import(/* webpackChunkName: "identify" */ '../views/Identify.vue')
      }
    ]
  }
]

const router = new VueRouter({
  routes,
  linkActiveClass: 'active'
})

export default router
