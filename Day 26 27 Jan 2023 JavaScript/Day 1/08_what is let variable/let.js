function gd(){

    {
        let y = 2;
          {
          let y = 3;
          console.log(y);
        }
        console.log(y);
      }
    //console.log(y); //Uncaught ReferenceError: y is not defined
  }
  
  gd();