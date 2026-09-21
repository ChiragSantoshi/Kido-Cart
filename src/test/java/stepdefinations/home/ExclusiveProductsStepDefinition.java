package stepdefinations.home;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import tests.home.ExclusiveProductsTests;

public class ExclusiveProductsStepDefinition {
    WebDriver driver;
    ExclusiveProductsTests exclusiveProductsTests;

    public ExclusiveProductsStepDefinition() {
        this.driver = new DriverFactory().getDriver();
        exclusiveProductsTests = new ExclusiveProductsTests(driver);
    }

    @Given("I clicked on study materials tab")
    public void iClickedOnStudyMaterialsTab() throws InterruptedException {
        exclusiveProductsTests.openStudyMaterialTab();
    }
    @Then("Only required number of products featured on study material tab")
    public void requiredNumberOfProductsFeaturedOnStudyMaterialTab() throws InterruptedException {
        exclusiveProductsTests.validateNumberOfProductsFeaturedOnStudyMaterialTab();
    }
}
