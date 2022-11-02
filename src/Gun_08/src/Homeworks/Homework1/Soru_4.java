package Gun_08.src.Homeworks.Homework1;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_4 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calcul = driver.findElement(By.id("calculate"));
        calcul.click();

        WebElement sayı1 = driver.findElement(By.id("number1"));
        sayı1.sendKeys("5");

        WebElement sayı2 = driver.findElement(By.id("number2"));
        sayı2.sendKeys("7");

        WebElement btn = driver.findElement(By.id("calculate"));
        btn.click();

        WebElement sonuc = driver.findElement(By.id("answer"));
        System.out.println(sonuc.getText());

        bekleKapat();
    }
}
