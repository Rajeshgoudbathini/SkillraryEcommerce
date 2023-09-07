package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
 //declaration
	//address of the selinium training
	@FindBy(xpath="(//a[text()=\"Selenium Training\"])[2]")
	private WebElement seliniumtraining;
	@FindBy(id="cartArea")
	private WebElement cart;
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fb;
			
	//initilisation
			public TestingPage(WebDriver driver) { 
				PageFactory.initElements(driver,this);
			}
	//utilization

			public WebElement getSeliniumtraining() {
				return seliniumtraining;
			}

			public WebElement getCart() {
				return cart;
			}

			public WebElement getFb() {
				return fb;
			}
			
}
