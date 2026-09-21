package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BasicsOfCucumber {
    @Given("I visited {string}")
    public void iVisitedGoogle(String url){
        System.out.println("visited " + url);
    }

    @When("I clicked on gmail")
    public void iClickedOnGmail(){
        System.out.println("clicked on gmail");
    }

    @And("I entered username {string}")
    public void iEnteredUsername(String username){
        System.out.println("entered username " + username);
    }

    @And("password {string}")
    public void iEnteredPassword(String password){
        System.out.println("entered password " + password);
    }
}
