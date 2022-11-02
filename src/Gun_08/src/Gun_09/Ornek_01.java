package Gun_08.src.Gun_09;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Ornek_01 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.youtube.com/");

        WebElement src = driver.findElement(By.id("search"));
        src.sendKeys("Selenium");

        WebElement btn = driver.findElement(By.id("search-icon-legacy"));
        btn.click();

        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        List<WebElement> linkle = driver.findElements(By.cssSelector(""));
        bekleKapat();
    }
}
