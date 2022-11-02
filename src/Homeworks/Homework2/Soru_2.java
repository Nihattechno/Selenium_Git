package Homeworks.Homework2;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_2 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demo.applitools.com/");

        Bekle(1);
        WebElement name = driver.findElement(By.cssSelector("[placeholder='Enter your username']"));
        name.sendKeys("ttechno@gmail.com");
        Bekle(1);

        WebElement pasword = driver.findElement(By.cssSelector("[placeholder='Enter your password']"));
        pasword.sendKeys("techno123.");
        Bekle(1);

        WebElement btn = driver.findElement(By.cssSelector("[class='buttons-w']>a"));
        btn.click();
        Bekle(1);

        WebElement kontrol = driver.findElement(By.cssSelector("[class='element-actions']+h6"));
        if (kontrol.getText().contains("Your nearest branch closes in: 30m 5s"))
            System.out.println("Test passed");
        else
            System.out.println("Test Failed");
        bekleKapat();
    }
}
