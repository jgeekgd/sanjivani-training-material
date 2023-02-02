//The Promise object represents the eventual completion (or failure) of an asynchronous operation and its resulting value.
//https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise

var makePizza;
makePizza = false;
let pizzaPromise = new Promise(function (resolve, reject) {
  if (makePizza) {
    resolve("Yum, pizza!");
  } else {
    reject("No pizza for you");
  }
});
console.log(pizzaPromise);

//Run above code in Firefox with both below values:
//makePizza = true;
//makePizza = false;
