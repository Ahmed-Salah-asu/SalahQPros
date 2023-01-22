package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id ="loginusername")
	public WebElement UserNameField ; 
	
	@FindBy(id ="loginpassword")
	public WebElement PasswordField ; 
	
	
	@FindBy(xpath ="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	public WebElement LoginButton ;
	
	 public void LoginWithValidCredentials(String username,String password) throws InterruptedException
	 {
		SetElementText(UserNameField,username);
	    SetElementText(PasswordField, password);
		ClickButton(LoginButton);
		Thread.sleep(500);
	 }
}
