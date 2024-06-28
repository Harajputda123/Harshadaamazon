package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazoncart {
  WebDriver driver=new ChromeDriver();
	
	
	
@Given("Url of amazon")
public void Url_of_amazon() {
   //urlof AMAzon //maximize//implicitwait // pageload
	
}
@When("user tries to search a product and clicks on product")
public void user_tries_to_search_a_product_and_clicks_on_product() {
//inspect searchbutton --sendkeys// select product

}

@When("click on addtocart button ")
public void click_on_addtocart_button() {
	
	//inspect add to cart ---click


}
@Then("The product should be added to cart")
public void the_product_should_be_added_to_cart() {
  //  Assertion
}

}
