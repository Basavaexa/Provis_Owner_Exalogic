package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmenityBooking_POM_OWNER 
{
	
	public WebDriver driver;
	public AmenityBooking_POM_OWNER (WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	
	@FindBy(name="username")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath="//button[contains(@type,'submit')]")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(xpath="//button[@onclick='closeapppopup()']/..")
	@CacheLookup
	WebElement btnClose;
	

	@FindBy(xpath="//span[text()='My Community']")
	@CacheLookup
	WebElement MyCommunity_A;
	
	@FindBy(xpath="//span[text()='Al Muneera']")
	@CacheLookup
	WebElement AlMuneera_A;
	
	
	@FindBy(xpath="(//a[text()='Amenity Booking'])[5]")
	@CacheLookup
	WebElement AmenityBooking_A;
	
	@FindBy(xpath="(//a[text()='Book Now'])[1]")
	@CacheLookup
	WebElement NowBook_A;
	
	@FindBy(xpath="//*[@class='btn dropdown-toggle btn-light bs-placeholder']")
	@CacheLookup
	WebElement unitdropdown_A;
    
	
	@FindBy(xpath="(//*[@class='text'])[2]")
	@CacheLookup
	WebElement unitno_A;
	
	@FindBy(id="check_in_date")
	@CacheLookup
	WebElement checkindate_A;
	
	@FindBy(xpath="(//td[text()='28'])[2]")
	@CacheLookup
	WebElement chkindate_A;
	
	@FindBy(xpath="(//*[@for='slot_01:00_12:00_01:00_2853'])[1]")
	@CacheLookup
	WebElement slottime_A;
	
	
	@FindBy(id="submit")
	@CacheLookup
	WebElement sbmtbtn_A;
	
	

	@FindBy(id="creditCardNumber")
	@CacheLookup
	WebElement CardNumber_A;
	
	
	@FindBy(id="expiryMonthCreditCard")
	@CacheLookup
	WebElement ExpiryMonth_A;
	
	
	@FindBy(xpath="//option[text()='Dec (12)']")
	@CacheLookup
	WebElement Month_A;
	
	@FindBy(id="expiryYearCreditCard")
	@CacheLookup
	WebElement ExpiryYear_A;
	
	
	@FindBy(xpath="//option[text()='2029']")
	@CacheLookup
	WebElement Year_A;
	
	@FindBy(id="CVVNumberCreditCard")
	@CacheLookup
	WebElement Cvv_A;
	
	@FindBy(xpath="//span[text()='Make Payment']")
	@CacheLookup
	WebElement MakePayment_A;
	
	
	@FindBy(xpath="//input[@value='Submit']/..")
	@CacheLookup
	WebElement Submitbtn_A;
	
	@FindBy(xpath="//a[@class='btn btn-primary mt-2 mt-md-0']")
	@CacheLookup
	WebElement Downloadreceipt_A;
	
	
	@FindBy(id="icon")
	@CacheLookup
	WebElement DownloadArrow_A;
	
	
	
	
	
	
	
	public void setUserName(String username)
	{
		txtEmail.clear();
		txtEmail.sendKeys(username);
	}

	public void setPassword(String password)
	{
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}

	public void clickLogin()
	{
		btnLogin.click();
	}

	public void clickClose()
	{
		btnClose.click();
	}

	public void clickMyCommunity_A()
	{
		MyCommunity_A.click();
	}
	
	
	public void clickAlMuneera_A()
	{
		AlMuneera_A.click();
	}
	
	public void clickAmenityBooking_A()
	{
		AmenityBooking_A.click();
	}
	
	public void clickNowBook_A()
	{
		NowBook_A.click();
	}
	
	public void clickunitdropdown_A()
	{
		unitdropdown_A.click();
	}
	
	public void clickunitno_A()
	{
		unitno_A.click();
	}
	
	public void clickcheckindate_A()
	{
		checkindate_A.click();
	}
	
	public void clickchkindate_A()
	{
		chkindate_A.click();
	}
	
	
	public void clickslottime_A()
	{
		slottime_A.click();
	}
	
	
	public void clicksbmtbtn_A()
	{
		sbmtbtn_A.click();
	}	
	
	public void setCardNumber_A(String cardno)
	{
		CardNumber_A.sendKeys(cardno);
	}
	
	public void clickExpiryMonth_A()
	{
		ExpiryMonth_A.click();
	}
	
	public void clickMonth_A()
	{
		Month_A.click();
	}
	
	public void clickExpiryYear_A()
	{
		ExpiryYear_A.click();
	}
	
	public void clickYear_A()
	{
		Year_A.click();
	}
	
	public void setCvv_A(String cvv)
	{
		Cvv_A.sendKeys(cvv);
	}
	
	public void clickMakePayment_A() throws InterruptedException
	{
		MakePayment_A.click();
		Thread.sleep(4000);
	}
	
	public void clickSubmitbtn_A()
	{
		Submitbtn_A.click();
	}
	
	public void clickDownloadreceipt_A()
	{
		Downloadreceipt_A.click();
	}
	
	public void clickDownloadArrow_A()
	{
		String tab = driver.getWindowHandle();
		//driver.switchTo().window(tab);
		//driver.findElement(By.xpath());
       DownloadArrow_A.click();
	}
	
	//*[@id="ContainerContent"]/center/form/table/tbody/tr[13]/td/input
	
	
}


