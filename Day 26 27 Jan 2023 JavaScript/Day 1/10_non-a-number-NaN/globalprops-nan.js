if (isNaN(1)) {
  console.log("Not a Number");
} else {
  console.log("Number");
}

function sanitise(x) {
  if (isNaN(x)) {
    return NaN;
  }
  return x;
}

console.log(sanitise("1"));
// expected output: "1"

console.log(sanitise("1s1"));
// expected output: NaN
