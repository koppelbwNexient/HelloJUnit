package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {

		// EXECUTING TESTS
		System.out.println("\nREGULAR TEST RESULTS");
		Result result = JUnitCore.runClasses(MessageUtilTest.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());

		// SUITE TEST
		System.out.println("\nSUITE TEST RESULTS");
		result = JUnitCore.runClasses(SuiteTest.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());

		// PARAMETERIZED TEST
		System.out.println("\nPARAMETERIZED TEST RESULTS");
		result = JUnitCore.runClasses(PrimeNumberCheckerTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());

	}
}
