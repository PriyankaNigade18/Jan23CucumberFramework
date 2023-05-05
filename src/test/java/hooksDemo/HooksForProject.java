package hooksDemo;

import org.openqa.selenium.WebDriver;

import generic.BrowserProvider;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class HooksForProject
{
	/*
	 * Hooks will use to setup preconditions and postconditions
	 */
	
	public WebDriver driver;
	
	@Before
	public void setApp()
	{
		BrowserProvider br=new BrowserProvider();
		driver=br.setBrowser("edge");
		
	}
	
	
	@After
	public void tearDown()
	{
		driver.quit();
		
	}
	
	@AfterStep
	public void steps()
	{
		System.out.println(driver.getTitle());
	}

}
