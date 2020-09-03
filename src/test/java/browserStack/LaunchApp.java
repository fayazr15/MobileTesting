package browserStack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LaunchApp
{

	public static String userName = "baig1";
	  public static String accessKey = "NMnWmCh6cpVws2mTpsUr";

	  public static void main(String args[]) throws MalformedURLException, InterruptedException {
	    DesiredCapabilities caps = new DesiredCapabilities();

	    caps.setCapability("device", "Google Pixel 3");
	    caps.setCapability("os_version", "9.0");
	    caps.setCapability("project", "Amazon Shopping");
	    caps.setCapability("build", "Mobile Testing");
	    caps.setCapability("name", "Launch Amazon Shopping App");
	    caps.setCapability("app", "bs://7defddd81c197026d45f9055339f8938cd18795c");

	    AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

	    /* Write your Custom code here */
	    
	    System.out.println("Welcome to Amazon Shopping");

	    driver.quit();
	  }
}
