Feature: login functionality 
@Reg
Scenario: Login with valid credentials
When User enter "standard_user" and "secret_sauce" details
And User click on login button
Then Validate successful login

@Reg
Scenario: Login with Invalid credentials
When User enter "standard_user1" and "secret_sauce1" details
And User click on login button
Then Validate error message

@Reg
Scenario: Login with valid Username and Invalid password
When User enter "standard_user" and "secret_sauce2" details
And User click on login button
Then Validate error message

@Reg
Scenario: Login with Invalid username and valid password
When User enter "standard_user2" and "secret_sauce" details
And User click on login button
Then Validate error message 