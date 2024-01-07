package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NOCforTrafficPoliceDamagetoProperty_POM_OWNER 
{
	
	
	public WebDriver driver;
	public NOCforTrafficPoliceDamagetoProperty_POM_OWNER(WebDriver driver1)
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
	WebElement btnMyRequest_NO;

	@FindBy(xpath="//span[text()='My Services']")
	@CacheLookup
	WebElement btnMyServices_NO;

	@FindBy(xpath="//div[text()='Select category']/../../..")
	@CacheLookup
	WebElement SelectaService_NO;
	
	
	@FindBy(xpath="(//span[text()='NOC for Traffic Police Damage to Property'])[1]")
	@CacheLookup
	WebElement NOCforTraffic_NO;
	
	@FindBy(xpath="//div[text()='Select Community']")
	@CacheLookup
	WebElement SelectCommunity_NO;
	
	@FindBy(xpath="(//*[text()='Yas Lea'])[3]")
	@CacheLookup
	WebElement YasLea_NO;	

	@FindBy(xpath="//*[@title='Select Precinct']")
	@CacheLookup
	WebElement Precinct_NO;

	@FindBy(xpath="(//*[text()='YAS ACRES OA LEA B'])[3]")
	@CacheLookup
	WebElement YASACRESOALEAB_NO;	

	@FindBy(xpath="(//*[text()='Select Unit'])[2]")
	@CacheLookup
	WebElement UnitNumber_NO;

	@FindBy(xpath="(//*[text()='B - 027'])[4]")
	@CacheLookup
	WebElement B027_NO;
	
	@FindBy(id="attachment_2")
	@CacheLookup
	WebElement DrivingLicense_NO;
	
	@FindBy(id="attachment")
	@CacheLookup
	WebElement LocalAuthority_NO;
	
	
	@FindBy(id="attachment_3")
	@CacheLookup
	WebElement VehicleRegistrationCopy_NO;
	
	@FindBy(id="proofOfPayment")
	@CacheLookup
	WebElement ProofofPayment_NO;
	
	@FindBy(xpath="//*[@class='cke_editable cke_editable_themed cke_contents_ltr']")
	@CacheLookup
	WebElement Comments_NO;
	
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement Submit_NO;
	
	
	
	
	
	

	
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

	public void clickMyRequest_NO()
	{
		btnMyRequest_NO.click();
	}

	public void clickMyServices_NO()
	{
		btnMyServices_NO.click();
	}

	public void clickSelectaService_NO()
	{
		SelectaService_NO.click();
	}

	public void clickNOCforTraffic_NO()
	{
		NOCforTraffic_NO.click();
	}
	
	
	public void clickSelectCommunity_NO()
	{
		SelectCommunity_NO.click();
		
	}	
	
	public void clickYasLea_NO()
	{
		YasLea_NO.click();
	}	
	
	public void clickPrecinct_NO()
	{
		Precinct_NO.click();
		
	}	
	
	public void clickYASACRESOALEAB_NO()
	{
		YASACRESOALEAB_NO.click();
	}	
	
	
	public void clickUnitNumber_NO()
	{
		UnitNumber_NO.click();
		
	}	
	
	public void clickB027_NO()
	{
		B027_NO.click();
	}	
	
	public void setDrivingLicense_NO(String image)
	{
				DrivingLicense_NO.sendKeys(image);
	}
	
	public void setLocalAuthority_NO(String image)
	{
		LocalAuthority_NO.sendKeys(image);
	}
	
	public void setVehicleRegistrationCopy_NO(String image)
	{
		VehicleRegistrationCopy_NO.sendKeys(image);
	}
	
	public void setProofofPayment_NO(String image)
	{
		ProofofPayment_NO.sendKeys(image);
	}
	
	public void setComments_NO(String text)
	{
		driver.switchTo().frame(0);
		Comments_NO.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	
	public void clickSubmit_NO()
	{
		Submit_NO.click();
	}
	
	
	
	
	
	
	
	

}
