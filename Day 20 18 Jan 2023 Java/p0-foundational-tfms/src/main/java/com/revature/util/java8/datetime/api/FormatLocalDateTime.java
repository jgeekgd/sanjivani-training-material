package com.revature.util.java8.datetime.api;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class FormatLocalDateTime {
	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.of(2019, Month.DECEMBER, 18, 9, 45);
		
		// ISO date format (yyyy-MM-dd) - 2019-12-18
		String isoDate = date.format(DateTimeFormatter.ISO_DATE);
		String isoTime = date.format(DateTimeFormatter.ISO_TIME);
		String isoDateTime = date.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println("ISO Date: " + isoDate);
		System.out.println("ISO Time: " + isoTime);
		System.out.println("ISO DateTime: " + isoDateTime);

		String customFormat = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm a"));
		System.out.println("Custom Date Time format:" + customFormat);

		// Best material: https://mkyong.com/java8/java-8-zoneddatetime-examples/
		ZonedDateTime nowUTC = ZonedDateTime.now(ZoneOffset.UTC);
		System.out.println("ZonedDateTime in UTC: " + nowUTC);
		ZonedDateTime localDateTimeOfUtc = nowUTC.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
		System.out.println("LocalDateTime in IST: " + localDateTimeOfUtc.toLocalDateTime());
		ZonedDateTime localDateTimeOfUsaCst = nowUTC.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println("LocalDateTime in CST: " + localDateTimeOfUsaCst.toLocalDateTime());

		// DifferenceBetweenTwoLocalDateTimeDuration

		LocalDateTime dateBefore = LocalDateTime.of(1978, Month.APRIL, 24, 6, 40, 00);
		LocalDateTime dateAfter = LocalDateTime.now();

		long noOfYears = ChronoUnit.YEARS.between(dateBefore, dateAfter);
		long noOfMonths = ChronoUnit.MONTHS.between(dateBefore, dateAfter);
		long noOfWeeks = ChronoUnit.WEEKS.between(dateBefore, dateAfter);
		long noOfDays = ChronoUnit.DAYS.between(dateBefore, dateAfter);
		long noOfHours = ChronoUnit.HOURS.between(dateBefore, dateAfter);
		long noOfMinutes = ChronoUnit.MINUTES.between(dateBefore, dateAfter);
		long noOfSeconds = ChronoUnit.SECONDS.between(dateBefore, dateAfter);

		System.out.println("Years: " + noOfYears);
		System.out.println("Months: " + noOfMonths);
		System.out.println("Weeks: " + noOfWeeks);
		System.out.println("Days: " + noOfDays);
		System.out.println("Hours: " + noOfHours);
		System.out.println("Minutes: " + noOfMinutes);
		System.out.println("Seconds: " + noOfSeconds);
	}
}
