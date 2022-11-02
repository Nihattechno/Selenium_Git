package Gun_05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action_class_Righclick extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");

        WebElement r_btn = driver.findElement(By.id("rightClickBtn"));

        Actions aksiyonlar = new Actions(driver);

        aksiyonlar.moveToElement(r_btn).contextClick().build().perform();
        bekleKapat();

    }
}
