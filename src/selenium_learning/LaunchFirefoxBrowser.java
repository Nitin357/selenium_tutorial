package selenium_learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        WebDriver driver= new FirefoxDriver();

        driver.get("https://www.google.com/");

        Thread.sleep(10000);
        driver.close();


    }
}
