package aca.first.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static org.testng.Assert.*;

public class MyFirstWebDriverTest {


    /*
    * 	Verify "Կենցաղային տեխնիկա" page
    *
    * 1.Open megamarket.am
    * 2.Open Հայտարարություն
    * 3.Open Կենցաղային տեխնիկա
    * */
    @Test()
    public void myFirstTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayana\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://megamarket.am");
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.xpath("//nav[@class='clearfix']//li[3][@class='pop100']"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).build().perform();

        WebElement haytararutyun = driver.findElement(By.xpath("//*[@href='/statements']"));
        haytararutyun.click();

        driver.close();
        driver.quit();
    }

//        Thread.sleep(5000);
//        WebElement pageHaytararutyun = driver.findElement(By.xpath(".//*[@class='statements']"));
//
//        boolean isPresent_PageHaytararutyun = pageHaytararutyun.equals(null);
//
//        assertFalse(isPresent_PageHaytararutyun, "'Հայտարարություններ' page not found");
//        WebElement kencaxayin = driver.findElement(By.xpath(".//*[@class='fa fa-lightbulb-o']"));
//        kencaxayin.click();
//        Thread.sleep(5000);
//        WebElement pageKencaxayin = driver.findElement(By.xpath(".//*[@class='cnt cnt-w1024 statements-overflow clearfix']"));
//        boolean isPresent_PageKencaxayin = pageKencaxayin.equals(null);
//        assertFalse(isPresent_PageKencaxayin, "'Կենցաղային տեխնիկա' page not found");


}


