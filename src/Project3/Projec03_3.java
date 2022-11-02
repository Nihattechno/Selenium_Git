package Project3;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Projec03_3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement book_btn = driver.findElement(By.cssSelector("[href='/product/1595015/Demo-eBook'] [class='view_product']"));
        book_btn.click();

        WebElement frame = driver.findElement(By.cssSelector("[class='EJIframeV3 EJOverlayV3']"));
        wait.until(ExpectedConditions.visibilityOf(frame));
        driver.switchTo().frame(frame);

        WebElement debit = driver.findElement(By.cssSelector("[class='Payment-Button CC']"));
        wait.until(ExpectedConditions.visibilityOf(debit));
        debit.click();

        WebElement pay = driver.findElement(By.cssSelector("[class='Pay-Button']"));
        wait.until(ExpectedConditions.visibilityOf(pay));
        pay.click();

        WebElement display = driver.findElement(By.xpath("//span[contains(text(),'Invalid Email')]"));
        wait.until(ExpectedConditions.visibilityOf(display));
        Assert.assertTrue(display.isDisplayed());

        bekleKapat();
    }
}
