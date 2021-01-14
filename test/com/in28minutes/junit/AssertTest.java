package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	void test() {
		boolean condn = true;

		assertEquals(1, 2);

		assertTrue(condn);

		assertFalse(condn);
		
		assertNotNull(condn);
		
		assertNull(condn);
		
//		assertArrayEquals(expected, actual);

	}

}
