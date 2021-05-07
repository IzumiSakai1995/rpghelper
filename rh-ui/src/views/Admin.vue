<template>
  <div class="manager">
      管理员页面
      <UserManager />
  </div>
</template>

<script>
import UserManager from '../components/UserManager.vue'
import { ref, getCurrentInstance } from "vue";

export default {
    name: 'admin',
    components:{
        UserManager
    }

}
</script>

<style>

</style>