package day_02_practice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class D10_Exercise extends TestBase {
 /*-http://demo.automationtesting.in/Alerts.html sayfasına gidiniz
 -Alert with OK karşısındaki click the button to display an alert box: butonuna tıklayınız
-Çıkan alert üzerindeki yazıyı konsola yazdırınız ve tamam butonuna basınız
-Alert with OK & Cancel butonuna basınız ve sonrasında click the button to display a confirm box butonuna basınız
-Çıkan alert'te iptal butonuna basınız
-Alert with Textbox butonuna basınız ve sonrasında click the button to demonstrate the prompt box butonuna basınız
-Çıkan prompt box'a 'isminizi' yazdırınız ve Tamam'a basınız
-Çıkan mesajı konsola yazdırınız
-Çıkan mesajın 'Hello <isminiz> How are you today' yazdığını doğrulayınız

  */

    @Before
    public void setUp() throws Exception {
        driver.get("http://demo.automationtesting.in/Alerts.html");
    }

    @Test
    public void test01() {
  driver.findElement(By.cssSelector("button[class='btn btn-danger']")).click();
  driver.switchTo().alert().accept();

       String alert = driver.findElement(By.cssSelector("button[class='btn btn-danger']")).getText();
        System.out.println(alert);
        driver.findElement(By.xpath("//*[text()='Alert with OK & Cancel '] ")).click();
       driver.findElement(By.xpath("//*[text()='click the button to display a confirm box ']")).click();
       driver.switchTo().alert().dismiss();
       driver.findElement(By.xpath("//*[text()='Alert with Textbox '] ")).click();
       driver.findElement(By.cssSelector("button[onclick='promptbox()']")).click();
       driver.switchTo().alert().sendKeys("tuba");
       driver.switchTo().alert().accept();
      String yaziGor = driver.findElement(By.id("demo1")).getText();
        System.out.println(yaziGor);
//        String actualIsim = driver.findElement(By.id("demo1")).getText();
//        String exceptedIsim = "Hello tuba How are you today";
//        Assert.assertEquals(actualIsim,exceptedIsim);

        String actualIsim = driver.findElement(By.id("demo1")).getText();
        String exceptedIsim = "Hello tuba How are you today";
        if (actualIsim.equals(exceptedIsim)){
            System.out.println("yaziyor");
        }else {
            System.out.println("yazmiyor");
        }

    }
}
