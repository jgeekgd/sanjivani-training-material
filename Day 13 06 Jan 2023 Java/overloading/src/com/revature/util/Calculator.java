package com.revature.util;

//Rules of Overloading/Early Binidng/Static Polymorphysm/Compile Time Polymorphysm
// Not required:
// 1. Access modifier - may or may not be same
// 2. Non Access Modifer - does not matter
// 3. Return type of method -may or may not be same
// Mandatory Required:
// 1. Name of methods - must be same
// 2. Methods signature - must be different
//  	-- No of paramters
//		-- Type of paramters
//		-- Sequence of parameters
// Be careful while performin overloading with methods having var-args arguments and normal methods wihtout var-arg arguments.
public class Calculator {

	public double add(float b, int a) {
		return a + b;
	}

	protected double add(int a, float b) {
		return a + b;
	}
}
