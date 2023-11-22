import { createRouter, createWebHistory } from 'vue-router'
import Home from "../views/Home.vue";
import ExaminationProgram from "../views/ExaminationProgram.vue";
import TestRegistration from "../views/TestRegistration.vue";
import ScoreQuery from "../views/ScoreQuery.vue";
import Preparation from "../views/Preparation.vue";
import Login from "../views/Login.vue"
import Register from "../views/Register.vue"
import Retrieve from '../views/Retrieve.vue'
import Profile from '../views/Profile.vue'
import inside from '../views/inside.vue'
import inside2 from '../views/inside2.vue'
import inside3 from '../views/inside3.vue'
import inside4 from '../views/inside4.vue'
import inside5 from '../views/inside5.vue'
import inside6 from '../views/inside6.vue'
import inside7 from '../views/inside7.vue'
import inside8 from '../views/inside8.vue'
import inside9 from '../views/inside9.vue'
import inside10 from '../views/inside10.vue'
import nomore from '../views/nomore.vue'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/ExaminationProgram',
    name: 'ExaminationProgram',
    component: ExaminationProgram
  },
  {
    path: '/TestRegistration',
    name: 'TestRegistration',
    component: TestRegistration
  },
  {
    path: '/ScoreQuery',
    name: 'ScoreQuery',
    component: ScoreQuery
  },
  {
    path: '/Preparation',
    name: 'Preparation',
    component: Preparation
  },
  {
    path: '/Login',
    name: 'Login',
    component: Login
  },
  {
    path: '/Register',
    name: 'Register',
    component: Register
  },
  {
    path: '/Retrieve',
    name: 'Retrieve',
    component: Retrieve
  },
  {
    path: '/Profile',
    name: 'Profile',
    component: Profile
  },
  {
    path: '/inside',
    name: 'inside',
    component: inside
  },
  {
    path: '/inside2',
    name: 'inside2',
    component: inside2
  },
  {
    path: '/inside3',
    name: 'inside3',
    component: inside3
  },
  {
    path: '/inside4',
    name: 'inside4',
    component: inside4
  },
  {
    path: '/inside5',
    name: 'inside5',
    component: inside5
  },
  {
    path: '/inside6',
    name: 'inside6',
    component: inside6
  },
  {
    path: '/inside7',
    name: 'inside7',
    component: inside7
  },
  {
    path: '/inside8',
    name: 'inside8',
    component: inside8
  },
  {
    path: '/inside9',
    name: 'inside9',
    component: inside9
  },
  {
    path: '/inside10',
    name: 'inside10',
    component: inside10
  },
  {
    path: '/nomore',
    name: 'nomore',
    component: nomore
  }


]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router;
