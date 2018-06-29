package Linkup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hris.assignhris.Base;

public class LogoutPage extends Base{

	public LogoutPage(WebDriver driver) {
		this.driver = driver;
}
	By logbtnlogo = By.className("user-image");
	
	By clicklog =By.cssSelector("a[href='https://hris.qainfotech.com:8086/user/logoff']");
		        
	public void action()  {
		
		driver.findElement(logbtnlogo).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement lgtBtn =driver.findElement(clicklog);
		js.executeScript("arguments[0].click();", lgtBtn);
		
	}

	

}
