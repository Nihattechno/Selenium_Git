package Gun_09.Window;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class Windows_Giris extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev/");

        List<WebElement>linkler=driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement s:linkler)
        {
            if (!s.getAttribute("href").contains("mail"))
            {
                s.click();
            }
        }

        Set<String> windowsIdler=driver.getWindowHandles();
        for (String x:windowsIdler)
            System.out.println(x);

        bekleKapat();
    }
}
