package day_02_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class D08_Exercise {
    /*
   Bir class oluşturun: DropDown
 https://the-internet.herokuapp.com/dropdown adresine gidin.
1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve
yazdırın
4.Tüm dropdown değerleri(value) yazdırın
5. Dropdown’un boyutunu bulun, Dropdown’da 4 öğe varsa konsolda True ,
degilse
False yazdırın.

     */
   static WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://the-internet.herokuapp.com/dropdown");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.close();

    }

    @Test
    public void test01() {


        WebElement drop = driver.findElement(By.xpath("//*[@id='dropdown']"));
        Select droplist = new Select(drop);
        droplist.selectByIndex(1);


        WebElement drop2 = driver.findElement(By.xpath("//*[@id='dropdown']"));
        Select droplist2 = new Select(drop2);
        droplist2.selectByValue("2");


        WebElement drop3 = driver.findElement(By.xpath("//*[@id='dropdown']"));
        Select droplist3 = new Select(drop3);
        droplist3.selectByVisibleText("Option 1");




    }

    @Test
    public void test02() {
        WebElement liste= driver.findElement(By.cssSelector("select[id='dropdown']"));
     Select select = new Select(liste);
     List<WebElement> liste1 = select.getOptions();
        for (WebElement w:liste1) {
            System.out.println(w.getText());

        }
        liste1.forEach(t-> System.out.println(t.getText()));



        WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
        List<WebElement> liste2 = dropdown.findElements(By.tagName("Option"));
        if (liste2.size()==4){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }

        //2.yol
        assertTrue(liste2.size()==4);
    }


}
