package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting // browser launch 

		
		//driver.navigate().to("https://www.facebook.com/r.php");
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
			
	for(int i=5;i>1;i--) {	
		
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);// Type Casting
	
	String random = RandomString.make(2);
	
	File destination = new File("C:\\Users\\yadav\\OneDrive\\Desktop\\Screenshot\\test"+random+".jpeg");
		
		FileHandler.copy(src, destination);
	
	
	}	

}
}