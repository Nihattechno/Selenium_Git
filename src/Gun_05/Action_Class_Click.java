package Gun_05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action_Class_Click extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");

        WebElement btn = driver.findElement(By.xpath("//*[text()='Click Me']"));


        Actions aksiyonlar = new Actions(driver);

        aksiyonlar.moveToElement(btn).click().build().perform();
        bekleKapat();

    }
}
