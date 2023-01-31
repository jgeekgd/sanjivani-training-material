function add(a,b){
  console.log(a+b);
}
function multiply(a,b){
  console.log(a*b);
}

function calculate(a,b, operation){
  operation(a,b);
}
calculate(2,3,add);
calculate(2,3,multiply);