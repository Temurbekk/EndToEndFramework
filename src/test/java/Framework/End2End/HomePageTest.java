package Framework.End2End;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.Base;

public class HomePageTest extends Base{

	@Test(dataProvider="getData")
	public void baseNavigationPath(String username, String password, String allowed) throws Exception {
		driver = initializeDriver();
		driver.get("https://www.salesforce.com/");
		
		HomePage homePage = new HomePage(driver);
		
		homePage.getLogin().click();
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.getUsername().sendKeys(username);
		loginPage.getPassword().sendKeys(password);
		System.out.println(allowed);
		loginPage.getLogin().click();
		
		driver.close();
		
	}
	
	@DataProvider
	public Object[][] getData() {
		//Rows -> how many different data you want to test on
		//Columns -> how many values each data will hold
		Object[][] data = new Object[2][3];
		
		//0th Row -> 1st Row
		data[0][0] = "My Username";
		data[0][1] = "My Password";
		data[0][2] = "Not Allowed";
		
		//1st Row -> 2nd Row
		data[1][0] = "My Other Username";
		data[1][1] = "My Other Password";
		data[1][2] = "Allowed";
		
		return data;
	}
}
