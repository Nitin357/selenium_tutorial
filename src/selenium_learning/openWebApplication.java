package selenium_learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openWebApplication {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        //get()
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //navigate().to()
        driver.navigate().to("https://demoqa.com/elements");

        driver.navigate().refresh();
        driver.navigate().forward();
        driver.navigate().back();

        Thread.sleep(1000);
        //close only single window of browser
        driver.close();
        //close all Active windows of browser
        //driver.quit();
    }
}
