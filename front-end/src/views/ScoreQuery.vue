<script>
import Head2 from "../components/Head2.vue";
import Bottom from "@/components/Bottom.vue";

export default {
  name: 'ScoreQuery',
  components: {
    Bottom,
    Head2
  }
}
</script>

<template>
  <head2/>
  <div>
    <div class="grade">
      <div class="left-part">
        <div class="new">最新查询</div>
        <div class="new-exam">
          <div class="exam-name"><a href="https://cjcx.neea.edu.cn/html1/folder/2210/283-1.htm">2023年5月同等学力申请硕士学位考试成绩查询</a></div>
          <div class="exam-name"><a href="https://cjcx.neea.edu.cn/html1/folder/22014/5476-1.htm">2023年9月全国计算机等级考试(NCRE)</a></div>
        </div>
        <div class="new-exam">
          <div class="exam-name"><a href="https://cjcx.neea.edu.cn/html1/folder/21051/3404-1.htm">2023年9月全国英语等级考试(PETS)</a></div>
          <div class="exam-name"><a href="https://cjcx.neea.edu.cn/html1/folder/2107/9221-1.htm">2023年05月全国外语水平考试(WSK)</a></div>
        </div>
        <div class="new-exam">
          <div class="exam-name"><a href="https://cjcx.neea.edu.cn/html1/folder/2204/64-1.htm">2023年5月书画等级考试(CCPT)</a></div>
          <div class="exam-name"><a href="https://cjcx.neea.edu.cn/html1/folder/2204/68-1.htm">2023年5月中国少数民族汉语水平等级考试（MHK））</a></div>
        </div>
        <div class="choose-title">选择考试项目</div>
        <div class="new-exam">
          <div class="exam-name"><a href="https://cjcx.neea.edu.cn/html1/folder/21064/9282-1.htm">中小学教师资格考试(NTCE)</a></div>
          <div class="exam-name"><a href="https://cjcx.neea.edu.cn/html1/folder/2210/283-1.htm">同等学力申请硕士学位考试</a></div>
        </div>
        <div class="new-exam">
          <div class="exam-name"><a href="https://cjcx.neea.edu.cn/html1/folder/21045/4883-1.htm	">全国大学英语四、六级考试(CET)</a></div>
          <div class="exam-name"><a href="https://cjcx.neea.edu.cn/html1/folder/22014/5476-1.htm">全国计算机等级考试(NCRE)</a></div>
        </div>
        <div class="new-exam">
          <div class="exam-name"><a href="https://cjcx.neea.edu.cn/html1/folder/21051/3404-1.htm">全国英语等级考试(PETS)</a></div>
          <div class="exam-name"><a href="https://cjcx.neea.edu.cn/html1/folder/2107/9221-1.htm">全国外语水平考试(WSK)</a></div>
        </div>
        <div class="new-exam">
          <div class="exam-name"><a href="https://cjcx.neea.edu.cn/html1/folder/2204/64-1.htm">2023年5月书画等级考试(CCPT)</a></div>
          <div class="exam-name"><a href="https://cjcx.neea.edu.cn/html1/folder/2204/68-1.htm">2023年5月中国少数民族汉语水平等级考试（MHK）</a></div>
        </div>
        <div class="new-exam">
          <div class="exam-name"><a href="">2023年5月全国计算机等级考试(NCRE)</a></div>
          <div class="exam-name"><a href="">2023年5月全国计算机应用水平考试(NCRE)</a></div>
        </div>
        <div class="new-exam">
          <div class="exam-name"><a href="">雅思</a></div>
          <div class="exam-name"><a href="">托福网考®</a></div>
        </div>
        <div class="new-exam">
          <div class="exam-name"><a href="" style="color: grey;">医护英语水平考试(METS)</a></div>
          <div class="exam-name"><a href="" style="color: grey;">移动商务技术工程师证书考试</a></div>
        </div>
        <div class="new-exam">
          <div class="exam-name"><a href="" style="color: grey;">嵌入式技术工程师证书考试</a></div>
          <div class="exam-name"><a href="" style="color: grey;">国家信息安全水平考试</a></div>
        </div>
        <div class="new-exam">
          <div class="exam-name"><a href="" style="color: grey;">中国餐饮职业经理人资格证书考试</a></div>
          <div class="exam-name"><a href="" style="color: grey;">劳动和社会保障岗位资格证书考试(LSSEP)</a></div>
        </div>
        <div class="new-exam">
          <div class="exam-name"><a href="" style="color: grey;">调查分析师资格证书考试</a></div>
          <div class="exam-name"><a href="" style="color: grey;">机械工程师资格考试</a></div>
        </div>
        <div class="new-exam">
          <div class="exam-name"><a href="" style="color: grey;">物流职业经理证书考试</a></div>
          <div class="exam-name"><a href="" style="color: grey;">中国市场营销资格证书考试</a></div>
        </div>
        <div class="new-exam">
          <div class="exam-name"><a href="" style="color: grey;">中英合作采购与供应管理证书考试</a></div>
          <div class="exam-name"><a href="" style="color: grey;">全国外语翻译证书考试(NAETI)</a></div>
        </div>
        <div class="new-exam">
          <div class="exam-name"><a href="" style="color: grey;">2023年5月书画等级考试(CCPT)</a></div>
          <div class="exam-name"><a href="" style="color: grey;">2023年5月中国少数民族汉语水平等级考试（MHK）</a></div>
        </div>
        <div class="new-exam">
          <div class="exam-name"><a href="" style="color: grey;">销售管理水平考试</a></div>
          <div class="exam-name"><a href="" style="color: grey;">全国高校市场营销大赛</a></div>
        </div>
        <div class="new-exam">
          <div class="exam-name"><a href="" style="color: grey;">中国移动商务管理师水平证书考试</a></div>
          <div class="exam-name"><a href="" style="color: grey;">中小企业经理人证书考试</a></div>
        </div>
        <div class="solid"></div>
        <div class="warning">注:灰色字体为已停考项目</div>
      </div>
      <div class="right-part">
        <h2 class="announcement">成绩查询公告</h2>
        <div><span>2023年9月全国英语等级考试（PETS）开通成绩查询</span></div>
        <div><span>2023年9月全国计算机等级考试（NCRE）开通成绩查询</span></div>
        <div><span>2023年5月全国计算机等级考试（NCRE）开通成绩查询</span></div>
        <div><span>2023年3月全国计算机等级考试（NCRE）开通成绩查询</span></div>
        <div><span>2023年3月全国英语等级考试（PETS）开通成绩查询</span></div>
        <div><span>2022年11月书画等级考试（CCPT）开通成绩查询</span></div>
        <div><span>2022年11月全国外语水平考试(WSK)开通成绩查询</span></div>
        <div><span>2022年12月全国计算机等级考试（NCRE）开通成绩查询</span></div>
        <div><span>2022年9月全国英语等级考试（PETS）开通成绩查询</span></div>
        <div>
          <div class="pagination">
            <a href="#">最前</a>
            <a href="#">上一页</a>
            <a href="#" class="current-page" style="color: #FF8000;">1</a>
            <a href="#">2</a>
            <a href="#">3</a>
            <a href="#">4</a>
            <a href="#">5</a>
            <a href="#">下一页</a>
            <a href="#">最后</a>
          </div>
        </div>
      </div>
    </div>
  </div>
  <Bottom/>
</template>

<style>
@import "../assets/css/ScoreQuery.css";
</style>