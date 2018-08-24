
import axios from 'axios'
import qs from 'qs'
// axios 配置
axios.defaults.timeout = 5000;
axios.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded;charset=UTF-8';
axios.defaults.baseURL = 'http://localhost:8080';
//返回状态判断
axios.interceptors.response.use((res) =>{
    console.log(res);
    //对响应数据做些事
    if(res.status  !=200){
      // _.toast(res.data.msg);
      return Promise.reject(res);
    }
    return res;
  }, (error) => {
    //404等问题可以在这里处理
    _.toast("网络异常", 'fail');
    return Promise.reje98765432+-
       ct(error);
  });
  export function fetch(url, params) {
    return new Promise((resolve, reject) => {
      axios.post(url, params)
        .then(response => {
          resolve(response.data);
        }, err => {
          reject(err);
        })
        .catch((error) => {
          reject(error)
        })
    })
  }
  export default {
    /**
     * 得到用户信息
     */
    getInfo(params) {
      return fetch('/Train_new/servlet/AppServlet', params)
    }
  }
      