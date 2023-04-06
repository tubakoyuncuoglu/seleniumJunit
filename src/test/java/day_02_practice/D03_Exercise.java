package day_02_practice;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class D03_Exercise {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. Launch browser

        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        // 3. Verify that home page is visible successfully
        //2.yol
//        Boolean homePage = driver.findElement(By.xpath("//a[@style='color: orange;']")).isDisplayed();
//        System.out.println(homePage);

        WebElement homePage = driver.findElement(By.xpath("//a[@style='color: orange;']"));
        System.out.println(homePage.isDisplayed());

        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();

        //5. Verify 'New User Signup!' is visible
        //WebElement newUser = driver.findElement(By.xpath("//*[text()='New User Signup!']"));
        WebElement newUser = driver.findElement(By.xpath("(//h2)[3]"));
        System.out.println(newUser.isDisplayed());

        //6. Enter name and email address
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Gökhan");
        driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("gokhan7@gmail.com");

        //7. Click 'Signup' button
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enter = driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
        System.out.println(enter.isDisplayed());

        //9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("1234567");

        driver.findElement(By.xpath("//*[text()='5']")).click();
        driver.findElement(By.xpath("//*[text()='February']")).click();
        driver.findElement(By.xpath("//*[text()='1998']")).click();

        //10. Select checkbox 'Sign up for our newsletter!'
        //driver.findElement(By.xpath("//*[text()='Sign up for our newsletter!']")).click();


        //11. Select checkbox 'Receive special offers from our partners!'
        //driver.findElement(By.xpath("//*[text()='Receive special offers from our partners!']")).click();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//       WebElement isim =  driver.findElement(By.id("first_name"));
//        isim.sendKeys("İbrahim");
//        driver.findElement(with(By.tagName("label")).below(isim)).sendKeys("Nalbant");

        driver.findElement(By.id("first_name")).sendKeys("İbrahim");
        driver.findElement(By.id("last_name")).sendKeys("Nalbant");
        driver.findElement(By.id("company")).sendKeys("Techpro");
        driver.findElement(By.id("address1")).sendKeys("Türkiye");
        driver.findElement(By.id("address2")).sendKeys("İstanbul");
        driver.findElement(By.xpath("//*[text()='Canada']"));
        driver.findElement(By.id("state")).sendKeys("Marmara");
        driver.findElement(By.id("city")).sendKeys("İstanbul");
        driver.findElement(By.id("zipcode")).sendKeys("123546");
        driver.findElement(By.id("mobile_number")).sendKeys("12354689");


        //13. Click 'Create Account button'
        driver.findElement(By.xpath("//*[text()='Create Account']")).submit();

        //14. Verify that 'ACCOUNT CREATED!' is visible
        System.out.println(driver.findElement(By.xpath("//*[text()='Account Created!']")).isDisplayed());

        //15. Click 'Continue' button
        driver.findElement(By.xpath("//*[text()='Continue']")).click();

        //16. Verify that 'Logged in as username' is visible
        System.out.println(driver.findElement(By.xpath("//*[text()='Gökhan']")).isDisplayed());

        //17. Click 'Delete Account' button
        driver.findElement(By.xpath("//a[@href='/delete_account']")).click();

        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        System.out.println(driver.findElement(By.xpath("//*[text()='Account Deleted!']")).isDisplayed());
    }
}