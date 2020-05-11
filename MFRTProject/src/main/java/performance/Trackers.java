package performance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjectmodel.KPInTrackerObj;

public class Trackers {
public void trackers(WebDriver driver) {
	
	FileInputStream stream = null;
	try {
		stream = new FileInputStream("property");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	Properties properties=new Properties();
	try {
		properties.load(stream);
	} catch (IOException e) {
		e.printStackTrace();
	}
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
	KPInTrackerObj.employname.sendKeys(EMPLOYNAME);
	KPInTrackerObj.employname.sendKeys(Keys.ENTER);
	KPInTrackerObj.availreviewers.click();
	KPInTrackerObj.aadd.click();
	KPInTrackerObj.ssave.click();
	
   }
}
