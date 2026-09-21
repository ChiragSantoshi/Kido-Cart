package stepdefinations.search;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import tests.search.SearchTests;

public class SearchStepDefinition {
    WebDriver driver;
    SearchTests searchTests;

    public SearchStepDefinition(){
        driver = DriverFactory.getDriver();
        searchTests = new SearchTests(driver);
    }

    @Given("I opened a search bar")
    public void iOpenedSearchBar(){
        searchTests.openSearchBar();
    }

    @When("I searched for a product {string}")
    public void searchProduct(String productName){
        searchTests.searchProduct(productName);
    }

    @Then("Searched product is visible {string}")
    public void searchProductIsVisible(String productName){
        searchTests.validateSearchProductVisible(productName);
    }
}
