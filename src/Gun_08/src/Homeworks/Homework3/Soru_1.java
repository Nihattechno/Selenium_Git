package Gun_08.src.Homeworks.Homework3;

import Gun_08.src.Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demoqa.com/text-box");
        Bekle(1);

        WebElement name = driver.findElement(By.xpath("//*[@placeholder='Full Name']"));
        name.sendKeys("Automation");
Bekle(1);
        WebElement mail = driver.findElement(By.xpath("//*[@placeholder='name@example.com']"));
        mail.sendKeys("Testing@gmail.com");
Bekle(1);
        WebElement c_adres = driver.findElement(By.xpath("//*[@placeholder='Current Address']"));
        c_adres.sendKeys("Testing Current Address");
        Bekle(1);

        WebElement p_adres=driver.findElement(By.xpath("//*[@class='col-md-9 col-sm-12']//*[@id='permanentAddress']"));
        p_adres.sendKeys("Testing Permanent Address");
        Bekle(1);

        WebElement btn = driver.findElement(By.xpath("//*[text()='Submit']"));
        btn.click();
        Bekle(1);

        WebElement c_name = driver.findElement(By.xpath("//*[@id='name']"));
        Assert.assertTrue(c_name.getText().contains("Automation"));

        WebElement c_mail= driver.findElement(By.xpath("//*[@id='email']"));
        Assert.assertTrue(c_mail.getText().contains("Testing"));

        bekleKapat();
    }
}
