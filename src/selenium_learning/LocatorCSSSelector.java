package selenium_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorCSSSelector {
        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


            WebElement fname= driver.findElement(By.cssSelector("input[name='firstname']"));
            fname.sendKeys("Sachin");

            WebElement genderCheckBox= driver.findElement(By.cssSelector("input#sex-0"));
            genderCheckBox.click();


            Thread.sleep(7000);

            driver.close();








        }




    }

