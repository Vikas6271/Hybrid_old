package testScriptDefinitions.Module1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import objectRepository.Pg_EmergencyContacts;
import objectRepository.Pg_Home;
import objectRepository.Pg_Login;
import objectRepository.Pg_MyInfo;
import userLibrary.UserLibrary;

public class TC101_AddEmergencyContactsAndVerify extends UserLibrary 
{
  String plog;
  String flog;
  boolean stepstatus;
  @Test
  public void scriptDefinition() 
  {
		WebDriver driver = launchBrowser("firefox");
		driver = SetImplicitWait(20, driver);

		stepstatus = OpenUrl(getdata("URL"), driver);
		plog = "Step 01: Able to launch the application";
		flog = "Step 01: Unable to launch Application";
		logEvent(stepstatus, plog, flog, driver, true);

		stepstatus = setText(Pg_Login.Edt_UserName, getdata("UserName"), driver);
		plog = "Step 02: Able to enter username";
		flog = "Step 02: Unable to enter username";
		logEvent(stepstatus, plog, flog, driver, false);


		stepstatus = setText(Pg_Login.Edt_Password, getdata("Password"), driver);
		plog = "Step 03:Able to enter Password";
		flog = "Step 03:Unable to enter Password";
		logEvent(stepstatus, plog, flog, driver, false);

		stepstatus = clickElement(Pg_Login.Btn_Login, driver);
		plog = "Step 04:Able to click on login";
		flog = " Step 04:UnAble to click on login";
		logEvent(stepstatus, plog, flog, driver, false);

		stepstatus = exists(Pg_Home.Lnk_MyInfo, driver);
		plog = "Step 05:Login is successful";
		flog = "Step 05:Login is not successful";
		logEvent(stepstatus, plog, flog, driver, true);

		stepstatus = clickElement(Pg_Home.Lnk_MyInfo, driver);
		plog = "Step 06:Able to click on myInfo";
		flog = "Step 06:UnAble to click on myInfo";
		logEvent(stepstatus, plog, flog, driver,false);

		stepstatus = clickElement(Pg_MyInfo.Lnk_EmergencyContacts, driver);
		plog = "Step 07:Able to click on EmergencyContacts";
		flog = "Step 07:UnAble to click on EmergencyContacts";
		logEvent(stepstatus, plog, flog, driver, false);

		stepstatus = clickElement(Pg_EmergencyContacts.Btn_Add, driver);
		plog = "Step 08:Able to click on Add Button";
		flog = "Step 08:UnAble to click on Add Button";
		logEvent(stepstatus, plog, flog, driver, false);

		stepstatus = setText(Pg_EmergencyContacts.edt_Name, getdata("Name"), driver);
		plog = "Step 09:Able to enter contact name";
		flog = "Step 09:Unable to enter contact name";
		logEvent(stepstatus, plog,flog, driver, false);

		stepstatus = setText(Pg_EmergencyContacts.edt_Relationship, getdata("Relationship"), driver);
		plog = "Step 10:Able to enter relationship";
		flog = "Step 10:Unable to enter relationship";
		logEvent(stepstatus, plog,flog, driver, false);

		stepstatus = setText(Pg_EmergencyContacts.edt_HomeTelephone, getdata("HomeTelePhone"), driver);
		plog = "Step 11:Able to enter Homephone";
		flog = "Step 11:Unable to enter Homephone";
		logEvent(stepstatus, plog,flog, driver, false);

		stepstatus = setText(Pg_EmergencyContacts.edt_MobileNumber, getdata("MobileNumber"), driver);
		plog = "Step 12:Able to enter Mobile Number";
		flog = "Step 12:Unable to enter Mobile Number";
		logEvent(stepstatus, plog,flog, driver, false);

		stepstatus = setText(Pg_EmergencyContacts.edt_WorkPhone, getdata("WorkTelephone"), driver);
		plog = "Step 13:Able to enter WorkPhone";
		flog = "Step 13:Unable to enter WorkPhone";
		logEvent(stepstatus, plog,flog, driver, false);


		stepstatus = clickElement(Pg_EmergencyContacts.btn_Save, driver);
		plog = "Step 14:Able to click save";
		flog = "Step 14:Unable to click save";
		logEvent(stepstatus, plog,flog, driver, true);

		stepstatus=exists(Pg_EmergencyContacts.msg_Savedsuccessfully, driver);
		plog = "Step 15:Saved Successfully Message is displsyed";
		flog = "Step 15:Saved Successfully Message is Not displsyed";
		logEvent(stepstatus, plog,flog, driver, true);


		stepstatus = clickElement(Pg_Home.lnk_LogoutExpand, driver);
		plog = "Step 16:Able to click Welcome";
		flog = "Step 16:Unable to click Welcome";
		logEvent(stepstatus, plog,flog, driver, false);

		stepstatus = clickElement(Pg_Home.lnk_Logout, driver);
		plog = "Step 17:Able to click Logout";
		flog = "Step 17:Unable to click Logout";
		logEvent(stepstatus, plog,flog, driver, false);

		stepstatus=exists(Pg_Login.Edt_UserName, driver);
		plog = "Step 18:Logout is successful";
		flog = "Step 18:Logout is Not successful";
		logEvent(stepstatus, plog,flog, driver, true);

		quitDriver(driver);
  } 
  @Test
  
  @BeforeTest
  public void setUp()
  {
	  SetUp();
  }
  @AfterTest
  public void tearDown()
  {
	  TearDown();
  }
}
