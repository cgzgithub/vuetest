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
         this.$router.push({
             path: this.active
         })
     }

 }

//  computed: {},

<<<<<<< HEAD
//  mounted: {},
=======
>>>>>>> ea2e0e1f4efa4e13894ce89a09b1758453668d42

//  methods: {}
}

</script>
<style lang="scss" scoped>
</style>