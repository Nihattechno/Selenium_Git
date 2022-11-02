package Gun_02;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Navigating extends BaseStaticDriver {
    public static void main(String[] args) {
        //Navigate history tutar get tutmaz
        //Eğer sayfalar arasında git gel yapıcaksak navigate daha uygun olur
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement eleman = driver.findElement(By.linkText("Alerts (JavaScript)"));
        Bekle(2);
        eleman.click(); // Bulduğumuz elemana tıklar
        Bekle(2);

        driver.navigate().back(); // Chromedaki sol üstteki geri ok tuşu
        Bekle(2);

        driver.navigate().forward(); // Chromeda sol üstteki ileri ok tuşu

        bekleKapat();
    }
}
