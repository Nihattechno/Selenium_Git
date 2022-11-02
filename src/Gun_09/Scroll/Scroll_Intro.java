package Gun_09.Scroll;

import Utils.BaseStaticDriver;
import org.openqa.selenium.JavascriptExecutor;

/*
    Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
    Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için

    Bu işlem javascriptexecuter ile yapılır.Bu interface sayesinde
    sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir
    sayfa üzerinde.

    hotels.com, https://p-del.co/
 */
public class Scroll_Intro extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        Bekle(2);
        // Sayfayı x kadar sağa veya sola, y kadar yukarı veya aşağı kaydırır. (X,Y) gibidir oranın içi
        // 1500 px aşağı kaydıracak

        js.executeScript("window.scrollBy(0,-100)");
        bekleKapat();
    }
}
