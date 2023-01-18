package com.revature.util.java8.datetime.api;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeDemo {
	public static void main(String[] args) {

		/**
		 * The LocalDateTime class is used to represent both local date and time without
		 * timezone information. It is a date description used for birthdays, combined
		 * with the local time, as seen on a wall clock.
		 */

		// use system clock
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Now Date Time:" + now);

		// parse a string
		LocalDateTime parseDt = LocalDateTime.parse("2019-08-02T15:20");
		System.out.println("Parsed Date Time: " + parseDt);

		// specify data and time units
		LocalDateTime specificDt = LocalDateTime.of(2019, Month.AUGUST, 2, 15, 20);
		System.out.println("Specific Date Time: " + specificDt);

		/**
		 * You can also compare two LocalDateTime instances to check if the given
		 * instance is after or before the other one:
		 */

		// create local dates and times
		LocalDateTime dt1 = LocalDateTime.parse("2019-08-08T05:10");
		LocalDateTime dt2 = LocalDateTime.parse("2019-08-08T05:11");

		// check if `dt1` is after `dt2`
		boolean isAfter = dt1.isAfter(dt2);
		System.out.println("LocalDateTime.parse(\"2019-08-08T05:10\").isAfter(LocalDateTime.parse(\"2019-08-08T05:11\")): "+isAfter);

		// check if `dt1` is before `dt2`
		boolean isBefore = dt1.isBefore(dt2);
		System.out.println("LocalDateTime.parse(\"2019-08-08T05:10\").isBefore(LocalDateTime.parse(\"2019-08-08T05:11\")): "+isBefore);
		
	}
}
