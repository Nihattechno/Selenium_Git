package Gun_08.src.Homeworks.Homework1;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_6 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html ");

        Bekle(2);
        WebElement alert = driver.findElement(By.id("fakealerttest"));
        alert.click();

        Bekle(2);
        WebElement dialog = driver.findElement(By.id("modaldialog"));
        dialog.click();

        Bekle(2);
        WebElement btn = driver.findElement(By.id("dialog-ok"));
        btn.click();

        bekleKapat();
    }
}
