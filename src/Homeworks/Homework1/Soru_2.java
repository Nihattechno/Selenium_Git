package Homeworks.Homework1;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.applitools.com/");

        WebElement usrname = driver.findElement(By.id("username"));
        usrname.sendKeys("ttechno@gmail.com");

        WebElement pswrd = driver.findElement(By.id("password"));
        pswrd.sendKeys("techno123.");

        WebElement btn = driver.findElement(By.id("log-in"));
        btn.click();

        WebElement girdi = driver.findElement(By.id("time"));
        if (girdi.getText().equals("Your nearest branch closes in: 30m 5s"))
            System.out.println("Test  geçildi");
        else
            System.out.println("Test problemli");
        bekleKapat();
    }
}
