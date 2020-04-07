package Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Lib implements IAutoConstant {
	
	public static Workbook wb;
	//setting chrome.exe FILE AND PROPERTY FILE
	public static String getProperty(String CONFIG_PATH, String key) throws FileNotFoundException, IOException {
	String property="";
	try {
		Properties prop=new Properties();
		prop.load(new FileInputStream(CONFIG_PATH));
		 property = prop.getProperty(key);
	} catch (Exception e) {
	}
	return property; 
   }
	// to get the cell value from Excel
  public static  String getCellvalue(String EXCEL_PATH, String sheet, int row, int col) {
	  String value="";
	  try {
		  wb= WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
		  value=wb.getSheet(sheet).getRow(row).getCell(col).toString();
		
	} catch (Exception e) {
	
	}
	return value;
     }  
        public static int getRowcount(String EXCEL_PATH, String sheet) {
		 int rowcount=0;
		 try {
			  wb= WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
			  rowcount=wb.getSheet(sheet).getLastRowNum();
			  
		} catch (Exception e) {
		}
      return rowcount;
		 
	 }
	 public static void TakesScreenshot(WebDriver driver, String testmethodName) throws IOException {

		Date d = new Date();
		String date1 = d.toString();
		System.out.println(date1);
		String date2 = date1.replaceAll(":", "_");
	    TakesScreenshot ts=(TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destfile = new File("./screenshots/"+ date2+"_"+testmethodName+"_"+"screenshot.png");
        FileUtils.copyFile(srcFile, destfile);
          } 
  }

