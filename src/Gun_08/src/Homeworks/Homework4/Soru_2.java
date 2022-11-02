package Gun_08.src.Homeworks.Homework4;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru_2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        List<WebElement> kutucuklar =driver.findElements(By.cssSelector("[id='dhtmlgoodies_mainContainer'] div"));
        List<WebElement> gidenler = driver.findElements(By.cssSelector("[id='allItems'] li"));

        Actions aksiyonlar = new Actions(driver);

        for (int i = 0; i < kutucuklar.size() ; i++) {
            int y=0;
            if (i==1)
                y=4;
            else if (i==2)
                y=8;
            else if (i==3)
                y=12;
            else if (i==4)
                y=15;

            int ty =0;

            for (int j = y; j < gidenler.size() ; j++) {
                Action aksiyon=aksiyonlar.clickAndHold(gidenler.get(j)).build();
                aksiyon.perform();
                Bekle(1);
                Action aksiyon2 = aksiyonlar.moveToElement(kutucuklar.get(i)).build();
                aksiyon2.perform();
                Bekle(1);
                Action aksiyon3=aksiyonlar.release(gidenler.get(j)).build();
                aksiyon3.perform();
                ty++;
                if (i!=4){
                if (ty>4)
                    break;}
            }

        }
        bekleKapat();
    }
}
