package Linkup;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.hris.assignhris.Base;

public class VerifyPage extends Base{
	public VerifyPage(WebDriver driver) {
		this.driver =driver;
		} 
		public void openbrowser() {
			driver.get("https://hris.qainfotech.com/login.php");
			String pagetitle = driver.getTitle();
			System.out.println(driver);

			Assert.assertEquals("HRIS Login", pagetitle);
			System.out.println("PAge Verified");
		}
			
}

