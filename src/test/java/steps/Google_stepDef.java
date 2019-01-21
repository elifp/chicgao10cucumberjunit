package steps;

import Page.GooglePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilities.Driver;

public class Google_stepDef {
    GooglePage gpObj= new GooglePage();

    @Given("user is on the google homepage")
    public void user_is_on_the_google_homepage() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("user enters flowers")
    public void user_enters_flowers() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("user clickd search button")
    public void user_clickd_search_button() {

    }

    @Then("user should see results related to flowers")
    public void user_should_see_results_related_to_flowers() {
       String actualTitle= Driver.getDriver().getTitle();

    }

}
