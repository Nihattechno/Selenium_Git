package Gun_08.src.Gun_08;

import Gun_08.src.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ornek_02 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        WebElement f_number = driver.findElement(By.id("number1Field"));
        WebElement s_number = driver.findElement(By.id("number2Field"));
        WebElement c_btn= driver.findElement(By.id("calculateButton"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement answer= driver.findElement(By.id("numberAnswerField"));
        WebElement menu = driver.findElement(By.id("selectOperationDropdown"));
        Select ddmenu= new Select(menu);
        WebElement clear_btn = driver.findElement(By.id("clearButton"));



        for (int i = 0; i <ddmenu.getOptions().size(); i++) {
            ddmenu.selectByIndex(i);
            for (int j = 0; j < 4; j++) {
                int random1 = (int)(Math.random()*101);
                int random2= (int)(Math.random()*101);

                String değer1=String.valueOf(random1);
                String değer2=String.valueOf(random2);

                f_number.sendKeys(değer1);
                s_number.sendKeys(değer2);
                c_btn.click();

                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("numberAnswerField")));

                clear_btn.click();
                f_number.clear();
                s_number.clear();
            }
        }

        bekleKapat();

    }
}
