package testsuites;
import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import admin.AdminUser;
import admin.Adminjob1;
import admin.Nationalities;
import admin.Organization;
import admin.Qualifications;
import leavemodule.Assignleave;
import leavemodule.Cofigureleave;
import leavemodule.Entitlements;
import leavemodule.Leavelist;
import leavemodule.Leavereports;
import login.Loginlogo;
import performance.KPI;
import performance.Trackers;
import pimmodule.Configuration;
import pimmodule.EmployeeList;
import pimmodule.Reports;
import recruitment.Candidates;
import recruitment.Vacancies;
public class BeforeandAfterSuite {
	 WebDriver driver=null;
	 Logger logger=Logger.getLogger(Loginlogo.class);
@BeforeSuite
	public void launchBrowser() throws AWTException, Throwable {

     FileInputStream stream=new FileInputStream("property");
     Properties properties=new Properties();
     properties.load(stream);
     
     String driverLocation=properties.getProperty("DriverLocation");
     String Link=properties.getProperty("Url");

     System.setProperty("webdriver.chrome.driver",driverLocation);

	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}
@Test(priority=1)
public void loginClass() throws AWTException, Throwable {
	Loginlogo log=new Loginlogo();
	log.login(driver);
}
@Test(priority=2)
public void useradmin() throws AWTException, Throwable {
	AdminUser user=new AdminUser();
    user.adminUser(driver);
}
@Test(priority=3)
public void adminjob() throws AWTException, Throwable {
	Adminjob1 obj=new Adminjob1();
    obj.JobIcons(driver);
    
}
@Test(priority=3)
public void organization() throws AWTException, Throwable {
	Organization org=new Organization();
    org.Organize(driver);
}
@Test(priority=4)
public void qualifications() throws AWTException, Throwable {
	 Qualifications qual=new Qualifications();
	 qual.qualIcons(driver);
}
@Test(priority=5)
public void nationalities() {
	Nationalities nat=new Nationalities();
	 nat.NatIcons(driver);
}
@Test(priority=6)
public void pimConfigure() throws InterruptedException, AWTException {
	Configuration conf=new Configuration();
	 conf.configMod(driver);
}
@Test(priority=7)
public void employeeList() throws InterruptedException, AWTException {
	EmployeeList emp=new EmployeeList();
	 emp.empList(driver);
}
@Test(priority=8)
public void pimreports() throws InterruptedException, AWTException {
	 Reports rep=new Reports();
		rep.reportMod(driver);
}
@Test(priority=9)
public void leaveentitle() throws AWTException, Throwable {
  Entitlements entitle=new Entitlements();
  entitle.entIcon(driver);
}
@Test(priority=10)
public void leavereports() throws AWTException, Throwable {
Leavereports rep=new Leavereports();
rep.leaveRep(driver);
}
@Test(priority=11)
public void leaveconfigure() throws InterruptedException, AWTException {
	Cofigureleave con=new Cofigureleave();
	con.conLeave(driver);
}
@Test(priority=12)
public void leavelist() throws AWTException, Throwable {
Leavelist list=new Leavelist();
list.leaveList(driver);
}

@Test(priority=13)
public void assignLeave() throws AWTException, Throwable {
	 Assignleave assign=new Assignleave();
	 assign.assLeave(driver);
}
@Test(priority=14)
public void recruitmentcandidate() throws AWTException, Throwable {
	Candidates can=new Candidates();
	can.candidate(driver);
}
@Test(priority=15)
public void recruitvacancy() throws AWTException, Throwable {
	Vacancies vac=new Vacancies();
	vac.vacancies(driver);
}
@Test(priority=16)
public void performancekpi() throws AWTException, Throwable {
	KPI kpi=new KPI();
	kpi.kpi(driver);
}
@Test(priority=17)
public void trackers() throws AWTException, Throwable {
	Trackers track=new Trackers();
	track.trackers(driver);
}
@AfterSuite
public void closeBrowser() {
	driver.quit();
}
}
