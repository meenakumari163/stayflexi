package Scripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic.BaseTest;
import Generic.Lib;
import Pompages.Loginpage;

public class TestInvalidLogin extends BaseTest{
	@Test
	public void testInavalidLogin() throws InterruptedException {

	Loginpage lp=new Loginpage(driver);
	int rowcount = Lib.getRowcount(EXCEL_PATH, "InvalidLogin");
	System.out.println(rowcount);
	for(int i=1; i<4; i++) {
	String username = Lib.getCellvalue(EXCEL_PATH, "InvalidLogin", i, 0);
	lp.setUsername(username);
	Thread.sleep(2000);
	
	String password = Lib.getCellvalue(EXCEL_PATH, "InvalidLogin", i,1);
	lp.setPassWord(password);
	Thread.sleep(3000);
	
    lp.clickLogin();
	}
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.titleIs("StayFlexi | Hotel Group Dashboard"));
	
	SoftAssert s=new SoftAssert();
	s.assertEquals(driver.getTitle(),"StayFlexi | Hotel Group Dashboard");
	s.assertAll();
	

	} 
}