package Homeworks.Homework2;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demoqa.com/text-box");

        WebElement f_name= driver.findElement(By.cssSelector("[placeholder='Full Name']"));
        f_name.sendKeys("Automation");
        Bekle(1);

        WebElement mail = driver.findElement(By.cssSelector("[placeholder='name@example.com']"));
        mail.sendKeys("Testing@gmail.com");
        Bekle(1);

        WebElement adres = driver.findElement(By.cssSelector("[placeholder='Current Address']"));
        adres.sendKeys("Testing Current Address");
        Bekle(1);

        WebElement p_adres= driver.findElement(By.cssSelector("[id='permanentAddress-wrapper'] [class='form-control']"));
        p_adres.sendKeys("Testing Permanent Address");
        Bekle(1);

        WebElement btn = driver.findElement(By.cssSelector("[type='button'][class='btn btn-primary']"));
        btn.click();
        Bekle(1);

        WebElement name_c =driver.findElement(By.cssSelector("[id='output'] [id='name']"));
        if (name_c.getText().contains("Automation"))
            System.out.println("Test passed");
        else
            System.out.println("Test failed");

        WebElement mail_test = driver.findElement(By.cssSelector("[id='output'] [id='email']"));
        if (mail_test.getText().contains("Testing"))
            System.out.println("Test passed");
        else
            System.out.println("Test Failed");

        bekleKapat();
    }
}
