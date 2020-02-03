package org.adactinproject.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdactinBaseclass1 {
	public static WebDriver driver;
	
	public static WebDriver OpenApp() throws Exception {

		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sadhana\\eclipse-workspace\\AdactinProject\\Drivers\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
		return driver;

	}
	
	public static void launchUrl(String url) throws Exception {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}		
		

	}
	
	public static void enterText(WebElement element, String value) throws Exception {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
			
		}

	}
	
	
	public static void emelemtIsDisplay(WebElement element) throws Exception {
		try {
			element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	
	}

	public static void mouseOver(WebElement element) throws Exception {
		try {
			Actions ac=new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}
	
	public static  void winhandle(String windowsname) throws Exception {
		try {
			Set<String> handles = driver.getWindowHandles();
			for (String x : handles) {
				String title = driver.switchTo().window(x).getTitle();
				System.out.println(title);
				String s=windowsname;
				if (s.equals(driver.switchTo().window(x).getTitle())) {
					break;
								}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}
	
	public static void elementIsEnable(WebElement element) throws Exception {
		try {
			element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
		

	}
	
	public static void elementScreenShot(String value) throws Exception {
		try {
			TakesScreenshot ts=(TakesScreenshot) driver;
			File temp=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File(".png");
			FileUtils.copyFile(temp, dest);
		} catch (WebDriverException e) {
			e.printStackTrace();
			throw new Exception();
		}
		
	}
	public static void elementdropdown(WebElement element,String value, String options) throws Exception {
		
		try {
			Select sc=new Select(element);
			if (options.equalsIgnoreCase(value)) {
				sc.selectByIndex(Integer.parseInt(value));
			}else if (options.equalsIgnoreCase("value")) {
				sc.selectByValue(value);
				
			}else if (options.equalsIgnoreCase("visibletest")) {
				sc.selectByVisibleText(value);
				
			}else {
				throw new Exception();
			}
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
  
	}
	
	public static void waittime(WebElement element) throws Exception {
		
		try {
			WebDriverWait wt=new WebDriverWait(driver, 50);
			wt.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}
	public static void driverquit() throws Exception {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}
	public static void enterclick(WebElement element) throws Exception {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	
}
