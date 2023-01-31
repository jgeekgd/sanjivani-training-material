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

function handleError(error) {
  console.log('Oh no, an error!');
  console.log(error);
}

//chain of promises

makePizza(['pepperoni'])
.then(function (pizza) {
  console.log(pizza); // Here is your pizza which has the toppings pepperoni
  return makePizza(['ham', 'cheese', 'pineapple']);
})
.then(function (pizza) {
  console.log(pizza); // Here is your pizza which has the toppings ham cheese pineapple
  return makePizza(['cheese', 'tomato', 'capsicum', 'basil', 'olives']);
})
.then(function (pizza) {
  console.log(pizza); // Here is your pizza which has the toppings cheese tomato capsicum basil olives
})
.catch(handleError);