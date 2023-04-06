package day_02_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class D12_Exercise {

//-BeforeClass methodu ile driver ı olusturun ve Maximize edin, 15 sn bekletin
//-Before methodunda http://www.google.com adresine gidin
// -Üç farklı test methodu ile;
//-arama kutusuna "The God Father" yazip, cikan sonuc sayisini yazdirin
//-arama kutusuna  "Lord of the Rings" yazip, cikan sonuc sayisini yazdirin
//-arama kutusuna  "Kill Bill" yazip, cikan sonuc sayisini yazdirin
//-NOT: Çıkan sonuç sayılarını After methodunda yazdırınız
//-AfterClass ile kapatın

    static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Before
    public void setUp() {
        driver.get("http://www.google.com");
    }

    @Test
    public void test01() {
        driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("The God Father",Keys.ENTER);

    }

    @Test
    public void test02() {
        driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Lord of the Rings",Keys.ENTER);


    }

    @Test
    public void test03() {
        driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Kill Bill",Keys.ENTER);
    }


    @After
    public void tearDown() throws Exception {
       String [] sonuc = driver.findElement(By.xpath("//*[@id='result-stats']")).getText().split(" ");
        System.out.println("arama sonuclari :"+sonuc[1]);
    }

    @AfterClass
    public static void afterClass() throws Exception {
        driver.close();


    }






}