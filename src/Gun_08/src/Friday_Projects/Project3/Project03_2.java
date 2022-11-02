package Gun_08.src.Friday_Projects.Project3;

import Gun_08.src.Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Project03_2 extends BaseStaticDriver {
    public static void main(String[] args) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement book_btn = driver.findElement(By.cssSelector("[href='/product/1595015/Demo-eBook'] [class='view_product']"));
        book_btn.click();

        WebElement frame = driver.findElement(By.cssSelector("[class='EJIframeV3 EJOverlayV3']"));
        wait.until(ExpectedConditions.visibilityOf(frame));
        driver.switchTo().frame(frame);


        WebElement promo_btn = driver.findElement(By.cssSelector("[class='Apply-Button Show-Promo-Code-Button']"));
        wait.until(ExpectedConditions.visibilityOf(promo_btn));
        promo_btn.click();

        WebElement promo_code = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[placeholder='Promo Code']")));
        promo_code.sendKeys("123456789");

        WebElement apply = driver.findElement(By.cssSelector("[class='Promo-Apply']"));
        apply.click();

        WebElement display =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Invalid promo code']")));
        Assert.assertTrue(display.isDisplayed());

        bekleKapat();

    }
}
