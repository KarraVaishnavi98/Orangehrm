package testNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.AddEmployeeObject;

import PageObjectModel.Loginpageobject;

public class PIMAddEmployee {
    @Test
	public  void newEmployee() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		PageFactory.initElements(driver,Loginpageobject.class);
		
		Loginpageobject.userName.sendKeys("Admin");
		Loginpageobject.password.sendKeys("admin123");
		Loginpageobject.loginButton.click();
		
		PageFactory.initElements(driver, AddEmployeeObject.class);
		
		AddEmployeeObject.pimbutton.click();
		AddEmployeeObject.employeelist.click();
		AddEmployeeObject.employeeName.click();
		AddEmployeeObject.employeeName.sendKeys("Steven Edwards"+Keys.ENTER);
		Thread.sleep(2000);
		AddEmployeeObject.employeeId.sendKeys("0004"+Keys.ENTER);
		Select select1=new Select(AddEmployeeObject.employmentstatus);
		select1.selectByValue("3");
		
		Select select2=new Select(AddEmployeeObject.employmenttermination);
		select2.selectByValue("1");
		
		AddEmployeeObject.supervisorname.sendKeys("John Smith");
		
		Select select3=new Select(AddEmployeeObject.jobtitle);
		select3.selectByValue("5");

		Select select4=new Select(AddEmployeeObject.subunit);
		select4.selectByValue("7");
		
		AddEmployeeObject.search.click();
		
		AddEmployeeObject.addEmployee.click();
		AddEmployeeObject.firstName.sendKeys("Karra");
		AddEmployeeObject.lastName.sendKeys("Vaishnavi");

		Actions mouseAction= new Actions(driver);
        mouseAction.moveToElement(AddEmployeeObject.choosefile).click(AddEmployeeObject.choosefile).build().perform();
	
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
		
		AddEmployeeObject.checkbox.click();
		AddEmployeeObject.usernametxt.sendKeys("Admin1");
		AddEmployeeObject.passwordtxt.sendKeys("Vaishuchomi123");
		AddEmployeeObject.confirmpasswordtxt.sendKeys("Vaishuchomi123");
		
		Select select=new Select(AddEmployeeObject.statuslist);
		select.selectByVisibleText("Enabled");
		
		AddEmployeeObject.Savebutton.click();
		
		

	}

}
