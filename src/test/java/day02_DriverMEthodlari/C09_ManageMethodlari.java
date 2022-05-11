package day02_DriverMEthodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_ManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amaazon.com");
        /*
          Ilerde wait konusunu daha genis olarak ele alacagiz
          Bir sayfa acilirken, ilk basta sayfanin icerisinde bulunan elementlere gore
          bir yuklenme suresine ihtiyac vardir
          veya bir webelementinin kullanilabilmesi icin zamana ihtiyac olabilir
          implicitlyWait bize sayfanin yuklenmesi ve sayfadaki elementlere ulasim icin beklenecek
          MAXIMUM sureyi belirleme olanagi tanir
         */
        driver.close();
        //bir testte birden fazla pencere aciksa driver.close() en son acik olani kapatir
        //hepsini kapatmak istiyorsak driver.quit(); i kullaniyoruz

    }
}
