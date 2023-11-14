<script>
import Bottom from "../components/Bottom.vue";
export default {
  name: 'Profile',
  components: {
    Bottom
  },
  data() {
    return {
      name: '',
      gender: '',
      age: '',
      city: '',
      university: '',
      phone: '',
      email: '',
      exams: '',
      nameError: '',
      genderError: '',
      ageError: '',
      cityError: '',
      universityError: '',
      phoneError: '',
      emailError: '',
      examsError: ''
    };
  },
  methods: {
    validateName() {
      const reg = /^[a-zA-Z\u4e00-\u9fa5]+$/; // 只能输入文字或者字母
      if (!reg.test(this.name)) {
        this.nameError = '请输入正确的姓名格式';
        return false
      } else {
        this.nameError = '';
        return true
      }
    },
    validateGender() {
      const reg = /^(男|女)$/; // 只能输入男字或女字
      if (!reg.test(this.gender)) {
        this.genderError = '请输入正确的性别格式';
      } else {
        this.genderError = '';
      }
    },
    validateAge() {
      const reg = /^\d+岁$/; // 只能输入数字+’岁‘
      if (!reg.test(this.age)) {
        this.ageError = '请输入正确的年龄格式';
      } else {
        this.ageError = '';
      }
    },
    validateCity() {
      const reg = /^[a-zA-Z\u4e00-\u9fa5]+$/; // 只能输入文字
      if (!reg.test(this.city)) {
        this.cityError = '请输入正确的城市格式';
      } else {
        this.cityError = '';
      }
    },
    validateUniversity() {
      const reg = /^[a-zA-Z\u4e00-\u9fa5]+$/; // 只能输入文字
      if (!reg.test(this.university)) {
        this.universityError = '请输入正确的大学格式';
      } else {
        this.universityError = '';
      }
    },
    validatePhone() {
      const reg = /^[a-zA-Z0-9]+$/; // 只能输入数字+字母
      if (!reg.test(this.phone)) {
        this.phoneError = '请输入正确的电话号码格式';
      } else {
        this.phoneError = '';
      }
    },
    validateEmail() {
      const reg = /^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/; // 正确的邮箱格式
      if (!reg.test(this.email)) {
        this.emailError = '请输入正确的邮箱格式';
      } else {
        this.emailError = '';
      }
    },
    validateExams() {
      const reg = /^[a-zA-Z\u4e00-\u9fa5]+$/; // 只能输入文字
      if (!reg.test(this.exams)) {
        this.examsError = '请输入正确的考试格式';
      } else {
        this.examsError = '';
      }
    },
    checkEmptyFields() {
      if (!this.name) {
        alert('请填写正确的姓名');
        return false;
      }
      if (!this.gender) {
        alert('请填写正确的性别');
        return false;
      }
      if (!this.age) {
        alert('请填写正确的年龄');
        return false;
      }
      if (!this.city) {
        alert('请填写正确的城市');
        return false;
      }
      if (!this.university) {
        alert('请填写正确的大学');
        return false;
      }
      if (!this.phone) {
        alert('请填写正确电话号码');
        return false;
      }
      if (!this.email) {
        alert('请填写正确的邮箱');
        return false;
      }
      if (!this.exams) {
        alert('请填写正确的考试信息');
        return false;
      }
      return true;
    },
    submit() {
      if (!this.validateName()) {
        alert(this.nameError);
        return;
      }

      if (!this.validateGender()) {
        alert(this.genderError);
        return;
      }

      if (!this.validateAge()) {
        alert(this.ageError);
        return;
      }

      if (!this.validateCity()) {
        alert(this.cityError);
        return;
      }

      if (!this.validateUniversity()) {
        alert(this.universityError);
        return;
      }

      if (!this.validatePhone()) {
        alert(this.phoneError);
        return;
      }

      if (!this.validateEmail()) {
        alert(this.emailError);
        return;
      }

      if (!this.validateExams()) {
        alert(this.examsError);
        return;
      }

      // 发送AJAX请求
      axios.post('/profile', { //请求对应的接口
        name: this.name,
        gender: this.gender,
        age: this.age,
        city: this.city,
        university: this.university,
        phone: this.phone,
        email: this.email,
        exams: this.exams
      })
          .then(response => {
            if (response.data.success) {
              alert('已成功提交个人信息');
              this.$router.push('/'); // 跳转到主界面
            } else {
              // 提交失败
              alert(response.data.message);
            }
          })
          .catch(error => {
            console.error(error);
          });

    },
    goTohome() {
      this.$router.push('/');
    }
  }
}
</script>

<template>
  <div class="header">
    <router-link to="/"><img src="../assets/image/logo.png" alt="Logo" class="logo"></router-link>
    <button id="switch" class="switch-button" @click="goTohome">主页</button>
  </div>
  <div class="loginbox">
    <div class="login-box">
      <h2>个人信息收集</h2>
      <form @submit.prevent="submit">
        <label><input type="text" v-model="name" placeholder="输入姓名" @input="validateName"></label><br>
        <span class="msg">{{ nameError }}</span>
        <label><input type="text" v-model="gender" placeholder="输入性别(男/女)" @input="validateGender"></label><br>
        <span class="msg">{{ genderError }}</span>
        <label><input type="text" v-model="age" placeholder="输入年龄(~岁)" @input="validateAge"></label><br>
        <span class="msg">{{ ageError }}</span>
        <label><input type="text" v-model="city" placeholder="输入所在城市" @input="validateCity"></label><br>
        <span class="msg">{{ cityError }}</span>
        <label><input type="text" v-model="university" placeholder="输入大学" @input="validateUniversity"></label><br>
        <span class="msg">{{ universityError }}</span>
        <label><input type="text" v-model="phone" placeholder="输入电话号码" @input="validatePhone"></label><br>
        <span class="msg">{{ phoneError }}</span>
        <label><input type="email" v-model="email" placeholder="输入邮箱" @input="validateEmail"></label><br>
        <span class="msg">{{ emailError }}</span>
        <label><input type="text" v-model="exams" placeholder="输入要准备的考试" @input="validateExams"></label><br>
        <span class="msg">{{ examsError }}</span>
        <button type="submit" class="submit-button" @click="submit">提交</button>
      </form>
    </div>
  </div>
  <Bottom />
</template>

<style scoped>
@import "../assets/css/Profile.css";
</style>