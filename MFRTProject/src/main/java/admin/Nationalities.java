package admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import pageobjectmodel.NatPageObject;

public class Nationalities {

	WebDriver driver=null;
	 static Logger logger=Logger.getLogger(Nationalities.class);
     @Test
	public void NatIcons(WebDriver driver) {
    	FileInputStream stream = null;
		try {
			stream = new FileInputStream("configure.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    Properties properties=new Properties();
	    String country=properties.getProperty("country");
	         try {
				properties.load(stream);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
    	     
	     PageFactory.initElements(driver,NatPageObject.class);

			        NatPageObject.nat.click();
			        NatPageObject.addd.click();
			        NatPageObject.ntname.sendKeys(country);
			        NatPageObject.save1.click();
			        
	      PropertyConfigurator.configure("configure.properties");
	           logger.info("Country added");
     }

}
