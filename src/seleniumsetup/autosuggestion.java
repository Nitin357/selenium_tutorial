package seleniumsetup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class autosuggestion {


    public static void main(String[] args) {

        //chromdriver.exe
        //selenium jar files

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();

        //open google url
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //search any "sarvaha system"
        driver.findElement(By.name("q")).sendKeys("selenium");

        //click matching option
        List<WebElement>  autosuggestion = driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]/li"));

        for (WebElement element: autosuggestion)
        {
           if(element.getText().trim().equals("selenium dev"))
           {
              element.click();
           }
        }


        driver.close();



    }
}
