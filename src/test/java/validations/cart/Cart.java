package validations.cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import validations.cart.constants.CartConstants;

public class Cart implements CartConstants {
    WebDriver driver;
    public Cart(WebDriver driver) {
        this.driver = driver;
    }
    public boolean isProductVisibleInCart(String productName) {
        String formattedXpath = PRODUCT_NAME.replace("productName", productName);
        return driver.findElement(By.xpath(formattedXpath)).isDisplayed();
    }
}
