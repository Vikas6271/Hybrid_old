package objectRepository;

import org.openqa.selenium.By;

public class Pg_Dependents
{
	public static By Btn_Add = By.xpath("//input[@id='btnAddDependent']");
	public static By edt_Name = By.xpath("//input[@id='dependent_name']");
	public static By Lst_Relationshiop = By.xpath("//Select[@id='dependent_relationshipType']");
	public static By Edt_PleaseSpecifyRelationship = By.xpath("//input[@id='dependent_relationship']");
	public static By edt_DateOfBirth = By.xpath("//input[@id='dependent_dateOfBirth']");
	public static By btn_Save = By.xpath("//input[@id='btnSaveDependent']");
}
