package com.common;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.Testings.Calculator;

public class CalculatorTest {

	Calculator cal;
	@Before
	public void before()
	{
		System.out.println("Before");
	}
	
	@After
	public void after()
	{
		System.out.println("After");
	}
	
	
	@Test
	public void testDivide() {
		cal=new Calculator();
		assertEquals(3,cal.divide(6, 2));
		
	}
	@Test(expected=ArithmeticException.class)
	public void testDivideByZero()
	{
		cal=new Calculator();
		assertEquals(2,cal.divide(2, 0));
		
	}
	
	@Ignore
	@Test(timeout=500)
	public void timeout()
	{
		while (true)
		{
			
		}
	}
	

}
