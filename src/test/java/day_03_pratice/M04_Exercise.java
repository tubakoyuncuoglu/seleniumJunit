package day_03_pratice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class M04_Exercise extends TestBase {
    @Test

    public void sahibinden() {

        driver.get("http://www.sahibinden.com");

        driver.findElement(By.id("searchText")).sendKeys("otomobil", Keys.ENTER);

        WebElement otomobil = driver.findElement(By.xpath("//a[@title='Otomobil']"));
        otomobil.click();

        driver.findElement(By.linkText("Audi")).click();
        driver.findElement(By.linkText("A5")).click();
        WebElement il = driver.findElement(By.xpath("//*[@class='faceted-select']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(il).perform();
      WebElement tikle=  driver.findElement(By.xpath("//*[text()='USD']"));

    }
}
