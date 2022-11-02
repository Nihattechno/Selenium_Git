package Homeworks.Homework3;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.applitools.com/");
        Bekle(1);

        WebElement name = driver.findElement(By.xpath("//*[@id='username']"));
        name.sendKeys("ttechno@gmail.com");
        Bekle(1);

        WebElement pasword= driver.findElement(By.xpath("//*[@placeholder='Enter your password']"));
        pasword.sendKeys("techno123.");
        Bekle(1);

        WebElement btn = driver.findElement(By.xpath("//*[text()='Sign in']"));
        btn.click();
        Bekle(1);

        WebElement control = driver.findElement(By.xpath("//*[text()='Your nearest branch closes in: 30m 5s']"));
        Assert.assertTrue(control.getText().contains("Your nearest branch closes in: 30m 5s"));

        bekleKapat();
    }
}
