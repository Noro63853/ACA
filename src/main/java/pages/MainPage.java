package pages;


import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * Created by ADMIN on 27/04/2017.
 */
public class MainPage extends PageObject {
    @FindBy(className = Constants.Fun)
    WebElement joy;

    @FindBy(linkText = Constants.Movies_xpath)
    WebElement cinema;

    @FindBy(className = Constants.Movies_page)
    WebElement cinemaPage;

    @FindBy(className = Constants.Movies_list_button)
    WebElement button;

    @FindBy(className = Constants.Movies_list_page)
    WebElement list;

    @FindBy(className = Constants.Movies_search_field)
    WebElement cinemaSearch;

    @FindBy(className = Constants.Movies_search_button)
    WebElement cinemaSearchButton;

    public MainPage(WebDriver driver){
        super(driver);

        driver.get(Constants.Url);
        driver.manage().window().maximize();

    }
    public void openCategoryMovie() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(joy).build().perform();
        Thread.sleep(2000);
        cinema.click();
        Assert.assertTrue(cinemaPage !=null);

    }
    public void openMovieList() throws InterruptedException {
        button.click();
        Thread.sleep(2000);
        Assert.assertTrue(list !=null);
    }
    public void enterName(String Հանցագործը){
        cinemaSearch.clear();
        cinemaSearch.sendKeys(Հանցագործը);

    }
    public PageObject search() throws InterruptedException {
        cinemaSearchButton.click();
        Thread.sleep(2000);
        return new MainPage(driver);
    }





}
