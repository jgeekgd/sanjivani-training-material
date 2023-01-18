package com.revature.util.java8.datetime.api;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		/**
		 * Current System Clock Time
		 * 
		 * The LocalTime class represents a time without date or timezone information in
		 * the ISO-8601 calendar system. This class does not store or represent a date
		 * or time zone. Instead, it is a local time description, as seen on a wall
		 * clock.
		 * 
		 */

		LocalTime now = LocalTime.now();
		System.out.println("Now Time: " + now);

		// Parse a string
		LocalTime parsedTime = LocalTime.parse("02:08");
		System.out.println("Specific Time: " + parsedTime);

		// specify hour-minute-second - 08:45:20 AM
		LocalTime specificTime1 = LocalTime.of(8, 45, 20);
		System.out.println("08:45:20 AM: " + specificTime1);

		// specify hour-minute-second - 06:45:20 PM
		LocalTime specificTime2 = LocalTime.of(18, 45, 20);
		System.out.println("06:45:20 PM: " + specificTime2);

		/**
		 * The LocalTime class provides various utility methods to get different units
		 * of the time like hours, minutes, seconds, or nanoseconds:
		 */

		int hour = LocalTime.now().getHour();
		int minutes = LocalTime.now().getMinute();
		int seconds = LocalTime.now().getSecond();
		int nanoseconds = LocalTime.now().getNano();

		System.out.println("Hours: " + hour);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
		System.out.println("Nanoseconds: " + nanoseconds);

		/**
		 * You can also compare two local times to check if a given local time is after
		 * or before another local time, as shown below:
		 */
		
		// create local times
		LocalTime time1 = LocalTime.parse("05:15");
		LocalTime time2 = LocalTime.parse("21:00");

		// is `time1` before `time2`?
		boolean isBefore = time1.isBefore(time2);
		System.out.println("LocalTime.parse(\"05:15\").isBefore(LocalTime.parse(\"21:00\")): "+isBefore);

		// is `time1` after `time2`?
		boolean isAfter = time1.isAfter(time2);
		System.out.println("LocalTime.parse(\"05:15\").isAfter(LocalTime.parse(\"21:00\")): "+isAfter);
	}
}
