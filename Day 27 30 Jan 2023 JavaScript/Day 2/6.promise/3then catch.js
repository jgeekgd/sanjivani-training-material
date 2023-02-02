function makePizza(toppings = []) {
  return new Promise(function (resolve, reject) {
    if (toppings.includes("ice-cream")) {
      reject("Seriously? No pizza for you!");
    }
    const amountOfTimeToCook = 500 + toppings.length * 200;
    setTimeout(function () {
      resolve(
        `Here is your pizza which has the toppings ${toppings.join(" ")}`
      );
    }, amountOfTimeToCook);
  });
}

// To access the resolved value of a promise we use the then() method.
// Consuming Promises:The then() method takes two optional arguments which are callback functions. // The first argument is a callback for the success case of the promise, the second is for the failure case.
// p.then(onFulfilled[, onRejected]);
// p.then(value => {
//   // fulfillment
// }, reason => {
//   // rejection
// });
// As the Promise.prototype.then() and Promise.prototype.catch() methods return promises, they can be chained.

makePizza(["pepperoni"]).then(
  (pizza) => {
    console.log(pizza); // Here is your pizza which has the toppings pepperoni
  },
  (reason) => {
    console.info(reason); // Error! you can also use console.error(reason);
  }
);

// old style without Arrow Functions
makePizza(["pepperoni", "ice-cream"]).then(
  function (pizza) {
    console.log(pizza + " -------- I am here"); //
  },
  function (reason) {
    console.info(reason + " -------- I am here"); // Error! you can also use console.error(reason);
  }
);

// ------------------------------------------------------

function handleError(error) {
  console.log("Oh no, an error!");
  console.log(error);
}

makePizza(["cheese", "ice-cream"])
  .then(function (pizza) {
    console.log(pizza);
  })
  .catch(handleError); // Code like boss...  // Callback Function
