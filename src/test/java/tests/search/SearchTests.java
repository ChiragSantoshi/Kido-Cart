package tests.search;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import validations.loader.Loader;
import validations.navbar.Navbar;
import validations.search.Search;
import validations.search.SearchResult;

public class SearchTests {
    Navbar navbar;
    SearchResult searchResult;
    Loader loader;
    Search search;

    public SearchTests(WebDriver driver) {
        navbar = new Navbar(driver);
        loader = new Loader(driver);
        search = new Search(driver);
        searchResult  = new SearchResult(driver);
    }

    public void openSearchBar(){
        loader.waitForLoaderToGetInvisible();
        navbar.openSearchBar();
    }

    public void searchProduct(String productName){
        search.searchAProduct(productName);
    }

    public void validateSearchProductVisible(String productName){
        boolean isSearchProductVisible = searchResult.isSearchedProductVisible(productName);
        Assert.assertTrue(isSearchProductVisible,"Searched product not visible");
    }
}
