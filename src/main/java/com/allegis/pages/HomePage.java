package com.allegis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	public WebElement searchbar;

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	public WebElement submit;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Search() {
		try {
			searchbar.sendKeys("Electronics");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Submit() {
		try {
			submit.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
