<template>
 <div>homepage</div>
</template>

<script>
export default {
 data () {
 return {
 };
 },

 components: {},

 computed: {
     
 },
 created() {
    this.setNewsApi();

  },

 methods: {
     setNewsApi: function() {
       this.$http({
        method: 'get',
        url: "http://localhost:8080/getUser",
        data: {}
     }).then(res => {
       console.log('res',res)
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
<style lang="scss" scoped>
</style>