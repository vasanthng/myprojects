package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	private WebDriver driver;		
	@Test				
	public void testEasy() {	
		driver.get("http://demo.guru99.com/selenium/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 
		
		System.out.println("run over");
	}	
	@BeforeTest
	public void beforeTest() {	
		System.setProperty("webdriver.chrome.driver", "C:/Users/vasanthg/Documents/eclipse all/chromedriver.exe");
	    driver = new ChromeDriver();  
		
//		DesiredCapabilities cap=DesiredCapabilities.firefox();
//		driver=new FirefoxDriver(cap);
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}	
}
