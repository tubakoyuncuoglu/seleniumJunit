package day_02_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class D09_Exercise {
//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
// 3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
//5. Verify 'Login to your account' is visible
//6. Enter incorrect email address and password
//7. Click 'login' button
//8. Verify error 'Your email or password is incorrect!' is visible
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void test01() {
       driver.get("https://automationexercise.com");
        System.out.printf("sayfa gorundu", driver.findElement(By.xpath("(//html[@lang='en'])[1]")).isDisplayed());
        driver.findElement(By.xpath("//*[@href='/login']")).click();
    }
}
