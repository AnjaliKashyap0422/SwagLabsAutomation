package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import utilitiesofPro.Base;

public class BasketPage extends Base {
public void clickOnAddToCart() {
	WebElement AddToCartBtn= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
	clickOnElement(AddToCartBtn);
	
}
public void validateCartCount(String count) {
	WebElement cartCount= driver.findElement(By.cssSelector("a.shopping_cart_link"));
	String cartValue=cartCount.getText();
	Assert.assertEquals(count, cartValue);
	
}
public void Usernavigatetocheckoutpage() {
	WebElement cartLink= driver.findElement(By.cssSelector("a.shopping_cart_link"));
	clickOnElement(cartLink);
	WebElement checkoutBtn= driver.findElement(By.xpath("//button[@id='checkout']"));
	clickOnElement(checkoutBtn);
	
}
}
