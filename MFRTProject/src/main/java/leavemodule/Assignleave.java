package leavemodule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pageobjectmodel.AssignLeaveObj;

public class Assignleave {

	public void assLeave(WebDriver driver) {
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
		
		String empname=properties.getProperty("EmployeeName");
	
      PageFactory.initElements(driver, AssignLeaveObj.class);
		        
                AssignLeaveObj.leavebutton.click();
                AssignLeaveObj.assignleave.click();
                AssignLeaveObj.empname.sendKeys(empname+Keys.ENTER);
		
		        
		        Select select=new Select(AssignLeaveObj.leavetype);
		        select.selectByValue("3");
		        
		        AssignLeaveObj.fromdate.click();
		        AssignLeaveObj.frommonth.click();
		        AssignLeaveObj.fromyear.click();
		        AssignLeaveObj.fromday.click();
		        
		        AssignLeaveObj.todate.click();
		        AssignLeaveObj.tomonth.click();
		        AssignLeaveObj.toDay.click();
		      
		        Select select1= new Select(AssignLeaveObj.partialdays);
		        select1.selectByVisibleText("None");
		     
		        AssignLeaveObj.assignbutton.click();
		        AssignLeaveObj.clickok.click();

		        AssignLeaveObj.assignbutton.click();
		        AssignLeaveObj.clickok.click();
		        

	}

}
