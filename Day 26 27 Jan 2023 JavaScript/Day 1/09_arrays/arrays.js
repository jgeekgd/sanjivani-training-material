const myArray = [1, 2, 'a', '1a'];
console.log(myArray.toString());
console.log('Array 1st element: '+myArray[0])
console.log('Array last element: '+myArray[myArray.length-1])

// expected output: "1,2,a,1a"
var allStoredValues='';
for (let index = 0; index < myArray.length; index++) {
    allStoredValues+=myArray[index]+" ";
}
console.log('For with index - Old style basic for loop followed by many programming languages: '+allStoredValues);

allStoredValues='';
for (const entry of myArray) {
    allStoredValues+=entry+" ";
}
console.log('For..of - New style for-of will iterate through the values of the array: '+allStoredValues);

allStoredValues='';
for (const key in myArray) {
    allStoredValues+="[Index: "+key+" Value:"+ myArray[key]+ "] ";
}
console.log('For..in - New style for-in will iterate through the keys of an array: '+allStoredValues);

//There is also the forEach() function on the Array Prototype. 
//This function is a functional array method that takes in a callback function and runs that function for each element in the array. The forEach() method returns undefined.
allStoredValues='';
myArray.forEach(
    function(value, index) {
        allStoredValues+="[Index: "+index+" Value:"+ myArray[value]+ "] ";
    }
)
console.log('forEach - New style forEach() method on the Array Prototype: '+allStoredValues);

//Changing the Array Length - JavaScript is a dynamic language and arrays are no different. the length of an array can be changed in several ways.
let marks = [];
marks[0]=10;
marks[10]=100;
console.log('No fixed size in JavaScript Array: '+marks.toString());

//Removing an Item
delete marks[0];
console.log('post removal of the 1st element from marks array: '+marks[0]) // 3


console.log('-------------------- sort() method in Array--------------------');
let list = ['tiger', 'panda', 'giraffe', 'cat', 'owl', 'bird']
list.sort()
// this will sort alphabetically
console.log(list)
// [ "bird", "cat", "giraffe", "owl", "panda", "tiger" ]

// This will sort by size of the string
list.sort(function(item1, item2) {return item1.length - item2.length})
console.log(list)
// [ "cat", "owl", "bird", "panda", "tiger", "giraffe" ]

console.log('-------------------- indexOf() & lastIndexOf() method in Array--------------------');
//The indexOf() method returns the first index at which an element is present. lastIndexOf() returns the last index at which an element is present. If the element can't be found in the list, both will return the value -1.
list = [1, 1, 2, 3, 3, 5, 6, 1]
console.log(list.indexOf(3)); // returns 3
console.log(list.lastIndexOf(3)); // returns 4
console.log(list.indexOf(1)); // returns 0
console.log(list.lastIndexOf(1)); // returns 7
console.log(list.indexOf('cat')); // returns -1
console.log(list.lastIndexOf('cat')); // returns -1

console.log('-------------------- splice() & slice() method in Array--------------------');
// slice()	: 
// The slice() method returns selected elements in an array, as a new array.
// The slice() method selects from a given start, up to a (not inclusive) given end.
// The slice() method does not change the original array.
// Syntax: array.slice(start, end)
// start:
//     Optional.
//     Start position. Default is 0.
//     Negative numbers select from the end of the array.
// end:
//     Optional.
//     End position. Default is last element.
//     Negative numbers select from the end of the array.
// Return Value: A new array containing the selected elements.

let fruits = ["Banana", "Orange", "Lemon", "Apple", "Mango"];
const citrus = fruits.slice(1, 3);
const myBest = fruits.slice(-3, -1);
console.log(citrus);
console.log(myBest);

// splice() : 
// The splice() method adds and/or removes array elements.
// The splice() function overwrites the original array.
// Syntax: array.splice(index, howmany, item1, ....., itemX)
// index:
//     Required.
//     The position to add/remove items.
//     Negative value defines the position from the end of the array.
// howmany:
//     Optional.
//     Number of items to be removed.
// item1, ..., itemX	:
//     Optional.
//     New elements(s) to be added.
// Return Value: An array containing the removed items (if any).

fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.splice(2, 0, "Lemon", "Kiwi"); //At position 2, add 2 elements:
console.log(fruits);  // [ 'Banana', 'Orange', 'Lemon', 'Kiwi', 'Apple', 'Mango' ]
fruits.splice(2, 2);  // At position 2, remove 2 items:
console.log(fruits);   // [ 'Banana', 'Orange', 'Apple', 'Mango' ]
fruits.splice(0, 0);   //Will not do anything
console.log(fruits);

console.log('-------------------- filter(), map() & reduce() function in Array--------------------');
// The filter() function takes a callback function and creates a new array that is the made up of elements for which the callback function returns a truthy value. This can be useful in situations where you wish to perform an operation on only a subset of elements in an array. The original array is not modified
list = [4, 67, 34, 55, 79, 12]
let evens = list.filter(function(n) { return n%2 === 0 })
console.log('filter() array function:  '+evens) // [ 4, 34, 12 ]

// The map() function takes a callback function and creates a new array that is the result of calling the function on each element of the array. The original array is not modified
let numbers = [1, 2, 3, 4, 5, 6, 7]
let squares = numbers.map(function(n) {return n*n})
console.log('map() array function:  '+squares)
// [ 1, 4, 9, 16, 25, 36, 49 ]

// The reduce() function takes a callback function and returns a single value that is the result of calling the function for each value in the array. 
numbers = [1, 2, 3, 4, 5, 6, 7]
let result = numbers.reduce(function(previousValue, currentValue) 
                            {return previousValue + currentValue}
                           )
console.log('reduce() array function:  '+result)  // 28


console.log('-------------------- push(), pop() function in Array--------------------');

// push()
//     The push() method adds new items to the end of an array.
//     The push() method changes the length of the array.
//     The push() method returns the new length.
const animals = ['pigs', 'goats', 'sheep'];
console.log(animals); // expected output: Array ['pigs', 'goats', 'sheep']
const count = animals.push('cows');
console.log(count); // expected output: 4
console.log(animals); // expected output: Array ["pigs", "goats", "sheep", "cows"]
animals.push('chickens', 'cats', 'dogs');
console.log(animals); // expected output: Array ["pigs", "goats", "sheep", "cows", "chickens", "cats", "dogs"]

// pop()
//     The pop() method removes (pops) the last element of an array.
//     The pop() method changes the original array.
//     The pop() method returns the removed element.

const plants = ['broccoli', 'cauliflower', 'cabbage', 'kale', 'tomato'];
console.log(plants); // expected output: Array ['broccoli', 'cauliflower', 'cabbage', 'kale', 'tomato'];
console.log('Removed: '+plants.pop()); // expected output: "tomato"
console.log(plants); // expected output: Array ["broccoli", "cauliflower", "cabbage", "kale"]


