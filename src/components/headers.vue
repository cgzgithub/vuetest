<template>
 <div>
     <div>welcome</div>
     <el-menu :default-active="active" class="el-menu-demo" mode="horizontal" @select="handleSelect" background-color="#545c64" text-color="#fff" active-text-color="#ffd04b">  
         <el-menu-item index="home">home</el-menu-item>
         <el-menu-item index="about">about</el-menu-item>
         <el-menu-item index="set">set</el-menu-item>
         <el-menu-item index="register">register</el-menu-item>
         
     </el-menu>
 </div>
</template>

<script>
export default {
 props: {
     active: {
         type: String,
         required: true
     }
 },
 data () {
 return {
 };
 },

//  components: {},

//  computed: {},

//  mounted: {},

 methods: {
     handleSelect (key, keyPath) {
         this.$emit('update:active', key)
     }
 }
}

</script>
<style lang="scss" scoped>
</style>