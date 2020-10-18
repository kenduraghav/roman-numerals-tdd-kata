package com.examples.tdd.kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RomanNumeralsConvertorTests {

	
	@Test
	public void test() {
		assertTrue(true);
	}
	
	@Test
	public void convertSingleRomanDigit() {
		assertEquals(1, RomanNumeralsConvertor.convert("I"));
		assertEquals(2, RomanNumeralsConvertor.convert("II"));
		assertEquals(5, RomanNumeralsConvertor.convert("V"));
		assertEquals(10, RomanNumeralsConvertor.convert("X"));
	}
	
	@Test
	public void romanNumeralAddition() {
		assertEquals(2, RomanNumeralsConvertor.convert("II"));
		assertEquals(3, RomanNumeralsConvertor.convert("III"));
		assertEquals(6, RomanNumeralsConvertor.convert("VI"));
	}
	
}
