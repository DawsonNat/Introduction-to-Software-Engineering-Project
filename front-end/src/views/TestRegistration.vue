<script>
import Head2 from "../components/Head2.vue";
import Bottom from "@/components/Bottom.vue";

export default {
  name: 'TestRegistration',
  components: {
    Bottom,
    Head2
  }
}
</script>

<template>
  <head2/>
  <div>
    <div class="exam1">
      <ul class="exam1-list1">
        <li><a href="https://ntce.neea.edu.cn/html1/folder/16013/15-1.htm">中小学教师资格考试(NTCE)</a></li>
        <li><a href="https://pets.neea.edu.cn/">全国英语等级考试（PETS）</a></li>
      </ul>
      <ul class="exam1-list2">
        <li><a href="https://cet-bm.neea.edu.cn">全国大学英语四、六级考试(CET)</a></li>
        <li><a href="https://wsk.neea.edu.cn/">全国外语水平考试(WSK)</a></li>
      </ul>
      <ul class="exam1-list3">
        <li><a href="https://ncre-bm.neea.cn">全国计算机等级考试(NCRE)</a></li>
        <li><a href="https://ccpt.neea.edu.cn/">书画等级考试(CCPT)</a></li>
      </ul>
      <ul class="exam1-list4">
        <li><a href="https://member.neea.cn/login/new?returnUrl=http%3A%2F%2Forder.neea.cn%2FfirstFlowNode%2F17">全国计算机应用水平考试(NIT)</a></li>
        <li><a href="https://mhk.neea.edu.cn/">中国少数民族汉语水平等级考试</a></li>

      </ul>
    </div>

    <div class="exam2">
      <ul class="exam2-list1">
        <li><a href="https://toefl.neea.cn/?_ga=2.212511766.366579531.1700050713-452917732.1700050713&_gl=1*1pkcfcf*_ga*NDUyOTE3NzMyLjE3MDAwNTA3MTM.*_ga_LV4JL7BVSY*MTcwMDA1MDcxMy4xLjEuMTcwMDA1MDg2OC4wLjAuMA..">托福网考®(TOEFL iBT®)</a></li>
        <li><a href="https://www.topik.go.kr/TWMBER/TWMBER0010.do">韩国语能力考试(TOPIK)</a></li>
        <li><a href="https://delf-dalf.neea.cn">法语(DELF-DALF)</a></li>
      </ul>
      <ul class="exam2-list2">
        <li><a href="https://ielts.neea.cn/?utm_source=chinaielts&utm_medium=banner&utm_campaign=chinaieltspromopilot&utm_id=chinaieltspromo&utm_term=chinaieltspromopilot&utm_content=chinaieltspromopilot">雅思(IELTS)</a></li>
        <li><a href="https://gre.neea.cn/login.do">美国研究生入学考试(GRE)</a></li>
        <li><a href="https://dele.neea.cn">对外西班牙语水平证书考试</a></li>
      </ul>
      <ul class="exam2-list3">
        <li><a href="https://testdaf.neea.cn/login.do">德福(TestDaF)</a></li>
        <li><a href="https://gmat.neea.c">美国管理学研究生入学考试</a></li>
        <li><a href="https://member.neea.cn/login/new?returnUrl=http%3A%2F%2Forder.neea.cn%2FfirstFlowNode%2F14">剑桥少儿英语(CYLE)</a></li>
      </ul>
      <ul class="exam2-list4">
        <li><a href="https://jlpt.neea.cn">日本语能力测试(JLPT)</a></li>
        <li><a href="https://member.neea.cn/login/new?returnUrl=http%3A%2F%2Forder.neea.cn%2FfirstFlowNode%2F01">剑桥商务英语(BEC)</a></li>
        <li><a href="https://member.neea.cn/login/new?returnUrl=http%3A%2F%2Forder.neea.cn%2FfirstFlowNode%2F19">楷尔(CAEL)</a></li>
      </ul>
    </div>

    <div class="subtitle">网络报名流程</div>
    <div class="image">
      <img src="../assets/image/step3-1.png" alt="">
      <span>
              <div class="right-arrow"></div>
          </span>
      <img src="../assets/image/step3-4.png" alt="">
      <span>
              <div class="right-arrow"></div>
          </span>
      <img src="../assets/image/step3-6.png" alt="">
      <span>
              <div class="right-arrow"></div>
          </span>
      <img src="../assets/image/step3-5.png" alt="">
    </div>

    <div class="process">
      <span>确认网报信息</span>
      <span>上传网报材料</span>
      <span>关注审核结果</span>
      <span>下载准考证件</span>
    </div>
  </div>
  <Bottom/>
</template>

<style>
@import "../assets/css/TestRegistration.css";
</style>