package day02_DriverMEthodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethods {
    public static void main(String[] args) {
        //amazon kaynak kodlarina gidip "spend less" yazdigini test edin
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");


        String  kaynakKodlari=driver.getPageSource();
        String arananKelime="spend less";
        if(kaynakKodlari.contains(arananKelime)){
            System.out.println("kaynak kodu testi PASSEd");
        }else{
            System.out.println("kaynak kodlarda aranan kelime yok");
        }

    }
}
