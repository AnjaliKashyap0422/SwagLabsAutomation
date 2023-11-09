@Reg2
Feature: Checkout Functionality
Scenario: checkout with valid firstname lastname and postalcode
When User enter "standard_user" and "secret_sauce" details
And User click on login button
And user click on add to cart button
Then validate cart count is "1"
And User navigate to checkout page
And user enter personal details "Test" "Automation" "201301"
And user click on continue button
Then user navigate to checkout two page