package com.bjs.TestngDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDemo {
	@Test
	public void firstMethod()
	{
		System.out.println("First Method");
	}
	@Test
	public void secondMethod()
	{
		System.out.println("Second Method");
	}
	@BeforeMethod
	public void thirdMethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void fourthMethod()
	{
		System.out.println("After Method");
	}
	@BeforeClass
	public void fifthMetod()
	{
		System.out.println("Before class");
	}
	@AfterClass
	public void sixthMethod()
	{
		System.out.println("After class");
	}

}
