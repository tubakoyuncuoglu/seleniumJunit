package day_02_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class D19_Exercise extends TestBase {
    @Test
    public void iframe() {
//        1) Open the browser
//        2) Enter the URL “http://practice.automationtesting.in/”

        driver.get("http://practice.automationtesting.in");
//        3) Click on Shop Menu
        driver.findElement(By.xpath("//*[text()='Shop']")).click();
//        4) Now click on Home menu button
        driver.findElement(By.xpath("//*[text()='Home']")).click();
//        5) Test whether the Home page has Three Arrivals only

        List<WebElement> fotograf = driver.findElements(By.xpath("(//*[@class='woocommerce'])"));
        System.out.println(fotograf.size());
        //Assert.assertEquals(3,fotograf.size());


//        6) The Home page must contains only three Arrivals
       // Assert.assertTrue(fotograf.contains(driver.findElement(By.xpath("//*[@class='woocommerce']"))));

//        7) Now click the image in the Arrivals

        driver.findElement(By.xpath("(//*[@loading='lazy'])[3]")).click();
//        8) Test whether it is navigating to next page where the user can add that book into his basket.

        WebElement addbutton =driver.findElement(By.xpath("//*[text()='Add to basket']"));
        if (addbutton.isDisplayed()){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
        //System.out.println(driver.findElement(By.xpath("//*[text()='Add to basket']")).isEnabled());
//        9) Image should be clickable and shoul navigate to next page where user can add that book to his basket

        driver.findElement(By.xpath("//*[text()='Add to basket']")).click();

//        10) Click on Description tab for the book you clicked on.
        driver.findElement(By.xpath("//*[text()='Description']")).click();


//        11) There should be a description regarding that book the user clicked on
        System.out.println(driver.findElement(By.xpath("//*[@class='page']")).isDisplayed());


    }
}
