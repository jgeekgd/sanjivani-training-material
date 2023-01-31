// Tagged templates:
// Tags allow you to parse template literals with a function.
// The first argument of a tag function contains an array of string values.
// The remaining arguments are related to the expressions.

//Example->
// The following is a tagged template:
//      tagFunction`Hello ${firstName} ${lastName}!`
// Putting a template literal after an expression triggers a function call, similar to how a parameter list triggers a function call.
// The above code is equivalent to the following function call:
//      tagFunction(['Hello ', ' ', '!'], firstName, lastName)

function myTag(strings, person, age) {
  console.log(strings);
  console.log(person);
  console.log(age);
  person = person.toUpperCase(); // due to immutable nature of primitive/value types.
  let str0 = strings[0]; // "That "
  let str1 = strings[1]; // " is a "
  let str2 = strings[2]; // "."

  let ageStr;
  if (age > 99) {
    ageStr = "older";
  } else {
    ageStr = "youngster";
  }
  ageStr = ageStr.toUpperCase();

  // We can even return a string built using a template literal
  return `${str0}${person}${str1}${ageStr}${str2}`;
}

let person = "Mike";
let age = 28;
let output = myTag`That ${person} is a ${age}.`;

console.log("Final Outcome:=>" + output);
// That Mike is a youngster.

//1. Paramter is split depending on the upon place holders
//2. Second paramter onwards all values pass as parameter
//3. Tag process the values as applicable
