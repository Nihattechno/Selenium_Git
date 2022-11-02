package Gun_08.src.Gun_05;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Get_css_value extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement srchbox = driver.findElement(By.id("inputValEnter"));

        System.out.println(srchbox.getAttribute("type"));
        System.out.println(srchbox.getAttribute("class"));

        System.out.println(srchbox.getCssValue("background"));
        System.out.println(srchbox.getCssValue("border-right"));

        bekleKapat();


    }
}
