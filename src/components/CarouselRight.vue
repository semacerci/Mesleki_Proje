<template>
  <div style="position: relative; top: 200px">
    <q-carousel-slide
      class="custom-skeleton-border"
      animated
      v-model="url"
      arrows
      navigation
      infinite
      swipeable
      @click="refresh"
    >
      <q-img
        :src="url"
        spinner-color="white"
        style="height: 500px; max-width: 240px"
        class="custom-skeleton-border"
      />
    </q-carousel-slide>
  </div>
</template>

<script>
import { ref } from "vue";

export default {
  setup() {
    const url = ref("https://picsum.photos/1000/1000?t=");

    return {
      url,
      refresh() {
        url.value = "https://picsum.photos/1000/1000?t=" + Math.random();
      },
    };
  },
};
</script>

<style lang="sass">
.custom-skeleton-border
  border-radius: 150px 0 24px 4px
</style>
