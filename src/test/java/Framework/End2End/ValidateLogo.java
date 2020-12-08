package Framework.End2End;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import resources.Base;

public class ValidateLogo extends Base{

	public WebDriver driver;
	@Test
	public void validateLogo() throws Exception{
		driver = initializeDriver();
		driver.get(properties.getProperty("url"));
		
		HomePage homePage = new HomePage(driver);
		
		Assert.assertTrue(homePage.getLogo().isDisplayed());
		
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
}
