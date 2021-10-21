package com.allegis.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.allegis.pages.HomePage;

public class FirstTestClass extends Testbase {

	@Test
	public void firstTest() throws Exception {
		HomePage homepage = new HomePage(driver);
		homepage.Search();
		Thread.sleep(5000);
		homepage.Submit();
		String pagetitle = driver.getTitle();
		Assert.assertEquals(pagetitle, "Amazon.in : Electronics");
	}
}
