package Linkup;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hris.assignhris.Base;

public class TestCases {
	LoginPage hrs;
	LogoutPage out;
	WebDriver driver;
	@BeforeClass
	public void calllaunchBrowser() {
		Base b = new Base();
		driver = b.getDriver();
		VerifyPage objj = new VerifyPage(driver);
		objj.openbrowser();
		out = new LogoutPage(driver);
		hrs = new LoginPage(driver);
	}
	@Test(priority= 1)
	public void testLoginCorrectCredentials()  {
		hrs.Login("harsohrabsingh","Harsohrab@321#");
		Assert.assertTrue(hrs.URL().contains("timesheet"));
	    out.action();
	}
	
	@Test(priority= 2)
	public void testLoginWorngPswrd_WrongUsrname() {
		hrs.Login("wrongusrneweame", "1234567890");
		Assert.assertTrue(hrs.URL().contains("login.php"));
	}
	
	@Test(priority= 3)
	public void testLoginBlankPswrd_BlankUsrname() {
		hrs.Login("  ", "  ");
		Assert.assertFalse(hrs.URL().contains("timesheet"));
	}
	
	@Test(priority= 4)
	public void testLoginWrongPswrd_CorrectUsrname() {
		hrs.Login("harsohrabsingh", "abcdef");
		Assert.assertFalse(hrs.URL().contains("timesheet"));
	}
	
	@Test(priority= 5)
	public void testLoginCorrectPswrd_WrongUsrname() {
		hrs.Login("qwerwerf", "Harsohrab@321#");
		Assert.assertFalse(hrs.URL().contains("timesheet"));
	}
	
	@Test(priority= 6)
	public void testLoginBlankPswrd_CorrectUsrname() {
		hrs.Login("harsohrabsingh", "   ");
		Assert.assertFalse(hrs.URL().contains("timesheet"));
	}
	
	@Test(priority= 7)
	public void testLoginCorrectPswrd_BlankUsrname() {
		hrs.Login("  ","Harsohrab@321#");
		Assert.assertTrue(hrs.URL().contains("login.php"));
	}
    @AfterClass
	public void callCloseBrowser() {
		CloseBrowser obj2 = new CloseBrowser(driver);
	     obj2.action();		
    }
}


