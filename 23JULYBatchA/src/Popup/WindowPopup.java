package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(ids);
		
		String cwid = al.get(2); // get address of child window
		
		driver.switchTo().window(cwid); // focus is on child window
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		
		
		driver.switchTo().window(al.get(0)); // focus is change to main window
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();

}
}