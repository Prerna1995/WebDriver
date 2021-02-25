package webdriver;

 

import java.util.concurrent.TimeUnit;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

 

public class DragDrop {

 

    public static void main(String[] args) {
    
            System.setProperty("webdriver.chromedriver", "/home/prernasinghtecn/Downloads/chromedriver");
            System.setProperty("webdriver.gecko.driver", "/home/prernasinghtecn/Downloads/geckodriver");
            
             WebDriver driver = new ChromeDriver();
            //WebDriver driver = new FirefoxDriver();
             driver.get("http://demo.guru99.com/test/drag_drop.html");
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

 

        
        
          WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));
          WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));
          
          Actions act =new Actions(driver);
          act.dragAndDrop(From, To).build().perform();
          

 

    }

 

}