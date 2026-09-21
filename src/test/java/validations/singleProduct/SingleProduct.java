package validations.singleProduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;

public class SingleProduct implements SingleProductConstants{
    WebDriver driver;
    WebDriverWait wait;
    HashMap<String, Object> productData;

    public SingleProduct(WebDriver driver) {
        this.driver = driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void ClickOnAddToCartBtn(){
        storeProductData();
        driver.findElement(ADD_TO_CART_BUTTON).click();
    }

    public boolean isSuccessfullyAddedToCartMessageVisible(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(ADDED_TO_CART_MESSAGE)).isDisplayed();
    }

    public void storeProductData(){
        productData=new HashMap<>();
        productData.put("name",this.getName());
        productData.put("price",this.getPrice());
        productData.put("quantity",this.getQuantity());
    }

    public String getName(){
        return driver.findElement(NAME).getText();
    }
    public float getPrice(){
        return Float.parseFloat(driver.findElement(PRICE).getText().trim());
    }
    public int getQuantity(){
        return Integer.parseInt(driver.findElement(QUANTITY).getAttribute("value"));
    }
    public HashMap<String, Object> getProductData(){
        return productData;
    }
}
