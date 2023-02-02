 
package com.support;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class MyDateTime
{
    public static String getDateTime()
    {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
   
}