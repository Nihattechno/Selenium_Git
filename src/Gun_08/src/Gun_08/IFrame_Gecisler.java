package Gun_08.src.Gun_08;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class IFrame_Gecisler extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement msj = driver.findElement(By.cssSelector("[id='topic']+input"));
        msj.sendKeys("Türkiye");

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement secim = driver.findElement(By.id("animals"));
        Select cat = new Select(secim);
        cat.selectByVisibleText("Avatar");

        bekleKapat();
    }
}
