package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Google_Search {
	static WebDriver driver;

	
	/*@Given("^browser is launched$")
	public void browserlaunch()
	{
		
	}*/
	
	@Given("^browser is launched$")
	public void browser_is_launched() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver",
				"D:\\Ahsan\\SeleniumGecko\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	//	Thread.sleep(3000);
		
	}

	@Given("^google page is opened$")
	public void google_page_is_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("English (US)")).click();
		Thread.sleep(3000);
		System.out.println("page opened");
	}

	@When("^enter search criteria and search$")
	public void enter_search_criteria_and_search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("ahsan_sipra86@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("when username and passsword entered");

	}

	@Then("^search results are displayed$")
	public void search_results_are_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("all done");

	}
	
}
