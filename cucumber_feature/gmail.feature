Feature: gmail login

Scenario: verify login successfully when user enter the gmail and password 
Given user should create the account on gmail
When launch gmail website
And enter email and password
And Click on login button
Then login should be successfull