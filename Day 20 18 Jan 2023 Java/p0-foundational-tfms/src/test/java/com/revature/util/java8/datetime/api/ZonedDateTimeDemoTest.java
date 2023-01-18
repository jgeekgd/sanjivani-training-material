package com.revature.util.java8.datetime.api;

import static org.junit.Assert.assertEquals;

import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class ZonedDateTimeDemoTest {
	ZonedDateTimeDemo zonedDateTimeDemo;

	@Before
	public void setUp() throws Exception {
		System.out.println("---------ZonedDateTimeDemoTest before every test---------");
		zonedDateTimeDemo = new ZonedDateTimeDemo();

	}

	@Test
	public void testGetAllZones() {
		TreeSet<String> allZones = zonedDateTimeDemo.getAllZones();
		assertEquals(6021, allZones.size());
	}
}

/**
 * 
 * The common methods of Assert class are as follows:
 * 
 * void assertEquals(boolean expected,boolean actual): checks that two
 * primitives/objects are equal. It is overloaded.
 * 
 * void assertTrue(boolean condition): checks that a condition is true.
 * 
 * void assertFalse(boolean condition): checks that a condition is false.
 * 
 * void assertNull(Object obj): checks that object is null.
 * 
 * void assertNotNull(Object obj): checks that object is not null.
 * 
 */
