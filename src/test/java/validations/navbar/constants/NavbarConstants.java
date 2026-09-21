package validations.navbar.constants;

import org.openqa.selenium.By;

public interface NavbarConstants {
    By USER_ICON = By.xpath("//div[contains(@class,'cart_trigger')]/i[contains(@class,'ti-user')]");
    By CART_ICON = By.xpath("//li[@class='dropdown cart_dropdown']/a[contains(@class,'cart_trigger')]");
    By VIEW_CART_BUTTON = By.xpath("//a[contains(@class,'view-cart')]");
    By SEARCH_ICON = By.xpath("//a[contains(@class,'search_trigger')]");
}
