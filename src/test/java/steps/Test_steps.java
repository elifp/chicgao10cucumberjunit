package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Test_steps {

    @When("user goes to google application")
    public void user_goes_to_google_application() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("selenium is going to google.com");
    }

    @Then("user searches for apple")
    public void user_searches_for_apple() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user searching for a word apple");
    }

    @Then("user should be apple related results")
    public void user_should_be_apple_related_results() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user checking the results of search");
        Assert.fail("failing for a reason");
    }

    @Then("user tests something")
    public void user_tests_something() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user doing ");
    }

}
