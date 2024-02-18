package selenium_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsAndCheckboxHandling {


    public static void main(String[] args) throws InterruptedException {

        //1. open chrome
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. naviagte to url
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        Thread.sleep(5000);
        List<WebElement> checkboxes = driver.findElements(By.tagName("input"));
        for(WebElement checkbox : checkboxes)
        {
            //3. select the checkbox 1
            //4. select the checkbox 2
            if(!checkbox.isSelected())
            {
                checkbox.click();
            }

        }
        Thread.sleep(5000);
        for(WebElement checkbox : checkboxes)
        {
            //7. unselect checkbox 1
            //8. unselect checkbox 2
            if(checkbox.isSelected())
            {
                checkbox.click();
            }

        }
        Thread.sleep(5000);
       //9. close browesr
        driver.quit();



    }


}
