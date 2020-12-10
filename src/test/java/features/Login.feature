Feature: Navigation Flow


Scenario Outline: Login the user
Given Navigate to "https://salesforce.com"
And User click on login button on home page
When User enters <username> and <password> and clicks on login button
Then Verify that user is successfully logged in

Examples:
|username			|password			|
|Username			|Password			|
|MyOtherUserName	|MyOtherPassword	|
