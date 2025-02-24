package com.testinterface;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import com.junitclass.Calculator;

public interface CalculatorTestInterface {
	
	

	@BeforeEach
	public static void beforEachMethod() {
		System.out.println("Initializating the calculator instance ");
		Calculator c;
		c = new Calculator();
	}
	
	@AfterEach
	public static void afterEachMethod() {
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

}
