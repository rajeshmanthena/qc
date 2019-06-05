package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Loginpage extends TestBase


{
	
		@FindBy(name="loginRequestBean.userId")
		public WebElement username;
		
		@FindBy(name="loginRequestBean.password")
		public WebElement pwd;
		
		@FindBy(name="loginRequestBean.locNbr")
		public WebElement store;
		
		@FindBy(name="login")
		public WebElement submit;
		
		public Loginpage()
		{
			PageFactory.initElements(driver,this);
		}
		
		
		public void logintoapp(){
			username.sendKeys(prop.getProperty("username"));
			pwd.sendKeys(prop.getProperty("password"));
			store.sendKeys(prop.getProperty("storeid"));
			submit.click();
		}
		/*public void fillusername(String uid)
		{
			username.sendKeys(uid);
		}
		public void fillpwd(String pd)
		{
			pwd.sendKeys(pd);
		}
		public void fillstore(String str)
		{
			store.sendKeys(str);
		}
		public void submitclick()
		{
			submit.click();
		}*/

}
