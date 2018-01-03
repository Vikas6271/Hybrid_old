package testScriptDefinitions.Module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import objectRepository.Pg_Dependents;
import objectRepository.Pg_MyInfo;
import userLibrary.UserLibrary;

public class TC102_AddDependency extends UserLibrary  {
	
	public void scriptdefinition(){
		WebDriver driver = new FirefoxDriver();
		setText(Pg_Dependents.edt_Name, "vikas", driver);
		setText(Pg_Dependents.edt_Name, "vignesh", driver);
		
	}
	

}
