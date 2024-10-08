import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView,
      children: [
        // 老人管理
        {
          path: '/user/elderly',
          name: 'elderly',
          component: () => import('../views/user/ElderlyManagerView.vue')
        },
        // 家属管理
        {
          path: '/user/family',
          name: 'family',
          component: () => import('../views/user/FamilyManagerView.vue')
        },
        // 用户管理
        {
          path: '/system/user',
          name: 'user',
          component: () => import('../views/system/UserManagerView.vue')
        }
      ]
    },
    {
      path: '/login',
      name: 'login',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/LoginView.vue')
    }
  ]
})

export default router
