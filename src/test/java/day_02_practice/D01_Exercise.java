package day_02_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class D01_Exercise {
      /*
    *** Aşağıdaki Task'i Junit framework'u ile yapınız
    - http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
    - Add Element butonuna 100 defa basınız
    - 100 defa basıldığını test ediniz
    - 90 defa delete butonuna basınız
    - 90 defa basıldığını doğrulayınız
    - Sayfayı kapatınız
     */

    @Test
    public void test1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        // Add Element butonuna 100 defa basınız
        WebElement addButton = driver.findElement(By.xpath("//*[@onclick='addElement()']"));

        for (int i = 0; i < 100; i++) {
            addButton.click();
        }

        // 100 defa basıldığını test ediniz
        List<WebElement> deleteButton = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
        Assert.assertEquals(100,deleteButton.size());

        // 90 defa delete butonuna basınız

        for (int i = 0; i < 90; i++) {
            driver.findElement(By.xpath("//*[@onclick='deleteElement()']")).click();
        }


        // 90 defa basıldığını doğrulayınız
        List<WebElement> deleteButtonList = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
        int kalanDeleteButton = deleteButton.size()-90;
        Assert.assertEquals(kalanDeleteButton,deleteButtonList.size());

        // Sayfayı kapatınız
        driver.close();


    }
}