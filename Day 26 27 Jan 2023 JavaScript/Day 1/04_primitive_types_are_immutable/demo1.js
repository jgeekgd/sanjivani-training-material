var age = 33;
console.log(age);
age = "My Age is: ";
age = age + "33";
console.log(age);
age = 33.22;
console.log(age);

//By default all immutable all primitive types in JavaScript

// Using a string method doesn't mutate the string
var bar = "baz";
console.log(bar); // baz
bar.toUpperCase();
console.log(bar); // baz
// Assignment gives the primitive a new (not a mutated) value
bar = bar.toUpperCase();
console.log(bar); // BAZ

// Using an array method mutates the array
var foo = [];
console.log(foo); // []
foo.push("plugh");
console.log(foo); // ["plugh"]
