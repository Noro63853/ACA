package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ADMIN on 27/04/2017.
 */
public class PageObject {
    public WebDriver driver;

    public PageObject(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}
