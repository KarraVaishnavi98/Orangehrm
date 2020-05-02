package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPageObject {
	                                  /*!!--------ADMIN USERS-----------!!*/
	@FindBy(id="menu_admin_viewAdminModule")
	public static WebElement adminButton;
	
	@FindBy(id="menu_admin_UserManagement")
	public static WebElement usermanagement;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	public static WebElement users;
	
	@FindBy(id="btnAdd")
	public static WebElement Add;

	@FindBy(xpath="//*[@id=\"systemUser_userType\"]")
	public static WebElement Userrole;
	
	@FindBy(id="systemUser_userName")
	public static WebElement Username;
	
	@FindBy(id="systemUser_employeeName_empName")
	public static WebElement Employeename;
	
	@FindBy(id="systemUser_status")
	public static WebElement Status;
	
	@FindBy(id="systemUser_password")
	public static WebElement Password;
	
	@FindBy(id="systemUser_confirmPassword")
	public static WebElement cfrpwd;
	
	@FindBy(id="btnSave")
	public static WebElement Save;
	
	@FindBy(id="searchSystemUser_userName")
	public static WebElement username1;
	
	@FindBy(id="searchSystemUser_userType")
	public static WebElement usertype;
	
	@FindBy(id="searchSystemUser_employeeName_empName")
	public static WebElement employeeName;
	
	@FindBy(id="searchSystemUser_status")
	public static WebElement userstatus;
	
	@FindBy(id="searchBtn")
	public static WebElement searchButton;
	
	                                  /*!!-------ADMIN JOB--------!!*/
	
	@FindBy(id="menu_admin_Job")
	public static WebElement Job;
	@FindBy(id="menu_admin_viewJobTitleList")
	public static WebElement Jobtitle;
	@FindBy(id="btnAdd")
	public static WebElement Addbtn;
	@FindBy(id="jobTitle_jobTitle")
	public static WebElement addtitle;
	@FindBy(id="jobTitle_jobDescription")
	public static WebElement description;
	@FindBy(id="jobTitle_jobSpec")
	public static WebElement specification;
	@FindBy(id="jobTitle_note")
	public static WebElement jobnote;
	@FindBy(id="btnSave")
	public static WebElement buttonsave;
	@FindBy(id="//*[@id=\"resultTable\"]/tbody/tr[15]/td[2]/a")
	public static WebElement clicklink;
}
