package validations.home.exclusiveProducts.constants;

import org.openqa.selenium.By;

public interface ExclusiveProductsConstants {
    By STUDY_MATERIAL_TAB = By.id("study-material-kit");
    By STUDY_MATERIAL_CARDS = By.xpath("//div[@id='study-material-kit']//div[contains(@class,'product product-wrapper')]");
    By PRODUCT_VIEW_DETAILS_BUTTON = By.xpath("//div[@id='study-material-kit']//div[contains(@class,'product-wrapper')]//a[normalize-space()='View Details']");
}
