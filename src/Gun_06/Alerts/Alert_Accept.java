package Gun_06.Alerts;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert_Accept extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
Bekle(1);
        WebElement click = driver.findElement(By.xpath("//*[@class='btn btn-default']"));
        click.click();
        Bekle(1);

        driver.switchTo().alert().accept(); // Çıkan alert boxtaki onay tuşuna basar
        bekleKapat();

    }
}
