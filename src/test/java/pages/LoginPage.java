package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilitiesofPro.Base;

public class LoginPage extends Base{
public void User_enter_and_details(String username, String pass){
	WebElement userName= driver.findElement(By.xpath("//input[@id='user-name']"));
	userName.sendKeys(username);
	WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys(pass);
	
}
public void User_click_on_login_button() {
	WebElement loginBtn= driver.findElement(By.cssSelector("#login-button"));
	clickOnElement(loginBtn); //reusing the method from base class
}
public void Validate_error_message() {
	WebElement errorMessage=driver.findElement(By.xpath("//h3[@data-test='error']"));
	Assert.assertTrue(errorMessage.isDisplayed());
}
}
