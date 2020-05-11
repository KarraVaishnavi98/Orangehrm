package performance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjectmodel.KPInTrackerObj;

public class KPI {
@Test
public void kpi(WebDriver driver)  {
	
	FileInputStream stream = null;
	try {
		stream = new FileInputStream("configure.properties");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	Properties properties=new Properties();
	try {
		properties.load(stream);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	String KPI=properties.getProperty("kpi");
	String MAX=properties.getProperty("maxrating");
	String MIN=properties.getProperty("minrating");

    PageFactory.initElements(driver, KPInTrackerObj.class);
    
	     KPInTrackerObj.perf.click();
	     KPInTrackerObj.con.click();
	     KPInTrackerObj.kpis.click();
	     KPInTrackerObj.add.click();
	     KPInTrackerObj.cancel.click();
	     KPInTrackerObj.add.click();
	     
	     Select select=new Select(KPInTrackerObj.jobtitle);
	     select.selectByVisibleText("Sales Executive");
	     
	     KPInTrackerObj.kpi.sendKeys(KPI);
	     KPInTrackerObj.minrating.clear();
	     KPInTrackerObj.minrating.sendKeys(MIN);
	     KPInTrackerObj.maxrating.clear();
	     KPInTrackerObj.maxrating.sendKeys(MAX);
	     KPInTrackerObj.mdc.click();
	     KPInTrackerObj.save.click();
	     
         Select select1=new Select(KPInTrackerObj.job);
	     select1.selectByVisibleText("Sales Executive");

	     KPInTrackerObj.search.click();
	     KPInTrackerObj.del.click();
	     KPInTrackerObj.delete.click();
	     KPInTrackerObj.ok.click();


        }
}
