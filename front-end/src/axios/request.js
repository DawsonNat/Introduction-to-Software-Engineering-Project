import axios from 'axios'

const instance = axios.create({
    // 请求的公共地址部分
    baseURL: 'http://10.253.37.227:8080',
    // 请求超时时间 当请求时间超过5秒还未取得结果时 提示用户请求超时
    timeout: 3000,
    //每次请求携带cookie
    withCredentials:true
})

//导出
export default instance