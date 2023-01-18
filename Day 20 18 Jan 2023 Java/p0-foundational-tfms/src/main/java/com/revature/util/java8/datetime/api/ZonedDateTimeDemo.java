package com.revature.util.java8.datetime.api;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.TreeSet;

//https://attacomsian.com/blog/java-new-date-time-api#localdate-class
public class ZonedDateTimeDemo {
	public static void main(String[] args) {
		/**
		 * The ZonedDateTime and ZoneId classes were added to Java 8 new date and time
		 * API to deal with situations where you can need the timezone information.
		 * 
		 * The ZoneId is an identifier used to identify different timezones. There are
		 * around 40 different timezones provided by ZoneId.
		 */

	new ZonedDateTimeDemo().getAllZones();

		ZoneId india = ZoneId.of("Asia/Kolkata");
		//System.out.println(india);

		/**
		 * The ZonedDateTime class represents a date-time with a time-zone in the
		 * ISO-8601 format (e.g. 2019-12-20T10:15:30+05:00 Asia/Karachi). It stores all
		 * date and time fields, to a precision of nanoseconds, and a timezone, with a
		 * zone offset used to handle ambiguous local date times.
		 * 
		 * 
		 * To obtain the current date-time from the system clock in the default
		 * timezone, you can use ZonedDateTime.now() as shown below:
		 * 
		 */

		ZonedDateTime now = ZonedDateTime.now();
		System.out.println("Now Date Time Zone: " + now);

		/**
		 * An instance of LocalDateTime can also be converted to a specific zone to
		 * create a new ZonedDateTime
		 */

		//ZonedDateTime zonedDt = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/New_York"));
		//System.out.println("LocalDateTime in America/New_York Time Zone is:" + zonedDt);

	}

	TreeSet<String> getAllZones() {
		Set<String> zones = ZoneId.getAvailableZoneIds();

		TreeSet<String> treeSet = new TreeSet<String>(zones);
		for (String val : treeSet)
			System.out.println(val);

		System.out.println("Total Available ZoneIds:" + zones.size());
		return treeSet;
	}
}
