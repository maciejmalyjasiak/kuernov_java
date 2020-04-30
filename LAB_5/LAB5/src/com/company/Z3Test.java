package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Z3Test {
	
	 private Z3 z3 = new Z3();
	 
	 @Test
	 void test() {
		assertEquals("123",z3.ZwrocPolowe("123456"));
	}	
	 
	 @Test
	 void test2() {
		assertEquals("ab",z3.ZwrocPolowe("abcde"));
	}	
}