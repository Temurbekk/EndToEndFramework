package resources;

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	protected WebDriver driver;
	protected Properties properties;
	
	public WebDriver initializeDriver() throws Exception {
		properties = new Properties();
		
		FileInputStream fileInputStream = new FileInputStream("/Users/temur/eclipse-workspace/End2End/src/main/java/resources/data.properties");
		
		properties.load(fileInputStream);
		
		String browser = properties.getProperty("browser");
		System.out.println(browser);

		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/temur/Downloads/chromedriver");
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			//Firefox
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
}
