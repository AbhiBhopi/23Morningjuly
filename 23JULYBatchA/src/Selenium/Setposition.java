package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Setposition {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); // upcasting
	//driver.navigate().to("https://www.facebook.com/r.php");
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	
	//Dimension d =new Dimension(100,300); // Pixels
	
	//driver.manage().window().setSize(d);
	
	Point p = new Point(200,100);
	
	driver.manage().window().setPosition(p);

	
	
	}
}
