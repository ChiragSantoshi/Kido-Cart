package validations.singleProduct;

import org.openqa.selenium.By;

public interface SingleProductConstants {

    By ADD_TO_CART_BUTTON = By.xpath("//button[contains(@class,'btn-addtocart')][normalize-space()='Add to cart']");
    By ADDED_TO_CART_MESSAGE = By.xpath("//div[normalize-space()='Successfully Added to cart!']");
    By NAME = By.xpath("//h4[@class='product_title']/a");
    By PRICE = By.xpath("//span[@class='price']");
    By QUANTITY = By.name("quantity");
}