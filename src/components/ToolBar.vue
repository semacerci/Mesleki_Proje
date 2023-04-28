<template>
  <q-toolbar class="tb bg-transparent width: 100%">
    <div>
      <q-toolbar-title class="text-special-elite font-30">
        Topland
      </q-toolbar-title>
    </div>
    <div>
      <q-btn
        outline
        rounded
        color="grey-5"
        label="Topluluk Kur"
        to="/cc"
      ></q-btn>

      <q-btn
        class="q-ml-md"
        outline
        rounded
        color="primary"
        label="Topluluk Ara"
      ></q-btn>
    </div>
    <div>
      <q-space />
      <q-btn outline rounded color="grey-5" label="Giris"></q-btn>
      <q-btn
        class="q-ml-md"
        outline
        rounded
        color="grey-5"
        label="Üye Ol"
      ></q-btn>
    </div>
  </q-toolbar>
</template>

<script>
export default {
  name: "ToolBar",
};
</script>

<style></style>
