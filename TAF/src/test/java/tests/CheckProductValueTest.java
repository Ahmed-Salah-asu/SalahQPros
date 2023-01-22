package tests;


import java.awt.AWTException;
import java.io.IOException;
import java.util.Random;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.opencsv.exceptions.CsvValidationException;
import data.Constants;
import org.testng.Assert;
import pages.CompleteShippmentPage;
import pages.ConfirmationShippmentPage;
import pages.HomePage;
import pages.LoginPage;
import pages.AddToCartPage;
import pages.ShippmentInformationPage;
import pages.SignUpPage;

public class CheckProductValueTest extends TestBase{

	protected WebDriverWait wait;
	Constants constantsobj=new Constants();
	Random randomGenerator = new Random();  
	int randomInt = randomGenerator.nextInt(100000);

	@Test(priority=1,alwaysRun=true)
	public void OrderCycle() throws CsvValidationException, IOException, AWTException, InterruptedException 
	{ 
		HomePage homePage=new HomePage(driver);
		homePage.Register();
		SignUpPage signUpPage=new SignUpPage(driver);
		String Username=constantsobj.ValidUserName+randomInt;
		signUpPage.SignUpWithValidCredentials(Username,constantsobj.ValidPassword);
		Alert alert=driver.switchTo().alert();
		alert.accept();	  
		homePage.Login();
		LoginPage loginPage = new LoginPage (driver);
		loginPage.LoginWithValidCredentials(Username,constantsobj.ValidPassword);
		homePage.AssertionOnListCount();
		homePage.ChooseRandomItem();
		AddToCartPage addToCartPage=new AddToCartPage(driver);
		//i repeat this step 2 times to make scenario "Remove item from cart
		for (int i = 0;i<2; i++) {
			addToCartPage.AddToCard();
			alert.accept();
		}
		homePage.NavigateToCardPage();
		CompleteShippmentPage completeShippmentPage=new CompleteShippmentPage(driver);
		completeShippmentPage.RemoveItem();
		completeShippmentPage.PlaceOrder();
		ShippmentInformationPage shippmentInformationPage=new ShippmentInformationPage(driver);
		shippmentInformationPage.CompleteShippmentInformation(constantsobj.ItemName,constantsobj.Country,constantsobj.City,constantsobj.CreditCard,constantsobj.Month,constantsobj.Year);
		ConfirmationShippmentPage confirmationShippmentPage=new ConfirmationShippmentPage(driver);
		Assert.assertEquals(confirmationShippmentPage.ConfirmationMsg.getText(),constantsobj.ConfirmationMsg);
	}
}
