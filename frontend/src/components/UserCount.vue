<template>
  <div class="count">
    <h1>{{ msg }}</h1>
  </div>
</template>

<script>
export default {
  name: 'count',
  data () {
    return {
      msg: 'Rank User'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1 {
  font-weight: normal;
}
a {
  color: #42b983;
}
</style>
