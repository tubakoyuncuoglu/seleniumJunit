package day_02_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class D14_Exercise extends TestBase {
    @Test
    public void iframe() {


    //➢   https://testcenter.techproeducation.com/index.php?page=iframe
        driver.get(" https://testcenter.techproeducation.com/index.php?page=iframe");
    //➢   Ana sayfadaki ‘An iframe with a thin black border:’ metninde ‘black border’ yazisinin   oldugunu test edelim
        String actualText = driver.findElement(By.xpath("//p[text()='An iframe with a thin black border:']")).getText();
        String exceptedText = "black border";
        Assert.assertTrue(actualText.contains(exceptedText));
    //➢   Ayrica ‘Applications lists’ yazisinin sayfada oldugunu test edelim
        driver.switchTo().frame(0);
        String actualtext2 = driver.findElement(By.xpath("//h1[@class='display-5 fw-bold']")).getText();
        String exceptedText2 = "Applications lists";
        Assert.assertTrue(actualtext2.contains(exceptedText2));

    //➢   Son olarak footer daki ‘Povered By’ yazisini varligini test edilip
        driver.switchTo().defaultContent();
        String actualText3 = driver.findElement(By.xpath("//*[text()='Povered By']")).getText();
        Assert.assertTrue(actualText3.contains("Povered By"));
 }
 }
