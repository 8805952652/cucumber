package StepsDefinition;


import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class StepDefinition {
	   private WebDriver driver;

	    @Given("^I am on the Facebook login page$")
	    public void iAmOnFacebookLoginPage() {
	        // Set up the WebDriver instance and navigate to the Facebook login page
	        System.setProperty("webdriver.chrome.driver", "/home/aratimagdum/eclipse-workspace/Cucumberjava/src/test/resources/Feature/LoginDemo.feature");
	        driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	    }

	    @When("^I enter my valid username and password$")
	    public void iEnterValidUsernameAndPassword() {
	        // Find the username and password input fields and enter valid credentials
	        WebElement usernameField = driver.findElement(By.id("email"));
	        WebElement passwordField = driver.findElement(By.id("pass"));

	        usernameField.sendKeys("your_username");
	        passwordField.sendKeys("your_password");
	    }

	    @And("^I click the login button$")
	    public void iClickLoginButton() {
	        // Find and click the login button
	        WebElement loginButton = driver.findElement(By.name("login"));
	        loginButton.click();
	    }

	    @Then("^I should be logged in to Facebook$")
	    public void iShouldBeLoggedInToFacebook() {
	        // Verify that the user is logged in to Facebook
	        String currentUrl = driver.getCurrentUrl();
	        // Add assertions to check the URL or any other elements on the Facebook home page
	    }

	    @And("^I should see my Facebook feed$")
	    public void iShouldSeeFacebookFeed() {
	        // Verify the presence of the Facebook feed
	        WebElement feed = driver.findElement(By.id("feed"));
	        // Add assertions to check any other attributes of the Facebook feed
	    }

	    @Then("^I should see an error message$")
	    public void iShouldSeeErrorMessage() {
	    	   // Verify the presence of an error message on the login page
	        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='error_message']"));
	        // Add assertions to check the text or any other attributes of the error message
	    }
	    

	    @After
	    public void closeBrowser() {
	        // Close the WebDriver instance after each scenario
	        
	    }
	}

	
  


