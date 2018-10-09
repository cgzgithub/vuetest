<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <h2>Essential Links</h2>
    
    <ul>
    <li></li>
    </ul>
    <div v-for="(item, key) in newsListShow" :key="key" class="con">
      <div class="son">{{item.author_name}}</div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 's',
      newsListShow:[]
    }
  },

  created() {
    this.setNewsApi();

  },
  methods:{
    setNewsApi: function() {
       this.$http({
        method: 'post',
        url: 'http://localhost:8080/getUser',
        data: {}
     }).then(res => {
       console.log(res)
          this.newsListShow = res.data.name;
     })
      // api.JH_news('/news/index', 'type=top&key=123456')
      // .then(res => {
      //   console.log(res);
      //   this.newsListShow = res.articles;
      // });
    },
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style lang="scss" scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
.con{
  .son{
    border: 1px solid #eee;
    width: 5rem;
  }
}
</style>
