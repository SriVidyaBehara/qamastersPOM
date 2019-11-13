package qamasters.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage extends BasePage {
@FindBy(linkText = "Sign in")
    public WebElement signinLink;
@FindBy(css="#email")
    public WebElement uNameField;
@FindBy(css="#passwd")
    public WebElement pswdField;
@FindBy(css="#SubmitLogin")
    public WebElement signinButton;
public SigninPage(){
    PageFactory.initElements(driver,this);
}
public void signinAs(String username,String password){
    signinLink.click();
    uNameField.sendKeys(username);
    pswdField.sendKeys(password);
    signinButton.click();
}
}
