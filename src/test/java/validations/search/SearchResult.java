package validations.search;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import validations.search.constants.SearchResultConstants;

import java.util.List;

public class SearchResult implements SearchResultConstants {
    WebDriver driver;

    public SearchResult(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isSearchedProductVisible(String searchedProductName) {
        List<WebElement> productCards = driver.findElements(PRODUCT_CARD);

        for (WebElement productCard : productCards) {
            String extractedProductName = productCard.findElement(PRODUCT_TITLE).getText().trim();
            if (extractedProductName.equalsIgnoreCase(searchedProductName)) {
                return true;
            }
        }
        return false;
    }
}
