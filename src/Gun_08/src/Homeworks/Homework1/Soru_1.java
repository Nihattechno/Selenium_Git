package Gun_08.src.Homeworks.Homework1;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demoqa.com/text-box");

        WebElement fname = driver.findElement(By.id("userName"));
        fname.sendKeys("Automation");

        WebElement mail = driver.findElement(By.id("userEmail"));
        mail.sendKeys("Testing@gmail.com");

        WebElement adress = driver.findElement(By.id("currentAddress"));
        adress.sendKeys("Testing Current Address");

        WebElement p_adress = driver.findElement(By.id("permanentAddress"));
        p_adress.sendKeys("Testing Permanent Address");

        WebElement btn = driver.findElement(By.id("submit"));
        btn.click();

        WebElement sname=driver.findElement(By.id("name"));
        if (sname.getText().contains("Automation"))
            System.out.println("Full name test passed");
        else
            System.out.println("Actual and expected result are not same");

        WebElement s_mail=driver.findElement(By.id("email"));
        if (s_mail.getText().contains("Testing"))
            System.out.println("Mail test passed");
        else
            System.out.println("Mail test did not passed");

        bekleKapat();
    }
}
