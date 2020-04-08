package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjectModel.Loginpageobject;


public class Loginpage {
@Test
public void login() {
	System.setProperty("webdriver.chrome.driver()","C:\\Users\\Harsha\\Downloads\\chromedriver_win32\\chromedriver.exe");
 	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	
	PageFactory.initElements(driver,Loginpageobject.class);
	
	Loginpageobject.userName.sendKeys("Admin");
	Loginpageobject.password.sendKeys("admin123");
	Loginpageobject.loginButton.click();
	
	driver.close();
}
}
