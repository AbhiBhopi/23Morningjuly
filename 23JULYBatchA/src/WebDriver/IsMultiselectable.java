package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiselectable {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select ele = new Select(year);
		
		boolean result = ele.isMultiple();
		System.out.println(result);
		
		if(result==true) {
			System.out.println("Listbox is multiselectable");
			
		}
		else {
			System.out.println("Listbox is not multiselectable");
		}
		
	}

}
