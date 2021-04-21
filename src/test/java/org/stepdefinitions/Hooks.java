package org.stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	@Before()
	public void beforeScenario1() {
		System.out.println("Before scenario");
		launchBrowser();
		launchUrl("https://www.crazysales.com.au/");
		//maximizeWindow();
		impWait();
	}
	@After()
	public void afterScenario1(Scenario s) throws IOException {
		//only for failed scenario
		if(s.isFailed()) {
			System.out.println("After scenario");
			TakesScreenshot tk=(TakesScreenshot)driver;
			byte[] b = tk.getScreenshotAs(OutputType.BYTES);		
			s.embed(b,"image/png");
		}
		quitBrowser();
	}
}

//to avoid override we are using the name
//we can see the images at reports folder as well as attachment in the custom report
//File src = tk.getScreenshotAs(OutputType.FILE);
//String name = s.getName();
//File des=new File("C:\\Users\\PREMA\\eclipse-workspace\\CucumberWithShots\\ScreenShots"+name+".png");
//FileUtils.copyDirectory(src,des);
