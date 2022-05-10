package day02_DriverMEthodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMEthodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//browser'e tam sayfa yapar

        driver.get("https://www.facebook.com");//bu bizi oraya goturur bir alt satir da gosterir
        System.out.println("actuel title "  +driver.getTitle());//sout'a koymasak gideriz ama goremeyiz
        Thread.sleep(3000);
        System.out.println("actual url "+driver.getCurrentUrl());

        driver.close();//isini bitirir ve kapatir
    }
}
