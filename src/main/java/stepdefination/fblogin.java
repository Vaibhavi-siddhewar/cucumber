package stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fblogin {
	
	EdgeDriver driver;
	
	@Given("Chrome Browser should be invoked")
	public void browser()
	{
		System.setProperty("webdriver.edge.driver","C:\\vaibhavicorejava\\automationatesting1\\driverresources\\msedgedriver.exe");
		driver = new EdgeDriver();
	}
	@And("fb login page should be visible")
	public void fb_loginpage()
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
    @When("Enter email {string} and password {string}")
	public void fb_invalid_credentials(String uname,String pass)
	{
    	driver.findElement(By.name("email")).sendKeys(uname);
    	driver.findElement(By.name("pass")).sendKeys(pass);
	}
    @And("click on login button of fb")
	public void fb_click_login()
	{
    	driver.findElement(By.xpath("//div[@role='button']"));
    	//driver.findElement(By.tagName("link")).click();
	}
    @Then("login should be faild when user enter invalid credentials")
	public void fb_login_faild()
	{
    	System.out.println("login faild");
   
	}
}
