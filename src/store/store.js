import Vue from 'vue'
import Vuex from 'vuex'
import actions from './actions'
import mutations from './mutations'
Vue.use(Vuex)
const state = {
 a: '初始值',
 b: 'balabala...'
}
export default new Vuex.Store({
  state,
  actions,
  mutations
})