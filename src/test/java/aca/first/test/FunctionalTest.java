package aca.first.test;

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
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32.zip\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterClass
    public static void testQuit(){
        driver.quit();
        driver.close();
    }
}
