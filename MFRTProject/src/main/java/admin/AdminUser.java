package admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjectmodel.AdminPageObject;
import pageobjectmodel.OrangehrmObject;


public class AdminUser {

	

	public void adminUser(WebDriver driver) throws IOException, InterruptedException {
	
				
		 PageFactory.initElements(driver,AdminPageObject.class);
		 	
		 AdminPageObject.adminButton.click();	
		 AdminPageObject.usermanagement.click();	
		 AdminPageObject.users.click();
		 AdminPageObject.Add.click();
		 Select userRole=new Select(AdminPageObject.Userrole);
		 userRole.selectByValue("2");
		 AdminPageObject.Employeename.sendKeys("Steven Edwards");
		 AdminPageObject.Username.sendKeys("ander98son");
		 Select status=new Select(AdminPageObject.Status);
		 status.selectByValue("1");
		 AdminPageObject.Password.sendKeys("Vaishuchomi@123");
		 AdminPageObject.cfrpwd.sendKeys("Vaishuchomi@123");
		 AdminPageObject.Save.click();
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		 AdminPageObject.username1.sendKeys("ander98son");
		 Select userType=new Select(AdminPageObject.usertype);
		 userType.selectByValue("2");
		 AdminPageObject.employeeName.sendKeys("Steven Edwards");
		 Select userstatus=new Select(AdminPageObject.userstatus);
		 userstatus.selectByValue("1");
		 AdminPageObject.searchButton.click();
	
}
}
