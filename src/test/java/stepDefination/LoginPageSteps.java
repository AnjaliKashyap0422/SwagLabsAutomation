package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageSteps {
	LoginPage login= new LoginPage();
	@When("User enter {string} and {string} details")
	public void user_enter_and_details(String username,String pass){
	    
	    login.User_enter_and_details(username, pass);
	    }
	@When("User click on login button")
	public void user_click_on_login_button(){
		login.User_click_on_login_button(); 
	}
	@Then("Validate successful login")
	public void validate_successful_login(){
	}
	@Then("Validate error message")
	public void Validate_error_message(){
	login.Validate_error_message();		
	}
}
