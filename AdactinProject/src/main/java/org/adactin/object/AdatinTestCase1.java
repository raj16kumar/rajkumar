package org.adactin.object;

import org.adactinproject.baseclass.AdactinBaseclass1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdatinTestCase1 extends AdactinBaseclass1{
	
	@FindBy(id="username")
	private WebElement uername;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement click;

	public WebElement getUername() {
		return uername;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getClick() {
		return click;
	}
	
	public AdatinTestCase1() {
		PageFactory.initElements(driver, this);
	}

}
