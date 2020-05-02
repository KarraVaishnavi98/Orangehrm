package admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjectmodel.NatPageObject;

public class Nationalities {

	
		@Test
		public void NatIcons(WebDriver driver) {
			  PageFactory.initElements(driver,NatPageObject.class);

			NatPageObject.nat.click();
			NatPageObject.addd.click();
			NatPageObject.ntname.sendKeys("India");
			NatPageObject.save1.click();

	}

}
