package com.revature.test.suite.run.in.main;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.revature.test.suite.JunitTestSuite;

public class TestRunner {
	public static void main(String[] args) {
		
		//You can mention the name of individual class or the suite class
		Result result = JUnitCore.runClasses(JunitTestSuite.class);

		for (Failure failure : result.getFailures()) {
			System.out.println("JunitTestSuite Failure : "+failure.toString());
		}

		System.out.println("JunitTestSuite Successful : "+result.wasSuccessful());
	}
}