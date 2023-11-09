package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CheckoutPage;
public class CheckoutPageSteps{
	
CheckoutPage c= new CheckoutPage();
@And("user enter personal details {string} {string} {string}")
public void user_enter_personal_details(String fname,String lname,String pcode){
c.user_enter_personal_details(fname, lname, pcode);
}
@And ("user click on continue button")
public void user_click_on_continue_button(){
	c.user_click_on_continue_button();
}
@Then ("user navigate to checkout two page")
public void user_navigate_to_checkout_two_page(){
	c.user_navigate_to_checkout_two_page();
}
}