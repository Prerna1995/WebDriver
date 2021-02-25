package webdriver;

 

import java.util.concurrent.TimeUnit;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

 

public class logintest {
    

 

    public static void main(String[] args) {
        
    
    System.setProperty("webdriver.chrome.driver", "//home/prernasinghtecn/Downloads/chromedriver");
    System.setProperty("webdriver.gecko.driver", "//home/prernasinghtecn/Downloads/geckodriver");
    
     //WebDriver driver = new ChromeDriver();
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.simplilearn.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
     
     WebElement lnkLogin=driver.findElement(By.linkText("Log in"));
     lnkLogin.click();
     
     WebElement editUsername=driver.findElement(By.name("user_login"));
     editUsername.sendKeys("abc@xyz.com");
   
     WebElement editPwd=driver.findElement(By.name("user_pwd"));
     editPwd.sendKeys("124");
     
     WebElement chkBox=driver.findElement(By.className("rememberMe"));
     chkBox.click();
     
     WebElement btnPwd=driver.findElement(By.name("btn_login"));
     btnPwd.click();
     
     WebElement error=driver.findElement(By.id("msg-box"));
     String ActError=error.getText();
     
     String ExpError="The mail or password you have entered is invalid.";
     if(ActError.equals(ExpError)) {
    	 System.out.println("TC Passed");
     }
    	 else {
    		 System.out.println("TC Failed");
    	 }
     
     driver.quit();
     
     
    }
     
     
}
