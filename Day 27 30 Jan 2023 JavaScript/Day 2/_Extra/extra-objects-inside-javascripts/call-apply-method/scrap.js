function Product(name, price) {
  this.name = name;
  this.price = price;
}

let pizza = {};
console.log(pizza);
Product.call(pizza, "Pepperoni Pizza", 250);
console.log(pizza.name);
console.log(pizza.price);

function Food(name, price) {
  Product.call(this, name, price); // adds two more properties into Food object
  this.category = "food";
}
let junk = new Food("cheese", 5);
console.log(junk);
console.log(junk.name);
