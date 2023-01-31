// The important difference between for-in and for-of is that the first allows iteration over the keys of any object, while for-of allows /// iteration over an array or array-like object. The syntax is demonstrated below.

let person = {
  name: "Bob",
  age: 25,
};

//Iteration over the keys of any object
for (let prop in person) {
  console.log(person[prop]); // prints 'Bob' and then 25
}

let people = [
  {
    name: "Alice",
    age: 30,
  },
  {
    name: "Charlie",
    age: 29,
  },
];

//Allows iteration over an array or array-like object.
for (let pers of people) {
  console.log(pers.name); // prints 'Alice' then 'Charlie'
}

