package stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orangehrmlogin {
EdgeDriver driver;
@Given("launch orangehrm login page")
public void orangehrm_loginpage()
{	
	driver = new EdgeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
@When(" enter username and password of orangehrm website")
public void enter_username_password()
{
	driver.findElement(By.name("username")).sendKeys("vaibhavi");
	driver.findElement(By.name("password")).sendKeys("vaibhavi@123");
}
@And("click on login button of orangehrm")
public void click_orangehrmloginbutton()
{
	driver.findElement(By.tagName("button")).click();
}
@Then("orangehrm login should be successfull")
public void validate()
{
	System.out.println(driver.getCurrentUrl());
	driver.close();
}
}
