<template>
  <div class="container q-pa-md">
    <q-card class="card">
      <q-img height="280px" flat src="~/assets/c2.jpg">
        <div class="absolute-bottom">
          <q-card-section>
            <q-btn flat>Kitap</q-btn>
            <div class="q-pl-md q-gutter-x-md">
              <span>Aktivite Sayısı</span>
              <q-icon size="15px" name="blur_on"></q-icon>
              <span>Üye Sayısı</span>
            </div>
          </q-card-section>
        </div>
      </q-img>
    </q-card>
  </div>
</template>
<script>
import { get } from "src/common/api.service";
export default {
  name: "CommunityCards",
  data() {
    return { user: [] };
  },
  created() {
    this.getCard();
  },
  methods: {
    getCard() {
      get("user").then((response) => {
        this.user = response.data;
      });
    },
  },
  setup() {
    return {
      title: "",
      activity: "",
      members: "",
    };
  },
};
</script>
<style scoped lang="scss">
.card {
  width: 100%;
  max-width: 350px;
}
</style>
