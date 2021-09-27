package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class RegiterDefinition {

	 @Given("^user is on home page$")
	    public void user_is_on_home_page() throws Throwable {
	       System.out.println("user is on home page");
	    }

	    @When("^he enters all details$")
	    public void he_enters_all_details() throws Throwable {
	    	System.out.println("he enters all details");
	    }

	    @Then("^registered$")
	    public void registered() throws Throwable {
	    	System.out.println("registered");
	    }


}