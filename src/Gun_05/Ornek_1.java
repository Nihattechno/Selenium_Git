package Gun_05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ornek_1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.facebook.com/");

        WebElement kayıt = driver.findElement(By.cssSelector("[class='_6ltg']>a"));
        kayıt.click();
        Bekle(1);

        WebElement name = driver.findElement(By.name("firstname"));
        name.sendKeys("Nihat");
        Bekle(1);
        WebElement surname = driver.findElement(By.name("lastname"));
        surname.sendKeys("Yavuz");
        Bekle(1);
        WebElement mailconfirm = driver.findElement(By.name("reg_email_confirmation__"));
        if (!mailconfirm.isDisplayed())
            System.out.println("Mail öncesi Ekranda yok");
        else
            System.out.println("Mail öncesi Ekranda var");

        WebElement mail = driver.findElement(By.name("reg_email__"));
        mail.sendKeys("grille9112@gmail.com");
        Bekle(1);
        if (mailconfirm.isDisplayed())
            System.out.println("Mail sonrası ekranda var");
        else
            System.out.println("Mail sonrası ekranda yok");

        bekleKapat();
    }
}
