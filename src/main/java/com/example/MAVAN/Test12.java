package com.example.MAVAN;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Test12 {
	@Test
	public void testinput() {
		assertTrue(MavanApplication.numIsEvenOrNot(124));
	}
	@Test
	public void testOddInput() {
		assertFalse(MavanApplication.numIsEvenOrNot(123));
	}
}
