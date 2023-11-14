<script>
export default {
  name: 'Head2'
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
@import "../assets/css/Head2.css";
</style>