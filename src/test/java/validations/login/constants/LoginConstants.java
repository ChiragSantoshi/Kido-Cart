package validations.login.constants;

import org.openqa.selenium.By;

public interface LoginConstants {
    By EMAIL_INPUT = By.name("email");
    By PASSWORD_INPUT = By.name("password");
    By LOGIN_BUTTON = By.id("btn-submit");
    By LOGIN_TITLE = By.xpath("//h3[normalize-space()='Login']");
    By FILL_INCOMPLETE_FIELD = By.xpath("//div[@class='invalid-feedback'][normalize-space()='Please fill out this field.']");
    By INVALID_EMAIL = By.xpath("//div[@class='invalid-feedback'][normalize-space()='Please enter an e-mail address.']");

}
