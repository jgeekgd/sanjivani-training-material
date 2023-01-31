// ----------------------
var x; // undefined
var y = null; // null  -- is also an object in JS
// console.log(typeof x);
// console.log(typeof y);
// console.log(x == y); //true
// console.log(x === y); //false

// Output:=>
// undefined
// VM638:4 object
// VM638:5 true
// ----------------------

var price = null;
console.log(typeof price === "undefined");
console.log(typeof price === "null");
console.log(typeof price === null);
console.log(typeof price == null);
console.log(typeof price === "object"); // null  -- is also an object in JS
console.log(typeof price == "object");

//String can be inside single quotes or double quotes ... why see below:
var mySMS = "Today we jave 'Zoom' training";
console.log(mySMS);

mySMS = 'Today we jave "Zoom" training';
console.log(mySMS);
