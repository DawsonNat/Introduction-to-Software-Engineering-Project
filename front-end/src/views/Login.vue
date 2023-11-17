<script>
import Bottom from '../components/Bottom.vue';
import axios from "axios";
export default {
  name: 'Login',
  components: {
    Bottom
  },
  data() {
    return {
      username: '',
      password: '',
      termsChecked: false,
      usernameError: '',
      passwordError: ''
    };
  },
  methods: {
    verifyUsername() {
      // 不限制用户名格式
      this.usernameError = '';
      return true;
    },
    verifyPassword() {
      const reg = /^[a-zA-Z0-9-]{8,16}$/;
      if (!reg.test(this.password)) {
        this.passwordError = '请输入8~16位密码!';
        return false;
      } else {
        this.passwordError = '';
        return true;
      }
    },
    handleUsernameInput() {
      this.verifyUsername();
    },
    handlePasswordInput() {
      this.verifyPassword();
    },
    goToRegister() {
      this.$router.push('/register');
    },
    goToRetrieve() {
      this.$router.push('/retrieve');
    },
    login() {
      if (!this.verifyUsername()) {
        alert('请输入正确的用户名');
        return;
      }
      if (!this.verifyPassword()) {
        alert('请输入正确的密码');
        return;
      }
      if (!this.termsChecked) {
        alert('请勾选我已阅读并同意');
        return;
      }

      // 发送POST请求到后端服务
      axios.post('http://localhost:8888/login', {
        username: this.username,
        password: this.password
      })
          .then(response => {
            if (response.data.code === 1) {
              // 登录成功
              this.$router.push('/');
            } else {
              // 登录失败
              alert(response.data.msg);
            }
          })
          .catch(error => {
            console.error(error);
            alert('登录失败');
          });
    }
  }
}
</script>

<template>
  <div>
    <div class="header">
      <router-link to="/"><img src="../assets/image/logo.png" alt="Logo" class="logo"></router-link>
      <router-link to="/Register"><button id="switch" class="switch-button">注册</button></router-link>
    </div>
    <div class="loginbox">
      <div class="login-box">
        <h2>用户名登录</h2>
        <input type="text" v-model="username" placeholder="用户名账号" @input="handleUsernameInput">
        <span class="msg">{{ usernameError }}</span>
        <input type="password" v-model="password" placeholder="输入密码" @input="handlePasswordInput">
        <span class="msg">{{ passwordError }}</span>
        <div class="checkbox">
          <input type="checkbox" id="terms-checkbox" v-model="termsChecked"><label for="terms-checkbox">
          <span>我已阅读并同意《服务条款》、《隐私政策》</span>
        </label>
        </div>
        <button @click="login">登录</button>
        <button id="retrieve" @click="goToRetrieve">找回密码</button>
        <p class="agreement">登录视为您已同意《服务条款》、《隐私政策》</p>
      </div>
    </div>
    <Bottom/>
  </div>
</template>

<style scoped>
@import "../assets/css/Login.css";
</style>