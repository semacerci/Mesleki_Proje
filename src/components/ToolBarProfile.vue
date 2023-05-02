<template>
  <q-toolbar class="tb bg-transparent width: 100%">
    <div>
      <q-toolbar-title
        style="color: white; font-size: 30px"
        class="text-special-elite"
        @click="$router.push('/')"
      >
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

    <div class="q-gutter-lg">
      <q-btn round icon="notifications">
        <q-badge floating color="primary" rounded>1</q-badge>
      </q-btn>

      <q-btn size="15px" dense round icon="email" class="q-ml-md">
        <q-badge color="primary" floating>4</q-badge>
      </q-btn>

      <q-chip outline color="grey-5" clickable size="18px" text-color="primary">
        <q-avatar size="35px">
          <img src="~/assets/p1.jpg" />
        </q-avatar>
        Sema Çerçi

        <q-icon class="q-pl-sm" name="expand_more"></q-icon>
      </q-chip>
    </div>
  </q-toolbar>
</template>

<script>
export default {
  name: "ToolBarProfile",
};
</script>

<style lang="sass">

icon
  color: red
</style>
