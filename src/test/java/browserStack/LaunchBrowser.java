package browserStack;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowser
{
		public static final String USERNAME = "baig1";
		public static final String AUTOMATE_KEY = "NMnWmCh6cpVws2mTpsUr";
		public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  
	  
	  
	  public static void main(String[] args) throws Exception 
	  {
	    DesiredCapabilities caps = new DesiredCapabilities();
	    
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "80");
	    caps.setCapability("project", "Chrome Browser");
	    caps.setCapability("build", "Web Testing");
	    caps.setCapability("name", "Google Search");
	    
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