package stepdefinations.login;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import tests.login.LoginTests;

public class LoginStepDefinations {
    WebDriver driver;
    LoginTests loginTests;

    public LoginStepDefinations() {
        driver = DriverFactory.getDriver();
        loginTests = new LoginTests(driver);
    }

    @Given("I visited login page")
    public void iVisitedLoginPage() {
        loginTests.visitLoginPage();
    }

    @Given("I entered username {string} and password {string}")
    public void iEnteredUsernameAndPassword(String username, String password) {
        loginTests.login(username, password);
    }

    @Then("I logged in successfully")
    public void iLoggedInSuccessfully() {
        loginTests.validateSuccessfulLogin();
    }

    @Then("I failed to login")
    public void iFailedToLogin() {
        loginTests.isFailedToLoginMessageVisible();
    }

    @Then("Incomplete Message Field Displayed")
    public void messageDisplayedToMe(){
        loginTests.isIncompleteFieldMsgVisible();
    }

    @Then("Invalid Email Message Displayed")
    public void invalidEmailMessageDisplayedToMe(){
        loginTests.isInvalidEmailMessageVisible();
    }
}
