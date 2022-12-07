package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.partialLinkText("Messen")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abhi@12345678");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		
	}
	
	
	

}
