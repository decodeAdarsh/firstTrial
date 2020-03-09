package com.common;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.Testings.RandomNum;

@RunWith(Parameterized.class)
public class RandomNumTest {
	private RandomNum randomNum;
	
	public RandomNumTest()
	{

	}
	@Parameterized.Parameters
	public static Collection RandomNumber()
	{
		 System.out.println("Inside Static collection");
		return Arrays.asList(new Object[][] {{},{},{},{}});
	}
	@Before
	public void initialize()
	{
		System.out.println("Inside Initialize");
		
		randomNum=new RandomNum();
		System.out.println("Random num= "+randomNum.generateRandom());
	}
	@Test
	public void testIsrandom() {
		System.out.println("Inside testIsRandom()");
		assertTrue(randomNum.generateRandom()<100);
	}
	
}

