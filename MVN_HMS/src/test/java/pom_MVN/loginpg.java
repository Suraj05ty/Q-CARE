package pom_MVN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpg 
{
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login;
	@FindBy(xpath = "//span[.='Patient']")
	private WebElement patient;
	
	@FindBy(xpath = "//a[contains(.,'Log Out')] ")
	private WebElement logout;
	
	
	public loginpg (WebDriver d)
	{
		PageFactory.initElements(d,this);
	}
	
	
	
	public void enterEmail(String s)
	{
		email.sendKeys(s);
	}
	public void enterPassword(String p)
	{
		password.sendKeys(p);
	}
	public void clicklogin() 
	{
		login.click();
	}
	public void patient() 
	{
		patient.click();
	} 
	public void clicklogout() 
	{
		logout.click();
	}

}
