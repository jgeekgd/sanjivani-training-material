//In JavaScript, variable declarations made with var and function declarations made with the function keyword are hoisted - or moved - to the top of the scope in which they are declared when the JavaScript interpreter parses the code. 
//This means that variables and functions can be used before they are even declared as shown below.

function example() {
    // var a declaration hoisted here
    a = 4;
    var a;
    a++;
    console.log(a); // prints 5
  }
  // anotherExample declaration hoisted to here
  anotherExample(); // no error thrown!
  
  function anotherExample() {
    console.log('it works!');
  }
  