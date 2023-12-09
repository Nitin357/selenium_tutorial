package selenium_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ImplicitAndExplcitwait {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //get()
        driver.get("https://demoqa.com/elements");

        //implicitywait-wait certain time before throwing "NO_SUCH_ELEMENT_EXCEPTION"
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

        //Explict wait - wait for a Ceratin Condition
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("about_me")));









    }
}
