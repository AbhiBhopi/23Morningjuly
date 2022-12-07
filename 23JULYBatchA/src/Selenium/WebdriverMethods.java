package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebdriverMethods {
	
	
public static void main(String[] args) throws InterruptedException{
	
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.facebook.com/r.php"); // to launch url and navigate to tht page
        Thread.sleep(6000);
        
        //driver.close();// close single tab
        
       // driver.quit(); // closed whole browser
        
        
      String title = driver.getTitle();
      System.out.println(title); // actual title
    
    String  exptitle =" up for Facebook | Facebook";
    
    
    if(title.equalsIgnoreCase(exptitle)) {
    	System.out.println("Navigated to correct page");
    	
    }
    else {
    	System.out.println("Navigate to wrong page");
    }
      
        
      
      driver.switchTo().newWindow(WindowType.TAB);
      driver.get("https://www.facebook.com/r.php");
        
        driver.close();
        driver.quit();
        
        
        
        
}
}