package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Z4Test {
	
	 private Z4 z4 = new Z4();
	 
	 @Test
	 void test() {
		assertArrayEquals(new int[] {6,5,4,3,2,1},z4.odwrocTablice(new int[] {1,2,3,4,5,6}));
	}	
	 
	 @Test
	 void test2() {
		assertArrayEquals(new int[] {4,1,234,66,32,77},z4.odwrocTablice(new int[] {77,32,66,234,1,4}));
	}	
}