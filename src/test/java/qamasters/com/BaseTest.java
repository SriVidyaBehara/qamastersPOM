package qamasters.com;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import qamasters.pages.BasePage;

import java.util.concurrent.TimeUnit;

public class BaseTest extends BasePage {
    @BeforeClass
    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(baseURL);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
    }
    @AfterClass
    public static void closeBrowser(){
        driver.close();
    }

}
