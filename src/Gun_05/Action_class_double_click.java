package Gun_05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action_class_double_click extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");

        WebElement d_btn = driver.findElement(By.id("doubleClickBtn"));

        Actions aksiyonlar = new Actions(driver);

        aksiyonlar.moveToElement(d_btn).doubleClick().build().perform();
        bekleKapat();
    }
}
