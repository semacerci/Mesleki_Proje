<template>
  <router-view />
</template>

<script>
import { defineComponent } from "vue";

export default defineComponent({
  components: {},
  name: "App",
  methods: {
    fetcRandomPhoto() {
      fetch(this.url + "?client_id=${this.accesKey}")
        .then((response) => response.json())
        .then((json) => {
          console.log("json", json);
        })
        .catch((err) => {
          console.log("error", err);
        });
    },
  },
  created() {
    this.fetcRandomPhoto();
  },
  data() {
    return {
      accesKey: "TVsHn4WZ5IPcV2LqTcjH5V2jkmv11vgKaFu_3JtqMdE",
      url: "https://api.unsplash.com/photos/random",
    };
  },
});
</script>
