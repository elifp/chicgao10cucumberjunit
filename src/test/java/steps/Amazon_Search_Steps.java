package steps;

import Page.AmazonPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Driver;

public class Amazon_Search_Steps {
   AmazonPage aponj= new AmazonPage();

    @Given("User is on the amazon homepage")
    public void user_is_on_the_amazon_homepage() {
        Driver.getDriver().get("http://amazon.com");
    }

    @When("User enters headphones keyword")
    public void user_enters_headphones_keyword() {


    }

    @When("User clicks to search button")
    public void user_clicks_to_search_button() {


    }

    @Then("User should see headphones in results")
    public void user_should_see_headphones_in_results() {

    }
}
