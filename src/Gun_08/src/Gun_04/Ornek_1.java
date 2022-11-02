package Gun_08.src.Gun_04;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ornek_1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://www.saucedemo.com/");

       WebElement username= driver.findElement(By.xpath("//*[@placeholder='Username']"));
       username.sendKeys("standard_user");
       Bekle(1);

       WebElement pasword = driver.findElement(By.xpath("//*[@type='password']"));
       pasword.sendKeys("secret_sauce");
       Bekle(1);

       WebElement btn = driver.findElement(By.xpath("//*[@id='login-button']"));
       btn.click();
       Bekle(1);

       WebElement urun1= driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
       urun1.click();
       Bekle(1);

       WebElement urun1sepet = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']"));
       urun1sepet.click();
       Bekle(1);

       driver.navigate().back();
       Bekle(1);

       WebElement urun2 = driver.findElement(By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']"));
       urun2.click();
       Bekle(1);

       WebElement urun2sepet = driver.findElement(By.xpath("//*[@name='add-to-cart-sauce-labs-bolt-t-shirt']"));
       urun2sepet.click();
       Bekle(1);

       driver.navigate().back();
       Bekle(1);

       WebElement sepet = driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
       sepet.click();
       Bekle(1);

       WebElement check = driver.findElement(By.id("checkout"));
       check.click();
       Bekle(1);

       WebElement name = driver.findElement(By.id("first-name"));
       name.sendKeys("Nihat");
       Bekle(1);

       WebElement lastname = driver.findElement(By.id("last-name"));
       lastname.sendKeys("Yavuz");
       Bekle(1);

       WebElement zip = driver.findElement(By.id("postal-code"));
       zip.sendKeys("17200");
       Bekle(1);

       WebElement continu = driver.findElement(By.id("continue"));
       continu.click();
       Bekle(1);

       WebElement hesap = driver.findElement(By.xpath("//*[text()='45.98']"));
       if (hesap.getText().contains("45.98"))
           System.out.println("Test Passed");
       else
           System.out.println("Test failed");

       //Assert.assertTrue(hesap.getText().contains("45.98"));
       //Assert.assertEquals("Merhaba","Merhaba");

       bekleKapat();

    }
}
