import Vue from 'vue'
import VueRouter from 'vue-router'
import Echarts from '../views/Echarts.vue'
import dataTest from "../views/dataTest"
import Home from "../views/Home";

Vue.use(VueRouter)

const routes = [
  // {
  //   path: '/',
  //   name: 'Login',
  //   component: Login
  // },
  // {
  //   path: '/home',
  //   name: 'Home',
  //   component: Home,
  //   children: [
  //     {
  //       path: 'list',
  //       name: 'list',
  //       component: () => import(/* webpackChunkName: "list" */ '../views/List.vue')
  //     },
  //     {
  //       path: 'user',
  //       name: 'user',
  //       component: () => import(/* webpackChunkName: "user" */ '../views/User.vue')
  //     }
  //   ]
  // },
  {
    path: '/',
    name: 'home',
    component: Home
  },
  {
    path: '/dataTest',
    name: 'dataTest',
    component: dataTest
  },
  {
    path: '/',
    name: 'Echarts',
    component: Echarts
  }

  // {
  //   //   path: '/about',
  //   //   name: 'About',
  //   //   // route level code-splitting
  //   //   // this generates a separate chunk (about.[hash].js) for this route
  //   //   // which is lazy-loaded when the route is visited.
  //   //   component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  //   // }
]

const router = new VueRouter({
  routes,
  linkActiveClass: 'active'
})

export default router
