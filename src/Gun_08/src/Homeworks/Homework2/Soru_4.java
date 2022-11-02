package Gun_08.src.Homeworks.Homework2;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_4 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Bekle(1);

        WebElement clcl = driver.findElement(By.linkText("Calculate"));
        clcl.click();
        Bekle(1);

        WebElement number1 = driver.findElement(By.cssSelector("[action='calculate.php']>:nth-child(1)"));
        number1.sendKeys("5");
        Bekle(1);

        WebElement number2= driver.findElement(By.cssSelector("[action='calculate.php']>:nth-child(3)"));
        number2.sendKeys("7");
        Bekle(1);

        WebElement btn = driver.findElement(By.cssSelector("[action='calculate.php']>:nth-child(4)"));
        btn.click();
        Bekle(1);

        WebElement result = driver.findElement(By.cssSelector("[action='calculate.php']+span"));
        System.out.println("İşlemin sonuc= "+ result.getText());

        bekleKapat();

    }
}
