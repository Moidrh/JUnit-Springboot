package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath m = new MyMath();
	
	@BeforeEach
	public void before() {
		System.out.println("Before");
	}
	
	@AfterEach
	public void after() {
		System.out.println("After");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

	@Test
	void sum_with3numbers() {
		System.out.println("sum_with3numbers");
		/** Absence of failure is success */
		int[] number = { 1, 2, 3 };

		m.sum(number);

		assertEquals(6, m.sum(number));

	}
	
	@Test
	void sum_with1number() {
		System.out.println("sum_with1number");
		/** Absence of failure is success */
		int[] number = {3};

		m.sum(number);

		assertEquals(3, m.sum(number));

	}

}
