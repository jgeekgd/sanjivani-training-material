// Spread syntax (...) allows an iterable such as an array expression or string to be expanded in places where zero or more arguments (for function calls) or elements (for array literals) are expected, or an object expression to be expanded in places where zero or more key-value pairs (for object literals) are expected.
let parts = ["shoulders", "knees"];
let lyrics = ["head", ...parts, "and", "toes"];
console.log(lyrics); //  ["head", "shoulders", "knees", "and", "toes"]




// Updating object adding additional properties
const myVehicle = {
  brand: "Ford",
  model: "Mustang",
  color: "red",
};
const updateMyVehicle = {
  type: "car",
  year: 2021,
  color: "yellow",
};
const myUpdatedVehicle = { ...myVehicle, ...updateMyVehicle };
//Check the result object in the console:
console.log(myUpdatedVehicle);

