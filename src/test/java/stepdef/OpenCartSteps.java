package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class OpenCartSteps {

	WebDriver driver;
	
	@Given("Open Opencart application")
	public void open_opencart_application() {
	    driver=new ChromeDriver();
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("I enter valid email id {string}")
	public void i_enter_valid_email_id(String emailid) {
	    
		driver.findElement(By.name("email")).sendKeys(emailid);
	}

	@When("I enter valid password {string}")
	public void i_enter_valid_password(String psw) {
	    driver.findElement(By.id("input-password")).sendKeys(psw);
	}

	@When("I click on cart login button")
	public void i_click_on_cart_login_button() {

    driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("I should get Login and dashboard page should be open")
	public void i_should_get_login_and_dashboard_page_should_be_open() {
	    System.out.println("Validate login !");
	}

}
