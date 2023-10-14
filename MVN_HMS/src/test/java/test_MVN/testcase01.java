package test_MVN;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import generic_MVN.Excel;
import generic_MVN.Launch;
import pom_MVN.loginpg;



public class testcase01 extends Launch
{
	@Test
	void tc1() throws Exception
	{
		String un = Excel.fetch(0, 0);
		String pwd = Excel.fetch(0, 1); 
		String exp_title = Excel.fetch(0, 2);
		
		
		loginpg lpg = new loginpg(driver);
		
		lpg.enterEmail(un);
		lpg.enterPassword(pwd);
		lpg.clicklogin();
		lpg.patient();
		lpg.clicklogout();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains(exp_title));
		
		String act_title = driver.getTitle();
		
		assertEquals(act_title, exp_title);
	}

}
