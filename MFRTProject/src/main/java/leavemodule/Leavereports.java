package leavemodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pageobjectmodel.LeaveReportsObj;

public class Leavereports {

	public void leaveRep(WebDriver driver) throws InterruptedException {
		
			// TODO Auto-generated method stub
			  PageFactory.initElements(driver,LeaveReportsObj.class);
			  	

			  LeaveReportsObj.reports.click();
			  LeaveReportsObj.viewleave.click();
	    
	    Select select2=new Select(LeaveReportsObj.generate);
	    select2.selectByValue("1");
	    LeaveReportsObj.typeofleave.click();
	    Thread.sleep(2000);
	    LeaveReportsObj.period.click();
	    LeaveReportsObj.pastemp.click();
	    LeaveReportsObj.view.click();
	    Thread.sleep(2000);
	    driver.quit();


	}

}
