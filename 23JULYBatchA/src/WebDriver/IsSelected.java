package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/r.php");
		
		 WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		female.click();
		boolean result = female.isSelected();
		
		
		if(result==true) {
			System.out.println("element is selected");
			
		}
		else {
			System.out.println("element is not selected");
		}
		
		
		
}

}
