package login;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjectmodel.OrangehrmObject;

import pimmodule.Configuration;
import pimmodule.EmployeeList;
import pimmodule.Reports;

import admin.Adminjob1;
import admin.Nationalities;
import admin.Organization;
import admin.Qualifications;
import leavemodule.Assignleave;
import leavemodule.Leavelist;

public class Loginlogo {

		 Logger logger=Logger.getLogger(Loginlogo.class);
		@Test
		public void login(WebDriver driver) throws AWTException, Throwable {
		
	
		
		      FileInputStream stream=new FileInputStream("property");
		      Properties properties=new Properties();
		      properties.load(stream);
		      String Link=properties.getProperty("Url");
		      String uName=properties.getProperty("Username");
		      String pWord=properties.getProperty("Password");
		     
			  driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			  driver.navigate().to(Link);
					
			  PageFactory.initElements(driver,OrangehrmObject.class);
			  
			  
			    OrangehrmObject.forgotPassword.click();
			    OrangehrmObject.btncnl.click();
			    OrangehrmObject.userName.sendKeys(uName);
				OrangehrmObject.password.sendKeys(pWord);
				OrangehrmObject.loginButton.click();
			

			 
				PropertyConfigurator.configure("property");
			     if (OrangehrmObject.image.getAttribute("naturalHeight").equals("0"))
			         logger.warn("!!....Image is Broken....!!");
			     else
			    	 logger.info("Image is not broken");
			                     
	}

}
