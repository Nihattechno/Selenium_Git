package Gun_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finding_by_Id {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jotform.com/221934510376353");
        WebElement eleman= driver.findElement(By.id("label_3"));
        System.out.println(eleman.getText());

        Thread.sleep(3000);
        driver.quit();
    }
}
