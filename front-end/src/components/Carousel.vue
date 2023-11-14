<script>
import { InfoFilled } from '@element-plus/icons-vue'
export default {
  name: 'Carousel'
}
</script>

<template>
  <div>
    <el-carousel :interval="5000" arrow="always">
      <el-carousel-item v-for="item in 1" :key="item">
        <p><img src="../assets/image/carousel/carousel1.jpg"></p>
      </el-carousel-item>
      <el-carousel-item v-for="item in 1" :key="item">
        <p><img src="../assets/image/carousel/carousel2.jpg"></p>
      </el-carousel-item>
      <el-carousel-item v-for="item in 1" :key="item">
        <p><img src="../assets/image/carousel/carousel3.png"></p>
      </el-carousel-item>
    </el-carousel>
  </div>
</template>

<style scoped>
.el-carousel__item p {
  opacity: 0.75;
  line-height: 300px;
  margin: auto;
  text-align: center;
}

.el-carousel__item:nth-child(2n) {
  background-color: whitesmoke;
}

.el-carousel__item:nth-child(2n + 1) {
  background-color: whitesmoke;
}
</style>