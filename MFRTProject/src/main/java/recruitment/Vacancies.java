package recruitment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjectmodel.CandidateObjects;
import pageobjectmodel.VacanciesObj;

public class Vacancies {
	public XSSFRow row;
	public String datas;
@Test
	public void vacancies(WebDriver driver) throws NumberFormatException, IOException {
	
		
			FileInputStream stream=new FileInputStream("config.properties");
			Properties properties=new Properties();
			properties.load(stream);
			
			String Location=properties.getProperty("location");
			String MainURL=properties.getProperty("mainURL");
			String Usrname=properties.getProperty("Username");
			String Password=properties.getProperty("Password");
			
			PropertyConfigurator.configure("config.properties");
			
		
			
			FileInputStream path = new FileInputStream("config.properties");
			Properties prop = new Properties();
			prop.load(path);

			String col = prop.getProperty("VacancyCol"),excelPath=prop.getProperty("ExcelPath");
			int colIndex=Integer.parseInt(col);
			
			PageFactory.initElements(driver, VacanciesObj.class);
		
			PageFactory.initElements(driver, CandidateObjects.class);
		
			CandidateObjects.recruitmentbtn.click();
			VacanciesObj.Vacancy.click();
			VacanciesObj.AddBtn.click();
			
			

			File src= new File(excelPath);
			FileInputStream getBookPath=new FileInputStream(src);

            XSSFWorkbook excelBook= new XSSFWorkbook(getBookPath);

			XSSFSheet sheet1=excelBook.getSheetAt(0);
			Iterator<Row>  rowIterator = sheet1.iterator();
			String vacancyName=getExcelData(rowIterator,colIndex),hiringMGR=getExcelData(rowIterator,colIndex),
					NoOfPosition=getExcelData(rowIterator,colIndex),description=getExcelData(rowIterator, colIndex),
					JobTitle=properties.getProperty("Jobtitle");
			
			Select select=new Select(VacanciesObj.JobTitle);
			select.selectByVisibleText(JobTitle);;
			
			VacanciesObj.VacancyName.sendKeys(vacancyName);
			VacanciesObj.HMgr.sendKeys(hiringMGR);
			VacanciesObj.NOS.sendKeys(NoOfPosition);
			VacanciesObj.Description.sendKeys(description);
			
			Actions act=new Actions(driver);
			act.click(VacanciesObj.Active).build().perform();
			act.click(VacanciesObj.publish).build().perform();
			
			VacanciesObj.SaveBtn.click();
			excelBook.close();
			}
		
		public String getExcelData(Iterator<Row> rowIterator,int colIndex) throws IOException {

			row = (XSSFRow) rowIterator.next();
			Cell cell = row.getCell(colIndex);
			datas=cell.getStringCellValue();
			return datas;
		}
		

	
	}


