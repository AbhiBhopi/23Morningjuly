package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/r.php");
		
		boolean result = driver.findElement(By.xpath("(//button[@type='submit'])[1]")).isEnabled();
		
		System.out.println(result);  // true or false
		
		// need to validate element is enabled or not
		
		if(result==true) {
			System.out.println("element is enabled");
			
		}
		else {
			System.out.println("element is disabled or not enabled");
		}
		
		
		
		
		
		
}

}
