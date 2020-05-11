package leavemodule;


import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjectmodel.LeavelistObject;

public class Leavelist {

	public void leaveList(WebDriver driver) {
		
		PageFactory.initElements(driver,LeavelistObject.class);
		
		LeavelistObject.leave.click();
		LeavelistObject.fromdate.click();
		
		Select year=new Select(LeavelistObject.fromyear);
		year.selectByVisibleText("2013");
		
		Select month=new Select(LeavelistObject.frommonth);
		month.selectByValue("3");
		
		LeavelistObject.fromday.click();
		
		LeavelistObject.todate.click();
		
	    Select toyear=new Select(LeavelistObject.toyear);
		toyear.selectByVisibleText("2020");
		
		Select tomonth=new Select(LeavelistObject.tomonth);
		tomonth.selectByVisibleText("Apr");
		
		LeavelistObject.toDay.click();
		
		LeavelistObject.Allcheck.click();
		
        LeavelistObject.empName.sendKeys("Linda Anderson");
        
        Select subunit=new Select(LeavelistObject.Subunit);
        subunit.selectByVisibleText("All");
        
        LeavelistObject.pastemployees.click();
        
        LeavelistObject.Search.click();
      
        Robot r = null;
		try {
			r = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
                Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
                Rectangle rectangle=new Rectangle(size);
                     WebDriverWait wait=new WebDriverWait(driver,10);
                     wait.until(ExpectedConditions.elementToBeClickable(LeavelistObject.btnSave)).click();
                BufferedImage source=r.createScreenCapture(rectangle);
                File destinationFile=new File("C:\\Users\\Balaji\\Desktop\\Vaish\\image1.png");
		try {
			ImageIO.write(source,"png",destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
		
 }
		
	}


