package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NEUtils {


	public static WebDriver driver;
	
	public void launch (String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Edge")) {
			
			driver = new EdgeDriver();
			
		}
		else {
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	
	public void url(String url){
		driver.get(url);
		
	}
	

	public void click(WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}
	
}
