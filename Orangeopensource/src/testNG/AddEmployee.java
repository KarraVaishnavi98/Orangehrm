package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.EmployeeObjectModel;
import PageObjectModel.Loginpageobject;

public class AddEmployee {
	@Test
	public void addEmployee() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	
	PageFactory.initElements(driver,Loginpageobject.class);
	
	Loginpageobject.userName.sendKeys("Admin");
	Loginpageobject.password.sendKeys("admin123");
	Loginpageobject.loginButton.click();
	
	PageFactory.initElements(driver, EmployeeObjectModel.class);
	
	EmployeeObjectModel.admin.click();
	EmployeeObjectModel.usermanagement.click();
	EmployeeObjectModel.users.click();
	EmployeeObjectModel.Add.click();
	Select select=new Select(EmployeeObjectModel.userRole);
	select.selectByVisibleText("ESS");
    EmployeeObjectModel.employeeName.sendKeys("Steven Edwards");
	EmployeeObjectModel.username.sendKeys("Admin1");
	EmployeeObjectModel.Status.click();
	EmployeeObjectModel.passWord.sendKeys("Vaishuchomy@123");
	EmployeeObjectModel.confirmpwrd.sendKeys("Vaishuchomy@123");
	EmployeeObjectModel.savebutton.click();
	}
}

