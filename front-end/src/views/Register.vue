<script>
import Bottom from "../components/Bottom.vue";
import axios from "axios";
export default {
  name: 'Register',
  components: {
    Bottom
  },
  data() {
    return {
      regusername: '',
      regpassword: '',
      confirmPassword: '',
      regbirthday: '',
      isChecked: false,
      regusernameErrorMsg: '',
      regpasswordErrorMsg: '',
      confirmpasswordErrorMsg: '',
      regmailErrorMsg: ''
    };
  },
  methods: {
    verifyRegusername() {
      this.regusernameErrorMsg = '';
      return true;
    },
    verifyRegpassword() {
      const reg = /^[a-zA-Z0-9-]{8,16}$/;
      if (!reg.test(this.regpassword)) {
        this.regpasswordErrorMsg = '请输入8~16位密码!';
        return false;
      } else {
        this.regpasswordErrorMsg = '';
        return true;
      }
    },
    verifyConfirmpassword() {
      if (this.confirmPassword !== this.regpassword) {
        this.confirmpasswordErrorMsg = '两次输入的密码不一致!';
        return false;
      } else {
        this.confirmpasswordErrorMsg = '';
        return true;
      }
    },
    // verifyRegmail() {
    //   const reg = /^\d{4}\/\d{1,2}\/\d{1,2}$/;
    //   if (!reg.test(this.regbirthday)) {
    //     this.regbirthdayErrorMsg = '请输入正确格式的生日!';
    //     return false;
    //   } else {
    //     this.regbirthdayErrorMsg = '';
    //     return true;
    //   }
    //   return true;
    // },
    goToLogin() {
      this.$router.push('/login');
    },
    register() {
      if (!this.verifyRegusername()) {
        alert('请输入用户名');
        return;
      }
      if (!this.verifyRegpassword()) {
        alert('请输入正确格式的密码');
        return;
      }
      if (!this.verifyConfirmpassword()) {
        alert('请再次输入密码');
        return;
      }
      // if (!this.verifyRegmail()) {
      //   alert('请输入正确格式的生日');
      //   return;
      // }
      if (!this.isChecked) {
        alert('请勾选我已阅读并同意');
        return;
      }

      // // 在请求之前输出数据到控制台
      // console.log("要发送的数据：", {
      //   username: this.regusername,
      //   password: this.regpassword,
      //   mail: this.mail
      // });
      // 发送AJAX请求
      axios.post('http://localhost:8888/register', { //请求对应的接口
        username: this.regusername,
        password: this.regpassword,
      })
          .then(response => {
            if (response.data.code === 1) {
              alert('已成功注册账号');
              this.$router.push('/login');
            } else {
              // 注册失败
              alert(response.data.msg);
            }
          })
          .catch(error => {
            console.error(error);
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
      <h2>用户名注册</h2>
      <input type="text" v-model="regusername" placeholder="输入用户名" @input="verifyRegusername">
      <span class="msg">{{ regusernameErrorMsg }}</span>
      <input type="password" v-model="regpassword" placeholder="输入密码(格式为8~16位数字+字母)" @input="verifyRegpassword">
      <span class="msg">{{ regpasswordErrorMsg }}</span>
      <input type="password" v-model="confirmPassword" placeholder="再次输入密码" @input="verifyConfirmpassword">
      <span class="msg">{{ confirmpasswordErrorMsg }}</span>
<!--      <input type="text" v-model="regbirthday" placeholder="输入你的邮箱" @input="verifyRegmail">-->
<!--      <span class="msg">{{ regbirthdayErrorMsg }}</span>-->
      <div class="checkbox">
        <input type="checkbox" id="terms-checkbox" v-model="isChecked">
        <label for="terms-checkbox">
        <span>我已阅读并同意《服务条款》、《隐私政策》</span>
        </label>
      </div>
      <button id="register" @click="register">注册</button>
      <p class="agreement">注册视为您已同意《服务条款》、《隐私政策》</p>
    </div>
  </div>
  <Bottom />
</template>

<style scoped>
@import "../assets/css/Register.css";
</style>