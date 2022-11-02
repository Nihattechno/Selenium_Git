package Gun_08.src.Gun_03;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CSS_Ornek extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        Bekle(1);

       WebElement busines = driver.findElement(By.cssSelector("#u_4hP_4586_0"));
       busines.click();
       Bekle(2);

        WebElement select = driver.findElement(By.id("u_4hP_4588"));
        select.click();
        Bekle(2);

        WebElement online = driver.findElement(By.cssSelector("[id='u_4hP_4588']>[value='Online Advertising']"));
        online.click();
        Bekle(2);

        WebElement day = driver.findElement(By.cssSelector("#u_4hP_89585_0"));
        day.click();
        Bekle(2);

        WebElement good = driver.findElement(By.cssSelector("#u_4hP_4589_0"));
        good.click();
        Bekle(2);

        WebElement select2 = driver.findElement(By.id("u_4hP_4597"));
        select2.click();
        Bekle(2);

        WebElement sec = driver.findElement(By.cssSelector("[id='u_4hP_4597']>[value*='using XYZ for a month or more']"));
        sec.click();

        bekleKapat();
    }
}
