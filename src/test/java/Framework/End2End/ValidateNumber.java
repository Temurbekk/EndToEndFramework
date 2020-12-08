package Framework.End2End;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import resources.Base;

public class ValidateNumber extends Base {
	public WebDriver driver;
	@Test
	public void validateNumber() throws Exception{
		driver = initializeDriver();
		driver.get(properties.getProperty("url"));
		
		HomePage homePage = new HomePage(driver);
		
		Assert.assertEquals("1-800-667-6389", homePage.getNumber().getText());
	
		
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
}
