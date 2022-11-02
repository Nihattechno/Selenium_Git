package Gun_08.src.Homeworks.Homework1;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement srcbox = driver.findElement(By.id("inputValEnter"));
        srcbox.sendKeys("teddy bear");

        WebElement btn = driver.findElement(By.className("searchformButton"));
        btn.click();

        WebElement rslt = driver.findElement(By.className("nnn"));
        if (rslt.getText().equals("We've got 248 results for 'teddy bear'"))
            System.out.println("Test d0ru");
        else
            System.out.println("Test yanlş");

        bekleKapat();
    }
}
