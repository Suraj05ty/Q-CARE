package generic_MVN;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Photos
{
	public static void capture(WebDriver driver) throws Exception
	{
		Date d = new Date();
		String data = d.toString();
		String res = data.replace(":", "-");
		
		TakesScreenshot tss =(TakesScreenshot) driver;
		File temp = tss.getScreenshotAs(OutputType.FILE);
		File per = new File("./Photo/"+res+".jpg");
		FileHandler.copy(temp, per);	
	}

}
