package Gun_08.src.Gun_08;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Ornek_01 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        WebElement msj = driver.findElement(By.cssSelector("[id='topic']+input"));
        msj.sendKeys("Türkiye");

        driver.switchTo().frame(0);

        WebElement check = driver.findElement(By.id("a"));
        check.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);

        WebElement menu = driver.findElement(By.id("animals"));
        Select ddmenu = new Select(menu);
        ddmenu.selectByVisibleText("Avatar");

        bekleKapat();

    }
}
