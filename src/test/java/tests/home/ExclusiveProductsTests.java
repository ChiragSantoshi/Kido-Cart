package tests.home;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import validations.home.exclusiveProducts.ExclusiveProducts;
import validations.loader.Loader;

public class ExclusiveProductsTests {
    ExclusiveProducts exclusiveProducts;
    Loader loader;

    public ExclusiveProductsTests(WebDriver driver) {
        exclusiveProducts = new ExclusiveProducts(driver);
        loader = new Loader(driver);
    }

    public void openStudyMaterialTab() throws InterruptedException{
        loader.waitForLoaderToGetInvisible();
        exclusiveProducts.iClickedOnStudyMaterialTab();
    }

    public void validateNumberOfProductsFeaturedOnStudyMaterialTab() throws InterruptedException{
        Assert.assertEquals(exclusiveProducts.getNumberOfProductsFeaturedOnStudyMaterialTab(),8,"Number of products featured on the studial tab is not equal to expected");
    }
}
