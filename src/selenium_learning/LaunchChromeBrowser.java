package selenium_learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

    public static void main(String[] args) throws InterruptedException {

        //chromdriver.exe
        //selenium jar files

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com/");

        Thread.sleep(10000);



        driver.close();


    }
}
