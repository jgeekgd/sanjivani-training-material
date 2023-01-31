// The way this code is structured is like our pizza oven can only make one pizza at a time and we are cooking them sequentially.
// What if we had a big oven that would allow us to make all of our pizzas at the same time? We could run our code concurrently, and there are some static methods on the Promise object that can help with that.

function makePizza(toppings = []) {
  return new Promise(function (resolve, reject) {
    if (toppings.includes("ice-cream")) {
      reject("Seriously? No pizza for you!");
    }
    resolve(`Here is your pizza which has the toppings ${toppings.join(" ")}`);
  });
}

function handleError(error) {
  console.log("Oh no, an error!");
  console.log(error);
}

// Promise.allSettled
// The Promise.allSettled() method is very similar to the Promise.all() method except that the return promise will resolve even when one or more of the input promises have been rejected.

const pizzaPromise1 = makePizza(["ham", "cheese", "pineapple"]);
const pizzaPromise2 = makePizza(["cheese", "ice-cream"]);
const pizzaPromise3 = makePizza(["sausage", "onions", "mushroom", "pepperoni"]);

const dinnerPromise = Promise.allSettled([
  pizzaPromise1,
  pizzaPromise2,
  pizzaPromise3,
]);

dinnerPromise.then(function (pizzas) {
  console.log(
    "GD Promise Object (This is Array of all Promises:",
    dinnerPromise
  );
  console.log(
    "GD Pizza Detail (This is Array of Result of each Promise):",
    pizzas
  );
});

// Output:
// Promise { <state>: "fulfilled", <value>: (3) […] }
// ​<state>: "fulfilled"
// ​<value>: Array(3) [ {…}, {…}, {…} ]
// ​0: Object { status: "fulfilled", value: "Here is your pizza which has the toppings ham cheese pineapple" }
// ​status: "fulfilled"
// ​value: "Here is your pizza which has the toppings ham cheese pineapple"
// ​<prototype>: Object { … }
// ​1: Object { status: "rejected", reason: "Seriously? No pizza for you!" }
// ​reason: "Seriously? No pizza for you!"
// ​status: "rejected"
// ​<prototype>: Object { … }
// ​2: Object { status: "fulfilled", value: "Here is your pizza which has the toppings sausage onions mushroom pepperoni" }
// ​status: "fulfilled"
// ​value: "Here is your pizza which has the toppings sausage onions mushroom pepperoni"
// ​<prototype>: Object { … }
// ​length: 3
