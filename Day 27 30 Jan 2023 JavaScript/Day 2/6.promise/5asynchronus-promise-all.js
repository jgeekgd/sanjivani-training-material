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

// Promise.all
// The Promise.all() method takes a group of promises as an input and returns a single promise that resolves to an array of the results of the input promises. The returned promise resolves when all of the input promises have resolved, and rejects immediately if any of the input promises reject.

// if one value is rejected it will not complete  no promise will work
// const pizzaPromise4 = makePizza(['ice-cream']);
// const dinnerPromise = Promise.all([pizzaPromise1, pizzaPromise2, pizzaPromise3,pizzaPromise4]);

const pizzaPromise1 = makePizza(["ice-cream", "cheese", "pineapple"]);
const pizzaPromise2 = makePizza([
  "cheese",
  "tomato",
  "capsicum",
  "basil",
  "olives",
]);
const pizzaPromise3 = makePizza(["sausage", "onions", "mushroom", "pepperoni"]);

const dinnerPromise = Promise.all([
  pizzaPromise1,
  pizzaPromise2,
  pizzaPromise3,
]);
dinnerPromise.then(function (pizzas) {
  console.log(dinnerPromise);
  console.log(pizzas);
});

// Output:
// Promise { <state>: "fulfilled", <value>: (3) […] }
// Array(3) [ "Here is your pizza which has the toppings ham cheese pineapple",
// "Here is your pizza which has the toppings cheese tomato capsicum basil olives",
// "Here is your pizza which has the toppings sausage onions mushroom pepperoni" ]
// ​0: "Here is your pizza which has the toppings ham cheese pineapple"
// ​1: "Here is your pizza which has the toppings cheese tomato capsicum basil olives"
// ​2: "Here is your pizza which has the toppings sausage onions mushroom pepperoni"
// ​length: 3
