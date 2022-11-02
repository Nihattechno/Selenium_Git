package Gun_09.Window;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class Windows_Swith_to extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev/");

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement x:linkler)
            if (!x.getAttribute("href").contains("mailto"))
                x.click();

        Set<String> idler = driver.getWindowHandles();

        for (String id : idler)
        {
            driver.switchTo().window(id);
            System.out.println(id+" Başlık ismi= "+driver.getTitle());

        }

        bekleKapat();
    }
}
