package admin;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjectmodel.JobPageObjects;
import pageobjectmodel.OrganizationObj;

public class Organization {

	@Test
	public void Organize(WebDriver driver) {
		// TODO Auto-generated method stub
		
		 PageFactory.initElements(driver,OrganizationObj.class);
		  
		  OrganizationObj.organization.click();
		  OrganizationObj.location.click();
		  OrganizationObj.addbtn.click();
		  OrganizationObj.locname.sendKeys("Jayanaarcolony");
		  Select select=new Select(OrganizationObj.country);
		  select.selectByVisibleText("India");
		  OrganizationObj.state.sendKeys("AndhraPradesh");	
		  OrganizationObj.city.sendKeys("Bangalore");
		  OrganizationObj.address.sendKeys("H.No:5/335,vallabhanagar"+Keys.TAB);
		  OrganizationObj.zipcode.sendKeys("512001");
		  OrganizationObj.phone.sendKeys("9989007654");
		  OrganizationObj.Savebtn.click();
		  OrganizationObj.Location_name.sendKeys("Jaynag Colony");
		  OrganizationObj.Location_city.sendKeys("Bangalore");
		  Select select1=new Select(OrganizationObj.loccountry);
		  select1.selectByVisibleText("India");
		  OrganizationObj.Reset.click();
	}

}
