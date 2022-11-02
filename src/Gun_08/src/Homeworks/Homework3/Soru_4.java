package Gun_08.src.Homeworks.Homework3;

import Gun_08.src.Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_4 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
Bekle(1);
        WebElement calcul = driver.findElement(By.xpath("//*[text()='Calculate']"));
        calcul.click();
        Bekle(1);

        WebElement sayı1= driver.findElement(By.xpath("//*[@id='number1']"));
        sayı1.sendKeys("5");
        Bekle(1);

        WebElement sayı2 = driver.findElement(By.xpath("//*[@id='number2']"));
        sayı2.sendKeys("7");
        Bekle(1);

        WebElement btn = driver.findElement(By.xpath("//*[@id='calculate']"));
        btn.click();
        Bekle(1);

        WebElement result = driver.findElement(By.xpath("//*[@id='answer']"));
        Assert.assertTrue(result.getText().contains("12"));

        bekleKapat();
    }
}
