package com.revature.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {

	public static String getCurrentDateTime() {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentDateTime = format.format(date);
		return currentDateTime;
	}
}
