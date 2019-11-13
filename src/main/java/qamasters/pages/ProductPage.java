package qamasters.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import qamasters.Utils;

public class ProductPage extends BasePage {
    @FindBy(linkText="Faded Short Sleeve T-shirts")
    public WebElement fadedTshirt;
    @FindBy(css="#quantity_wanted")
    public WebElement quantityField;
    @FindBy(css="#group_1")
    public WebElement sizeList;
    @FindBy(name="Blue")
    public WebElement color;
    @FindBy(name="Submit")
    public WebElement addToCartButton;
    @FindBy(css=".layer_cart_product")
    public WebElement cartPopUp;

    @FindBy(css="#quantity_plus")
    public WebElement increaseQuantity;

    public ProductPage(){
        PageFactory.initElements(driver,this);

    }
    public void clickfadedTshirt(){
        fadedTshirt.click();
    }
    public void enterQuantity(String quantity){
        quantityField.sendKeys("quantity");

    }
    public void selectSize(String size){
        Utils.selectFromList(sizeList,size);
    }
    public void selectColor(){
        color.click();
    }
    public void addToCart(){
        addToCartButton.click();
    }
    public void itemSuccessfullyAddedToCart(){
        Assert.assertTrue(cartPopUp.isDisplayed());
    }

    public void increaseQuantity() {
        increaseQuantity.click();
    }
}
