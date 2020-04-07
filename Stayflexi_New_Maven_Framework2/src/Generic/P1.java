package Generic;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   //System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		   System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
		     //WebDriverManager.chromedriver().setup();
		    // WebDriver driver=new ChromeDriver();
		     WebDriver driver=new  FirefoxDriver();
		     driver.manage().window().maximize();
		     driver.get("https://www.google.co.in");
		     driver.close();
	
	}

}
