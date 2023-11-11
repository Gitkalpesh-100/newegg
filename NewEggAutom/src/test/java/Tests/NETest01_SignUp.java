package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Base.NEProjSpecs;
import Utils.NEUtils;

public class NETest01_SignUp extends NEProjSpecs{

	
public static WebDriver driver;
	
    @Test
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
}
