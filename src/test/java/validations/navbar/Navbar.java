package validations.navbar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import validations.navbar.constants.NavbarConstants;

import java.time.Duration;

public class Navbar implements NavbarConstants {
    WebDriver driver;
    Actions actions;
    WebDriverWait wait;

    public Navbar(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public boolean isUserIconVisible() {
        return driver.findElement(USER_ICON).isDisplayed();
    }

    public void openCart(){
        WebElement cartIcon = driver.findElement(CART_ICON);
        actions.moveToElement(cartIcon);
        actions.perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(VIEW_CART_BUTTON)).click();
    }

    public void openSearchBar(){
        driver.findElement(SEARCH_ICON).click();
    }
}
