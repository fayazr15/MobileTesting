package sauceLabs;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowser

{
	public static final String USERNAME = "fayazrx";
	public static final String AUTOMATE_KEY = "a29cb4c8-61d2-480c-a38a-cb48b1b7eddc";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
	
	public static void main(String[] args) throws Throwable {
		
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("platformName", "Windows 10");
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("browserVersion", "85.0");
		caps.setCapability("build", "85.0");
		caps.setCapability("recordVideo", "true");
		caps.setCapability("recordScreenshots", "false");
		
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		
		 /* Write your Custom code here */
		
		  	driver.get("http://www.google.com");
		    WebElement element = driver.findElement(By.name("q"));
		    element.sendKeys("BrowserStack");
		    element.submit();

		    System.out.println(driver.getTitle());
		    driver.quit();
	}
}
