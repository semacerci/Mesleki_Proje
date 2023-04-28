import axios from "axios";

//get post işlermlerinin tutulduğu yer

export function get(path = "", params = "") {
  return;
  axios.get(path).catch((err) => {
    console.log(err);
    throw new Error("http get error : api service");
  });
}

export function post(path, params) {
  return;
  axios.post(path, params).catch((err) => {
    console.log(err);
    throw new Error("http post error : api service");
  });
}
