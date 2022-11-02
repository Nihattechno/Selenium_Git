package Gun_06;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionHoverOverTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.etsy.com/");
        Actions aksiyonlar=new Actions(driver);
        Bekle(1);

        WebElement jewel = driver.findElement(By.id("catnav-primary-link-10855"));
        Action aksiyon = aksiyonlar.moveToElement(jewel).build();
        aksiyon.perform();
        Bekle(2);

        WebElement necklace = driver.findElement(By.id("side-nav-category-link-10873"));
        aksiyon = aksiyonlar.moveToElement(necklace).build();
        aksiyon.perform();
        Bekle(2);

        WebElement bibnc = driver.findElement(By.id("catnav-l3-10881"));
        aksiyon=aksiyonlar.moveToElement(bibnc).click().build();
        aksiyon.perform();

        Assert.assertTrue(driver.getCurrentUrl().contains("bib"));

        bekleKapat();

    }
}
