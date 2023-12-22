package selenium_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorsPart_I {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //get()
        driver.get("https://jobs.boeing.com/search-jobs/full-stack%20developer/India/185-18469/1/2/1269750/22/79/50/2?gclid=CjwKCAiApuCrBhAuEiwA8VJ6Jlv9W4TaKtA56kHaN6wnl0eKeCiDjoGe4SfrD5cxRccsY_R6Dh6WExoCRXsQAvD_BwE#anchor-alert");

        //implicitywait-wait certain time before throwing "NO_SUCH_ELEMENT_EXCEPTION"
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //id
        String acceptButton ="igdpr-button";
        WebElement accept_button = driver.findElement(By.id(acceptButton));
        accept_button.click();

        //classname
        String location = "search-location";
        WebElement location_text = driver.findElement(By.className(location));
        location_text.clear();
        location_text.sendKeys("Mumbai");

        //name
        String keyword = "k";
        WebElement keword_text = driver.findElement(By.name(keyword));
        keword_text.clear();
        keword_text.sendKeys("Peneer");


        Thread.sleep(500);
        driver.close();


    }
}
