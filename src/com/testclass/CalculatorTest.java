package com.testclass;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.junitclass.Calculator;

public class CalculatorTest {

	// Test the Addition method
	// <methodNameToBeTested><Valid><Test>
	/*
	 * public int addition(int num1,int num2) { return num1+num2; }
	 */

	Calculator c;

	@BeforeEach
	public void beforEachMethod() {
		System.out.println("Initializating the calculator instance ");
		c = new Calculator();
	}
	
	@AfterEach
	public void afterEachMethod() {
		System.out.println("This method is excuted After Each the method ");
	}

	@BeforeAll
	public static void beforAllMethod() {
		System.out.println("This method is excuted Before all the method ");
	}
	
	@AfterAll
	public static void afterAllMethod() {
		System.out.println("This method is excuted  After All  the method ");
	}

	// TestMethod
	@Test
	@DisplayName("Adding two Integer Number")
	void additionValidTest() {

		// actual value == expected value
		int expectedvalue = 5;
		int actualValue = c.addition(2, 3);

		System.out.println("The Sum of the method: " + actualValue);
	}

	@Test
	@DisplayName("Adding two Negative Integer Number")
	void additionValidTest1() {

		// actual value == expected value
		int expectedvalue = 5;
		int actualValue = c.addition(-2, -3);

		System.out.println("The Sum of the method: " + actualValue);
	}

	@Disabled
	@Test
	void additionValidTest2() {

		// actual value == expected value
		int expectedvalue = 5;
		int actualValue = c.addition(2, 3);

		System.out.println("The Sum of the method: " + actualValue);
	}
	
	@Ignore
	@Test
	void additionValidTest3() {

		// @EnableJUnit4MigrationSupport need to use the class level annotations .
		// actual value == expected value
		int expectedvalue = 5;
		int actualValue = c.addition(2, 3);

		System.out.println("The Sum of the method: " + actualValue);
	}
	
	
	@Timeout(3)
	@Test
	void additionTimeOutValidTest() {
		try {
		Thread.sleep(3000);
		System.out.println("Test Excuted after 3 sec");
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
