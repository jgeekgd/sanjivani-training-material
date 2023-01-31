//Run directly inside Mozilla firefox

const xhr = new XMLHttpRequest();  //STEP 2
const method = "GET"; 
const url = "https://dummyjson.com/products/6";

xhr.open(method, url, true);
xhr.onreadystatechange = () => {
  // In local files, status is 0 upon success in Mozilla Firefox
  if (xhr.readyState === XMLHttpRequest.DONE) {
    const status = xhr.status;
    if (status === 0 || (status >= 200 && status < 400)) {
      // The request has been completed successfully
      //console.log(xhr.responseText);
      var responseJsonObj = JSON.parse(xhr.responseText);
      console.log(responseJsonObj.title);
      console.log(responseJsonObj.price);
    } else {
      // Oh no! There has been an error with the request!
    }
  }
};
xhr.send();

//Notes:
//https://github.com/Ovi/DummyJSON
//We can also use below GET with query parameter
//const url = "https://dummyjson.com/products/6";
//In the GET method, the query data is sent as URL parameters
//In the POST method, the data is sent to the server as a part of the HTTP request body, which is not visible in the URL.
