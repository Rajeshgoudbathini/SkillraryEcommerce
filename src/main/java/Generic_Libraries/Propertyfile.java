package Generic_Libraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile {
	
	public String getPropertydata(String key) throws IOException { 
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(IPathConstant.propertyphotopath);
		p.load(fis);
		return p.getProperty(key);
	} 
}
