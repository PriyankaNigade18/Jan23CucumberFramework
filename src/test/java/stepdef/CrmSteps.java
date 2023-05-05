package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import generic.BrowserProvider;
import io.cucumber.java.en.*;

public class CrmSteps
{
	WebDriver driver=BrowserProvider.getDriver();
	@Given("Open Crm Application")
	public void open_crm_application()
	{
	    //driver=new ChromeDriver();
	    driver.get("https://automationplayground.com/crm/login.html");
	    
	}

	@When("I enter username and password")
	public void i_enter_username_and_password() {
	    driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("test123");
	}

	@When("I click on Login button")
	public void i_click_on_login_button() {
	    driver.findElement(By.id("submit-id")).click();
	}

	@Then("I should able to login")
	public void i_should_able_to_login() {
	    
		String exp="customers.html";
		Assert.assertTrue(driver.getCurrentUrl().contains(exp));
		System.out.println("User Login successfully!");
	}



}
