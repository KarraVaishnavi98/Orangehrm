package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpageobject {
	
	 @FindBy(how=How.ID,using="txtUsername")
		public static WebElement userName;
	  
		@FindBy(id="txtPassword")
		public static WebElement password;
		
		@FindBy(id="btnLogin")
		public static WebElement loginButton;
		
	
	
	
	
	
	
	
	

	
}
