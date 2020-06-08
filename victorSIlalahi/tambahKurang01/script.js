var v = new Vue({
  el: "#aplikasi",
  data: {
    nA: 0,
    nB: 0
  },
  computed: {
    hasilKali: function() {
      return parseInt(nA) * parseInt(nB);
    },
    hasilBagi: function() {
      return parseInt(nA) / parseInt(nB);
    }
  }
});
