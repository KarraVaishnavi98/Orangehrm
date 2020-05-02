package leavemodule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pageobjectmodel.AssignLeaveObj;

public class Assignleave {

	public void assLeave(WebDriver driver) throws Throwable {
	
PageFactory.initElements(driver, AssignLeaveObj.class);
		        
AssignLeaveObj.leavebutton.click();
AssignLeaveObj.assignleave.click();
AssignLeaveObj.empname.sendKeys("Linda Anderson"+Keys.ENTER);
		        Thread.sleep(2000);
		        
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
