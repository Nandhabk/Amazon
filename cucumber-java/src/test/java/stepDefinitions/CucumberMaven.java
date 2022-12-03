package stepDefinitions;




import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CucumberMaven {
	
	@Given("^user enter valid username$")
	public void user_enter_valid_username() {
	   System.out.println("hi");
	}
	
	@Given("user enter valid password")
	public void user_enter_valid_password() {
	   System.out.println("hi");
	}
	@When("user click on login")
	public void user_enter_valid_password1() {
	   System.out.println("hi");
	}
	@Then("Home screen should be displayed")
	public void user_enter_valid_password2() {
	   System.out.println("hi");
	}
	
	
	
	
	
	
	
	
	
	@Then("^home screen should display$")
	public void home_screen_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	

	
}
