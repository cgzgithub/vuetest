<template>
 <div>resgister
     <span @click="goto">back</span>
 </div>
</template>

<script>
export default {
 data () {
 return {
 };
 },

//  components: {},

//  computed: {},

//  mounted: {},

 methods: {
     goto() {
         this.$router.push('index')
     }
 }
}

</script>
<style lang="scss" scoped>
</style>