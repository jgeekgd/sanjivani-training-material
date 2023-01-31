var newYear = 2022; //global variable
function greeting(user) {
  var message = "Happy New Year"; //local variable
  return message + " " + newYear + ", " + user;
}
console.log(greeting("GD"));
console.log(newYear);

// console.log(message);  ReferenceError: message is not defined
// console.log(user);  ReferenceError: message is not defined
