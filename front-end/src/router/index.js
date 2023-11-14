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
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router;
