package Gun_02;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SendText extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement thnk = driver.findElement(By.partialLinkText("thanks"));
        thnk.click();

        WebElement msg = driver.findElement(By.id("user-message"));
        msg.sendKeys("Merhaba Selenium");

        WebElement btn = driver.findElement(By.className("btn-default"));
        btn.click();

        WebElement dsp = driver.findElement(By.id("display"));
        if (dsp.getText().contains("Merhaba Selenium")){
            System.out.println("Test Passed");
        }
        else {
            System.out.println("Test Failed");
        }

        bekleKapat();
    }
}
