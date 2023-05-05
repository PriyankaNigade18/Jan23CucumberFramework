package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserProvider 
{
	public WebDriver driver;
	 
	static ThreadLocal<WebDriver> tDriver=new ThreadLocal<WebDriver>();
	
	
	public static WebDriver getDriver()
	{
		return tDriver.get();
	}
		
	public WebDriver setBrowser(String bname)
	{
		if(bname.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			tDriver.set(driver);
			
		}else if(bname.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			tDriver.set(driver);
			
		}else if(bname.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			tDriver.set(driver);
			
		}
		
		return getDriver();
		
	}
	
	

}
