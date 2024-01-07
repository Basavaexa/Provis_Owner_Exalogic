package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoveOutRequest_POM_OWNER 
{

	public WebDriver driver;
	public MoveOutRequest_POM_OWNER(WebDriver driver1)
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
	WebElement btnMyRequest_MO;

	@FindBy(xpath="//span[text()='My Services']")
	@CacheLookup
	WebElement btnMyServices_MO;

	@FindBy(xpath="//div[text()='Select category']/../../..")
	@CacheLookup
	WebElement SelectaService_MO;
	
	
	@FindBy(xpath="(//span[text()='Move-out Request'])[1]")
	@CacheLookup
	WebElement MoveoutRequest_MO;
	
	@FindBy(xpath="//div[text()='Select Community']")
	@CacheLookup
	WebElement SelectCommunity_MO;
	
	@FindBy(xpath="(//*[text()='Yas Lea'])[3]")
	@CacheLookup
	WebElement YasLea_MO;	

	@FindBy(xpath="//*[@title='Select Precinct']")
	@CacheLookup
	WebElement Precinct_MO;

	@FindBy(xpath="(//*[text()='YAS ACRES OA LEA B'])[3]")
	@CacheLookup
	WebElement YASACRESOALEAB_MO;	

	@FindBy(xpath="(//*[text()='Select Unit'])[2]")
	@CacheLookup
	WebElement UnitNumber_MO;

	@FindBy(xpath="(//*[text()='B - 027'])[4]")
	@CacheLookup
	WebElement B027_MO;
	
	@FindBy(name="reasons_for_leaving")
	@CacheLookup
	WebElement reasonsforleaving_MO;
	
	
	@FindBy(id="movingOutTo")
	@CacheLookup
	WebElement movingOutTo_MO;
	
		

	@FindBy(id="furniture_moveout_date")
	@CacheLookup
	WebElement furnituremoveoutdate_MO;
	
	
	@FindBy(xpath="(//td[text()='28'])[2]")
	@CacheLookup
	WebElement moveoutdate_MO;
	
	
	@FindBy(name="furniture_time")
	@CacheLookup
	WebElement Preferredtime_MO;
	
	
	
	@FindBy(id="preferred_date")
	@CacheLookup
	WebElement MoveoutdateKeyhandoverdate_MO;
	
	
	@FindBy(xpath="(//td[text()='29'])[2]")
	@CacheLookup
	WebElement handoverdate_MO;
	
	@FindBy(name="time")
	@CacheLookup
	WebElement Pretime_MO;
	
	@FindBy(id="addc_bill")
	@CacheLookup
	WebElement ADDCBill_MO;
	
	@FindBy(id="dc_form")
	@CacheLookup
	WebElement DistrictCooling_MO;
	
	
	@FindBy(xpath="//label[@class='accept_comm']")
	@CacheLookup
	WebElement TermsandConditions_MO;
	
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement btnSubmit_MO;
	
	
	
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

	public void clickMyRequest_MO()
	{
		btnMyRequest_MO.click();
	}

	public void clickMyServices_MO()
	{
		btnMyServices_MO.click();
	}

	public void clickSelectaService_MO()
	{
		SelectaService_MO.click();
	}

	public void clickMoveoutRequest_MO()
	{
		MoveoutRequest_MO.click();
	}
	
	
	public void clickSelectCommunity_MO()
	{
		SelectCommunity_MO.click();
		
	}	
	
	public void clickYasLea_MO()
	{
		YasLea_MO.click();
	}	
	
	public void clickPrecinct_MO()
	{
		Precinct_MO.click();
		
	}	
	
	public void clickYASACRESOALEAB_MO()
	{
		YASACRESOALEAB_MO.click();
	}	
	
	
	public void clickUnitNumber_MO()
	{
		UnitNumber_MO.click();
		
	}	
	
	public void clickB027_MO()
	{
		B027_MO.click();
	}	
	
	
	
	public void setreasonsforleaving_MO(String text)
	{
		reasonsforleaving_MO.sendKeys(text);
	}
	
	public void setmovingOutTo_MO(String text)
	{
		movingOutTo_MO.sendKeys(text);
	}
	
	public void clickfurnituremoveoutdate_MO()
	{
		furnituremoveoutdate_MO.click();
	}
	
	public void clickmoveoutdate_MO()
	{
		moveoutdate_MO.click();
	}
	
	
	public void setPreferredtime_MO(String time)
	{
		Preferredtime_MO.sendKeys(time);
	}
	
	
	
	
	public void clickMoveoutdateKeyhandoverdate_MO()
	{
		MoveoutdateKeyhandoverdate_MO.click();
	}
	
	public void clickhandoverdate_MO()
	{
		handoverdate_MO.click();
	}
	
	
	public void setPretime_MO(String text)
	{
		Pretime_MO.sendKeys(text);
	}
	
	
	public void setADDCBill_MO(String image)
	{
		ADDCBill_MO.sendKeys(image);
	}
	
	
	public void setDistrictCooling_MO(String Image)
	{
		DistrictCooling_MO.sendKeys(Image);
	}
	
	
	
	
	public void clickTermsandConditions_MO()
	{
		TermsandConditions_MO.click();
	}
	
	public void clickbtnSubmit_MO()
	{
		btnSubmit_MO.click();
	}
	
	
}

	
	
	

