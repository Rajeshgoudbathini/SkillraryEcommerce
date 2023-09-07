package Scripts;

import org.testng.annotations.Test;

import Generic_Libraries.BaseClass;
import Generic_Libraries.WebDriverUtilities;
import Pompages.AddtocartPage;
import Pompages.SkillaryDemoLoginpage;
import Pompages.Skillaryloginpage;


public class TestCase1 extends BaseClass {

@Test
public void TC1() { 
	
	Skillaryloginpage s=new Skillaryloginpage(driver);
	s.gearbutton();
	s.skillrarydemoapplication();
	WebDriverUtilities u=new WebDriverUtilities();
	u.switchigtabs(driver);
	SkillaryDemoLoginpage sd=new SkillaryDemoLoginpage(driver);
	u.mouseovering(driver,sd.getCoursetab());
	sd.Seliniumtraining();
	AddtocartPage atc=new AddtocartPage(driver);
	u.doubleclick(driver, atc.getAdd());
	atc.CartTooCart();
	u.alertPopup(driver);
	
  }
}
