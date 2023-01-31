// We are talking about object not class here

var person1 = {
  firstName: "John",
  lastName: "Wilson",
  age: 23,
};

console.log(person1.firstName); // returns John
console.log(person1.lastName); // returns Wilson
// or
console.log(person1["firstName"]); // returns John
console.log(person1["lastName"]); // returns Wilson

var person3 = new Object();
person3.firstName = "GD"; 
if (person3.hasOwnProperty("firstName")) {
  console.log("Yes Has Property firstName:" + person3.firstName); //returns Yes Has Property firstName:GD
}

//Iterate over only the keys in existing object
let allKeys = ""; 
for (var key in person1) {
  allKeys += key + " \n";
}
console.log(allKeys);


// Simple Object creation 
let People = function (name, age) {
  this.name = name;
  this.age = age;

  this.displayInfo = function () {
    return (this.name + " is " + this.age + " years old");
  };
};
 
const gd1 = new People("GD", "11");
console.log(gd1.displayInfo()); // returns GD is 11 years old



// Encapsulation via Closures
// Encapsulation means hiding information or data.
// The simplest a way to create encapsulation in JavaScript is using closures. 
// A closure can be created as a function with private state. 
// When creating many closures sharing the same private state, we create an object.

const Book = function(t, a) {
  let title = t; 
  let author = a; 
  
  return {
     summary : function() { 
       console.log(`${title} written by ${author}.`);
     } 
  }
}
const book1 = new Book('Hippie', 'Paulo Coelho');
book1.summary(); // Returns Hippie written by Paulo Coelho.
console.log(book1);
