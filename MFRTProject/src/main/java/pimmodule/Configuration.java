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
import pageobjectmodel.PIMConfig;

public class Configuration {
@Test
	public void configMod(WebDriver driver) throws InterruptedException, AWTException {
		
PageFactory.initElements(driver,PIMConfig.class);
	
    PIMConfig.pimbutton.click();
    PIMConfig.configuration.click();
    PIMConfig.optfield.click();
    PIMConfig.Edit.click();
    PIMConfig.depfield.click();
    PIMConfig.ssnbtn.click();
    PIMConfig.savebutton.click();
    Thread.sleep(2000);
    PIMConfig.configuration.click();
    PIMConfig.customfield.click();
    PIMConfig.buttonAdd.click();
    PIMConfig.fieldname.sendKeys("customfields");
    Select select=new Select(PIMConfig.screen);
    select.selectByVisibleText("Qualifications");
    Select select1=new Select(PIMConfig.fieldtype);
    select1.selectByValue("0");
    PIMConfig.savebtn1.click();
    Thread.sleep(2000);
    PIMConfig.addBtn.click();
    PIMConfig.fieldname.sendKeys("customfield12");
    Select sele=new Select(PIMConfig.screen);
    sele.selectByVisibleText("Memberships");
    Select sele1=new Select(PIMConfig.fieldtype);
    sele1.selectByValue("1");
    PIMConfig.selopt.sendKeys("sel,opt"+Keys.ENTER);
    PIMConfig.btnSave.click();
    PIMConfig.allcheck.click();
    PIMConfig.buttonRemove.click();
    PIMConfig.btncancel.click();
    Thread.sleep(2000);
    PIMConfig.configuration.click();
    PIMConfig.dataimport.click();
    PIMConfig.download.click();
    Thread.sleep(1000);
    Actions mouseAct= new Actions(driver);
    mouseAct.moveToElement(PIMConfig.choose).click(PIMConfig.choose).build().perform();
   		
    String file=("C:\\Users\\Harsha\\Downloads\\importData(12).xls");
    StringSelection string= new StringSelection(file);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, null);
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);

	PIMConfig.upload.click();
	Thread.sleep(1000);
	PIMConfig.configuration.click();
	PIMConfig.reportmeth.click();
	PIMConfig.addbtn1.click();
	PIMConfig.reportmethname.sendKeys("DirectMethod2");
	PIMConfig.saveebtn.click();
	Thread.sleep(2000);
	PIMConfig.configuration.click();
	PIMConfig.termination.click();
	PIMConfig.adddbtn.click();
	PIMConfig.term_reason.sendKeys("Self_Resignation");
	PIMConfig.termsave.click();
	PIMConfig.term_reason.sendKeys("resign by request");
	PIMConfig.cancel.click();
	}


}
