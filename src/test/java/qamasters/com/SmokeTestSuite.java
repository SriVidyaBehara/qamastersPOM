package qamasters.com;

import org.junit.Test;
import qamasters.pages.ProductPage;
import qamasters.pages.IsUserOnHeaderPage;
import qamasters.pages.SearchAnItemPage;
import qamasters.pages.SigninPage;

public class SmokeTestSuite extends BaseTest {
    SigninPage signinpage=new SigninPage();
    SearchAnItemPage searchanitem=new SearchAnItemPage();
    IsUserOnHeaderPage yourLagaHeader=new IsUserOnHeaderPage();
    ProductPage productPage =new ProductPage();
    @Test
    public void verifyUserCanSearchAnItem(){
            signinpage.signinAs(userName,userPassword);
            yourLagaHeader.isUserOnHeaderPage();
            searchanitem.searchAnItem("Dresses");
            searchanitem.search();

    }
    @Test
    public void verifyUserCanAddAnItemToCart(){
        signinpage.signinAs(userName,userPassword);
        yourLagaHeader.isUserOnHeaderPage();
        searchanitem.searchAnItem("T-Shirts");
        searchanitem.search();
        productPage.clickfadedTshirt();
        productPage.enterQuantity("2");
        productPage.selectSize("L");
        productPage.selectColor();
        productPage.addToCart();
        productPage.itemSuccessfullyAddedToCart();

    }

}
