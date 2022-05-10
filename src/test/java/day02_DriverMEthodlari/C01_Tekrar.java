package day02_DriverMEthodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers");
        //bir projeye jar dosyalarini yukledikten sonra bir daha yuklemeye gerek yok
        //ancak her proje icin ayri ayri yuklememiz gerekir
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");


    }
}
