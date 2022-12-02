Feature: Login Functionality

Scenario: To check whether login can be successfull with valid credentials

Given user enter valid username
And user enter valid password
When user click on login
Then Home screen should be displayed