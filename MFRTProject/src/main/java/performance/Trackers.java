package performance;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjectmodel.KPInTrackerObj;

public class Trackers {
public void trackers(WebDriver driver) throws IOException, InterruptedException {
	
	
	FileInputStream stream=new FileInputStream("property");
	Properties properties=new Properties();
	properties.load(stream);
	String TRACKERNAME=properties.getProperty("trackername");
	String EMPLOYNAME=properties.getProperty("employname");
	
	PageFactory.initElements(driver, KPInTrackerObj.class);


	KPInTrackerObj.perf.click();
	KPInTrackerObj.con.click();
	KPInTrackerObj.tracks.click();
	KPInTrackerObj.tadd.click();
	KPInTrackerObj.tcancel.click();
	KPInTrackerObj.tadd.click();

	KPInTrackerObj.trackername.sendKeys(TRACKERNAME);
	Thread.sleep(3000);
	KPInTrackerObj.employname.sendKeys(EMPLOYNAME);
	Thread.sleep(3000);
	KPInTrackerObj.employname.sendKeys(Keys.ENTER);

	KPInTrackerObj.availreviewers.click();
	KPInTrackerObj.aadd.click();
	KPInTrackerObj.ssave.click();
	
}
}
