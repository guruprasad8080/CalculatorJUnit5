package com.testclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.junitclass.Calculator;

public class RepeatedTestDemo {
	
	@RepeatedTest(value = 5)
	@Test
	public void afterEachMethod() {
		Calculator c=new Calculator();
		int expectedvalue = 5;
		int actualValue = c.addition(2, 3);

		Assertions.assertEquals(expectedvalue, actualValue);
	}


}
