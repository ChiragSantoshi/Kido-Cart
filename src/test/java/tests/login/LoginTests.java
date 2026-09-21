package tests.login;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import validations.loader.Loader;
import validations.login.Login;
import validations.navbar.Navbar;
import validations.navigation.Navigation;

public class LoginTests {
    Login login;
    Navigation navigation;
    Loader loader;
    Navbar navbar;

    public LoginTests(WebDriver driver) {
        login = new Login(driver);
        navigation = new Navigation(driver);
        loader = new Loader(driver);
        navbar = new Navbar(driver);
    }

    public void visitLoginPage(){
        navigation.visitLoginPage();
    }

    public void login(String username, String password){
        loader.waitForLoaderToGetInvisible();
        login.enterUsername(username);
        login.enterPassword(password);
        login.clickOnLoginButton();
    }

    public void validateSuccessfulLogin(){
        Assert.assertTrue(navbar.isUserIconVisible(), "Failed to login");
    }

    public void isFailedToLoginMessageVisible(){
        Assert.assertTrue(login.isLoginPageVisible(), "Error message not visible");
    }

    public void isIncompleteFieldMsgVisible(){
        Assert.assertTrue(login.incompleteFieldMessageVisible(), "Incomplete Text Field Message Not Visible");
    }

    public void isInvalidEmailMessageVisible(){
        Assert.assertTrue(login.invalidEmailMessageVisible(), "Invalid Email Message Not Displayed");
    }


}
