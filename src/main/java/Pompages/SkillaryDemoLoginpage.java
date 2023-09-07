package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryDemoLoginpage {
       //declaration
	//address of the course
	@FindBy(xpath="//a[text()='COURSE']")
	private WebElement coursetab;
	//address of selinium training
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seliniumtraining;
	//address of the dropdown
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	//initilisation
	public SkillaryDemoLoginpage(WebDriver driver) { 
		PageFactory.initElements(driver,this);
	}
	//utilisation

	public void Seliniumtraining() {
		seliniumtraining.click();;
	}

	public WebElement getCoursetab() {
		return coursetab;
	}

	public WebElement getCoursedd() {
		return coursedd;
	}

	
}
