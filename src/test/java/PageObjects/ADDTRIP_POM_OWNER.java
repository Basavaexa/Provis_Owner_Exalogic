package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ADDTRIP_POM_OWNER 
{

	public WebDriver driver;
	public ADDTRIP_POM_OWNER(WebDriver driver1)
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

	@FindBy(xpath="//span[text()='My Requests']")
	@CacheLookup
	WebElement btnMyRequest_AD;

	@FindBy(xpath="//span[text()='My Trip']")
	@CacheLookup
	WebElement MYTRIP_AD;
	
	@FindBy(xpath="//a[text()='Add Trip']")
	@CacheLookup
	WebElement AddTrip_AD;
	
	@FindBy(xpath="//div[text()='Select Community']")
	@CacheLookup
	WebElement SelectCommunity_AD;
	
	@FindBy(xpath="(//*[text()='Yas Lea'])[3]")
	@CacheLookup
	WebElement YasLea_AD;	

	@FindBy(xpath="//*[@title='Select Precinct']")
	@CacheLookup
	WebElement Precinct_AD;

	@FindBy(xpath="(//*[text()='YAS ACRES OA LEA B'])[3]")
	@CacheLookup
	WebElement YASACRESOALEAB_AD;	

	@FindBy(xpath="(//*[text()='Select Unit'])[2]")
	@CacheLookup
	WebElement UnitNumber_AD;

	@FindBy(xpath="(//*[text()='B - 027'])[4]")
	@CacheLookup
	WebElement B027_AD;
	
	@FindBy(id="start_date")
	@CacheLookup
	WebElement ExpectedStartDate_AD;
	
	@FindBy(xpath="//td[text()='20']")
	@CacheLookup
	WebElement StartDate_AD;
	
	@FindBy(id="visitor_expected_time")
	@CacheLookup
	WebElement Starttime_AD;
	
	
	@FindBy(id="end_date")
	@CacheLookup
	WebElement ExpectedEndDate_AD;
	
	@FindBy(xpath="//td[text()='20']")
	@CacheLookup
	WebElement EndDate_AD;
	
	@FindBy(id="visitor_end_time")
	@CacheLookup
	WebElement Endtime_AD;
	
	
	@FindBy(id="emg_name")
	@CacheLookup
	WebElement EmergencyContactName_AD;
	
	@FindBy(id="emg_mobile")
	@CacheLookup
	WebElement EmergencyContactNumber_AD;
	
	@FindBy(id="emrgncy_email")
	@CacheLookup
	WebElement EmergencyContactEmail_AD;
	
	@FindBy(id="emg_emirate_id")
	@CacheLookup
	WebElement EmergencyContactEmiratesId_AD;
	
	
	@FindBy(name="comment")
	@CacheLookup
	WebElement Comments_AD;
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement Submit_AD;
	
	
	
	
	
	
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

	public void clickMyRequest_AD()
	{
		btnMyRequest_AD.click();
	}

	public void clickMYTRIP_AD()
	{
		MYTRIP_AD.click();
	}
	
	public void clickAddTrip_AD()
	{
		AddTrip_AD.click();
	}
	
	
	public void clickSelectCommunity_AD()
	{
		SelectCommunity_AD.click();
		
	}	
	
	public void clickYasLea_AD()
	{
		YasLea_AD.click();
	}	
	
	public void clickPrecinct_AD()
	{
		Precinct_AD.click();
		
	}	
	
	public void clickYASACRESOALEAB_AD()
	{
		YASACRESOALEAB_AD.click();
	}	
	
	
	public void clickUnitNumber_AD()
	{
		UnitNumber_AD.click();
		
	}	
	
	public void clickB027_AD()
	{
		B027_AD.click();
	}
	
	public void clickExpectedStartDate_AD()
	{
		ExpectedStartDate_AD.click();
	}
	
	public void clickStartDate_AD()
	{
		StartDate_AD.click();
	}
	
	public void setStarttime_AD(String time)
	{
		Starttime_AD.sendKeys(time);
	}
	
	public void clickExpectedEndDate_AD()
	{
		ExpectedEndDate_AD.click();
	}
	
	public void clickEndDate_AD()
	{
		EndDate_AD.click();
	}
	
	public void setEndtime_AD(String time)
	{
		Endtime_AD.sendKeys(time);
	}
	
	public void setEmergencyContactName_AD(String name)
	{
		EmergencyContactName_AD.clear();
		EmergencyContactName_AD.sendKeys(name);
	}
	public void setEmergencyContactNumber_AD(String no)
	{
		EmergencyContactNumber_AD.sendKeys(no);
	}
	public void setEmergencyContactEmail_AD(String Email)
	{
		EmergencyContactEmail_AD.clear();
		EmergencyContactEmail_AD.sendKeys(Email);
	}
	public void setEmergencyContactEmiratesId_AD(String id)
	{
		EmergencyContactEmiratesId_AD.sendKeys(id);
	}
	public void setComments_AD(String cmt)
	{
		Comments_AD.sendKeys(cmt);
	}
		
	public void clickSubmit_AD()
	{
		Submit_AD.click();
	}
	
	
	
	
}
