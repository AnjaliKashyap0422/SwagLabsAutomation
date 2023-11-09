package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BasketPage;

public class BasketPageSteps {
BasketPage b= new BasketPage();
@And ("user click on add to cart button")
public void user_click_on_add_to_cart_button(){
	b.clickOnAddToCart();
}
@Then("validate cart count is {string}")
	public void validate_cart_count(String Count){
	b.validateCartCount(Count);
}
@And("User navigate to checkout page")
public void User_navigate_to_checkout_page(){
	b.Usernavigatetocheckoutpage();
}
}
