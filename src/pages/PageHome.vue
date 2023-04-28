<template>
  <q-img style="height: 500px" src="~/assets/t1.jpg">
    <tool-bar-vue></tool-bar-vue>
  </q-img>

  <div class="row justify-center" style="position: relative; top: -20px">
    <div
      class="col-sm-8 bg-white tb"
      style="border-style: outset; height: 50px; border-radius: 50px"
    >
      <div class="col-4">
        <q-input
          borderless
          color="none"
          v-model="text"
          label="Topluluk Ara"
          :dense="dense"
        >
          <template v-slot:append>
            <q-icon
              v-if="text !== ''"
              name="close"
              @click="text = ''"
              class="cursor-pointer"
            />
            <q-icon name="search" />
          </template>
        </q-input>
      </div>
      <q-separator vertical inset />

      <div class="col-4">
        <q-select
          :dropdown-icon="location_city"
          borderless
          color="none"
          rounded
          v-model="model"
          :options="options"
          :value="options"
        />
      </div>
      <q-separator vertical inset />
      <div class="col-4">
        <q-select
          :dropdown-icon="location_city"
          borderless
          color="none"
          rounded
          v-model="model1"
          :options="option"
          :value="option"
        />
      </div>
    </div>
  </div>
  <div class="row">
    <q-linear-progress
      rounded
      size="xs"
      :value="progress"
      color="warning"
      class="q-mt-sm"
    />
  </div>
  <div class="row justify-center flex-center items-center r">
    <div class="col-md-2">
      <carousel-left-vue></carousel-left-vue>
    </div>
    <div class="col-md-8 items-center justify-center q-gutter-md">
      <community-cards-vue @click="ActivityPage"></community-cards-vue>
    </div>
    <div class="col-md-2"><carousel-right-vue></carousel-right-vue></div>
  </div>
</template>

<script>
import { ref } from "vue";

import CarouselLeftVue from "src/components/CarouselLeft.vue";

import CommunityCardsVue from "src/components/CommunityCards.vue";
import CarouselRightVue from "src/components/CarouselRight.vue";

import ToolBarVue from "src/components/ToolBar.vue";

export default {
  name: "PageHome",

  components: {
    CarouselLeftVue,
    CommunityCardsVue,
    CarouselRightVue,
    ToolBarVue,
  },

  setup() {
    const leftDrawerOpen = ref(false);

    return {
      leftDrawerOpen,
      toggleLeftDrawer() {
        leftDrawerOpen.value = !leftDrawerOpen.value;
      },

      model1: ref("Şehir"),
      model: ref("Kategori"),
      options: ["Aile", "Çocuk", "Felsefe"],
      option: ["Ankara", "İstanbul", "Adana"],

      shape: ref("line"),
      onItemClick: {},

      text: ref(""),
      ph: ref(""),
      dense: ref(false),
    };
  },
};
</script>
<style></style>
