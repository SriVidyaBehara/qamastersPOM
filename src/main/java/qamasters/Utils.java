package qamasters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import qamasters.pages.BasePage;

import java.util.concurrent.TimeUnit;

public class Utils extends BasePage {
    public static void selectFromList(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public static void wait(int seconds) {

        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
}
