package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippmentInformationPage extends PageBase {

	public ShippmentInformationPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id  ="name")
	public WebElement ItenNameField ; 

	@FindBy(id  ="country")
	public WebElement CountryField ; 
	@FindBy(id  ="city")
	public WebElement CityField ; 

	@FindBy(id  ="card")
	public WebElement CreditCardField ; 

	@FindBy(id  ="month")
	public WebElement MonthField ; 

	@FindBy(id  ="year")
	public WebElement YearField ; 

	@FindBy(xpath ="//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
	public WebElement ConfirmButton ; 


	public void CompleteShippmentInformation(String itemname,String country,String city,String creditcard,String month,String year)
	{
		SetElementText(ItenNameField, itemname);
		SetElementText(CountryField, country);
		SetElementText(CityField, city);
		SetElementText(CreditCardField, creditcard);
		SetElementText(MonthField, month);
		SetElementText(YearField, year);
		ClickButton(ConfirmButton);
	}


}
