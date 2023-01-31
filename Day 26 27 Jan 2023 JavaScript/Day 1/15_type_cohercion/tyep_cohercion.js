//console.log((100 + 23).toString()); //returns "123"
//console.log(true.toString()); // returns "true"

/*
Truthy and Fasly in JavaScript
Falsy value
In JavaScript, any expressions or value that results in boolean false value, are considered as Falsy. The falsy values/expressions in javascript are:

Obviously boolean false is false.
Any empty string will be evaluated to false.
Any undefined variable will be equal to false.
Any null variable will be equal to false.
Any numerical expression with result in NaN (not a number) will be equal to false.
Any numerical expression with result in zero will be equal to false.
Truthy value
In JavaScript, any expressions or value that results in boolean true value, are considered as Truthy. Any expression or value other than above listed falsy values – is considered truthy.

*/
if ("Hello") {
  console.log("Hello is considered as true"); // truthy
}

if (1) {
  console.log("1 is considered as true");
} // truthy

if (-1) {
  console.log("-1 is considered as true");
} // truthy

if (new Boolean(false)) {
  console.log("new Boolean(false) is considered as true"); // is truthy values because 'object' is always true
}

if (new String("")) {
  console.log('new String("") is considered as true'); // is truthy values because 'object' is always true
}
