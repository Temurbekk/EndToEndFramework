package Framework.End2End;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By login = By.xpath("//*[@id=\"globalnavbar-header-container\"]/div[2]/div/div[5]/div/div/div[1]/a");
	By number = By.xpath("//*[@id=\"globalnavbar-header-container\"]/div[2]/div/div[2]/div/span/span[2]");
	By logo = By.xpath("//*[@id=\"globalnavbar-header-container\"]/div[1]/div/a/img");
	
	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
	public WebElement getNumber() {
		return driver.findElement(number);
	}
	
	public WebElement getLogo() {
		return driver.findElement(logo);
	}
}
