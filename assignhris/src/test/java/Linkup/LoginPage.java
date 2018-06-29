package Linkup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.hris.assignhris.Base;

public class LoginPage extends Base{
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	By UserName = By.id("txtUserName");
	By password = By.id("txtPassword");
	By sub =By.name("Submit");
	By tab = By.className("active");
	
	public String URL() {
		return driver.getCurrentUrl();
	}
	public void Login(String user, String pass) {
		driver.findElement(tab).click();
		driver.findElement(UserName).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(sub).click();
		
	}
	
	
	

}
