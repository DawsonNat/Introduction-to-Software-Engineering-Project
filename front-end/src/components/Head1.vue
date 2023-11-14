<script>
export default {
  name: 'Head1',
  methods: {
    goTopPofile(){
      this.$router.push('/Profile');
    }
  }
}
</script>

<template>
  <div>
    <div class="title">
      <router-link to="/">
        <div class="title1">
          考试信息网
        </div>
        <div class="title2">
          Examination information network
        </div>
      </router-link>
      <div class="search-box">
        <input type="text" placeholder="请输入关键词" class="search-box-input">
        <button class="search-box-button"><img src="../assets/image/search.png"></button>
      </div>
      <div class="btn">
        <router-link to="/Login"><button>登录</button></router-link>
        <router-link to="/Register"><button>注册</button></router-link>
      </div>
        <div class="sign" @click="goTopPofile">
          <img src="../assets/image/user.png"><br>
          <strong>个人信息</strong>
        </div>
    </div>
    <nav>
      <router-link to="/">首页</router-link>
      <router-link to="/ExaminationProgram">考试项目</router-link>
      <router-link to="/TestRegistration">考试报名</router-link>
      <router-link to="/ScoreQuery">成绩查询</router-link>
      <router-link to="/Preparation">备考方案</router-link>
    </nav>
  </div>
</template>

<style scoped>
@import "../assets/css/Head1.css";
</style>