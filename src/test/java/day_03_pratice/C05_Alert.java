package day_03_pratice;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C05_Alert extends TestBase {
    @Test
    public void alert() {
        //http://demo.guru99.com/test/delete_customer.php adresine gidin
        driver.get("http://demo.guru99.com/test/delete_customer.php ");
        //customer id kısmına 53920 yazın
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("53920");
        //submit butonuna tıklayın
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        //cıkan alert mesajını yazdırın
        String alertmesaji = driver.switchTo().alert().getText();
        System.out.println("alert yazisi :"+ alertmesaji);
        //alerti kabul edin
        alertAccept();
        //cıkan 2. alert mesajını yazdırın
//    String alertmesaj2 = driver.switchTo().alert().getText();
//        System.out.println("alert yazisi2 :"+ alertmesaj2);
         alertText();

        //cıkan 2. alerti kabul edin
        alertAccept();


    }
}


