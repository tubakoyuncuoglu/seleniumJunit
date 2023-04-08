package NT_day13_ActionsClass;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import javax.swing.*;

public class C01_Actions02 extends TestBase {

    @Test
    public void test01() {

//    Amazon anasayfasına gidin
    driver.get("https://Amazon.com");
//    "Account & List" üzerinde bekleyin (mouse over - hover over)
        WebElement accountList = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
        Actions actions= new Actions(driver);
        actions.moveToElement(accountList).perform();
//    Açılan menüde "Account" linkine tıklayın
        driver.findElement(By.xpath("//*[text()='Account']")).click();
//    Açılan sayfanın başlığının "Your Account" içerdiğini doğrulayın
        Assert.assertEquals("Your Account",driver.getTitle());
//


    }
}
