package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.NEProjSpecs;

public class NEHomePage extends NEProjSpecs {

	
	@FindBy(xpath = "//span[contains(text(), \"Today's Best Deals\")]/parent::a")
	WebElement TodaysBestDeals;

	
	@FindBy(xpath = "//span[contains(text(), \"Best Sellers\")]/parent::a")
	WebElement BestSellers;
	
public NEHomePage() {
	PageFactory.initElements(driver, this);
}

}
	

