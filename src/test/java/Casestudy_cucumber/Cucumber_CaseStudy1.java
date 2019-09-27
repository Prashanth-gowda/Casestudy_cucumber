package Casestudy_cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucumber_CaseStudy1 {
	WebDriver driver = null;
	@Given("^The signup page is openeds$")
    public void the_signup_page_is_openeds()  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\Browser Drivers\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		   driver.manage().window().maximize();
		   driver.findElement(By.linkText("SignUp")).click();
	     
	}

	@When("^entes \"([^\"]*)\" as usernamee$")
public void entes_as_usernamee(String arg1) {
       driver.findElement(By.id("userName")).sendKeys(arg1);
	}

	@When("^entrs \"([^\"]*)\" as fisrt namee$")
public void entrs_as_fisrt_namee(String arg1) {
	    driver.findElement(By.id("firstName")).sendKeys(arg1);
	}

	@When("^entrs \"([^\"]*)\" as lastnamee$")
public void entrs_as_lastnamee(String arg1)  {
	    driver.findElement(By.id("lastName")).sendKeys(arg1);
	}

	@When("^eners \"([^\"]*)\" as passworde$")
public void eners_as_passworde(String arg1) {
	   driver.findElement(By.id("password")).sendKeys(arg1);
	}

	@When("^eters \"([^\"]*)\" to confirm passworde$")
public void eters_to_confirm_passworde(String arg1) {
	    driver.findElement(By.id("pass_confirmation")).sendKeys(arg1);
	}

	@When("^Select malee$")
public void select_malee(){
	  WebElement radio1 =  driver.findElement(By.xpath("//input[@value='Male']"));
	  radio1.click();
	}

	@When("^entrs \"([^\"]*)\" as emaile$")
public void entrs_as_emaile(String arg1) {
	    driver.findElement(By.id("emailAddress")).sendKeys(arg1);
	}

	@When("^entrs \"([^\"]*)\" as mobile numbere$")
public void entrs_as_mobile_numbere(String arg1) {
	    driver.findElement(By.id("mobileNumber")).sendKeys(arg1);
	}

	@When("^enters \"([^\"]*)\" as date of birthe$")
public void enters_as_date_of_birthe(String arg1) {
	    driver.findElement(By.xpath("//input[@name='dob']")).sendKeys(arg1);;
	}

	@When("^entrs \"([^\"]*)\" as addresse$")
public void entrs_as_addresse(String arg1) {
	   driver.findElement(By.id("address")).sendKeys(arg1);
	}

	@When("^Select Security Questione$")
public void select_Security_Questione() {
	    Select db = new Select(driver.findElement(By.id("securityQuestion")));
	      db.selectByIndex(1);
	}

	@When("^enter \"([^\"]*)\" as answer e$")
public void enter_as_answer_e(String arg1) {
	   driver.findElement(By.id("answer")).sendKeys(arg1);
	}

	@When("^clicks registere$")
public void clicks_registere() {
	   driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

	@Then("^registers successfullye$")
public void registers_successfullye() {
	    
	}

}
