package pages;


import java.util.List;
import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "signin2")
	public WebElement SignUpButton;
	@FindBy(id = "login2")
	public WebElement LoginButton;
	@FindBy(className  = "card-title")
	public List<WebElement> itemCard;
	@FindBy(id  = "cartur")
	public WebElement Cardbutton;

	public void Register()
	{
		ClickButton(SignUpButton);
	}
	public void Login()
	{
		ClickButton(LoginButton);
	}
	public void AssertionOnListCount() throws InterruptedException
	{
		Assert.assertNotEquals(itemCard.size(),null);
	}
	public void ChooseRandomItem() throws InterruptedException
	{
		Random rnd = new Random();
		itemCard.get(rnd.nextInt(itemCard.size())).click();
		Thread.sleep(500);
	}
	public void NavigateToCardPage() throws InterruptedException
	{
		ClickButton(Cardbutton);
		Thread.sleep(2000);
	}
}
