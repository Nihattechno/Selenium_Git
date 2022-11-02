package Gun_05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_Drag_dropBy extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        WebElement solsurgu = driver.findElement(By.cssSelector("[id='slider-range']>:nth-child(2)"));
        Bekle(2);

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.dragAndDropBy(solsurgu,111,0).build();
        aksiyon.perform();

        Bekle(3);
        bekleKapat();

    }
}
