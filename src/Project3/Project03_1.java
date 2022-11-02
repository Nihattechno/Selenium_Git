package Project3;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Project03_1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://shopdemo.e-junkie.com");

        WebElement btn_cart = driver.findElement(By.cssSelector("[href='/product/1595015/Demo-eBook'] [class='view_product']"));
        btn_cart.click();

        WebElement frame = driver.findElement(By.cssSelector("[class='EJIframeV3 EJOverlayV3']"));
        wait.until(ExpectedConditions.visibilityOf(frame));
        driver.switchTo().frame(frame);

        WebElement cart = driver.findElement(By.cssSelector("[class='Fixed-Actions Desktop-Only'] [class='Cart-Items-Nos']"));
        wait.until(ExpectedConditions.visibilityOf(cart));
        Assert.assertTrue(cart.getText().contains("1"));

        WebElement btn_rmv = driver.findElement(By.cssSelector("button[class='Product-Remove']"));
        wait.until(ExpectedConditions.elementToBeClickable(btn_rmv));
        btn_rmv.click();

        WebElement ctn_shp = driver.findElement(By.xpath("//button[text()='Continue Shopping']"));
        wait.until(ExpectedConditions.visibilityOf(ctn_shp));
        ctn_shp.click();

        driver.switchTo().defaultContent();

        WebElement cartItemNo2 = driver.findElement(By.xpath("//span[@id='cart_item_nos']"));
        Assert.assertTrue(cartItemNo2.getText().contains("0"));

        bekleKapat();
    }
}
