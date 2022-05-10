package day01_SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {
        /*
        en ilkel haliyle bir otomasyon yapmak icin gerekli olan web driver'in yerini
        gostermemiz gerekiyor. Bunun icin java kutuphanesinden System.setProperty()
        methodunu kullaniriz
        System.setProperty("webdriver.chrome.driver -> buradaki driver'in yerini de
        driver'a gidip  , sag tus yapip ordan copy/pathReference i secip ordan da path
        content root u seciyoruz. Kopyaladigimiz uzantiyi da virgulden sonraya cift tirnak icinde yaziyoruz.
        "resources/drivers/chromedriver"
        */
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver");//driverin yeri
        //bir driver obj 'si olusturuyoruz
        WebDriver driver =new ChromeDriver();
        driver.get("https://aliexpress.com/");
        Thread.sleep(2000);


    }
}
/*
DOM; document opject model=>
 */