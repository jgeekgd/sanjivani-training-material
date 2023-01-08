package com.revature.util;

public class Calculator {

	public static int add(int n1, int n2) {
		int result=n1 + n2;
		n1++;
		n2++;
		return result;
	}

	public static  int sub(int n1, int n2) {
		return n1 - n2;
	}

	public static int mul(int n1, int n2) {
		return n1 * n2;
	}

	public static int div(int n1, int n2) {
		return n1 / n2;
	}

	public static int mod(int n1, int n2) {
		return n1 % n2;
	}

}
