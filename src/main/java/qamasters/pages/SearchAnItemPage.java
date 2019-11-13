package qamasters.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchAnItemPage extends BasePage {
    @FindBy(css="#search_query_top")
    public WebElement itemnameField;
    @FindBy(name="submit_search")
    public WebElement searchButton;
    public SearchAnItemPage(){
        PageFactory.initElements(driver,this);
    }

    public void searchAnItem(String itemname){
        itemnameField.sendKeys(itemname);

    }
    public void search(){
        searchButton.click();

    }
}
