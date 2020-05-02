package pimmodule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjectmodel.EmpListObject;
import pageobjectmodel.JobPageObjects;


public class EmployeeList {
@Test
	public void empList(WebDriver driver) throws InterruptedException, AWTException {
	PageFactory.initElements(driver,EmpListObject.class);
	
    EmpListObject.pimbutton.click();
    EmpListObject.Emplist.click();
    EmpListObject.chklist.click();
    EmpListObject.Delete.click();
    EmpListObject.cancel.click();
    EmpListObject.btnAdd.click();
    EmpListObject.firstname.sendKeys("Kara");
    EmpListObject.lastname.sendKeys("Vyshnavi");
    Actions mouseAction1= new Actions(driver);
    mouseAction1.moveToElement(EmpListObject.choosefile).click(EmpListObject.choosefile).build().perform();
   		
    String file=("C:\\Users\\Harsha\\Downloads\\image.png");
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
	
	EmpListObject.checkLogin.click();
	EmpListObject.Username.sendKeys("OrangeHRM1");
	EmpListObject.Password.sendKeys("Vaishuchomi@123");
	EmpListObject.cnfmPassword.sendKeys("Vaishuchomi@123");
	Select Status=new Select(EmpListObject.status);
	Status.selectByVisibleText("Enabled");
	EmpListObject.Savee.click();
	EmpListObject.Emplist.click();
	EmpListObject.empName.sendKeys(Keys.CLEAR+"Linda Anderson"+Keys.ENTER);
	Thread.sleep(1000);
	EmpListObject.empsearchid.sendKeys("0001");
	EmpListObject.empstatus.click();
	EmpListObject.currentemp.click();
	EmpListObject.supervisorname.sendKeys(Keys.CLEAR+"John Smith"+Keys.ENTER);
	Thread.sleep(1000);
	Select sel=new Select(EmpListObject.empjobtitle);
	sel.selectByValue("3");
	Select sel1=new Select(EmpListObject.sub_unit);
	sel1.selectByValue("5");
	EmpListObject.search.click();
	Thread.sleep(2000);
	EmpListObject.reset.click();
	}

}
