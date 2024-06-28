package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinationlogin {
WebDriver driver=new ChromeDriver();

	@Before
public void setup() {
		System.out.println("executed before test");
	
}

@After
public void teardown() {
	System.out.println("execute after test");
	//driver.close();
}
@BeforeStep
public void method1() {
	System.out.println("before each step");
}
@AfterStep
public void method2() {
	System.out.println("after each step");
}


@Given("Url is running")
public void url_is_running() {
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  }

@When("user enters valid username")
public void user_enters_valid_username() {
	 
	driver.findElement(By.id("email")).sendKeys("harshada.rajput");
}

@When("valid password")
public void valid_password() {

	driver.findElement(By.id("pass")).sendKeys("harshada123");
	driver.findElement(By.name("login")).click();} 

@Then("user should be able to login")
public void user_should_be_able_to_login() {

	System.out.println("user is sucessfully loged in ");
  }


//-------------------------------



@When("user enters valid username {string}")
public void user_enters_valid_username(String string) {
	driver.findElement(By.id("email")).sendKeys(string);
}

@When("valid password {string}")
public void valid_password(String string) {
	driver.findElement(By.id("pass")).sendKeys(string);
	driver.findElement(By.name("login")).click();
}


//---------------------------------------------------------------------


@When("^user enters valid username (.+)$")
public void user_enters_valid_username_ruhi(String Username) {
	driver.findElement(By.id("email")).sendKeys(Username);
}

@When("^valid password (.+)$")
public void valid_password_ruhi123(String pass) {
	driver.findElement(By.id("pass")).sendKeys(pass);
	driver.findElement(By.name("login")).click();
}









//
//@When("user enters valid username priya")
//public void user_enters_valid_username_priya() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//@When("valid password Priya213")
//public void valid_password_priya213() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//@When("user enters valid username tushar")
//public void user_enters_valid_username_tushar() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//@When("valid password tushar123")
//public void valid_password_tushar123() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//@When("user enters valid username rutu")
//public void user_enters_valid_username_rutu() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//@When("valid password tutu123")
//public void valid_password_tutu123() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//























}
