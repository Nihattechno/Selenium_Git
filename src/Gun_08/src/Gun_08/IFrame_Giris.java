package Gun_08.src.Gun_08;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IFrame_Giris extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0); //frame1
        WebElement msj = driver.findElement(By.cssSelector("[id='topic']+input"));
        msj.sendKeys("Türkiye");

        driver.switchTo().parentFrame(); // 1 frame (basamak) geri döner
        driver.switchTo().defaultContent(); // Ana (ilk başlangıçtaki) frame'e geri döner

        bekleKapat();
    }
}
