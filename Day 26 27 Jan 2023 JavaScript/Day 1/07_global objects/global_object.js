// Invoke this code from browser the output is same:
// Invoke this code from node js & see errors:
function gd() {
  console.log(this);
}
gd();

function globalObj() {
  console.log(window);
}
globalObj();
