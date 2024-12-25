package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {
	//PageFactory pattern
		@FindBy(css = "i.ion-log-in")
		WebElement login;
		
		@FindBy(css = "input[name='email']")
		WebElement email;
		
		@FindBy(css = "input[name='password']")
		WebElement pwd;
		
		
		@FindBy(css = "button.btn.btn-lg.btn-primary.pull-xs-right")
		WebElement loginBtn;
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		public void ClickLogin() {
			login.click();
		}
		
		public void validLogin(String strUser, String strPwd) {
			email.sendKeys(strUser);
			pwd.sendKeys(strPwd);
			loginBtn.click();
			
		}
}
