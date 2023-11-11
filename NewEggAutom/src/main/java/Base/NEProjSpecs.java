package Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utils.NEUtils;

public class NEProjSpecs extends NEUtils{
	
	@BeforeMethod
	public void launchBrowser() {
		
		launch("Chrome");
	    url("https://www.newegg.com");
	        
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
