package aca.first.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class MyFirstWebDriverTest extends FunctionalTest {



    @Test()
    public void myFirstTest() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);
        mainPage.openAboutUs();
        mainPage.openContacts();
        WebElement contacts = driver.findElement(By.xpath("//div[@class='about-bloc']"));
        Assert.assertTrue(contacts != null);
        mainPage.openAboutUs();
        mainPage.openInformation();
        WebElement information = driver.findElement(By.xpath("//div[@class='about-bloc']"));
        Assert.assertTrue(information != null);


    }
}


