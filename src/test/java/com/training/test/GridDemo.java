package com.training.test;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridDemo {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver;
		String huburl="http://192.168.1.208:4444";
		String url="https://login.salesforce.com/";
		//DesiredCapabilities cap = DesiredCapabilities.chrome();

 		//driver = new RemoteWebDriver(new URL(huburl), cap);

 		//driver.navigate().to(url);
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("platformName", "Windows");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("browserName", "chrome");
		
		
		//cap.setPlatform(Platform.WINDOWS);
		//cap.setBrowserName("Chrome");
		
		driver= new RemoteWebDriver(new URL(huburl),cap);
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		
	}

}
