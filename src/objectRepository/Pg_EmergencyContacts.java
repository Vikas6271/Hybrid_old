package objectRepository;

import org.openqa.selenium.By;

public class Pg_EmergencyContacts 
{
	public static By Btn_Add = By.xpath("//input[@id='btnAddContact']");
	public static By edt_Name = By.xpath("//input[@id='emgcontacts_name']");
	public static By edt_Relationship = By.xpath("//input[@id='emgcontacts_relationship']");
	public static By edt_HomeTelephone = By.xpath("//input[@id='emgcontacts_homePhone']");
	public static By edt_MobileNumber = By.xpath("//input[@id='emgcontacts_mobilePhone']");
	public static By edt_WorkPhone = By.xpath("//input[@id='emgcontacts_workPhone']");
	public static By btn_Save = By.xpath("//input[@id='btnSaveEContact']");
	public static By msg_Savedsuccessfully = By.xpath("//div[contains(text(),'Successfully Saved')]");
}
