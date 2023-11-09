package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilitiesofPro.Base;

public class CheckoutPage extends Base {
	public void user_enter_personal_details(String fname, String lname, String pcode) {
	WebElement firstName=	driver.findElement(By.cssSelector("input#first-name"));
	firstName.sendKeys(fname);
	WebElement lastName=driver.findElement(By.cssSelector("input#last-name"));
	lastName.sendKeys(lname);
	WebElement postalCode=driver.findElement(By.cssSelector("input#postal-code"));
	postalCode.sendKeys(pcode);
	}
public void	user_click_on_continue_button(){
	WebElement continueBtn=	driver.findElement(By.cssSelector("input#continue"));
	clickOnElement(continueBtn);
		}
public void user_navigate_to_checkout_two_page() {
	String currentUrl = driver.getCurrentUrl();
	Assert.assertTrue(currentUrl.contains("step-two"));
}
}
