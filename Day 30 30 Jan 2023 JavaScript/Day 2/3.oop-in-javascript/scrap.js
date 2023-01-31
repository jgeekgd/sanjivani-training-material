const myDate = new Date();
let object = myDate;

do {
  object = Object.getPrototypeOf(object);
  //  console.log(object);
  console.log(object.__proto__);
} while (object);

// Date.prototype
// Object { }
// null
