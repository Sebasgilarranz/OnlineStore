package test.stepdef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login{
	private static WebDriver driver = null;
	
	@Before
	public void init(){
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sebas/Desktop/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Given("^User is on the home page$")
	public void user_is_on_the_home_page() throws Throwable {
		driver.get("http://www.google.com");
		Assert.assertEquals(0, driver.findElements(By.id("account_logout")).size());
	}
	
	@After
	public void clean(){
		driver.close();
	}
}
