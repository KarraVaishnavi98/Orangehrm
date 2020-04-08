package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.
@Test
@Parameters({"username","password"})
	public static void main(String uName,String pWord) {
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
