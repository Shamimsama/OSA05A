Feature: login Validation

Scenario: valid credential
Given open browser
And nevigate to URl
When user type userId and password
And user click on login button
Then user should see his profile page


Scenario Outline: invalid credential
Given open browser
And nevigate to URl
When user type "<userId>" and "<password>"
And user click on login button
Then user should not see his profile page

Examples: 
|userId|password|
|user1|1234|
|user2|3533|
|user3|5436|
