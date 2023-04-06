package day_02_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class D07_Exercise {

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://automationexercise.com");
    }

    @Test
    public void test01() {
        //System.out.printf("Sayfaya erisildi",driver.findElement(By.xpath("(//html[@lang='en'])[1]")).isEnabled());
        assertTrue(driver.findElement(By.xpath("(//html[@lang='en'])[1]")).isEnabled());


        driver.findElement(By.xpath("//a[@href='/login']")).click();

         driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("tuba@gmail.com", Keys.ENTER);
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345", Keys.ENTER);
         driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

        //System.out.printf("SAYFA GORUNDUMU", driver.findElement(By.xpath("//*[@class='fa fa-user']")).isDisplayed());
        driver.findElement(By.xpath("//*[@href='/delete_account']"));
    }
}
