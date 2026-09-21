package validations.loader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import validations.loader.constants.LoaderConstants;

import java.time.Duration;

public class Loader implements LoaderConstants {
    WebDriver driver;
    WebDriverWait wait;

    public Loader(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void waitForLoaderToGetInvisible() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LOADER));
    }
}
