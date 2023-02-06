console.log("Hello Typescript!")
let fullName: string = 'Bob Bobbington';
let age: number = 37;
let sentence: string = `Hello, my name is ${ fullName }.
        I'm ${ age } years old.`;
console.log(sentence)

let variable: any = 14;
console.log(variable)
variable = "maybe a string instead";
console.log(variable)
variable = false; 
console.log(variable)


function sayHello(): string {
    return "Hello!!!";
}
console.log(sayHello());


let list: number[] = [1, 2, 3];
let list1: Array<number> = [1, 2, 3];
let list2: any[] = [1, "two", 3];


var employee: [number, string] = [1, "John"];
//Accessing Tuple
employee[0]; // returns 1
employee[1]; // returns "John"

var person: [number, string, boolean] = [1, "Steve", true];

// tuple array
var employee2: [number, string][];
employee2 = [[1, "John"], [2, "Adam"], [3, "Jeff"]];
console.log(employee2);

enum Color1 {Red, Green, Blue}
let c: Color1 = Color1.Green;

enum Color2 {Red = 1, Green, Blue}
let colorName: string = Color2[2];

console.log(colorName); // Displays 'Green' as its value is 2 above

enum SugarCaneJuice {Small=20, Medium=30, Large=50}
console.log(SugarCaneJuice.Small);
console.log(SugarCaneJuice.Medium);
console.log(SugarCaneJuice.Large);

//never effectively throws an error whenever it is defined.
//never is rarely used, especially by itself, its primary use is in advanced generics.
let gd:never;

//The never type represents a type of values that never occur. 
//For instance, never is the return type for a function that always throws an exception or one that never returns.
// Function returning never must have unreachable end point
function error(message: string): never {
    throw new Error(message);
}
error("gd");
