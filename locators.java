package webdriver;

 

import java.util.concurrent.TimeUnit;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

 

public class locators {

 

        public static void main(String[] args) {
            
            System.setProperty("webdriver.chromedriver", "/home/prernasinghtecn/Downloads/chromedriver");
            System.setProperty("webdriver.gecko.driver", "/home/prernasinghtecn/Downloads/geckodriver");
            
            WebDriver driver = new ChromeDriver();
            //WebDriver driver = new FirefoxDriver();
             driver.get("https://www.facebook.com/");
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
             
            // WebElement editUsername=driver.findElement(By.xpath("//input[@name='email']"));
            // editUsername.sendKeys("abc@xyz.com");
             
            // WebElement lnkLogin=driver.findElement(By.xpath("//button[@name='login']"));
            // lnkLogin.click();
             
             WebElement lnkLogin=driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]"));
             lnkLogin.click();
             
             WebElement editFirstname=driver.findElement(By.xpath("//input[@name='firstname']"));
             editFirstname.sendKeys("John");
             
             WebElement editLastname=driver.findElement(By.xpath("//input[@name='lastname']"));
             editLastname.sendKeys("A");
             
             WebElement editEmail=driver.findElement(By.xpath("//input[@name='reg_email__']"));
             editEmail.sendKeys("abc@gmail.com");
             
             //WebElement editPwd=driver.findElement(By.xpath("//input[@name=' reg_passwd_']"));
             //editPwd.sendKeys("1234");
             
             WebElement select_birth_month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
             Select month=new Select(select_birth_month);
             month.selectByVisibleText("Mar");
             
             WebElement select_birth_date=driver.findElement(By.xpath("//select[@name='birthday_day']"));
             Select date=new Select(select_birth_date);
             date.selectByIndex(6);
             
             WebElement select_birth_year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
             Select year=new Select(select_birth_year);
             year.selectByValue("2014");
             
            // WebElement select_gender=driver.findElement(By.xpath("//select[@name='sex']"));
             //select.gen
             
             
           
             
            
            

 

    }

 

}