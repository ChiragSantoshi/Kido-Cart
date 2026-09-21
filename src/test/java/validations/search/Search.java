package validations.search;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import validations.search.constants.SearchConstants;

import java.time.Duration;

public class Search implements SearchConstants {
    WebDriver driver;
    WebDriverWait wait;
    public Search(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void searchAProduct(String productName) {
        wait.until(ExpectedConditions.elementToBeClickable(SEARCH_INPUT)).sendKeys(productName, Keys.ENTER);
    }
}
