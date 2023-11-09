Feature: Basket Functionality

Background: user navigate swag lab app
When User enter "standard_user" and "secret_sauce" details
And User click on login button

@Reg
Scenario: Verify user is able to add the product into basket
And user click on add to cart button
Then validate cart count is "1"