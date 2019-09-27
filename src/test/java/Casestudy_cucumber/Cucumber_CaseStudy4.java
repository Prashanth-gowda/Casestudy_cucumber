package Casestudy_cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucumber_CaseStudy4 {
	    WebDriver driver = null;
	@Given("^Alex has registered into TestMeApp$")
	public void alex_has_registered_into_TestMeApp(){
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\Browser Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("SignIn")).click();
		 driver.findElement(By.id("userName")).sendKeys("Lalitha");
		 driver.findElement(By.id("password")).sendKeys("Password123");
		 driver.findElement(By.xpath("//input[@value='Login']")).click();

	}

	@When("^Alex search for a particular product like headphones$")
	public void alex_search_for_a_particular_product_like_headphones(){
		WebElement search =  driver.findElement(By.xpath("//input[@name='products']"));
		   Actions action =  new Actions(driver);
		   action.sendKeys(search,"bag").perform();
		   action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	@When("^try to proceed to payment without adding items to cart$")
	public void try_to_proceed_to_payment_without_adding_items_to_cart(){
	  try {
		  if(driver.findElement(By.xpath("//a[@href='displayCart.htm']")).isDisplayed()) {
		  driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
		  }
	  }
	  catch(Exception e) {
		  System.out.println("No items in cart, so payment is not posibble");
	  }
	}
	@Then("^TestMeApp doesn't display the cart icon$")
	public void testmeapp_doesn_t_display_the_cart_icon(){
	    driver.close();
	}


}
