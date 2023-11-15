<script>
import Bottom from "../components/Bottom.vue";
import axios from "axios";

export default {
  name: 'Retrieve',
  components: {
    Bottom
  },
  data() {
    return {
      retusername: '',
      retbirthday: '',
      isChecked: false,
      retusernameErrorMsg: '',
      retbirthdayErrorMsg: ''
    };
  },
  methods: {
    verifyRetusername() {
      this.retusernameErrorMsg = '';
      return true;
    },
    verifyRetbirthday() {
      const reg = /^\d{4}\/\d{1,2}\/\d{1,2}$/
      if (!reg.test(this.retbirthday)) {
        this.retbirthdayErrorMsg = '请输入格式为年/月/日的生日!';
        return false;
      } else {
        this.retbirthdayErrorMsg = '';
        return true;
      }
    },
    goToLogin() {
      this.$router.push('/login');
    },
    retrieve() {
      if (!this.verifyRetusername()) {
        alert('请输入正确的用户名');
        return;
      }
      if (!this.verifyRetbirthday()) {
        alert('请输入正确的生日');
        return;
      }
      if (!this.isChecked) {
        alert('请勾选我已阅读并同意');
        return;
      }

      // 发送POST请求到后端服务
      axios.post('/retrieve', {
        username: this.retusername,
        birthday: this.retbirthday
      })
          .then(response => {
            if (response.data.success) {
              // 如果找回密码成功，显示密码并跳转到登录界面
              alert('你的密码是：' + response.data.password);
              this.$router.push('/login');
            } else {
              // 如果找回密码失败，显示错误信息
              alert(response.data.message);
            }
          })
          .catch(error => {
            console.error(error);
            alert('找回密码失败');
          });
    }
  }
}
</script>

<template>
  <div class="header">
    <router-link to="/"><img src="../assets/image/logo.png" alt="Logo" class="logo"></router-link>
      <router-link to="/Login"><button id="switch" class="switch-button" @click="goToLogin">登录</button></router-link>
  </div>
  <div class="loginbox">
    <div class="login-box">
      <h2>找回密码</h2>
      <input type="text" v-model="retusername" placeholder="输入用户名" @input="verifyRetusername">
      <span class="msg">{{ retusernameErrorMsg }}</span>
      <input type="text" v-model="retbirthday" placeholder="输入你的生日，格式为‘年/月/日’" @input="verifyRetbirthday">
      <span class="msg">{{ retbirthdayErrorMsg }}</span>
      <div class="checkbox">
        <input type="checkbox" id="terms-checkbox" v-model="isChecked">
        <label for="terms-checkbox">
        <span>我已阅读并同意《服务条款》、《隐私政策》</span>
        </label>
      </div>
      <button id="retrieve" @click="retrieve">找回密码</button>
      <p class="agreement">该行为视为您已同意《服务条款》、《隐私政策》</p>
    </div>
  </div>
  <Bottom/>
</template>

<style scoped>
@import "../assets/css/Retrieve.css";
</style>