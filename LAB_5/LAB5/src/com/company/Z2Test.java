package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Z2Test {
	
	 private Z2 z2 = new Z2();
	 
	 @Test
	 void test() {
		assertTrue(z2.sprawdzTablice(new int[] {5,6,7,1,2,3,1,1,1}));
	}
	 
	 @Test
	 void test2() {
			assertFalse(z2.sprawdzTablice(new int[] {5,6,7,1,2,5,1,2,2}));
	}
		 
}