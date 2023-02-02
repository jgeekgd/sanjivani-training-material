let mylog = (function () {
  return {
    log: function () {
      let args = Array.prototype.slice.call(arguments);
      console.log.apply(console, args);
    },
    warn: function () {
      let args = Array.prototype.slice.call(arguments);
      console.warn.apply(console, args);
    },
    error: function () {
      let args = Array.prototype.slice.call(arguments);
      console.error.apply(console, args);
    },
  };
})();

let name = "Alex";
let arr = [1, 2, 3];
let obj = { a: 1, b: 2, c: 3 };
let hello = function (msg) {
  alert(msg);
};
mylog.log("Name: ", name);
mylog.log("Window Debug: ", this);
mylog.error("Something error happen");
mylog.warn("Ahh... Warning", arr, obj);
mylog.log("more parameter: ", arr, obj, hello);
