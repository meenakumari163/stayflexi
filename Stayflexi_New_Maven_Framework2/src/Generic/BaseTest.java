package Generic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant {

	public WebDriver driver;
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	  @BeforeMethod
      public void openApplication() throws FileNotFoundException, IOException {
      driver= new ChromeDriver();
      //driver.manage().window().maximize();
      driver.manage().window().maximize();
      
      String url=Lib.getProperty(CONFIG_PATH, "URL");
      driver.get(url);
      
     String ITO= Lib.getProperty(CONFIG_PATH, "ImplicitTimeout");
    
     try {
         int timeoutPeriod=Integer.parseInt(ITO);
          driver.manage().timeouts().implicitlyWait(timeoutPeriod, TimeUnit.SECONDS);
         }
         catch(NumberFormatException e) {
          }
        }  
      @AfterMethod  
      public  void closeApplication(ITestResult result) throws  IOException {
      if(ITestResult.FAILURE==result.getStatus())
       {
       Lib.TakesScreenshot(driver, result.getName());
       }
      driver.close();
      }
}