import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import { resolve } from 'rsvp';

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      redirect: '/login'
    },
    {
      path: '/login',
      component: resolve => require(['@/views/index/index'], resolve)
<<<<<<< HEAD
    },
    {
      path: '/register',
      component: resolve => require(['@/views/register/register'], resolve)
=======
>>>>>>> ea2e0e1f4efa4e13894ce89a09b1758453668d42
    },
    {
      path: '/index',
      component: resolve => require(['@/views/index/index'], resolve),
      children: [
        {
          path: '/home',
          component: resolve => require(['@/views/home/home'], resolve)
        },
        {
          path: '/about',
          component: resolve => require(['@/views/about/about'], resolve)
        },
        {
          path: '/set',
          component: resolve => require(['@/views/set/set'], resolve)
        }
      ]

    }
  ]
})
