package performance;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjectmodel.KPInTrackerObj;

public class KPI {
@Test
public void kpi(WebDriver driver) throws InterruptedException, IOException {
	
	FileInputStream stream=new FileInputStream("property");
	Properties properties=new Properties();
	properties.load(stream);
	
	String KPI=properties.getProperty("kpi");
	String MAX=properties.getProperty("maxrating");
	String MIN=properties.getProperty("minrating");

PageFactory.initElements(driver, KPInTrackerObj.class);
	KPInTrackerObj.perf.click();
	KPInTrackerObj.con.click();
	KPInTrackerObj.kpis.click();
	Thread.sleep(3000);
	KPInTrackerObj.add.click();
	Thread.sleep(3000);
	KPInTrackerObj.cancel.click();
	Thread.sleep(3000);
	KPInTrackerObj.add.click();

	Select select=new Select(KPInTrackerObj.jobtitle);
	select.selectByVisibleText("Sales Executive");
	Thread.sleep(3000);

	KPInTrackerObj.kpi.sendKeys(KPI);
	KPInTrackerObj.minrating.clear();
	KPInTrackerObj.minrating.sendKeys(MIN);
	KPInTrackerObj.maxrating.clear();
	KPInTrackerObj.maxrating.sendKeys(MAX);
	KPInTrackerObj.mdc.click();

	KPInTrackerObj.save.click();

	Thread.sleep(3000);

	Select select1=new Select(KPInTrackerObj.job);
	select1.selectByVisibleText("Sales Executive");

	KPInTrackerObj.search.click();

	KPInTrackerObj.del.click();
	Thread.sleep(3000);
	KPInTrackerObj.delete.click();
	Thread.sleep(3000);
	KPInTrackerObj.ok.click();


}
}
