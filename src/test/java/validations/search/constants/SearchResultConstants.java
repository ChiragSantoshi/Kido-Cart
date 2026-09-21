package validations.search.constants;

import org.openqa.selenium.By;

public interface SearchResultConstants {
    By PRODUCT_CARD = By.xpath("//div[@class='product product-wrapper']");
    By PRODUCT_TITLE = By.xpath("//div[@class='product_info']/h6");
}

