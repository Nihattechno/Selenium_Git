package Gun_06.Alerts;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert_Dismiss extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement click2 = driver.findElement(By.cssSelector("[onclick='myConfirmFunction()']"));
        click2.click();
        Bekle(1);

        driver.switchTo().alert().dismiss(); // alertteki iptal tuşuna bastık

        bekleKapat();
    }
}
