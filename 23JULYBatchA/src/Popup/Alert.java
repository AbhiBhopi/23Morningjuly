package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting
		
		driver.get("http://www.cookbook.seleniumacademy.com/Alerts.html");
		
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
	   
		
		Thread.sleep(2000);
		
	org.openqa.selenium.Alert alt = driver.switchTo().alert();
	
		
		alt.sendKeys("Abhinav");
		alt.dismiss();
	    
}
}