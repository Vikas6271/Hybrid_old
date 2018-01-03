package objectRepository;

import org.openqa.selenium.By;

/**
 * Login Page of Orange HRM
 * @author Ankit
 */
public class Pg_Login 
{
	public static By Edt_UserName= By.xpath("//input[@id='txtUsername']");
	public static By Edt_Password = By.xpath("//input[@id='txtPassword']");
	public static By Btn_Login = By.xpath("//input[@id='btnLogin']");
}
