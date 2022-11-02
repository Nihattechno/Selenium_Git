package Gun_08.src.Gun_02;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindingByLinkTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.hepsiburada.com/");
        WebElement elemanı = driver.findElement(By.linkText("Siparişlerim"));
        System.out.println(elemanı.getText());



        // Sayfanın özelliklerini bulur, özelliğin ismini yazar ve bulur
        System.out.println(elemanı.getAttribute("title"));
        System.out.println(elemanı.getAttribute("rel"));
        System.out.println(elemanı.getAttribute("href"));

        //Birde partial link text bulma yöntemi vardır
        //Sadece <a> taglilerle çalışır
        //Aranan text'in belli bir bölümünü yazıp bütün texte ulaşıp oradan da attributlerine ulaşmak için
        WebElement elemanı1 = driver.findElement(By.partialLinkText("Süper Teklif"));
        System.out.println(elemanı1.getText());
        System.out.println(elemanı1.getAttribute("href"));


        bekleKapat();
    }
}
