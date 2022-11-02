package Gun_08.src.Gun_09.Scroll;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Scroll_to_BottomofThePage extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://triplebyte.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Sayfanın en aşağısına kadar kaydırır

        bekleKapat();
    }
}
