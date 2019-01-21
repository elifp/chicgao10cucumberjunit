package steps;

import Page.DataTablesPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import utilities.Driver;

public class DataTables_Step {

    DataTablesPage dtobj= new DataTablesPage();

    @Given("User is on the datatables homepage")
    public void user_is_on_the_datatables_homepage() {
        Driver.getDriver().get("https://editor.datatables.net");
    }

    @Given("User clicks to New Button")
    public void user_clicks_to_New_Button() {
    dtobj.newButton.click();
    }

    @Then("User should see Create New Entry Box")
    public void user_should_see_Create_New_Entry_Box() {
        Assert.assertTrue(dtobj.DataDisplay.isDisplayed());

    }

    @Then("User should enter firstname")
    public void user_should_enter_firstname() {
    dtobj.firstName.sendKeys("Pek");
    }

    @Then("User should enter lastname")
    public void user_should_enter_lastname() {

    }

    @Then("User should enter position")
    public void user_should_enter_position() {

    }

    @Then("User should enter office")
    public void user_should_enter_office() {

    }

    @Then("User should enter extension")
    public void user_should_enter_extension() {

    }

    @Then("User should enter start date")
    public void user_should_enter_start_date() {

    }

    @Then("User should enter salary")
    public void user_should_enter_salary() {

    }

    @Then("User should click ti create button")
    public void user_should_click_ti_create_button() {

    }

    @Then("User enters first name to serach box")
    public void user_enters_first_name_to_serach_box() {

    }

    @Then("User should se first name is inserted in the table")
    public void user_should_se_first_name_is_inserted_in_the_table() {

    }


}
