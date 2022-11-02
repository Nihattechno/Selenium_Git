package Gun_08.src.Gun_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingByIdNotFoundException  {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jotform.com/221934510376353");
        try {
            WebElement eleman= driver.findElement(By.id("label_"));
            System.out.println(eleman.getText());
        }catch (Exception ex){
            System.out.println("Bu id ile eleman bulunamadı");
        }
        Thread.sleep(3000);
        driver.quit();

    }
}
