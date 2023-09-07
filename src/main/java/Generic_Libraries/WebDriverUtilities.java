package Generic_Libraries;

import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	//1.Handling drag and drop
			public void dropdown(WebElement ele ,String text) { 
				Select s=new Select(ele);
				s.selectByVisibleText(text);	
			}
	//2.Handling mouse overing
		public void mouseovering(WebDriver driver,WebElement ele) { 
			Actions a=new Actions(driver);
			a.moveToElement(ele).perform();;		
		}
		//3.Handling double click
		public void doubleclick(WebDriver driver,WebElement ele) { 
			Actions a=new Actions(driver);
			a.doubleClick(ele).perform();;	
		}
		
		//4.Handling rightclick
		public void rightclick(WebDriver driver,WebElement ele) { 
			Actions a=new Actions(driver);
			a.contextClick(ele).click();	
		}
		//5.Handling drag and drop
		public void dragdrop(WebDriver driver,WebElement src,WebElement target) { 
			Actions a=new Actions(driver);
			a.dragAndDrop(src, target);
		}
		//6.Shifting control to the frame
		public void switchFrame(WebDriver driver,String value) { 
			driver.switchTo().frame(value);
		}
		//7.shifting control to normal web Page
		public void switchbackframee(WebDriver driver) { 
			driver.switchTo().defaultContent();
		}
		//8.shifting control to popup
		public void alertPopup(WebDriver driver) { 
			driver.switchTo().alert().accept();
		}
		//9.shifting control to child window
		
		public void switchigtabs(WebDriver driver) { 
			Set<String> child = driver.getWindowHandles();
			for(String b:child) { 
				driver.switchTo().window(b);
			}
		}
		//10.Handling scroll bar
		public void scrollBar(WebDriver driver,int x,int y) { 
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("wibdow.scrollBy("+x+","+y+")");
				
			
		}
}



