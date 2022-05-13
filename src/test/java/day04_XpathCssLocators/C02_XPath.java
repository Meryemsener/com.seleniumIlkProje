package day04_XpathCssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_XPath {
    //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    //2- Add Element butonuna basin
    //driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
    //driver.findElement(By.xpath("//button[text()='Add Element']")).click();
    //3- Delete butonu’nun gorunur oldugunu test edin
    //4- Delete tusuna basin
    //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        //NOT/ bu elementi sadece bir kere kullanacaksak bir webelemen olusturup bir de clik yazmamiza gerek yok
        // WebElement addButton= driver.findElement(By.xpath("//button [@onclick='addElement()']"));
        //addButton.click();->bu iki satiri tek satira indiriyoruz
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu= driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("delete butonu testi PASSED");
        } else {
            System.out.println("delete butonu testi FAILED");
        }


        //4- Delete tusuna basin
        deleteButonu.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveYaziElementi= driver.findElement(By.xpath("//h3"));
        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("addRemoveYazi testi PASSED");
        } else {
            System.out.println("addRemoveYazi testi FAILED");
        }

        driver.close();

    }
}