package selenium_learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class MicrosoftTwoFactorAuthentication {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        // Create ChromeOptions and set the proxy
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:\\Users\\nitin.magar.ININDCRWS\\AppData\\Local\\Chromium\\User Data");
        options.addArguments("--profile.directory.Profile=10");

        // Create a new instance of the Chrome driver with the configured options
        WebDriver driver = new ChromeDriver(options);

        // Navigate to the desired URL
        driver.get("https://");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }
}
