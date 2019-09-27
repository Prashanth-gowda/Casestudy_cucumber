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

public class Cucumber_CaseStudy3 {
	WebDriver driver = null;
	@Given("^User logs in$")
	public void user_logs_in(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\Browser Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("SignIn")).click();
		 driver.findElement(By.id("userName")).sendKeys("Lalitha");
		 driver.findElement(By.id("password")).sendKeys("Password123");
		 driver.findElement(By.xpath("//input[@value='Login']")).click();

	}

	@When("^Types head$")
	public void types_head(){
	   WebElement search =  driver.findElement(By.xpath("//input[@name='products']"));
	   Actions action =  new Actions(driver);
	   action.sendKeys(search,"bag").perform();
	   action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    
	}

	@Then("^suggestions of the product is displayed$")
	public void suggestions_of_the_product_is_displayed(){
	    
	}
}
