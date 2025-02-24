package com.testclass;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junitclass.Calculator;

public class CalculatorTest {
	
	//Test the Addition method
	//<methodNameToBeTested><Valid><Test>
             /*	public int addition(int num1,int num2) {
	             	return num1+num2;
	            }
             */
	
	
	//testMethod
	@Test
	@DisplayName("Adding two Integer Number")
	void additionValidTest() {
		
		Calculator c=new Calculator();
		
		//actual value == expected value
		int expectedvalue=5;
		int actualValue=c.addition(2,3);
		
		System.out.println("The Sum of the method: "+actualValue);
	}
	
	
	@Test
	@DisplayName("Adding two Negative Integer Number")
	void additionValidTest1() {
		
		Calculator c=new Calculator();
		
		//actual value == expected value
		int expectedvalue=5;
		int actualValue=c.addition(-2,-3);
		
		System.out.println("The Sum of the method: "+actualValue);
	}
	
	@Disabled
	@Test
	void additionValidTest2() {
		
		Calculator c=new Calculator();
		
		//actual value == expected value
		int expectedvalue=5;
		int actualValue=c.addition(2,3);
		
		System.out.println("The Sum of the method: "+actualValue);
	}
	
	
	
	

}
