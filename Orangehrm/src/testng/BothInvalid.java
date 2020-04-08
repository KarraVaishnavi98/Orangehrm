package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BothInvalid {

	String[][] data= {
			{"admin1","admin123"},
			{"Admin","admin1"},
			{"admin2","gfh"},
			{"Admin","admin123"}
			};
@DataProvider(name="login")
public String[][] loginData(){
	return data;
}

		@Test(dataProvider="login")
		
		public void main(String uName,String pWord) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com");
			WebElement username=driver.findElement(By.id("txtUsername"));
			username.sendKeys(uName);
			WebElement password=driver.findElement(By.id("txtPassword"));
			password.sendKeys(pWord);
			WebElement login=driver.findElement(By.id("btnLogin"));
			login.click();
			
	}

}
