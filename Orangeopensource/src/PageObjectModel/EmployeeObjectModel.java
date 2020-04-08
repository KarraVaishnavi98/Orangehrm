package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class EmployeeObjectModel {
    @FindBy(how=How.ID,using="menu_admin_viewAdminModule")
	public static WebElement admin;
  
	@FindBy(id="menu_admin_UserManagement")
	public static WebElement usermanagement;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	public static WebElement users;
	
	@FindBy(id="btnAdd")
	public static WebElement Add;
	
	@FindBy(xpath="//*[@id=\"systemUser_userType\"]")
	public static WebElement userRole;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"systemUser_employeeName_empName\"]")
	public static WebElement employeeName ;
	
	@FindBy(id="systemUser_userName")
	public static WebElement username;
	
	@FindBy(xpath="//*[@id=\"systemUser_status\"]/option[1]")
	public static WebElement Status;
	
	@FindBy(id="systemUser_password")
	public static WebElement passWord ;
	
	@FindBy(id="systemUser_confirmPassword")
	public static WebElement confirmpwrd;
	
	@FindBy(how=How.ID,using="btnSave")
	public static WebElement savebutton;

}
