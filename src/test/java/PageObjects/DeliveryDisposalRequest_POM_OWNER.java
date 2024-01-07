package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryDisposalRequest_POM_OWNER 

{

	public WebDriver driver;
	public DeliveryDisposalRequest_POM_OWNER(WebDriver driver1)
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
	WebElement btnMyRequest_D;

	@FindBy(xpath="//span[text()='My Services']")
	@CacheLookup
	WebElement btnMyServices_D;

	@FindBy(xpath="//div[text()='Select category']/../../..")
	@CacheLookup
	WebElement SelectaService_D;
	
	@FindBy(xpath="//span[text()='Delivery/Disposal Request']")
	@CacheLookup
	WebElement Delivery_D;
	
	@FindBy(xpath="//div[text()='Select Community']/../../..")
	@CacheLookup
	WebElement Community_D;

	@FindBy(xpath="(//span[text()='Sun & Sky'])[2]")
	@CacheLookup
	WebElement SunSky_D;	

	@FindBy(xpath="//div[text()='Select Precinct']")
	@CacheLookup
	WebElement Precinct_D;

	@FindBy(xpath="//span[text()='Sky Residential']")
	@CacheLookup
	WebElement SkyResidential_D;	

	@FindBy(xpath="//button[@title='Select Unit']")
	@CacheLookup
	WebElement UnitNumber_D;

	@FindBy(xpath="//span[text()='Sky Unit-41-01']")
	@CacheLookup
	WebElement SkyUnit4101_D;
	
	@FindBy(xpath="//*[@id=\"formid\"]/div[2]/div[1]/div[4]/div/div/button")
	@CacheLookup
	WebElement TypeofRequest_D;
	
	@FindBy(xpath="//span[text()=' Delivery ']")
	@CacheLookup
	WebElement Deliveryoption_D;
	
	@FindBy(name="number_of_items")
	@CacheLookup
	WebElement numberofitems_D;
	
	@FindBy(xpath="//body[@class=\"cke_editable cke_editable_themed cke_contents_ltr\"]")
	@CacheLookup
	WebElement ItemsDescription_D;
	
	@FindBy(id="disposal_date")
	@CacheLookup
	WebElement disposaldate_D;
	
	@FindBy(xpath="(//td[text()='2'])[2]")
	@CacheLookup
	WebElement disdate_D;
	
	@FindBy(name="company_name")
	@CacheLookup
	WebElement ContactPersonName_D;
	
	@FindBy(id="alteration_contact_number")
	@CacheLookup
	WebElement ContactPersonNumber_D;
	
	@FindBy(id="btnsubmit")
	@CacheLookup
	WebElement Submitbtn_D;
	
	
	
	
	
	
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

	public void clickMyRequest_D()
	{
		btnMyRequest_D.click();
	}

	public void clickMyServices_D()
	{
		btnMyServices_D.click();
	}

	public void clickSelectaService_D()
	{
		SelectaService_D.click();
	}

	public void clickDeliveryDisposalRequest_D()
	{
		Delivery_D.click();
	} 
	
	public void ClickCommunity_D()
	{
		Community_D.click();
	}	

	public void ClickSunSky_D()
	{
		SunSky_D.click();
	}	

	public void ClickPrecinct_D()
	{
		Precinct_D.click();
		
		
	}

	public void ClickSkyResidential_D()
	{
		SkyResidential_D.click();
	}

	public void ClickTypeofRequest_D()
	{
		TypeofRequest_D.click();
	}

	public void ClickDeliveryoption_D()
	{
		Deliveryoption_D.click();
	}
	
	public void ClickUnitNumber_D()
	{
		UnitNumber_D.click();
	}

	public void ClickSkyUnit4101_D()
	{
		SkyUnit4101_D.click();
	}
	

	public void setClicknumberofitems_D(String string)
	{
		numberofitems_D.sendKeys(string);
	}
	
	
	public void setContactPersonName_D(String Name) 
	{
		ContactPersonName_D.sendKeys(Name);
	}
	
	public void Clickdisposaldate_D() throws InterruptedException
	{
		disposaldate_D.click();
		Thread.sleep(2000);
		disdate_D.click();
	}
	
	/*public void Clickdisdate_D()
	{
		disdate_D.click();
	}
	*/
	
	public void ItemsDescription_D(String text) 
	{
		driver.switchTo().frame(0);
		ItemsDescription_D.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	public void setContactPersonNumber_D(String mobileno) 
	{
		ContactPersonNumber_D.sendKeys(mobileno);
	}
	
	public void ClickSubmitbtn_D()
	{
		Submitbtn_D.click();
	}
	
	
	
	
}	
	
	

