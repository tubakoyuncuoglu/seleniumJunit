package day_03_pratice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class M04_Exercise extends TestBase {
    @Test

    public void sahibinden() {
        /*
        -http://www.sahibinden.com adresine gidiniz
        -otomobil secenegine click yapin
        -Audi secegine click yaptiktan sonra A5' click'leyin
        -il secenegine gelip adıyaman'ı click'leyin
        -ilce secenegine gelip merkez'i click'leyin
        -fiyat kisminda usd ' yi click'le
        -yakıt kısmında dizel'i click'le
        -vites kısmında otomatik click'le
         */

        driver.get("http://www.sahibinden.com");

        driver.findElement(By.id("searchText")).sendKeys("otomobil", Keys.ENTER);

        WebElement otomobil = driver.findElement(By.xpath("//a[@title='Otomobil']"));
        otomobil.click();

        driver.findElement(By.linkText("Audi")).click();
        driver.findElement(By.linkText("A5")).click();

        //1.yol
//        WebElement il = driver.findElement(By.xpath("//*[@class='faceted-select']"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(il).perform();
//      WebElement tikle=  driver.findElement(By.xpath("//*[text()='USD']"));



       // 2.yol
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@class='faceted-select']"));
        aramaKutusu.sendKeys(Keys.SHIFT,"il",Keys.ENTER,"izmir",Keys.ENTER);
      WebElement tikle = driver.findElement(By.xpath("(//*[@class='noChild facetedCheckbox'])[5]"));
     if (!tikle.isSelected()){
         tikle.click();
     }
     driver.findElement(By.xpath("//*[@class='btn btn-block search-submit']")).submit();
     //driver.findElement(By.xpath("//a[@class='collapse-pane']")).click();

//     WebElement aramakutusu1 = driver.findElement(By.xpath("(//*[@type='text'])[5]"));
//    aramakutusu1.sendKeys(Keys.SHIFT,"ilçe",Keys.ENTER,"bornova",Keys.ENTER);
//     WebElement ilce = driver.findElement(By.xpath("(//*[@class='noChild facetedCheckbox'])[3]"));
//     if (!ilce.isSelected()){
//         ilce.click();
//     }

     //3.yol
        //WebElement il = driver.findElement(By.xpath("//*[@class='faceted-select']"));
       //Select select = new Select(il);
      //select.selectByIndex(5);



//     WebElement isaretle = driver.findElement(By.xpath("//*[text()='USD']"));
//     if (!isaretle.isSelected()){
//         isaretle.click();
//     }


    }
}
