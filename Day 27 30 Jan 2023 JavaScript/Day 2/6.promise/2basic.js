function makePizza(toppings = []) {
  return new Promise(function (resolve, reject) {
    if (toppings.includes("ice-cream")) {
      reject("Seriously? No pizza for you!");
    }
    const amountOfTimeToCook = 500 + toppings.length * 200;
    console.log("CookingTime:" + amountOfTimeToCook);
    setTimeout(function () {
      resolve(
        `Here is your pizza which has the toppings ${toppings.join(" ")}`
      );
    }, amountOfTimeToCook);
  });
}
const yumPizza = makePizza(["cheese", "tomato", "capsicum", "basil", "olives"]);
console.log(yumPizza); // Promise {<pending>} setTimeout(()=>console.log(yumPizza),1501);  //Promise { <state>: "fulfilled", <value>: "Here is your pizza which has the toppings cheese tomato capsicum basil olives" }
const grossPizza = makePizza(["cheese", "ice-cream"]);
console.log(grossPizza); // Promise {<rejected>: "Seriously? No pizza for you!"}
