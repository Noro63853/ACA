package pages;


import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ADMIN on 27/04/2017.
 */
public class MainPage {

    WebDriver driver ;
    @FindBy(xpath = Constants.ABOUT_US)
    WebElement aboutUs;

    @FindBy(xpath = Constants.INFORMATION)
    WebElement information;

    @FindBy(xpath = Constants.CONTACTS)
    WebElement contacts;


    public MainPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public void openAboutUs() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(aboutUs).build().perform();
        Thread.sleep(2000);

    }
    public void openInformation() throws InterruptedException {
        information.click();
        Thread.sleep(2000);
    }
    public void openContacts() throws InterruptedException {
        contacts.click();
        Thread.sleep(2000);

    }



}
