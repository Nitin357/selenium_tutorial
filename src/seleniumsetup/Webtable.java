package seleniumsetup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Webtable {

    public static void main(String[] args) throws InterruptedException {

        //chromdriver.exe
        //selenium jar files

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();

        //open google url
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://cosmocode.io/automation-practice-webtable/#google_vignette");
        WebElement table = driver.findElement(By.tagName("table"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", table);


        for(int i=0; i<=10; i++)
        {
            List<WebElement> tablecontent = driver.findElements(By.xpath("//table[@id=\"countries\"]/tbody/tr["+i+"]/td"));

            for (WebElement country1 : tablecontent) {

                System.out.print("" + country1.getText() + "|");

            }
            System.out.println("");
        }

        Thread.sleep(5000);
        driver.close();

    }
}
