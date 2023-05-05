package day_03_pratice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class M06_Exercise extends TestBase {
    @Test
    public void sabindn() {

        driver.get("https://www.ebay.com/b/Cars-Trucks/6001/bn_1865117");
       // driver.findElement(By.xpath("//*[@class='b-list__footer-resetbutton b-list__footer--viewall']")).click();
       driver.findElement(By.linkText("Audi")).click();
       driver.findElement(By.xpath("//*[text()='Price']")).click();
       driver.findElement(By.xpath("//*[text()='Under $15,000.00']")).click();
       WebElement frame= driver.findElement(By.xpath("//*[@title='Ads by Google']"));
      driver.switchTo().frame(frame);
      // driver.switchTo().frame("iframe");
    driver.findElement(By.linkText("imotors.com")).click();
   WebElement gorunebiliyormu = driver.findElement(By.xpath("(//h2)[1]"));
        Assert.assertEquals("SELECT AUDI MODEL TO GET PRICING",gorunebiliyormu);


//
//     driver.get("http://www.sahibinden.com");
//
//    driver.findElement(By.id("searchText")).sendKeys("otomobil", Keys.ENTER);
//
//    WebElement otomobil = driver.findElement(By.xpath("//a[@title='Otomobil']"));
//    otomobil.click();
//
//    driver.findElement(By.linkText("Audi")).click();
//    driver.findElement(By.linkText("A5")).click();
//    WebElement aramaButonu = driver.findElement(By.xpath("//*[@class='faceted-select']"));
//
//    aramaButonu.sendKeys(Keys.SHIFT,"Antalya",Keys.ENTER);
//    WebElement istedigimIliSec = driver.findElement(By.xpath("(//*[@class='noChild facetedCheckbox'])[12]"));
//
//   istedigimIliSec.sendKeys("Antalya"+Keys.ENTER);
//

}
}

