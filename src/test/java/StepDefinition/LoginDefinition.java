package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class LoginDefinition {

    @Given("^user is oon home page$")
    public void user_is_oon_home_page() throws Throwable {
        System.out.println("user is oon home page");
    }

    @When("^he enters credentials$")
    public void he_enters_credentials() throws Throwable {
        System.out.println("he enters credentials");
    }

    @Then("^logged in$")
    public void logged_in() throws Throwable {
      System.out.println("logged in");
    }

}