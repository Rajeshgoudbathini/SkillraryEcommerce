package Generic_Libraries;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo {
      public void getPhoto(WebDriver driver,String name) throws IOException { 
    	  Date date=new Date();
    	  String currentdate=date.toString().replaceAll(":","-");
    	  
    	 TakesScreenshot ts=(TakesScreenshot) driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
    	File dest=new File(IPathConstant.PhotoPath+currentdate+name+".png");
    	FileUtils.copyFile(src, dest);
      }
}
