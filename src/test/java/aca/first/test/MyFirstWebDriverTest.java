package aca.first.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.MainPage;

import static org.testng.Assert.*;

public class MyFirstWebDriverTest extends FunctionalTest {


    @Test()
    public void myFirstTest() throws InterruptedException {
<<<<<<< HEAD

        MainPage mainPage = new MainPage(driver);
        mainPage.openAboutUs();
        mainPage.openContacts();
        WebElement contactos = driver.findElement(By.xpath("//div[@class='about-bloc']"));
        Assert.assertTrue(contactos != null);
        mainPage.openAboutUs();
        mainPage.openInformation();
        WebElement informato = driver.findElement(By.xpath("//div[@class='about-bloc']"));

=======
>>>>>>> 2657ac62b2ee99defdb5aa54fe265267d82c873b

    }
}


