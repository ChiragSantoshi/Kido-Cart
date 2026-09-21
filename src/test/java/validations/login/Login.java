package validations.login;

import org.openqa.selenium.WebDriver;
import validations.login.constants.LoginConstants;

public class Login implements LoginConstants {
    WebDriver driver;
    public Login(WebDriver driver) {
        this.driver = driver;
    }
    public void enterUsername(String username) {
        driver.findElement(EMAIL_INPUT).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    public void clickOnLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
    }

    public boolean isLoginPageVisible() {
        return driver.findElement(LOGIN_TITLE).isDisplayed();
    }

    public boolean incompleteFieldMessageVisible(){
        return driver.findElement(FILL_INCOMPLETE_FIELD).isDisplayed();
    }

    public boolean invalidEmailMessageVisible(){
        return driver.findElement(INVALID_EMAIL).isDisplayed();
    }
}
