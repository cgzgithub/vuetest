<template>
 <div>homepage</div>
</template>

<script>
function a (t1,t2){
    this.name = t1;
    this.tel = t2;
}
var b = new a("dd","d");
console.log(b)
function Person(name){
                this.name=name;
            }

            Person.prototype.share=[];

            Person.prototype.printName=function(){
                alert(this.name);
            }

            var person1=new Person('Byron');
            var person2=new Person('Frank');

            person1.share.push(1);
            person2.share.push(2);
            console.log(person2.share); //[1,2]
export default {
 data () {
 return {
 };
 }

//  components: {},

//  computed: {},

//  mounted: {},

//  methods: {}
}

</script>
<style lang="scss" scoped>
</style>