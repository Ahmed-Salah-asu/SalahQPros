package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompleteShippmentPage extends PageBase{

	public CompleteShippmentPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath ="//*[@id=\"tbodyid\"]/tr[1]/td[4]/a")
	public WebElement DeleteButton ; 
	@FindBy(xpath  ="//*[@id=\"page-wrapper\"]/div/div[2]/button")
	public WebElement PlaceOrderButton ; 

	public void RemoveItem() throws InterruptedException
	{
		ClickButton(DeleteButton);
		Thread.sleep(1000);
	}
	public void PlaceOrder() throws InterruptedException
	{
		ClickButton(PlaceOrderButton);
		Thread.sleep(1000);
	}

}
