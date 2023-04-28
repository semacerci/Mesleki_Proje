<template>
  <div class="container q-mt-md">
    <tool-bar-profile-vue></tool-bar-profile-vue>
  </div>
  <hr class="hr" />
  <div class="main">
    <c-create-page-vue></c-create-page-vue>
  </div>
</template>

<script>
import ToolBarProfileVue from "src/components/ToolBarProfile.vue";

import CCreatePageVue from "src/components/CCreatePage.vue";

export default {
  name: "CommunityCreate",
  components: {
    ToolBarProfileVue,
    CCreatePageVue,
  },
};
</script>

<style>
.main {
  display: flex;
  justify-content: center;
}
hr {
  width: 90%;
  border: 0.05px solid #e9b458;
}
</style>
