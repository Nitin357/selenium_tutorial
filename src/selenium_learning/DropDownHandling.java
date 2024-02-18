package selenium_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

    public static void main(String[] args) throws InterruptedException {
        //1. open chrome
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. naviagte to url
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Thread.sleep(5000);

        //3. select option 2 from dropdown
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select sel=new Select(dropDown);
        sel.selectByVisibleText("Option 2");
        Thread.sleep(5000);

        //4. close browser
        driver.quit();
    }
}
