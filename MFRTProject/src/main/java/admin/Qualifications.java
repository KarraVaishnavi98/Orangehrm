package admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjectmodel.QualificationsObj;

public class Qualifications {

	
		@Test
		public void qualIcons(WebDriver driver) {
			  PageFactory.initElements(driver,QualificationsObj.class);

			 QualificationsObj.qualification.click();
			 QualificationsObj.skills.click();
			 QualificationsObj.add2.click();
			 QualificationsObj.skname.sendKeys("selenium");;
			 QualificationsObj.skdesc.sendKeys("wepapplication framework");
			 QualificationsObj.savee.click();
			 QualificationsObj.qualification.click();
			 QualificationsObj.edc.click();
			 QualificationsObj.btad.click();

			 QualificationsObj.level.sendKeys("hjjh");
			 QualificationsObj.btsavee.click();
	
	}

}
