package PageObjectModel;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddEmployeeObject {
	  @FindBy(how=How.ID,using="menu_pim_viewPimModule")
		public static WebElement pimbutton;
	  
		@FindBy(id="menu_pim_viewEmployeeList")
		public static WebElement employeelist;
	  
		@FindBy(xpath="//*[@id=\"empsearch_employee_name_empName\"]")
		public static WebElement employeeName;
		
		@FindBy(id="empsearch_id")
		public static WebElement employeeId;
		
		@FindBy(id="empsearch_employee_status")
		public static WebElement employmentstatus;
		
		@FindBy(id="empsearch_termination")
		public static WebElement employmenttermination;
		
		@FindBy(id="empsearch_supervisor_name")
		public static WebElement supervisorname;
		
		@FindBy(id="empsearch_job_title")
		public static WebElement jobtitle;
		
		@FindBy(id="empsearch_sub_unit")
		public static WebElement subunit;
		
		@FindBy(id="searchBtn")
		public static WebElement search;
	
		@FindBy(id="btnAdd")
		public static WebElement addEmployee;
		
		@FindBy(id="firstName")
		public static WebElement firstName;
		
		@FindBy(id="lastName")
		public static WebElement lastName;
		
		@FindBy(xpath="//*[@id=\"photofile\"]")
		public static WebElement choosefile;
		
		@FindBy(id="chkLogin")
		public static WebElement checkbox;
	
		@FindBy(id="user_name")
		public static WebElement usernametxt;
		
		@FindBy(id="user_password")
		public static WebElement passwordtxt;
		
		@FindBy(id="re_password")
		public static WebElement confirmpasswordtxt;
		
		@FindBy(xpath="//*[@id=\"status\"]")
		public static WebElement statuslist;
		
		@FindBy(id="btnSave")
		public static WebElement Savebutton;


}
