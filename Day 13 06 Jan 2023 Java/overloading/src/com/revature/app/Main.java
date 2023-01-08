package com.revature.app;

import com.revature.util.Calculator;

public class Main extends Calculator {

	public void whatMyParentGaveMe() {
		//System.out.println(add(1, 1));
		//System.out.println(add(1, 1.1));
	}

	public static void main(String[] args) {
		Main child = new Main();
		// System.out.println(child.add(15, 10)); //The method add(float, int) is ambiguous for the type Main
		System.out.println(child.add(25, 20.00f));
		System.out.println(child.add(25.00f, 20));
	}

}
