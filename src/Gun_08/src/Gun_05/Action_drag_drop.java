package Gun_08.src.Gun_05;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_drag_drop extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement norvec = driver.findElement(By.id("box101"));

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.dragAndDrop(oslo,norvec).build();
        aksiyon.perform();

        Bekle(4);
        // 2. Yöntem

        WebElement rome = driver.findElement(By.id("box6"));
        WebElement italya = driver.findElement(By.id("box106"));

        Action aksiyon2 = aksiyonlar.clickAndHold(rome).moveToElement(italya).release().build();
        aksiyon2.perform();

        bekleKapat();
    }
}
