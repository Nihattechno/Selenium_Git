package Gun_08.src.Friday_Projects.Project3;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Project03_5 extends BaseStaticDriver {
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

        WebElement mail = driver.findElement(By.cssSelector("[placeholder='Confirm Email']"));
        wait.until(ExpectedConditions.visibilityOf(mail));
        mail.sendKeys("Grille9112@gmail.com");

        WebElement remail = driver.findElement(By.cssSelector("[placeholder='Email']"));
        remail.sendKeys("Grille9112@gmail.com");

        WebElement cardname = driver.findElement(By.cssSelector("[placeholder='Name On Card']"));
        cardname.sendKeys("Nihat");

        WebElement frame_1 = driver.findElement(By.cssSelector("[name*='__privateStripeFrame']"));
        wait.until(ExpectedConditions.visibilityOf(frame_1));
        driver.switchTo().frame(frame_1);

        WebElement cardnumber = driver.findElement(By.name("cardnumber"));
        cardnumber.sendKeys("4242 4242 4242 4242");

        WebElement expdate = driver.findElement(By.name("exp-date"));
        expdate.sendKeys("1222");

        WebElement cvc = driver.findElement(By.name("cvc"));
        cvc.sendKeys("000");

       // WebElement paybtn = driver.findElement(By.);
        //bekleKapat();


    }
}
