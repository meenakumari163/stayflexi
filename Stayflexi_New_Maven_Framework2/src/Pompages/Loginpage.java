package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	 static WebDriver driver;
	  //Declare the elements
	  @FindBy(id="email")
	  WebElement unTB;
	   @FindBy(id="password")
	  WebElement pwdTB;
	  @FindBy(xpath="//*[@class='btn btn-primary ga_LoginSubmit']")
	  WebElement Loginbttn;
	  @FindBy(xpath="//*[@id='page-wrapper']//*[text()='Go to Dashboard'][@href='/hotelAdmin/?hotel_id=12356']")
	  WebElement dsbrdbton;
	  @FindBy(xpath="//ul[@id='side-menu']//span[text()='Room Booking']")
	  WebElement bkngbuttn;
	  @FindBy(xpath="//input[@id='checkin']")
	  WebElement chknfromdte;
	  @FindBy(xpath="//input[@id='checkout']")
	  WebElement chkoutdate;
	  @FindBy(xpath="//*[@id='getRoomsBtn']")
	  WebElement getroombutton;
	  @FindBy(xpath="//form[@id='roomBookingForm']//div[2]//div[@id=1]")
	  WebElement selecthotel;
	  @FindBy(xpath="//div[@class='col-md-5 list-group-item pull-right']//div[1]")
	  WebElement  Bookingbutton;
	  @FindBy(xpath="//div[@class='col-md-6']//button")
	  WebElement  cntnuebttn;
	  @FindBy(xpath="//input[@id='email']")
	  WebElement EmailTB;
	  @FindBy(xpath="//input[@id='name']")
	  WebElement CstmernmeTB;
	  @FindBy(xpath="//input[@id='phone']")
	  WebElement phneTB;
	  @FindBy(xpath="//input[@id='address1']")
	  WebElement addrs1TB;
	  @FindBy(xpath="//input[@id='address2']")
	  WebElement addrs2TB;
	  @FindBy(xpath="//input[@id='city']")
	  WebElement cityTB;
	  @FindBy(xpath="//input[@id='zip']")
	  WebElement ZipTB;
	  @FindBy(xpath="//input[@id='govt_id_number']")
	  WebElement panTB;
	  @FindBy(xpath="//textarea[@id='special_requests']")
	  WebElement RequestTB;
	  @FindBy(xpath="//a[text()='Confirm and Reserve']")
	  WebElement confirmbttn;
	  @FindBy(xpath="//button[@id='finishWithoutPay']")
	  WebElement finishbookingbutton;
	  @FindBy(xpath="//span[@aria-hidden='true']")
	  WebElement closebutton;
	  //Initialize the elements
	   public Loginpage(WebDriver driver) {
	   PageFactory.initElements(driver, this); }
	   //Utilize the elements
	   public void setUsername(String username){
	   unTB.sendKeys(username);}
	   public void setPassWord(String password){
	   pwdTB.sendKeys(password);}
	   public void clickLogin() {
	   Loginbttn.click();}
	   public void clickdashboard(){
	   dsbrdbton.click();}
	   public void clickRmBkngbttn(){
	   bkngbuttn.click();}
	   public void chknfromdate(){
	   chknfromdte.clear();}
	   public void chknfromdate1(){
	   chknfromdte.sendKeys("Tue 24 Mar 2020");;}
	   public void chkouttodate(){
	   chkoutdate.clear();}
	   public void chkouttodate1(){
	   chkoutdate.sendKeys("Wed 25 Mar 2020");}
	   public void getroombutton(){
	   getroombutton.click();}
	   public void selecthotel(){
	   selecthotel.click();}
	   public void clickaddtobooking(){
	   Bookingbutton.click();}
	   public void clickcntnuebuttn(){
	   cntnuebttn.click();}
	   public void sendemial(){
	   EmailTB.sendKeys("prema_asho@rediffmail.com"); }
	   public void sendname(){
	   CstmernmeTB.sendKeys("prema");}
	   public void sendph(){
	   phneTB.sendKeys("9148391383");}
	   public void sendadd1(){
	   addrs1TB.sendKeys("Rajive Ghandhi Nagar");}
	   public void sendadd2(){
	   addrs2TB.sendKeys("HSR layout");}
	   public void sendcity(){
	   cityTB.sendKeys("Banglore");}
	   public void sendzip(){
	   ZipTB.sendKeys("560068");}
	   public void sendpan(){
	   panTB.sendKeys("BWSPP3655B");}
	   public void sendreq(){
	   RequestTB.sendKeys("I would like to stay in hotel");}
	   public void clickconfirmbutton(){
	   confirmbttn.click();}
	   public void clickfinishbookingbutton(){
	   finishbookingbutton.click();} 
	   public void clickfclosebutton(){
	   closebutton.click();} 
     }

