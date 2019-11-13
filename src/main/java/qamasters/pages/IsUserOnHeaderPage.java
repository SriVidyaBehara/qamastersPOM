package qamasters.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IsUserOnHeaderPage extends BasePage {
    @FindBy(css="img[class='logo img-responsive']")
    public WebElement yourLagaHeaderField;
    public IsUserOnHeaderPage(){
        PageFactory.initElements(driver,this);
    }
    public void isUserOnHeaderPage(){
        yourLagaHeaderField.isDisplayed();
    }
}
