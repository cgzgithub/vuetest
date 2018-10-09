<template>
 <div>homepage</div>
</template>

<script>
export default {
 data () {
 return {
 };
 }

//  components: {},

<<<<<<< HEAD
//  computed: {},

//  mounted: {},

//  methods: {}
=======
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
>>>>>>> ea2e0e1f4efa4e13894ce89a09b1758453668d42
}

</script>
<style lang="scss" scoped>
</style>