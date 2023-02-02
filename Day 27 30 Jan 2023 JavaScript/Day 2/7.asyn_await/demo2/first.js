// In the below example, each step is carried out sequentially, with each additional function waiting for the one before to resolve or reject before continuing. 
//After one second, we log “Colonel Mustard, in the library, with the candlestick” to the console.

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
async function cluedo() {
  const who = await character();
  const where = await room();
  const using = await weapon();
  console.log(`${who} ${where} ${using}`);
}
cluedo(); // Colonel Mustard, in the library, with the candlestick
