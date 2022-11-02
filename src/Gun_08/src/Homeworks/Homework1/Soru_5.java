package Gun_08.src.Homeworks.Homework1;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_5 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");


        WebElement alert= driver.findElement(By.id("fakealerttest"));
        alert.click();


        WebElement btn = driver.findElement(By.id("fakealert"));
        btn.click();


        WebElement okbtn = driver.findElement(By.id("dialog-ok"));
        okbtn.click();

        bekleKapat();
    }
}
