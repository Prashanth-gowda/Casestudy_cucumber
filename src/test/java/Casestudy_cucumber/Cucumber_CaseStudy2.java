package Casestudy_cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucumber_CaseStudy2 {
	WebDriver driver = null;
	@Given("^The Login page is opened$")
	public void the_Login_page_is_opened() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\Browser Drivers\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		   driver.manage().window().maximize();
		   driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^Enter the username \"([^\"]*)\"$")
	public void enter_the_username(String arg1) {
	    driver.findElement(By.id("userName")).sendKeys(arg1);
	}

	@When("^Enters the password \"([^\"]*)\"$")
	public void enters_the_password(String arg1){
	   driver.findElement(By.id("password")).sendKeys(arg1);
	}

	@Then("^the home page is opened$")
	public void the_home_page_is_opened(){
	   driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

}
