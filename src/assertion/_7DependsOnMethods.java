package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _7DependsOnMethods {

	static WebDriver driver;
	@Test
	public void launchUrl() {
		String chromeDriver="webdriver.chrome.driver";
		String chromeLocation="C:\\Users\\kshir\\eclipse-workspace\\febbatch\\testngdemoooooo\\chromedriver\\chromedriver.exe";
		System.setProperty(chromeDriver, chromeLocation);
		
        // launch browser
		
		 driver=new ChromeDriver();
				// get browser
		driver.get("https://kite.zerodha.com/");
		//we create the object of soft assert class
				SoftAssert sa=new SoftAssert();
				String actual=driver.getTitle();
				sa.assertEquals(actual, "zerodha99999");
	            sa.assertAll();	         
	}
		@Test(dependsOnMethods="launchUrl")
		public void login() {
		driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("ABC123");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("12354");
	WebElement web=	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[4]/button"));
	
	web.click();
	System.out.println("Hello java");
	   
}
}