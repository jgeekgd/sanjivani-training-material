// In Object Oriented JS we learned that in JS, everything is an object. 
// Because everything is an object, we came to understand that we could set and access additional properties to functions.
// Setting properties to a function and additional methods via the prototype is super awesome
// Every function gets 'this' property automatically

let People = function (name, age) {
  this.name = name;
  this.age = age;
  this.displayInfo = function () {
    console.log(this.name + " is " + this.age + " years old");
  };
};

const gd = new People("world", 10000000000000000n);
console.log(gd);
console.log(gd.displayInfo());
console.log(typeof gd.displayInfo);
console.log(typeof People.prototype);
console.log(typeof People.prototype.prototype);
