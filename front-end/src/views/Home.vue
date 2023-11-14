<script>
import Head1 from "../components/Head1.vue";
import Bottom from "../components/Bottom.vue";
import Carousel from "../components/Carousel.vue";
import Calendar from "../components/Calendar.vue";
import axios from "axios";

export default {
  name: 'Home',
  components: {
    Bottom,
    Head1,
    Carousel,
    Calendar
  },
  methods: {
    goTopPofile(){
      this.$router.push('/Profile.css');
    },
    fetchData() {
      axios.get('http://10.253.37.227:8080')
          .then(response => {
            console.log(response.data);
          })
          .catch(error => {
            console.error(error);
          });
    }
  },
  created() {
    this.fetchData();
  }
}
</script>

<template>
  <Head1/>
  <div>
    <div id="Content">
      <Carousel></Carousel>
      <Calendar></Calendar>
      <div id="Content1">
        <div class="leftcont">
          <div class="testprogram">
            <strong>考试项目</strong>
          </div>
          <div class="container">
            <div class="card">
              <div class="face face1">
                <div class="content">
                  <img src="../assets/image/certificate.png">
                  <h3>英语四六级考试(CET)</h3>
                </div>
              </div>
              <div class="face face2">
                <div class="content">
                  <p>全国大学英语四、六级考试(CET)是由教育部主办，是全国性的教学考试，其目的是促进我国大学英语教学工作，对大学生的英语能力进行客观、准确的测量，为提高我国大学英语课程的教学质量提供服务。<a href="#">了解更多</a></p>
                </div>
              </div>
            </div>
            <div class="card">
              <div class="face face1">
                <div class="content">
                  <img src="../assets/image/book-one.png">
                  <h3>雅思(IELTS)</h3>
                </div>
              </div>
              <div class="face face2">
                <div class="content">
                  <p>IELTS 雅思考试(International English Language Testing System, 国际英语语言测试系统)是为那些打算在以英语作为交流语言的国家和地区留学或就业的人们设置的英语语言水平考试。<a href="#">了解更多</a></p>
                </div>
              </div>
            </div>
            <div class="card">
              <div class="face face1">
                <div class="content">
                  <img src="../assets/image/bachelor-cap-one.png">
                  <h3>全国外语水平考试(WSK)</h3>
                </div>
              </div>
              <div class="face face2">
                <div class="content">
                  <p>全国外语水平考试(WSK)是为了鉴定非外语专业人员的外语水平设置的考试，其成绩主要用于选拔国家公派出国留学人员。全国外语水平考试设英语(PETS-5)、法语(TNF)、德语(NTD)、日语(NNS)和俄语(ТПРЯ)五个科目。<a href="#">了解更多</a></p>
                </div>
              </div>
            </div>
          </div>
          <br>
          <div class="container">
            <div class="card">
              <div class="face face1">
                <div class="content">
                  <img src="../assets/image/read-book.png">
                  <h3>普通高考</h3>
                </div>
              </div>
              <div class="face face2">
                <div class="content">
                  <p>普通高等学校招生全国统一考试(The National College Entrance Examination)是中华人民共和国普通高等学校的招生考试，是由普通高中毕业生和具有同等学力的考生参加的选拔性考试。<a href="#">了解更多</a></p>
                </div>
              </div>
            </div>
            <div class="card">
              <div class="face face1">
                <div class="content">
                  <img src="../assets/image/classroom.png">
                  <h3>成人高考</h3>
                </div>
              </div>
              <div class="face face2">
                <div class="content">
                  <p>成人高等学校招生全国统一考试(Adult university entrance exam)是中国成人高等学校的招生入学考试，属于国民教育系列教育，已经列入国家招生计划，每年九月份报名，十月下旬考试。<a href="#">了解更多</a></p>
                </div>
              </div>
            </div>
            <div class="card">
              <div class="face face1">
                <div class="content">
                  <img src="../assets/image/bachelor-cap.png">
                  <h3>研究生考试</h3>
                </div>
              </div>
              <div class="face face2">
                <div class="content">
                  <p>全国硕士研究生统一招生考试(Unified National Graduate Entrance Examination)是应届本科毕业生、本科毕业及同等学历学生攻读高校硕士研究生的招生考试，是大学毕业生获得硕士、博士学位的主要通道。<a href="#">了解更多</a></p>
                </div>
              </div>
            </div>
          </div>
          <br>
          <div class="other">
            <router-link to="ExaminationProgram/">---更多考试信息点击此处---</router-link>
          </div>
        </div>
      </div>
      <div id="Content2">
        <div class="rightcont">
          <h1>考生服务</h1>
          <div class="box">
            <span>
              <router-link to="/TestRegistration"><img src="../assets/image/1.jpg">考试报名</router-link>
            </span>
            <p><a href="#">英语四六级考试(CET)</a>| <a href="#">雅思(IELTS)</a>| <a href="#">托福(TOEFL)</a>|</p>
            <p><a href="#">全国外语水平考试(WSK)</a>| <a href="#">全国英语等级考试(PETS)</a>|</p>
            <p><a href="#">全国计算机等级考试(NCRE)</a>| <a href="#">美国研究生入学考试(GRE)</a>|</p>
            <p><router-link to="/TestRegistration">...</router-link></p>
          </div>
          <div class="box">
            <span>
              <router-link to="/ScoreQuery"><img src="../assets/image/2.jpg">成绩查询</router-link>
            </span>
            <p><a href="#">全国计算机等级考试(NCRE)</a>| <a href="#">英语四六级考试(CET)</a>|</p>
            <p><a href="#">全国外语水平考试(WSK)</a>| <a href="#">全国英语等级考试(PETS)</a>|</p>
            <p><a href="#">普通高考成绩查询</a>| <a href="#">成人高考成绩查询</a>|</p>
            <p><router-link to="/ScoreQuery">...</router-link></p>
          </div>
          <div class="box">
            <span>
              <router-link to="/Preparation"><img src="../assets/image/3.jpg">备考方案</router-link>
            </span>
            <p><a href="#">备考一天拿下雅思8.0</a></p>
            <p><a href="#">备考一天拿下雅思8.0</a></p>
            <p><a href="#">备考一天拿下雅思8.0</a></p>
            <p><a href="#">备考一天拿下雅思8.0</a></p>
            <p><a href="#">备考一天拿下雅思8.0</a></p>
            <p><router-link to="/Preparation">...</router-link></p>
          </div>
        </div>
      </div>
    </div>
  </div>
  <Bottom/>
</template>

<style scoped>
@import "../assets/css/Home.css";
</style>