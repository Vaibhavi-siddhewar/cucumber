Feature: Orangehrm login

Scenario: Verify the orangehrm login successfully with valid credentials
Given launch orangehrm login page
When enter username and password of orangehrm website
And click on login button of orangehrm
Then orangehrm login should be successfull