package Homeworks.Homework2;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");
        Bekle(2);

        WebElement search = driver.findElement(By.cssSelector("[class='col-xs-14 search-box-wrapper']>[type='text']"));
        search.sendKeys("teddy bear");
        Bekle(1);

        WebElement btn = driver.findElement(By.cssSelector("[class='searchformButton col-xs-4 rippleGrey'] [class='sd-icon sd-icon-search-under-catagory lfloat']"));
        btn.click();
        Bekle(2);

        WebElement result = driver.findElement(By.cssSelector("[id='searchMessageContainer'] [class='nnn']"));
        if (result.getText().contains("We've got 251 results for 'teddy bear'"))
            System.out.println("Test Passed");
        else
            System.out.println("Test failed");

        bekleKapat();

    }
}
