// --------------- 1. Case

var person1 = {
  fullName: function (firstName, lastName) {
    return firstName + " " + lastName;
  },
};
console.log("Hello, " + person1.fullName("GD", "abc"));
// Output: Hello, GD abc

// --------------- 2. Case
var person2 = {
  fullName: function (firstName, lastName) {
    return this.firstName + " " + this.lastName;
  },
};
console.log("Hello, " + person2.fullName("GD", "abc"));
// Output: Hello, undefined undefined
// Bcz this is empty object here not initialize with properties

// --------------- 3. Case
var person3 = {
  fullName: function () {
    return this.firstName + " " + this.lastName;
  },
};

var person2_1 = {
  first: "John",
  last: "Wilson",
};
console.log("Hello, " + person3.fullName.call(person2_1));

// --------------- 4. Case
var person4 = {
  fullName: function () {
    return this.firstName + " " + this.lastName;
  },
};

var person4_1 = {
  firstName: "John",
  lastName: "Wilson",
};
var person4_2 = {
  firstName: "GD",
  lastName: "JavaScript",
};
console.log("Hello, " + person1.fullName.call(person4_1));
console.log("Hello, " + person1.fullName.call(person4_2));
