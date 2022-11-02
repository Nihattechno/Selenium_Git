package Homeworks.Homework3;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");
        Bekle(1);

        WebElement srch= driver.findElement(By.xpath("//*[@class='col-xs-14 search-box-wrapper']//*[@name='keyword']"));
        srch.sendKeys("teddy bear");
        Bekle(1);

        WebElement btn = driver.findElement(By.xpath("//*[@class='searchTextSpan']/*"));
        btn.click();
        Bekle(1);

        WebElement result = driver.findElement(By.xpath("//*[@id='searchMessageContainer']//*[contains(text(),'ve got 250 results')]"));
        Assert.assertTrue(result.getText().contains("We've got 250 results for 'teddy bear'"));
        bekleKapat();
    }
}
