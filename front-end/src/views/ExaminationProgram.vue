<script>
import Head2 from "../components/Head2.vue";
import Bottom from "@/components/Bottom.vue";

export default {
  name: 'ExaminationProgram',
  components: {
    Bottom,
    Head2
  }
}
</script>

<template>
  <Head2/>
  <div>
    <div class="subtitle">国家教育考试</div>
    <div class="exam-name1">
      <a href="https://gaokao.neea.edu.cn" target="_blank">普通高考</a>
      <a href="https://www.zikaoben.cn/archives/4611.html" target="_blank">成人高考</a>
      <a href="https://yankao.neea.edu.cn" target="_blank">研究生考试</a>
      <a href="https://ntce.neea.edu.cn" target="_blank">教师资格证考试</a>
      <a href="https://tdxl.neea.edu.cn/html1/folder/2210/311-1.htm" target="_blank">同等学力申请硕士学位考试</a>
    </div>
    <div class="subtitle">社会证书考试</div>
    <div class="exam-name2">
      <a href="https://cet.neea.edu.cn/html1/folder/16033/247-1.htm" target="_blank">全国大学英语四、六级考试(CET)</a>
      <a href="https://ncre.neea.edu.cn/html1/folder/1507/909-1.htm" target="_blank">全国计算机等级考试(NCRE)</a>
      <a href="https://nit.neea.edu.cn/html1/folder/1507/1631-1.htm" target="_blank">全国计算机应用水平考试(NIT)</a>
      <a href="https://pets.neea.edu.cn/" target="_blank">全国英语等级考试(PETS)</a>
      <a href="https://wsk.neea.edu.cn/" target="_blank">全国外语水平考试(WSK)</a>

      <div class="exam2-line2">
        <a href="https://ccpt.neea.edu.cn/" target="_blank"> 书画等级考试(CCPT)</a>
        <a href="https://mhk.neea.edu.cn/" target="_blank">中国少数民族汉语水平等级考试(MHK)</a>

      </div>
    </div>
    <div class="subtitle">海外考试</div>
    <div class="exam-name3">
      <a href="https://www.toefl.cn/" target="_blank">托福网考®(TOEFL iBT®)</a>
      <a href="https://www.chinaielts.org/" target="_blank">雅思(IELTS)</a>
      <a href="https://www.testdaf.de/de/" target="_blank">德福(TestDaF)</a>
      <a href="https://www.jlpt.jp/cn/index.html" target="_blank">日本语能力测试(JLPT)</a>
      <a href="https://www.topik.go.kr/TWMAIN/TWMAIN0010.do" target="_blank">韩国语能力考试 (TOPIK)</a>

      <div class="exam3-line3">
        <a href="https://gre-main.neea.cn" target="_blank">美国研究生入学考试(GRE)</a>
        <a href="https://gmat-main.neea.cn" target="_blank">美国管理学研究生入学考试(GMAT)</a>
        <a href="https://bec.neea.cn" target="_blank">剑桥商务英语证书考试 (BEC)</a>
        <a href="https://delf-dalf.neea.cn" target="_blank">法语(DELF-DALF)</a>
      </div>
      <div class="exam3-line4">
        <a href="https://dele.neea.cn" target="_blank">对外西班牙语水平证书考试(DEL)E</a>
        <a href="https://lsat.neea.edu.cn" target="_blank">美国法学院入学考试 (LSAT)</a>
        <a href="https://gelpe-bras.neea.edu.cn" target="_blank">巴西葡萄牙语(GELPE-BRAS)</a>
        <a href="https://cyle.neea.cn" target="_blank">剑桥少儿英语 (CYLE)</a>
      </div>
    </div>
    <div class="subtitle">其它</div>
    <div class="exam-name4">
      <a href="https://cse.neea.edu.cn" target="_blank">国家外语能力测评体系</a>
    </div>
  </div>
  <Bottom/>
</template>

<style scoped>
@import "../assets/css/ExaminationProgram.css";
</style>