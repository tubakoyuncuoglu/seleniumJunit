package day_03_pratice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.List;
import java.util.Set;

public class M02_Exercise extends TestBase {
    @Test
    public void test01() {
        //1-Amazon anasayfaya gidin
        driver.get("https://Amazon.com");

        //TÜM COOKIE'LERI LİSTELEYEBİLMEK İÇİN driver.manage().getCookies() METHODUNU KULLANIRIZ
        Set<Cookie> Cokies = driver.manage().getCookies();
        int sayac = 1;
        for (Cookie w : Cokies) {
            System.out.println(sayac + ".inci cookies : " + w);
            System.out.println("name :" + w.getName());
            System.out.println("value." + w.getValue());
            sayac++;


        }

        //3-Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        Assert.assertTrue(Cokies.size() > 5);

        //4-ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        String actualisim = driver.manage().getCookieNamed("i18n-prefs").getValue();
        Assert.assertEquals("USD", actualisim);


        //5-ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie  olusturun ve sayfaya ekleyin
        Cookie yenicookies = new Cookie("en sevdigim cookies", "cikolatali");
        driver.manage().addCookie(yenicookies);

            //6-eklediginiz cookie’nin sayfaya eklendigini test edin
        Cokies = driver.manage().getCookies();
        sayac =1;
        for (Cookie w:Cokies) {
            System.out.println(sayac +".inci cookies :"+ w);
            sayac++;

        }

            //7-ismi skin olan cookie’yi silin ve silindigini test edin
           driver.manage().deleteCookieNamed("skin");
            Assert.assertFalse(Cokies.contains("skin"));
           Cokies = driver.manage().getCookies();
           sayac =1;
           for (Cookie w:Cokies) {
            System.out.println(sayac +".inci cookies :"+ w);
            sayac++;

        }




            //8-tum cookie’leri silin ve silindigini test edin
//        driver.manage().deleteAllCookies();
//           Assert.assertTrue(Cokies.size()==0);
//        Cokies = driver.manage().getCookies();
//        sayac =1;
//        for (Cookie w:Cokies) {
//            System.out.println(sayac +".inci cookies :"+ w);
//            sayac++;
//
//        }
//

        driver.manage().deleteAllCookies();
        Cokies =driver.manage().getCookies();
        Assert.assertTrue(Cokies.isEmpty());


        }
    }
