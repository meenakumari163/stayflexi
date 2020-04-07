package Scripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic.BaseTest;
import Generic.Lib;
import Pompages.Loginpage;

public class TestValidLogin extends BaseTest{

	@Test
	public void testValidLogin( ) throws InterruptedException {
	Loginpage lp=new Loginpage(driver);	
	String username = Lib.getCellvalue(EXCEL_PATH,"ValidLogin", 1,0);
	lp.setUsername(username);
	Thread.sleep(2000);
	
	String password= Lib.getCellvalue(EXCEL_PATH,"ValidLogin", 1,1);
	lp.setPassWord(password);
	Thread.sleep(2000);
    lp.clickLogin();
	
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.titleIs("StayFlexi | Hotel Group Dashboard"));
	
	SoftAssert s=new SoftAssert();
	s.assertEquals(driver.getTitle(),"StayFlexi | Hotel Group Dashboard");
	s.assertAll();	
	}
}
