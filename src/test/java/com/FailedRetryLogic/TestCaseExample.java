package com.FailedRetryLogic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseExample {
	//@Test(retryAnalyzer = RetryAnalyser.class)
	
	@Test
	public void TestCase01() {
		Assert.assertTrue(false);// Failed Test Case
	}
	
	//@Test(retryAnalyzer = RetryAnalyser.class)
	@Test
	public void TestCase02() {
		Assert.assertTrue(false);// Failed Test Case
	}
	
	@Test
	public void TestCase03() {
		Assert.assertTrue(true);// Failed Test Case
	}


}
