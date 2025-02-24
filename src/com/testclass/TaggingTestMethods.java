package com.testclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.junitclass.Calculator;

public class TaggingTestMethods {
	
	Calculator c;

	@BeforeEach
	public void beforEachMethod() {
		c = new Calculator();
	}
	
	@Tag("Important")
	@Test
	void additionValidTest() {

		int expectedvalue = 5;
		int actualValue = c.addition(2, 3);
		Assertions.assertEquals(expectedvalue, actualValue);
		System.out.println("Imp");
	}
	
	@Tag("Success")
	@Test
	void additionValidTest1() {

		int expectedvalue = 5;
		int actualValue = c.addition(2, 3);

		Assertions.assertEquals(expectedvalue, actualValue);
		System.out.println("S");
	}
	
	@Tag("Success")
	@Test
	void additionValidTest2() {
		
		int expectedvalue = 5;
		int actualValue = c.addition(2, 3);

		Assertions.assertEquals(expectedvalue, actualValue);
		System.out.println("S");
	}
	
	@Tag("Failure")
	@Test
	void additionValidTest3() {

		int expectedvalue = 5;
		int actualValue = c.addition(2, 3);

		Assertions.assertEquals(expectedvalue, actualValue);
		System.out.println("F");
	}
	
	@Tag("Failure")
	@Test
	void additionValidTest4() {

		int expectedvalue = 5;
		int actualValue = c.addition(2, 3);

		Assertions.assertEquals(expectedvalue, actualValue);
		System.out.println("F");
	}
	
	@Tag("Important")
	@Test
	void additionValidTest5() {

		int expectedvalue = 5;
		int actualValue = c.addition(2, 3);

		Assertions.assertEquals(expectedvalue, actualValue);
		System.out.println("Imp");
	}

}
