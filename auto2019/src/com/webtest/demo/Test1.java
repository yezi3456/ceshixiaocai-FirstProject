package com.webtest.demo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(com.webtest.demo.ApiListener.class)
public class Test1 {
	@Test
	public void test0() {
		assertEquals(1, 2);
	}
	@Test
	public void test2() {
		assertEquals(1, 4);
	}

	@Test
	public void test3() {
		assertEquals(1, 1);

	}

}
