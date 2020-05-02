package pimmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjectmodel.ReportObject;

public class Reports {
@Test
	public void reportMod(WebDriver driver) {
	PageFactory.initElements(driver,ReportObject.class);
	
	          ReportObject.pimbutton.click();
	          ReportObject.report.click();
	          ReportObject.addbutton1.click();
	          ReportObject.reportname.sendKeys("Report1");
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
