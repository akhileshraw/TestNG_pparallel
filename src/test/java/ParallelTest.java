
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;

public class ParallelTest {
	public WebDriver driver;
        @Test
        public void FirefoxTest() {	 
            //Initializing the firefox driver (Gecko)
        System.setProperty("webdriver.gecko.driver","D:\\Driver\\geckodriver.exe");
	    driver = new FirefoxDriver();	  
	    driver.get("https://www.demoqa.com"); 
	    driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
	    driver.quit();
         }
 
        @Test
 	public void ChromeTest()
 	{ 
	  //Initialize the chrome driver
       System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.demoqa.com"); 
	  driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
	  driver.quit();
 	}
}