package Gun_08.src.Gun_09.Scroll;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Scroll_to_Webelement extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        JavascriptExecutor js = (JavascriptExecutor)driver;

        WebElement eleman = driver.findElement(By.linkText("Machine Learning Jobs"));
        js.executeScript("arguments[0].scrollIntoView()",eleman);
        // Verdiğin elemena kadar scroll yapar



        bekleKapat();
    }
}
