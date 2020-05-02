package leavemodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjectmodel.ConfigLeaveObj;

public class Cofigureleave {
@Test
	public void conLeave(WebDriver driver) {
		// TODO Auto-generated method stub
	PageFactory.initElements(driver,ConfigLeaveObj.class);
	ConfigLeaveObj.Leave.click();
	ConfigLeaveObj.Leave_config.click();
	ConfigLeaveObj.Leave_period.click();
		  // POMobj.L_edit.click();
		   
		   Select month=new Select(ConfigLeaveObj.L_startmonth);
		   month.selectByVisibleText("August");
		   ConfigLeaveObj.L_startmonth.click();
		  
		   Select date=new Select(ConfigLeaveObj.L_startdate);
		   date.selectByIndex(12);
		   ConfigLeaveObj.L_startdate.click();
	 
		  // POMobj.L_reset.click();
		   ConfigLeaveObj.L_save.click();
		   ConfigLeaveObj.Leave_config.click();
		   
		   ConfigLeaveObj.Leavetype.click();
		   ConfigLeaveObj.LT_add.click();
		   ConfigLeaveObj.LT_name.sendKeys("VacyLeave");
		   
		   //POMobj.LT_cancel.click();
		   ConfigLeaveObj.LT_save.click();
		   ConfigLeaveObj.Leave_config.click();
		   ConfigLeaveObj.Leavetype.click();
		   ConfigLeaveObj.LT_deltitem.click();
		   ConfigLeaveObj.LT_delete.click();
		   ConfigLeaveObj.LTdelt_cancel.click();

	}

}
