function character() {
  return new Promise(function (resolve) {
    setTimeout(() => {
      resolve("Colonel Mustard,");
    }, 400);
  });
}
function room() {
  return new Promise(function (resolve) {
    setTimeout(() => {
      resolve("in the library,");
    }, 1000);
  });
}
function weapon() {
  return new Promise(function (resolve) {
    setTimeout(() => {
      resolve("with the candlestick");
    }, 600);
  });
}

// more better way
async function cluedo() {
  const whoDidIt = await Promise.all([character(), room(), weapon()]);
  console.log(whoDidIt); // (3) ["Colonel Mustard,", "in the library,", "with the candlestick"]
  console.log(`${whoDidIt[0]} ${whoDidIt[1]} ${whoDidIt[2]}`); // Colonel Mustard, in the library, with the candlestick
}
cluedo();

