package sauceLabs;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
public class LaunchApp {

	public static final String USERNAME = "fayazrx";
	public static final String AUTOMATE_KEY = "a29cb4c8-61d2-480c-a38a-cb48b1b7eddc";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY+ "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
	public static void main(String args[])
	{

		DesiredCapabilities caps = DesiredCapabilities.android();
		caps.setCapability("appiumVersion", "1.9.1");
		caps.setCapability("deviceName", "Samsung Galaxy S9 Plus WQHD GoogleAPI Emulator");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("browserName", "");
		caps.setCapability("build", "Api Demos");
		caps.setCapability("platformVersion", "8.1");
		caps.setCapability("platformName", "Android");
		caps.setCapability("app", "C:\\Users\\Lenovo-Home2-PC\\Downloads\\ApiDemos-debug.apk");
		
		AppiumDriver<MobileElement> driver = null;
		
		try 
		{
			driver = new AppiumDriver<MobileElement>(new URL(URL), caps);
		} 
		catch (Throwable e)
		{
			e.printStackTrace();
		}
		/* Write your Custom code here */

		System.out.println("Welcome to Api Demos");
		
		try 
		{
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
