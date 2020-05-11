package leavemodule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjectmodel.ConfigLeaveObj;

public class Cofigureleave {
    @Test
	public void conLeave(WebDriver driver) {
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
	
	String leavetype=properties.getProperty("Leavetype");

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
		     ConfigLeaveObj.LT_name.sendKeys(leavetype);
		   
		    //POMobj.LT_cancel.click();
		     ConfigLeaveObj.LT_save.click();
		     ConfigLeaveObj.Leave_config.click();
		     ConfigLeaveObj.Leavetype.click();
		     ConfigLeaveObj.LT_deltitem.click();
		     ConfigLeaveObj.LT_delete.click();
		     ConfigLeaveObj.LTdelt_cancel.click();

	}

}
