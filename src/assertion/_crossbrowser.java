package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _crossbrowser {
	
	static WebDriver driver;

	@Test
	@Parameters("browser")
	public void launchUrl(String browser) {
		//chrome setup
		String chromeDriver="webdriver.chrome.driver";
		String chromeLocation="C:\\Users\\kshir\\eclipse-workspace\\febbatch\\testngDemo2\\Chrome\\chromedriver.exe";
		System.setProperty(chromeDriver, chromeLocation);
		
		
		//firefox setup
		String EdgeDriver="webdriver.edge.driver";
		String EdgeLocation="C:\\Users\\kshir\\eclipse-workspace\\febbatch\\testngDemo2\\firefoxdriver\\msedgedriver.exe";
		System.setProperty(EdgeDriver, EdgeLocation);
		
		if(browser.equalsIgnoreCase("chrome")) {
			//launch browser
			driver=new ChromeDriver();
		}else {
			//launch browser
			driver=new EdgeDriver();
			
		}
		
      		driver.get("https://kite.zerodha.com/");
		
		//we create the object of soft assert class
		SoftAssert sa=new SoftAssert();
		String actual=driver.getTitle();
		sa.assertEquals(actual, "zerodha99999");
		driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("ABC123");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("12354");
	WebElement web=	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[4]/button"));
	sa.assertTrue(web.isDisplayed(),"click button is displayed");
	web.click();
	System.out.println("Hello java");
	    sa.assertAll();
		
}
}



	