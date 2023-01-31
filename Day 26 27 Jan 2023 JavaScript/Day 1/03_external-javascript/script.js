function getDateTime() {
    // program to display the date
    // get local machine date time
    const date = new Date();

    // get the date as a string
    const dateString = date.toDateString();

    // get the time as a string
    const timeString = date.toLocaleTimeString();

    // display date
    console.log('Date: ' + dateString);
    // display time
    console.log('Time: ' + timeString);
    return dateString+"<br>"+timeString;
}
