package Linkup;

import org.openqa.selenium.WebDriver;

import com.hris.assignhris.Base;

public class CloseBrowser extends Base{
	public CloseBrowser(WebDriver driver) {
		this.driver = driver;
	}
	public void action() {
		driver.close();
	}

}
