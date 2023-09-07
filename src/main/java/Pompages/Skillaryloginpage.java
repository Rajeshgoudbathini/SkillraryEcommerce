package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillaryloginpage {
          
	//Declaration
	//address of gears WebElement
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	//address of Skillary demo
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillaerydemo;
	//address of the search text field
	@FindBy(name="q")
	private WebElement searchtb;
	//address of the search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement Searchbtn;

     //Initilization
public Skillaryloginpage(WebDriver driver) { 
	PageFactory.initElements(driver, this);
}
      //utilisation
public void gearbutton() { 
	gearsbtn.click();
}
public void skillrarydemoapplication() { 
	skillaerydemo.click();
}
public void searchTextBox(String name) { 
	searchtb.sendKeys(name);
}

public void gobutton() { 
	Searchbtn.click();
}
    }