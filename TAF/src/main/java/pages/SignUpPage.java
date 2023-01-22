package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SignUpPage extends PageBase {
	public SignUpPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id ="sign-username")
	public WebElement UserNameField ; 

	@FindBy(id ="sign-password")
	public WebElement PasswordField ; 


	@FindBy(xpath  ="//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
	public WebElement SignUpButton ;

	public void SignUpWithValidCredentials(String username,String password) throws InterruptedException
	{
		SetElementText(UserNameField,username);
		SetElementText(PasswordField, password);
		ClickButton(SignUpButton);
		Thread.sleep(1000);
	}
}
