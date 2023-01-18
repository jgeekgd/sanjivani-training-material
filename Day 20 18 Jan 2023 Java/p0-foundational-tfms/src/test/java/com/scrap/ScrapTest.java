package com.scrap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.revature.util.Calculator;

public class ScrapTest {
	
	@Test
	public void testAddMethod() {
		Calculator calc= new Calculator();
		int result=calc.add(12,12);
		assertEquals(24, result);
	}

}
