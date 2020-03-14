import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    active: 0
  },
  mutations: {
    changeActive (state, value) {
      state.active=value
    }
  },
  actions: {
  },
  modules: {
  }
})
