package generic_MVN;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch implements Framework_Constants
{
	public static WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@AfterMethod
	public void closeApp(ITestResult res) throws Exception 
	{
		if (ITestResult.FAILURE == res.getStatus())
		{
			Photos.capture(driver);
		}
		driver.quit();
	}


}
