<template>
  <q-card class="inset-shadow q-mt-xl">
    <div class="row">
      <div class="col-sm-8 q-pl-xl" style="height: 100%">
        <q-form
          class="q-pl-xl q-mt-xl"
          method="post"
          @submit.prevent="onSubmit"
        >
          <div class="row q-pt-xl">
            <div class="col-12">
              <p class="text-Inter text-grey-8">
                Grubunuzun <strong>Adı</strong> ne olacak?
              </p>

              <q-input style="max-width: 700px" rounded outlined v-model="text">
                <template v-slot:prepend>
                  <q-icon name="search" />
                </template>
              </q-input>
            </div>
          </div>

          <div class="row q-pt-xl">
            <div class="col-12">
              <p class="text-Inter text-grey-8">
                Grubunuzun <strong>Konumunu</strong> Girin
              </p>
              <q-input style="max-width: 700px" rounded outlined v-model="text">
                <template v-slot:prepend>
                  <q-icon name="search" />
                </template>
              </q-input>
            </div>
          </div>

          <div class="row q-pt-xl">
            <div class="col-12">
              <p class="text-Inter text-grey-8">
                Grubunuzun <strong>İlgi alanlarını</strong> tanımlayan birkaç
                konu seçin.
              </p>

              <q-input style="max-width: 700px" rounded outlined v-model="text">
                <template v-slot:prepend>
                  <q-icon name="search" />
                </template>
              </q-input>
            </div>
          </div>

          <div class="row q-pt-xl">
            <div class="col-12">
              <p class="text-Inter text-grey-8">
                Grubunuzun nasıl <strong>Tanım</strong>larsınız ? Açıklayıcı bir
                şekilde yazın.
              </p>

              <q-input
                style="max-width: 700px"
                v-model="textareaModel"
                filled
                clearable
                type="textarea"
                color="primary"
                label="Lütfen en az 50 karakter girin"
                :shadow-text="textareaShadowText"
                @keydown="processTextareaFill"
                @focus="processTextareaFill"
              />
            </div>
          </div>

          <div class="row q-pt-xl">
            <q-btn
              class="q-mr-auto"
              flat
              rounded
              style="background: goldenrod; color: white"
              label="Tamamla"
            />
          </div>
        </q-form>
      </div>

      <div class="col-sm-4 d-flex justify-content-end">
        <div class="rightShape">
          <div class="row cc-text">
            <div class="col-12">
              <p class="text-special-elite font-25 d-none d-lg-block d-sm-none">
                Hoşgeldin, <br />Sema
              </p>
              <div class="row q-pt-md">
                <div class="col-md-12">
                  <p class="q-mr-auto text-white text-Inter">
                    Etkinlik Takvimi
                  </p>
                </div>
              </div>
            </div>
          </div>

          <div class="row q-mt-xl">
            <div class="q-pa-md date-picker">
              <div class="q-gutter-md row items-start">
                <q-date dark v-model="date" minimal />
              </div>
            </div>
          </div>

          <div class="row">
            <div class="col-12">
              <h3 class="text-grey-8 text-special-elite-horizontal">Topl</h3>
            </div>
          </div>
        </div>
      </div>
    </div>
  </q-card>
</template>

<script>
import { ref } from "vue";

export default {
  name: "CCreatePage",
  setup() {
    return {
      date: ref("2019/02/01"),
    };
  },
};
</script>

<style scoped>
.q-card {
  border-top-left-radius: 20px;
  border-top-right-radius: 20px;
  width: 80%;
}
.rightShape {
  position: absolute;
  bottom: 0%;
  right: 0%;
  width: 20%;
  height: 720px;
  z-index: 0;
  background-color: #e9b458;
  border-radius: 300px 0 0px 4px;
}
.cc-text {
  position: absolute;
  top: 100px;
  right: 20px;
}
.date-picker {
  position: absolute;
  top: 30%;
  right: 10%;
}
</style>
