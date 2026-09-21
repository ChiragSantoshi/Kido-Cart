package validations.navigation;

import org.openqa.selenium.WebDriver;
import validations.navigation.constants.NavigationConstants;

public class Navigation implements NavigationConstants {
    WebDriver driver;

    public Navigation(WebDriver driver) {
        this.driver = driver;
    }
    public void visitLoginPage() {
        driver.get(LOGIN_URL);
    }
}
