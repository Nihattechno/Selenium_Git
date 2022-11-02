package Gun_02;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindingByClassName extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.jotform.com/221934510376353");
      WebElement elemanı= driver.findElement(By.className("form-submit-button"));

        System.out.println("Eleman ismi= "+elemanı.getText());

        //Eğer aynı arama isminden 1 den fazla varsa findelement ilk bulduğunu getirir.(Class, id, hepsi dahil)

        WebElement elemanı2= driver.findElement(By.className("form-sub-label"));

        System.out.println("Eleman class'ın= "+elemanı2.getText());

        // Eğer ki class ismiyle bulamazsa exception oluşturmaz liste döndürdüğü için boş liste döndürür
        List<WebElement> liste = driver.findElements(By.className("form-sub-label"));
        System.out.println(liste.size());
        for (WebElement s: liste){
            System.out.println(s.getText());
        }

        bekleKapat();
    }
}
