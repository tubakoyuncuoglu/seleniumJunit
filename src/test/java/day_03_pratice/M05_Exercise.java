package day_03_pratice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class M05_Exercise extends TestBase {
    @Test
    public void test01() {


// Sahibinden.com adresine gidin
        driver.get("http://www.sahibinden.com");

        // Otomobil seçeneğine tıklayın
        WebElement otomobilLink = driver.findElement(By.linkText("Otomobil"));
        otomobilLink.click();

        // Audi seçeneğine tıklayın
        WebElement audiLink = driver.findElement(By.xpath("//div[@class='category-item']/a[contains(text(), 'Audi')]"));
        audiLink.click();

        // A5'i seçin
        WebElement a5Link = driver.findElement(By.xpath("//div[@class='model-listing']/ul/li/a[contains(text(), 'A5')]"));
        a5Link.click();

        // İl seçeneğine gelip Adıyaman'ı seçin
        WebElement ilLink = driver.findElement(By.xpath("//div[@id='searchCategoryContainer']/div/div[2]/div[1]/a"));
        ilLink.click();
        WebElement adiyamanLink = driver.findElement(By.xpath("//div[@id='searchCategoryContainer']/div/div[2]/div[1]/div[2]/a[contains(text(), 'Adıyaman')]"));
        adiyamanLink.click();

        // İlçe seçeneğine gelip Merkez'i seçin
        WebElement ilceLink = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='searchCategoryContainer']/div/div[3]/div[1]/a")));
        ilceLink.click();
        WebElement merkezLink = driver.findElement(By.xpath("//div[@id='searchCategoryContainer']/div/div[3]/div[1]/div[2]/a[contains(text(), 'Merkez')]"));
        merkezLink.click();

        // Fiyat kısmında USD'yi seçin
        WebElement fiyatLink = driver.findElement(By.xpath("//div[@class='search-filter-item'][2]/div/a"));
        fiyatLink.click();
        WebElement usdLink = driver.findElement(By.xpath("//ul[@class='selectbox-list']/li/a[contains(text(), 'USD - Dolar')]"));
        usdLink.click();

        // Yakıt kısmında dizel'i seçin
        WebElement yakitLink = driver.findElement(By.xpath("//div[@class='search-filter-item'][4]/div/a"));
        yakitLink.click();
        WebElement dizelLink = driver.findElement(By.xpath("//ul[@class='selectbox-list']/li/a[contains(text(), 'Dizel')]"));
        dizelLink.click();

        // Vites kısmında otomatik'i seçin
        WebElement vitesLink = driver.findElement(By.xpath("//div[@class='search-filter-item'][5]/div/a"));
        vitesLink.click();
        WebElement otomatikLink = driver.findElement(By.xpath("//ul[@class='selectbox-list']/li/a[contains(text(), 'Otomatik')]"));
        otomatikLink.click();

        // Tarayıcıyı kapatın
        driver.quit();
    }

}
