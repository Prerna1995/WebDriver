package webdriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Platform;


public class GridExample {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities obj= new DesiredCapabilities();
		obj.setPlatform(Platform.LINUX);
		obj.setBrowserName("firefox");
		String HubURL="http://172.17.0.1:4444/wd/hub";
		
		WebDriver driver=new RemoteWebDriver(new URL(HubURL), obj);
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,  TimeUnit.MILLISECONDS);
	}
}
				

	


