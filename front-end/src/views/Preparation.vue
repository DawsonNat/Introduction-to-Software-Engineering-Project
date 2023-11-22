<script>
import Head2 from "../components/Head2.vue";
import Bottom from "@/components/Bottom.vue";

export default {
  name: 'Preparation',
  components: {
    Bottom,
    Head2
  }
}
</script>

<template>
  <head2/>
  <div>
    <div class="subtitle">备考方案</div>
    <div class="pr_content">
      <p>
        <a href="inside">如何备考GRE?</a>
        <span>2023-10-20</span>
      </p>
      <p>
        <a href="inside2">雅思备考方案</a>
        <span>2023-10-20</span>
      </p>
      <p>
        <a href="inside3">四级考试如何准备呢</a>
        <span>2023-10-20</span>
      </p>
      <p>
        <a href="inside4">托福110+是种什么体验？</a>
        <span>2023-10-20</span>
      </p>
      <p>
        <a href="inside5">JLPT备考分享</a>
        <span>2023-10-20</span>
      </p>
      <p>
        <a href="inside6">教育部书画等级考试</a>
        <span>2023-10-20</span>
      </p>
      <p>
        <a href="inside7">三战雅思终上7.5</a>
        <span>2023-10-20</span>
      </p>
      <p>
        <a href="inside8">计算机二级备考指南</a>
        <span>2023-10-20</span>
      </p>
      <p>
        <a href="inside9">教师资格证复习资料、备考方法</a>
        <span>2023-10-20</span>
      </p>
      <p>
        <a href="inside10">德福备考经验：5444之路</a>
        <span>2023-10-20</span>
      </p>


    </div>
    <div>
      <div class="pagination">
        <a href="Preparation">最前</a>
        <a href="#">上一页</a>
        <a href="#" class="current-page" style="color: #FF8000;">1</a>
        <a href="nomore">2</a>
        <a href="nomore">3</a>
        <a href="nomore">4</a>
        <a href="nomore">5</a>
        <a href="nomore">下一页</a>
        <a href="nomore">最后</a>
      </div>
    </div>
  </div>
  <Bottom/>
</template>

<style>
@import "../assets/css/Preparation.css";
</style>