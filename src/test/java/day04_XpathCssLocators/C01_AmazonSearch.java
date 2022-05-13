package day04_XpathCssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearch {
    //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

    //  a. web sayfasına gidin. https://www.amazon.com/

    //  b. Search(ara) “city bike”

    //  c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın

    //  d-Sonra karşınıza çıkan ilk sonucun resmine tıklayın.


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1 ) Bir class oluşturun : Locators_css

        //2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.

        //  a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("https://www.amazon.com");
        //  b. Search(ara) “city bike”
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);
        //  c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> istenenElementListesi = driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazisiElementi = istenenElementListesi.get(0);
        System.out.println(sonucYazisiElementi.getText());

        //e.Sonra karsiniza cikan ilk sonucun remine tiklayin
        List<WebElement> urunResimleriList = driver.findElements(By.className("s-image"));
        WebElement ilkUrunResmi = urunResimleriList.get(0);
        ilkUrunResmi.click();



    }
}
