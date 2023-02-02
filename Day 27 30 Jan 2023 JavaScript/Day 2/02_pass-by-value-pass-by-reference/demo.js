// Pass by value
// In JavaScript, all function arguments are passed by value. This means that the value of any variable passed to a function is copied into the argument of the function. Any changes you make to the argument will not be reflected in the variable outside of the function.

// Primitives
// With primitive values this behavior is straightforward. The primitive value is copied to a new variable:

function changeValue(number) {
  console.log(number) // 20
  number = 42
  console.log(number) // 42
}
let myNumber = 20;
changeValue(myNumber);
console.log(myNumber); // 20

// Objects ---  Value Changed
// If you pass an object into a function, the story is slightly different. The value that is stored in a variable containing an object is not the object itself. Instead, an object reference is being stored inside of that variable. When you pass a variable containing a reference to an object, that reference is copied into the arguments of the function. Since the new variable has a copy of that object reference, we can use this variable to modify the object.

let myObject = {'pet': 'Cat'}
console.log(myObject.pet) // 'Cat'
function adoptDog(obj) {
  obj.pet = 'Dog'
}
adoptDog(myObject)
console.log(myObject.pet) // 'Dog'


// Objects ---  Entire Object Not Changed
// It is tempting to conclude that objects are pass by reference, because you can modify the object that we pass into the function. However, if we attempt to change the value of the variable by assigning a new object we see that this isn't true:
// Here, we see that because we reassigned the variable obj to a new object, the value of the variable changed and so the value of the variable myObject did not change. JavaScript is pass by value.

let myObject1 = {'pet': 'Cat'}
console.log(myObject.pet) // 'Cat'
function adoptDog1(obj) {
  obj = {'pet': 'Dog'}
}
adoptDog1(myObject1)
console.log(myObject1.pet) // 'Cat'
