package Gun_08.src.Gun_06;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionTusKontrolSendKeys extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");

        WebElement eleman = driver.findElement(By.id("autoCompleteSingleInput"));

        Actions aksiyonlar = new Actions(driver);

      Action aksiyon = aksiyonlar.moveToElement(eleman).click()
                .keyDown(Keys.SHIFT) // shifte bastık
                .sendKeys("n")
                .keyUp(Keys.SHIFT) // elimizi shiftten kaldırdık
                .sendKeys("ihat").build();
        aksiyon.perform();


        bekleKapat();
    }
}
