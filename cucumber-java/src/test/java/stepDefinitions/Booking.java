package stepDefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Booking {
	
	@Given("Enter {String}")
	public void enter_Date(String name){
		
		System.out.println("HI");
	   
	}

	@Given("^Place$")
	public void place() {
	    
		System.out.println("HI");
		
	}

	@When("^user click book$")
	public void user_click_book()  {
	  
		System.out.println("HI");
		
	}

	@Then("^Ticket should be booked$")
	public void ticket_should_be_booked()  {
	    
		System.out.println("HI");

	}

}
