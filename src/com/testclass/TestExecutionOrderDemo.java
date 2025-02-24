package com.testclass;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(value=MethodOrderer.OrderAnnotation.class)  order value 
//@TestMethodOrder(value=MethodOrderer.Random.class)      		random value
//@TestMethodOrder(value=MethodOrderer.Alphanumeric.class)		method name
public class TestExecutionOrderDemo {
	
	@Order(5)
	@Test
	void test1() {
		System.out.println("test 1");
	}

	@Order(4)
	@Test
	void test2() {
		System.out.println("test 2");
	}
	
	@Order(3)
	@Test
	void test3() {
		System.out.println("test 3");
	}
	
	@Order(1)
	@Test
	void test4() {
		System.out.println("test 4");
	}
	
	@Order(2)
	@Test
	void test5() {
		System.out.println("test 5");
	}
}
