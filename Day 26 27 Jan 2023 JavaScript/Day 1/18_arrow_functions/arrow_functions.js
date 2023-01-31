 // Traditional Anonymous Function
  var myF1=function (a){
    return a + 100;
  }
  console.log(myF1(10));

  // Arrow Function Break Down
  // 1. Remove the word "function" and place arrow between the argument and opening body bracket
  myF1=(a) => {
    return a + 100;
  }
  console.log(myF1(10));

    
  // 2. Remove the body braces and word "return" -- the return is implied.
  myF1=(a) => a + 100;
  console.log(myF1(10));
  
  // 3. Remove the argument parentheses
  myF1=a => a + 100;
  console.log(myF1(10));
  