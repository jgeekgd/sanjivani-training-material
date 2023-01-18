package com.revature.util.java8.datetime.api;

import java.time.LocalDate;

public class LocaDateDemo {

	public static void main(String[] args) {
		/**
		 * Create an instance of the current local date
		 * 
		 * The LocalDate class represents a date without time in the ISO-8601 format
		 * (yyyy-MM-dd)
		 */
		LocalDate now = LocalDate.now();
		System.out.println("Now Date:" + now);

		/**
		 * To create an instance of LocalDate for a specific day, month, and year, you
		 * can use the LocalDate.of() method:
		 */

		LocalDate localDate = LocalDate.of(2050, 12, 20);
		System.out.println("Specific Date: " + localDate);

		/**
		 * Utility methods
		 */
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		System.out.println("Tomorrow: " + tomorrow);
		LocalDate yesterday = LocalDate.now().minusDays(1);
		System.out.println("Yesterday: " + yesterday);
		LocalDate lastMonth = LocalDate.now().minusMonths(1);
		System.out.println("Last Month: " + lastMonth);

		/**
		 * To check if the current year is leap year, you can do the following:
		 * 
		 * 
		 */
		boolean isLeap = LocalDate.now().isLeapYear();
		System.out.println("Is Leap Year: " + isLeap);

		/**
		 * You can also compare two local dates using isBefore() and isAfter() methods
		 * as shown below:
		 * 
		 */

		// create local dates
		LocalDate date1 = LocalDate.parse("2019-08-02");
		LocalDate date2 = LocalDate.parse("2018-01-05");

		// check if `date1` is before `date2`
		boolean isBefore = date1.isBefore(date2);
		System.out.println("LocalDate.parse(\"2019-08-02\").isBefore(LocalDate.parse(\"2018-01-05\"): " + isBefore);

		// check if `date1` is after `date2`
		boolean isAfter = date1.isAfter(date2);
		System.out.println("LocalDate.parse(\"2019-08-02\").isAfter(LocalDate.parse(\"2018-01-05\"): " + isAfter);

	}
}
