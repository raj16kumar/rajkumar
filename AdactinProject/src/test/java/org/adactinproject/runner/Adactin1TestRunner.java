package org.adactinproject.runner;

import org.adactinproject.baseclass.AdactinBaseclass1;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.json.Json;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"pretty","json:src\\test\\java\\org\\adactin\\reports.json","junit:src\\\\test\\\\java\\\\org\\\\adactin\\\\reports.xml",
		"html:src\\\\test\\\\java\\\\org\\\\adactin\\\\reports"},
		features="C:\\Users\\Sadhana\\eclipse-workspace\\AdactinProject\\Features\\adactin1.feature",
		glue="org.adactin.setpdefinition",dryRun=false,strict=true,monochrome=true,tags="@TC-101")

public class Adactin1TestRunner {
	
	public static WebDriver driver;
	
	@BeforeClass
       public static void driveropen() throws Exception {
		AdactinBaseclass1.OpenApp();

	}
	
	@AfterClass
	public static void quit() throws Exception {
	AdactinBaseclass1.driverquit();
	}
}
