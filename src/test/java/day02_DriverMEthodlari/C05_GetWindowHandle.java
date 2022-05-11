package day02_DriverMEthodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_GetWindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        System.out.println(driver.getWindowHandle());
        //hic bir yere gitmememe ragmen windpow handle verdi. Her defasinda farkli oluyor.
        //buna hash kodu denir. Bu ne isimize yarar. Ileride hash kodlarini bilirsek
        //pencereler driwerlar arasi gezebiliriz
        //CDwindow-23135D72D42CD405406AE9AEA3E6F192
    }
}
