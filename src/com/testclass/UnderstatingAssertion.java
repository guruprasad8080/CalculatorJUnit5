package com.testclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junitclass.Calculator;

public class UnderstatingAssertion {

	Calculator c;

	@BeforeEach
	public void beforEachMethod() {
		System.out.println("Initializating the calculator instance ");
		c = new Calculator();
	}

	// Test Method Traditional Method 
	@Test
	@DisplayName("Adding Traditional Two Integer Number")
	void additionValidOldTest() {
		// actual value == expected value
		int expectedvalue = 5;
		int actualValue = c.addition(2, 3);

		if (expectedvalue == actualValue) {
			System.out.println("TestCase Passed..");
		} else {
			System.out.println("TestCase Failed");
		}

	}

	@Test
	@DisplayName("Adding two Integer Number")
	void additionAssertionEqualsValidTest() {
		// actual value == expected value
		int expectedvalue = 4;
		int actualValue = c.addition(2, 3);

		Assertions.assertEquals(expectedvalue, actualValue);
	
	}
	
	@Test
	void additionAssertionNullValidTest() {
		
		Calculator c=null;
		Calculator c1=new Calculator();
		
		// Assertions.assertNull(c); Passed Test Case
		Assertions.assertNull(c1);  //Fail Test Case

	}
	
	
	

}
