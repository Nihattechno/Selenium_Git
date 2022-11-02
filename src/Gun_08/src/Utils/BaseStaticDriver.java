package Gun_08.src.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseStaticDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

    // Eğer bunu her zaman kullanıcaksan böyle sadece static bırakırsan
    // Her extend ettiğim class'a otomatik olarak gelir ve bu varmış gibi çalışır.
     static {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "Chrome/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().deleteAllCookies();
        // Siteye her bağlanmadan önce cookileri silip ilk defa bağlanıyormuş gibi gösteriyor

        wait=new WebDriverWait(driver,Duration.ofSeconds(30));

       Duration dr = Duration.ofSeconds(30);
       driver.manage().timeouts().pageLoadTimeout(dr);// Ana sayfa yüklenirken başta verilen süre kadar zaman tanıyor açılması için
       driver.manage().timeouts().implicitlyWait(dr);// bütün webelementler için geçerli
    }

    public static void bekleKapat (){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    public static void Bekle (int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
