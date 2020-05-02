package admin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjectmodel.AdminPageObject;
import pageobjectmodel.JobPageObjects;

public class Adminjob1 {

		@Test
		public void JobIcons(WebDriver driver) throws InterruptedException, AWTException {
			// TODO Auto-generated method stub
			  PageFactory.initElements(driver,JobPageObjects.class);
			  JobPageObjects.adminButton.click();
			  JobPageObjects.job.click();
			  JobPageObjects.jobTitles.click();
			  JobPageObjects.add.click();
			  JobPageObjects.jobTitle.sendKeys("mghft");
			  JobPageObjects.Description.sendKeys("Manage Staff Meetings"+Keys.TAB);
			  
			  Actions mouseAction= new Actions(driver);
			    mouseAction.moveToElement(JobPageObjects.specification).click(JobPageObjects.specification).build().perform();
			   		
			    String file=("C:\\Users\\Balaji\\Desktop\\Vaish\\image1.png");
			    StringSelection string= new StringSelection(file);
			    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, null);
			    Thread.sleep(3000);
				
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			  JobPageObjects.Note.sendKeys("Job title added");;
			  JobPageObjects.Save.click();
			  Thread.sleep(2000);
			  JobPageObjects.job.click();
            
			  JobPageObjects.payGrades.click();
			  JobPageObjects.Add.click();
			  JobPageObjects.payname.sendKeys("hjhbjh");
			  JobPageObjects.savebtn.click();
			  JobPageObjects.AddCurrency.click();
			  JobPageObjects.currency.sendKeys("USD - United States Dollar");
			  JobPageObjects.SaveCurrency.click();
			  Thread.sleep(1000);
			  JobPageObjects.job.click();
			  JobPageObjects.empstatus.click();
			  JobPageObjects.add1.click();
			  JobPageObjects.empnme.sendKeys("Partial-T!");
			  Thread.sleep(1000);
			  JobPageObjects.save1.click();
			  
			  
	}

}
