package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class gmaillogin {
@Given("user should create the account on gmail")
public void create_ac()
{
	System.out.println("precondition:user create the account");
}
@When("launch gmail website")
public void login_steps()
{
	System.out.println("test steps:user performed all the steps");
}
@And("enter email and password")
public void enter_user()
{
	System.out.println("step1:enter the all credentials");
}
@And("Click on login button")
public void click_button()
{
	System.out.println("step2:click the login button");
}
@Then("login should be successfull")
public void login_button()
{
	System.out.println("expected result:login successfully");
}
}
