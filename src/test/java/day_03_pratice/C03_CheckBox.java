package day_03_pratice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03_CheckBox extends TestBase {
    @Test
    public void checkbox() {


// https://demo.guru99.com/test/radio.html adresine gidin
    driver.get("https://demo.guru99.com/test/radio.html");
// checkbox elementlerini locate edin
      WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
      WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='vfb-6-1']"));
      WebElement checkbox3 = driver.findElement(By.xpath("//input[@id='vfb-6-2']"));
// checkbox1 ve checkbox3  secili degil ise secin
        if (!checkbox1.isEnabled()){
            checkbox1.click();
        }
        if (!checkbox3.isSelected()){
            checkbox3.click();
        }
// checkbox1 ve checkbox3 elementlerinin secili oldugunu Test edin
       Assert.assertTrue(checkbox1.isSelected());
        Assert.assertTrue(checkbox3.isSelected());


// checkbox2 elementinin secili olmadıgını test edin
        Assert.assertFalse(checkbox2.isSelected());


}


}
