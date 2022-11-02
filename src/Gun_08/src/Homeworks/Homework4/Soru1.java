package Gun_08.src.Homeworks.Homework4;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        List<WebElement> liste = driver.findElements(By.cssSelector("[id='answerDiv'] [class='dragDropSmallBox']"));

        List<WebElement> bosluk = driver.findElements(By.cssSelector("[id='questionDiv'] [class='destinationBox']"));



        Actions aksiyonlar = new Actions(driver);

        for (int i=0;i<bosluk.size();i++) {

            for (int j =0;j< liste.size();j++) {
                Action aksiyon = aksiyonlar.clickAndHold(liste.get(i)).build();
                aksiyon.perform();
                Bekle(1);
                Action aksiyon2 = aksiyonlar.moveToElement(bosluk.get(j)).build();
                aksiyon2.perform();
                Action aksiyon3=aksiyonlar.release(liste.get(i)).build();
                aksiyon3.perform();
                WebElement eleman = driver.findElement(By.cssSelector("[class='destinationBox'] div"));


                if (eleman.getAttribute("class").contains("correct")){
                    break;
                }

            }
        }

        bekleKapat();
    }
}
