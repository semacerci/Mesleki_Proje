<template>
  <div
    class="row bg-white position-relative"
    style="
      position: relative;
      top: -20px;
      border-style: outset;
      border-color: grey;
      width: 70%;
      height: 50px;
      border-radius: 50px;
    "
  >
    <div class="col-sm-4">
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

    <div class="col-sm-4">
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

    <div class="col-sm-4 float-right"><q-btn stretch flat />Şehir</div>
  </div>
</template>

<script>
export default {
  setup() {
    return {
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
