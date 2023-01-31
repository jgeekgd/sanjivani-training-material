const name = "Jesse";
const age = 40;

export { name, age }; //Named Exports needs curly braces

// Modules
// JavaScript modules allow you to break up your code into separate files.
// This makes it easier to maintain a code-base.
// Modules are imported from external files with the import statement.
// Modules also rely on type="module" in the <script> tag.

// Export:
// Modules with functions or variables can be stored in any external file.
// There are two types of exports: Named Exports and Default Exports.
//You can create named exports two ways. In-line individually, or all at once at the bottom.
// In-line individually:
//       person.js
//  export const name = "Jesse";
//  export const age = 40;
// All at once at the bottom:
//      person.js
//  const name = "Jesse";
//  const age = 40;
//  export {name, age};

// Default Exports
// Let us create another file, named message.js, and use it for demonstrating default export.
// You can only have one default export in a file.
// Example
// message.js
// const message = () => {
// const name = "Jesse";
// const age = 40;
// return name + ' is ' + age + 'years old.';
// };
// export default message;
