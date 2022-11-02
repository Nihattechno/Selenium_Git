package Gun_08.src.Gun_06.Alerts;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert_Send_keys extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement eleman = driver.findElement(By.xpath("//*[text()='Click for Prompt Box']"));
        eleman.click();
        Bekle(1);

        driver.switchTo().alert().sendKeys("Nihat");
        Bekle(1);
        driver.switchTo().alert().accept();
        bekleKapat();

    }
}
