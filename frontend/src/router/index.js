import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from "../views/Home"

Vue.use(VueRouter)

const routes = [
  // {
  //   path: '/',
  //   name: 'Login',
  //   component: Login
  // },
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
      }
    ]
  }
  // {
  //   path: '/',
  //   name: 'home',
  //   component: Home
  // },

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
