package stepDefinitions;

import Framework.End2End.HomePage;
import Framework.End2End.LoginPage;
import io.cucumber.java.en.*;
import resources.Base;

public class stepDefinition extends Base {

	LoginPage loginPage = new LoginPage(driver);
	
    @Given("Navigate to {string}")
    public void navigate_to(String url) throws Throwable {
    	driver = initializeDriver();
		driver.get(url);
    }

    @When("^User enters (.+) and (.+) and clicks on login button$")
    public void user_enters_and_clicks_on_login_button(String username, String password) throws Throwable {
    	LoginPage loginPage = new LoginPage(driver);
		
		loginPage.getUsername().sendKeys(username);
		loginPage.getPassword().sendKeys(password);
		loginPage.getLogin().click();
    }

    @Then("Verify that user is successfully logged in")
    public void verify_that_user_is_successfully_logged_in() throws Throwable {
        driver.close();
    }

    @And("User click on login button on home page")
    public void user_click_on_login_button_on_home_page() throws Throwable {
		HomePage homePage = new HomePage(driver);
		
		homePage.getLogin().click();
    }
}
