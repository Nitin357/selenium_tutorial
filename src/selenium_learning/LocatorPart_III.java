package selenium_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorPart_III {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //get()
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //implicitywait-wait certain time before throwing "NO_SUCH_ELEMENT_EXCEPTION"
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        password.sendKeys("admin");


        WebElement login_Button = driver.findElement(By.tagName("button"));
        login_Button.click();

        driver.close();
    }




}
