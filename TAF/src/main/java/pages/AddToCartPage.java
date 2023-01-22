package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends PageBase {
	public AddToCartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath ="//*[@id=\"tbodyid\"]/div[2]/div/a")
	public WebElement AddToCardButton ; 


	public void AddToCard() throws InterruptedException
	{
		ClickButton(AddToCardButton);
		Thread.sleep(1000);
	}

}
