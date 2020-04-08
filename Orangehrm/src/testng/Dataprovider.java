package testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Dataprovider {
	WebDriver driver;
	
	String[] [] data=null;
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() throws IOException, BiffException{
		data=getExcelData();
		return data;
	}
	public String[][] getExcelData() throws IOException, BiffException {
		FileInputStream excel=new FileInputStream("C:\\Users\\Harsha\\Downloads\\Testng excel.xls");
		Workbook workbook=Workbook.getWorkbook(excel);
		Sheet sheet=workbook.getSheet(0);
		int rows=sheet.getRows();
		int columns=sheet.getColumns();
		String testData[][]=new String[rows-1][columns];
		for(int i=1;i<rows;i++){
			for(int j=0;j<columns;j++) {
				testData[i-1][j]=sheet.getCell(j,i).getContents();
			}
		}
        return testData;
	}     
	@BeforeSuite
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
	}

	@Test(dataProvider="loginData")
	
	public void main(String uName,String pWord) {
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys(uName);
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(pWord);
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
	}
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		
	}
}
