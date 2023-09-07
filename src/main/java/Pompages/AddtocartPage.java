package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {
  //declaration
	//address of the add to cart
	@FindBy(xpath="//button[text()= ' Add to Cart']")
	private WebElement AddToCart;
	//address of +
	@FindBy(id="add")
	private WebElement add;
	
	//initilisation
		public AddtocartPage(WebDriver driver) { 
			PageFactory.initElements(driver,this);
		}
		//utilisation
		public void CartTooCart() {
			AddToCart.click();
		}

		public WebElement getAdd() {
			return add;
		}
		
}

