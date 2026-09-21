package stepdefinations.cart;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import tests.cart.CartTests;

import java.sql.Driver;

public class CartStepDefinition {
    WebDriver driver;
    CartTests cartTests;

    public CartStepDefinition() {
        this.driver = DriverFactory.getDriver();
        cartTests = new CartTests(driver);
    }

    @And("Opened random product from study material tab")
    public void openedRandomProductFromStudyMaterialTab()  {
        cartTests.openRandomProductFromStudyMaterialTab();
    }

    @And("I added product to cart")
    public void iAddedProductToCart() {
        cartTests.addProductToCart();
    }
    @Then("Successfully added to cart message was visible")
    public void successfullyAddedToCartMessageWasVisible() {
        cartTests.validateAddedToCartMessage();
    }
    @And("I opened cart")
    public void iOpenedCart() {
        cartTests.openCart();
    }

    @Then("Added product was visible in cart")
    public void addedProductWasVisibleInCart() {
        cartTests.validateAddedProductInCart();
    }
}
