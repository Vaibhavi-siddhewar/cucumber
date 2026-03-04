Feature: Fb Login

@smoke
Scenario: Verify logn faild when user enter invalid credentials

Given Chrome Browser should be invoked
And fb login page should be visible
When Enter email "fcuser@gmail.com" and password "fc123"
And click on login button of fb 
Then login should be faild when user enter invalid credentials