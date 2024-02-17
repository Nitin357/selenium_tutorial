package selenium_learning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindowHandling {

    public static void main(String[] args) throws InterruptedException {

        // 1. Launch Chrome browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. navigate to URL "https://the-internet.herokuapp.com/"
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        String parentWindowHandle = driver.getWindowHandle();
        //3. print Parent window title & Url
        System.out.println("parent Window title : "+driver.getTitle());
        System.out.println("parent Window Url : "+driver.getCurrentUrl());

        //4. click Multiple Window link
        WebElement multipleWindow = driver.findElement(By.linkText("Multiple Windows"));
        multipleWindow.click();
        //5. click click here link
        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        clickHere.click();

       // 6. shift locous to child window
        Set<String> allWindowHandles = driver.getWindowHandles();

        for(String handle: allWindowHandles)
        {
            if(!handle.equals(parentWindowHandle))
            {
                driver.switchTo().window(handle);
            }
        }
         Thread.sleep(7000);
        //7. print child window title & Url
        System.out.println("Child Window title : "+driver.getTitle());
        System.out.println("Child Window Url : "+driver.getCurrentUrl());
        //8 print visible text
        WebElement textEle = driver.findElement(By.className("example"));
        System.out.println("child window text"+textEle.getText());
        //8. shift locous to Parent window
        driver.switchTo().window(parentWindowHandle);
        Thread.sleep(3000);
        //9. navigate Back
        driver.navigate().back();
        //10. print Parent window title & Url
        System.out.println("parent Window title : "+driver.getTitle());
        System.out.println("parent Window Url : "+driver.getCurrentUrl());
        //11. close browser
        driver.close();
        driver.quit();




    }
}