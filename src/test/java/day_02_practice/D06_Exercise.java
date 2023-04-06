package day_02_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class D06_Exercise {
//  1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
// 3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
//5. Verify 'Login to your account' is visible
//6. Enter correct email address and password
//7. Click 'login' button
//8. Verify that 'Logged in as username' is visible
//9. Click 'Delete Account' button
//10. Verify that 'ACCOUNT DELETED!' is visible
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

        System.out.printf("sayfa göründü", driver.findElement(By.xpath("//*[text()='Login to your account']")).isDisplayed());
        // driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("tuba@gmail.com", Keys.ENTER);
        // driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234tm",Keys.ENTER);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tuba",Keys.ENTER);
        driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("tuba@gmail.com",Keys.ENTER);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

        // driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345",Keys.ENTER);
        WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
        Select obj = new Select(day);
        obj.selectByIndex(3);
        WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
        Select obj1 = new Select(month);
        obj1.selectByValue("10");
        WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
        Select obj2 = new Select(year);
        obj2.selectByIndex(12);
      WebElement KUTUCUK =  driver.findElement(By.xpath("//input[@id='newsletter']"));
      if (!KUTUCUK.isSelected()){
          KUTUCUK.click();
      }
      WebElement kutucuk2 = driver.findElement(By.xpath("//input[@id='optin']"));
      if (!kutucuk2.isSelected()){
          kutucuk2.click();
      }
     driver.findElement(By.xpath("//*[text()='Create Account']")).submit();



    }
}




