package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectYear {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		//String x = year.getText();
		//System.out.println(x);
		
		
		Select ele = new Select(year);
		
		List<WebElement> options = ele.getOptions();
		//System.out.println(options);
	     int size = options.size(); // 118
		
		System.out.println("List box Size is :" +size);
			for(int i =0;i<=options.size()-1;i++) {
			System.out.println(options.get(i).getText());
			
		}
		

}
}