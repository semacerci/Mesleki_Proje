const routes = [
  {
    path: "/",
    name: "PageHome",
    component: () => import("src/pages/PageHome.vue"),
    children: [],
  },

  // Always leave this as last one,
  // but you can also remove it
  {
    path: "/:catchAll(.*)*",
    component: () => import("pages/ErrorNotFound.vue"),
  },
  {
    path: "/ap",
    name: "ActivityPage",
    component: () => import("src/pages/ActivityPage.vue"),
  },
  {
    path: "/cc",
    name: "CommunityCreate",
    component: () => import("src/pages/CommunityCreate.vue"),
  },
];

export default routes;
