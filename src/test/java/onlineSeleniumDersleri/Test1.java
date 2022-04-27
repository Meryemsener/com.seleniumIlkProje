package onlineSeleniumDersleri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver");//driverin yeri
        //bir driver obj 'si olusturuyoruz
        WebDriver driver =new ChromeDriver();
        driver.get("https://aliexpress.com/");
    }
}
/*
DOM; document opject model=>
 */