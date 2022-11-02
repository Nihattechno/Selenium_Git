package Gun_08.src.Gun_05;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Get_Status extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement salı = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println(salı.isDisplayed()); // Ekranda görünüyor mü
        System.out.println(salı.isEnabled()); // Açık mı seçilebiliyor mu
        System.out.println(salı.isSelected()); // Seçilmiş mi
    }
}
