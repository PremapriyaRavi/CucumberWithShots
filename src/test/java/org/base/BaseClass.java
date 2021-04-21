package org.base;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\CucumberWithShots\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);	
	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public static void impWait() {
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}
	public static void click(WebElement e) {
		e.click();
	}
	public static void insert(WebElement e,String value) {
		e.sendKeys(value);
	}
	public void actClick(WebElement m) {
		Actions a=new Actions(driver);
		a.moveToElement(m).click().perform();
	}
	public static void quitBrowser() {
		driver.quit();
	}
	
}

