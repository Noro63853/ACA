package aca.first.test;

import constants.Constants;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ADMIN on 27/04/2017.
 */
public class FunctionalTest {
    protected static WebDriver driver;


    @BeforeClass
    public static void testTools(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ACA Student 002\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get(Constants.URL);
        driver.manage().window().maximize();

    }
    @AfterClass
    public static void testQuit(){
        driver.quit();
        driver.close();
    }
}
