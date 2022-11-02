package Gun_08.src.Gun_07;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ornek_02 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.demoblaze.com/index.html");

        WebElement s6 = driver.findElement(By.linkText("Samsung galaxy s6"));
        s6.click();

        WebElement cart = driver.findElement(By.linkText("Add to cart"));
        cart.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        WebElement don = driver.findElement(By.id("nava"));
        don.click();

        bekleKapat();
    }
}
