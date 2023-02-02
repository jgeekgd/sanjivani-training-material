// The static String.raw() method is a tag function of template literals. 
// This is similar to the r prefix in Python, or the @ prefix in C# for string literals. 
// (But it is not identical; see explanations in this issue.) 
// It's used to get the raw string form of template literals, that is, substitutions (e.g. ${foo}) are processed, but escapes (e.g. \n) are not.

// Create a variable that uses a Windows
// path without escaping the backslashes:

let filePath = "C:\iGD\profile\about_me.html"; //no use 
console.log(`The file was uploaded from: ${filePath}`); //C:iGDprofileabout_me.html

filePath = `C:\iGD\profile\about_me.html`; //no use 
console.log(`The file was uploaded from: ${filePath}`); //C:iGDprofileabout_me.html

filePath = String.raw`C:\iGD\profile\about_me.html`;   
console.log(`The file was uploaded from: ${filePath}`); //C:\iGD\profile\about_me.html  
