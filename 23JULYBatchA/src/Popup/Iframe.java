package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
		
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);// change focus from main page to Iframe
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(5000);
		
	//	driver.switchTo().defaultContent();// change focus from Iframe to Main poage
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();

}
}