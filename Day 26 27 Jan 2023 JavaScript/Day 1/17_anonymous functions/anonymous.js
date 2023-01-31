var greeting=function(username, occasion, message) {
    const sendThis = "Hello "+ username + "!\n"+
                    message+" \n"+
                    "["+occasion+"]\n\n";
    console.log(sendThis);
    return sendThis;
}
greeting('GD','New Year', 'Happy New Year To Tamil Nadu');
greeting('James','Birthday', 'Happy Birthday');
greeting('Rogger','Death', 'Condolenses');
greeting('Kenu','Bundle of Joy', 'Congratulations on arrival of new baby girl!');

//var hacker=greeting('GD','New Year', 'Happy New Year To Tamil Nadu');
//hacker();  TypeError: hacker is not a function

