package assertion;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class _4asserttrue {
	
	@Test
	public void launchUrl() {
		String chromeDriver="webdriver.chrome.driver";
		String chromeLocation="C:\\Users\\kshir\\eclipse-workspace\\febbatch\\testngdemoooooo\\chromedriver\\chromedriver.exe";
		System.setProperty(chromeDriver, chromeLocation);
		
        // launch browser
		
		WebDriver driver=new ChromeDriver();
				// get browser
		driver.get("https://kite.zerodha.com/");
		
		WebElement e=driver.findElement(By.xpath("//*[@id='userid']"));
		Assert.assertTrue(true);
		
		
}
}


