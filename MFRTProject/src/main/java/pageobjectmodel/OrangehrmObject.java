package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrangehrmObject {
	@FindBy(xpath="//*[@id=\"forgotPasswordLink\"]/a")
	public static WebElement forgotPassword;
	
	@FindBy(id="btnCancel")
	public static WebElement btncnl;
	
	@FindBy(how=How.ID,using="txtUsername")
	public static WebElement userName;
		  
	@FindBy(id="txtPassword")
	public static WebElement password;
			
	@FindBy(id="btnLogin")
	public static WebElement loginButton;
		
	@FindBy(css="img")
	public static WebElement image;

}
