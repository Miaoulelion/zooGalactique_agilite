package zoo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  

public class CocktailSteps {
    private Order order;

	@Given("Romeo who wants to buy a drink")
	public void romeo_who_wants_to_buy_a_drink() {
	    // Write code here that turns the phrase above into concrete actions
		order = new Order();
        order.declareOwner("Romeo");
	}

	@When("an order is declared for Juliette")
	public void an_order_is_declared_for_Juliette() {
	    // Write code here that turns the phrase above into concrete actions
        order.declareTarget("Juliette");
	}

	@Then("there is no cocktail in the order")
	public void there_is_no_cocktail_in_the_order() {
	    // Write code here that turns the phrase above into concrete actions
		List<String> cocktails =  order.getCocktails();
        assertEquals(0, cocktails.size());	
    }
}
