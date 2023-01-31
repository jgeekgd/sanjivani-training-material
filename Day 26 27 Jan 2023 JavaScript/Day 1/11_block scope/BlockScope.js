// Both const & let are block scoped.
function foo() {
  if (true) {
    var fruit1 = "apple"; //exist in function scope
    const fruit2 = "banana"; //exist in block scope
    let fruit3 = "strawberry"; //exist in block scope
  }
  console.log(fruit1);
  //console.log(fruit2); // results error - due to it exist in block scope
  // console.log(fruit3); // results error - due to it exist in block scope
}
foo();
