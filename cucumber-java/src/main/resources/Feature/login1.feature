Feature: Login Functionality

Scenario: To check login is successfull

Given user navigate to url
When user enter valid "username" 
And user enter valid "password"
Then user click on login button
And home screen should display