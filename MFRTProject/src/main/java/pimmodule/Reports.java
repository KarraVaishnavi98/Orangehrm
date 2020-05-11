package pimmodule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjectmodel.ReportObject;

public class Reports {
@Test
	public void reportMod(WebDriver driver) {
		   FileInputStream stream = null;
		       try {
			       stream = new FileInputStream("configure.properties");
		           } catch (FileNotFoundException e) {
			          e.printStackTrace();
		           }
		   Properties properties=new Properties();
		       try {
			       properties.load(stream);
		           } catch (IOException e) {
			           e.printStackTrace();
		           }
		
	       String reportname=properties.getProperty("ReportName");

	       PageFactory.initElements(driver,ReportObject.class);
	
	          ReportObject.pimbutton.click();
	          ReportObject.report.click();
	          ReportObject.addbutton1.click();
	          ReportObject.reportname.sendKeys(reportname);
	          
	          Select report=new Select(ReportObject.reportcriteria);
	          report.selectByVisibleText("Employee Name");
	          
	          Select repcomparision=new Select(ReportObject.repcomp);
	          repcomparision.selectByValue("1");
	          
	          Select groups=new Select(ReportObject.disgrps);
	          groups.selectByVisibleText("Personal");
	          
	          ReportObject.adddis.click();
	          ReportObject.checkbox1.click();
	          ReportObject.savebttn.click();
	          

	}

}
