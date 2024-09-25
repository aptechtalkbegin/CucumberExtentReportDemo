package stepDefinitions;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	public WebDriver driver;
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     

	}
	@When("User opens URL {string}")
	public void user_opens_url(String URL) {
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@When("User enters username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		 driver.findElement(By.name("username")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@When("Click on Login")
	public void click_on_login() {
	driver.findElement(By.cssSelector(".orangehrm-login-button")).click();
	}
	
	@Then("Page Title should be {string}")
	public void page_title_should_be(String string) {
	String pageTitile = driver.getTitle();
	Assert.assertEquals(pageTitile, "OrangeHRM");
	}

	@Then("User clicks on Logout and close the browser")
	public void user_clicks_on_logout_and_close_the_browser() {
	driver.quit();
	}

}
