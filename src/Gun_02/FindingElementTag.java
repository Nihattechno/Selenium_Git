package Gun_02;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindingElementTag extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.hepsiburada.com/");

        // Burası da tag ile bulmak için kullanılır
        List<WebElement> link=driver.findElements(By.tagName("a"));
        for (WebElement s : link){
            System.out.println(s.getAttribute("href"));
        }
        bekleKapat();
    }
}
