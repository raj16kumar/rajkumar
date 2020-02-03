package org.adactin.setpdefinition;

import org.adactin.object.AdatinTestCase1;
import org.adactinproject.baseclass.AdactinBaseclass1;
import org.adactinproject.runner.Adactin1TestRunner;
import org.openqa.selenium.remote.html5.AddApplicationCache;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactin1StepDefinition extends AdactinBaseclass1 {
	
	@Given("^user opens the chrome browser$")
	public void user_opens_the_chrome_browser() throws Throwable {
	    launchUrl("https://adactin.com/HotelApp/index.php");

	}

	@Then("^User enter the username in username field$")
	public void user_enter_the_username_in_username_field() throws Throwable {
   AdatinTestCase1 ad=new AdatinTestCase1();
   enterText(ad.getUername(), "rajramesh");
	}

	@Then("^User enter the Password in password field$")
	public void user_enter_the_Password_in_password_field() throws Throwable {
	 AdatinTestCase1 ad=new AdatinTestCase1();
	 enterText(ad.getPass(), "raj1607$");
	}

	@Then("^user click login button to login the application$")
	public void user_click_login_button_to_login_the_application() throws Throwable {
		AdatinTestCase1 ad= new AdatinTestCase1();
		enterclick(ad.getClick());
	    
	}

}
