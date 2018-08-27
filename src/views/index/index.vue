<template>
 <div>
<headers :active.sync="active"></headers>
<router-view></router-view>
 </div>
</template>

<script>
import headers from '@/components/headers'
export default {
 data () {
 return {
     active: "home"
 };
 },

 components: {
     headers
 },
 watch: {
     active (newVal) {
         console.log(newVal)
         this.$router.push({
             path: '${this.active}'
         })
     }

 },

 computed: {},

 mounted: {},

 methods: {}
}

</script>
<style lang='scss' scoped>
</style>