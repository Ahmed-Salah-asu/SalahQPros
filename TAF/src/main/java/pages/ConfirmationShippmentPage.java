package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ConfirmationShippmentPage extends PageBase {

	public ConfirmationShippmentPage(WebDriver driver) {
		super(driver);

	}
	@FindBy(xpath  ="/html/body/div[10]/h2")
	public WebElement ConfirmationMsg ; 


}
