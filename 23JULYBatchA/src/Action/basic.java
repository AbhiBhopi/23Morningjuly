package Action;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class basic {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/"); // to launch url and navigate to tht page
		
		driver.findElement(By.xpath (" //input[@type='text']")).sendKeys("patilapeksha0808@gmail.com");
		
	Wait<WebDriver> fwait =new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(20))    // Maximum waiting time
	.pollingEvery(Duration.ofSeconds(2))            // frequency
	.ignoring(NoSuchElementException.class)	;      // condition
	
	WebElement element = fwait.until(new Function <WebDriver,WebElement>(){
		public WebElement apply (WebDriver driver)
		{
			return driver.findElement(By.xpath(" //input[@type='te']"));
		}

	});		
}
}