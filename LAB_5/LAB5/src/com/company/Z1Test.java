package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Z1Test {
	 private Z1 z1 = new Z1();
	 
	 @Test
	 void test() {
		 assertTrue(z1.sprawdzTemperature(99, 1));
	 }
	 
	 @Test
	 void test2() {
		 assertFalse(z1.sprawdzTemperature(150, 110));
	 }
}