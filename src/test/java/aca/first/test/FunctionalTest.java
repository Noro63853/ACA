package aca.first.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ADMIN on 27/04/2017.
 */
public class FunctionalTest {
    protected static WebDriver driver;


    @BeforeClass
    public static void testTools(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();


    }
    @AfterTest
    public static void testQuit(){
        driver.close();
        driver.quit();

    }
}
