package seleniumsetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PolicyBazar {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();

        //open google url
        driver.get("https://www.policybazaar.com/");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        List<WebElement> services= driver.findElements(By.xpath("//div[@class=\"prd-block\"]"));

        services.get(1).click();

        Thread.sleep(300);

        //driver.findElement(By.id("2")).click();
        driver.findElement(By.id("step1ContinueBtn")).click();

        WebElement dropdown= driver.findElement(By.id("Self"));

        Select sel= new Select(dropdown);
        sel.selectByVisibleText("25");

        driver.findElement(By.id("step2ContinueBtn")).click();

        Thread.sleep(500);

        driver.close();

          }
}
