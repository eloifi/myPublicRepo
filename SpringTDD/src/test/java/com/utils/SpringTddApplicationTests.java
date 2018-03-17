package com.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class SpringTddApplicationTests {

	@Test
	public void unEtun() {
		int a=1;
		int b=1;
		assertTrue(2==a+b);
	}
	@Test
	public void unEt2() {
		int a=1;
		int b=2;
		assertEquals(3,a+b);
	}

}
