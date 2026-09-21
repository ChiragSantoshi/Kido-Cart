package tests.cart;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import validations.cart.Cart;
import validations.home.exclusiveProducts.ExclusiveProducts;
import validations.loader.Loader;
import validations.navbar.Navbar;
import validations.singleProduct.SingleProduct;

import java.util.HashMap;
import java.util.Objects;

public class CartTests {
    WebDriver driver;
    Cart cart;
    Loader loader;
    Navbar navbar;
    ExclusiveProducts exclusiveProducts;
    SingleProduct singleProduct;

    public CartTests(WebDriver driver) {
        singleProduct = new SingleProduct(driver);
        loader = new Loader(driver);
        exclusiveProducts = new ExclusiveProducts(driver);
        navbar = new Navbar(driver);
        cart = new Cart(driver);
    }

    public void openRandomProductFromStudyMaterialTab(){
        exclusiveProducts.openRandomProductFromStudyMaterialTab();
    }

    public void addProductToCart(){
        loader.waitForLoaderToGetInvisible();
        singleProduct.ClickOnAddToCartBtn();
    }

    public void validateAddedToCartMessage(){
        Assert.assertTrue(singleProduct.isSuccessfullyAddedToCartMessageVisible(), "Failed to add product to cart or message not visible");
    }

    public void openCart(){
        navbar.openCart();
    }

    public void validateAddedProductInCart(){
        HashMap<String, Object> addedProduct = singleProduct.getProductData();
        loader.waitForLoaderToGetInvisible();
        Assert.assertTrue(cart.isProductVisibleInCart((String) addedProduct.get("name")));
    }


}
