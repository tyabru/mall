import hasRole from './permission/hasRole'
import hasPermi from './permission/hasPermi'
import Vue from 'vue'

const install = function(Vue) {
  Vue.directive('hasRole', hasRole)
  Vue.directive('hasPermi', hasPermi)
}


Vue.use(install); // eslint-disable-line

export default install
