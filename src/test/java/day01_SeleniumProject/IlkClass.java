package day01_SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class IlkClass {
    public static void main(String[] args) {
        //ilk otomasyonumuzu yapabiliriz artik
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver");
        //mac cullancilarin uzantisinda .exe yok, windovs kullananlarda var
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

    }
}
