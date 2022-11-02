package Gun_08.src.Gun_04;

import Gun_08.src.Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Select_Class_use extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.amazon.com.tr/");

        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        Select ddmenu= new Select(dropdown);
        ddmenu.selectByVisibleText("Bilgisayarlar");
        Bekle(1);

        WebElement searchBox = driver.findElement(By.id("nav-search-submit-button"));
        searchBox.click();

        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("amazon"));
        bekleKapat();
    }
}
