package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VisitorRegistration_POM_OWNER 
{

	public WebDriver driver;
	public VisitorRegistration_POM_OWNER(WebDriver driver1)
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
	WebElement btnMyRequest_VR;

	@FindBy(xpath="//span[text()='My Services']")
	@CacheLookup
	WebElement btnMyServices_VR;

	@FindBy(xpath="//div[text()='Select category']/../../..")
	@CacheLookup
	WebElement SelectaService_VR;
	
	
	@FindBy(xpath="//span[text()='Visitor Registration']")
	@CacheLookup
	WebElement VisitorRegistration_VR;
	
	@FindBy(id="visitor_name")
	@CacheLookup
	WebElement visitorname_VR;
	
	
	@FindBy(id="visitor_mobile_no")
	@CacheLookup
	WebElement visitormobileno_VR;
	
	@FindBy(id="visitor_email")
	@CacheLookup
	WebElement visitoremail_VR;
	
	@FindBy(id="attachment")
	@CacheLookup
	WebElement attachment_VR;
	
	@FindBy(xpath="//div[text()='Select Community']")
	@CacheLookup
	WebElement SelectCommunity_VR;
	
	@FindBy(xpath="(//*[text()='Yas Lea'])[3]")
	@CacheLookup
	WebElement YasLea_VR;	

	@FindBy(xpath="//*[@title='Select Precinct']")
	@CacheLookup
	WebElement Precinct_VR;

	@FindBy(xpath="(//*[text()='YAS ACRES OA LEA B'])[3]")
	@CacheLookup
	WebElement YASACRESOALEAB_VR;	

	@FindBy(xpath="(//*[text()='Select Unit'])[2]")
	@CacheLookup
	WebElement UnitNumber_VR;

	@FindBy(xpath="(//*[text()='B - 027'])[4]")
	@CacheLookup
	WebElement B027_VR;
	
	@FindBy(id="visitor_expected_date")
	@CacheLookup
	WebElement visitorexpecteddate_VR;
	
	@FindBy(xpath="//td[text()='20']")
	@CacheLookup
	WebElement Visitordate_VR;
	
	@FindBy(id="visitor_expected_time")
	@CacheLookup
	WebElement visitorexpectedtime_VR;
	
	@FindBy(id="visitor_expected_last_date")
	@CacheLookup
	WebElement visitorexpectedlastdate_VR;
	
	@FindBy(xpath="//td[text()='24']")
	@CacheLookup
	WebElement Visitorenddate_VR;
	
	
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")
	@CacheLookup
	WebElement AdditionalNotes_VR;
	
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement submit_VR;
	
	
	
	
	
	
	
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

	public void clickMyRequest_VR()
	{
		btnMyRequest_VR.click();
	}

	public void clickMyServices_VR()
	{
		btnMyServices_VR.click();
	}

	public void clickSelectaService_VR()
	{
		SelectaService_VR.click();
	}

	public void clickVisitorRegistration_VR()
	{
		VisitorRegistration_VR.click();
	}
	
	public void setvisitorname_VR(String name)
	{
		visitorname_VR.clear();
		visitorname_VR.sendKeys(name);
	}
	
	public void setvisitormobileno_VR(String Number)
	{
		visitormobileno_VR.clear();
		visitormobileno_VR.sendKeys(Number);
	}
	
	public void setvisitoremail_VR(String email) throws InterruptedException
	{
		visitoremail_VR.clear();
		visitoremail_VR.sendKeys(email);
		Thread.sleep(2000);
	}
	
	
	public void setattachment_VR(String image) throws InterruptedException
	{
		attachment_VR.sendKeys(image);
		Thread.sleep(2000);
	}
	
	
	public void clickSelectCommunity_VR()
	{
		SelectCommunity_VR.click();
		
	}	
	
	public void clickYasLea_VR()
	{
		YasLea_VR.click();
	}	
	
	public void clickPrecinct_VR()
	{
		Precinct_VR.click();
		
	}	
	
	public void clickYASACRESOALEAB_VR()
	{
		YASACRESOALEAB_VR.click();
	}	
	
	
	public void clickUnitNumber_VR()
	{
		UnitNumber_VR.click();
		
	}	
	
	public void clickB027_VR()
	{
		B027_VR.click();
	}
	
	
	public void clickvisitorexpecteddate_VR() throws InterruptedException
	{
		visitorexpecteddate_VR.click();
		Thread.sleep(2000);
	}
	
	
	public void clickVisitordate_VR() throws InterruptedException
	{
		Visitordate_VR.click();
		Thread.sleep(2000);
	}
	
	public void setvisitorexpectedtime_VR(String TIME) throws InterruptedException
	{
		visitorexpectedtime_VR.clear();
		visitorexpectedtime_VR.sendKeys(TIME);
		Thread.sleep(2000);
	}
	
	
	public void clickvisitorexpectedlastdate_VR() throws InterruptedException
	{
		visitorexpectedlastdate_VR.click();
		Thread.sleep(2000);
	}
	
	public void clickVisitorenddate_VR() throws InterruptedException
	{
		Visitorenddate_VR.click();
		Thread.sleep(2000);
	}
	
	public void setAdditionalNotes_VR(String Text)
	{
		driver.switchTo().frame(0);
		AdditionalNotes_VR.sendKeys(Text);
		driver.switchTo().defaultContent();
	}
	
	public void clicksubmit_VR()
	{
		submit_VR.click();
	}
	
	
}
