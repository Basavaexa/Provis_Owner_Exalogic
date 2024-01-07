package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoveInRequest_Pom_OWNER 
{

	public WebDriver driver;
	public MoveInRequest_Pom_OWNER(WebDriver driver1)
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
	WebElement btnMyRequest_M;

	@FindBy(xpath="//span[text()='My Services']")
	@CacheLookup
	WebElement btnMyServices_M;

	@FindBy(xpath="//div[text()='Select category']/../../..")
	@CacheLookup
	WebElement SelectaService_M;

	@FindBy(xpath="//span[text()='Move-in Request']")
	@CacheLookup
	WebElement MoveinRequest_M;

	@FindBy(xpath="//div[text()='Select Community']")
	@CacheLookup
	WebElement SelectCommunity_M;

	@FindBy(xpath="(//span[text()='Sun & Sky'])[2]")
	@CacheLookup
	WebElement SunSky_M;	

	@FindBy(xpath="//div[text()='Select Precinct']")
	@CacheLookup
	WebElement Precinct_M;

	@FindBy(xpath="//span[text()='Sky Residential']")
	@CacheLookup
	WebElement SkyResidential_M;	

	@FindBy(xpath="//div[text()='Select Unit Number']")
	@CacheLookup
	WebElement UnitNumber_M;

	@FindBy(xpath="//span[text()='Sky Unit-41-01']")
	@CacheLookup
	WebElement SkyUnit4101_M;

	@FindBy(xpath="//a[text()='Next']")
	@CacheLookup
	WebElement Next_M;


	@FindBy(id="contract-0")
	@CacheLookup
	WebElement ElectricityWaterReceipt_M;

	@FindBy(id="contract-cr")
	@CacheLookup
	WebElement DistrictCoolingReceipt_M;

	@FindBy(xpath="//a[text()='Next']")
	@CacheLookup
	WebElement NextD_M;


	@FindBy(id="adult")
	@CacheLookup
	WebElement Adult_M;


	@FindBy(xpath="//a[text()='Next']")
	@CacheLookup
	WebElement Nextbtn_M;

	@FindBy(xpath="//a[text()='Next']")
	@CacheLookup
	WebElement BtnNextE_M;


	@FindBy(id="date")
	@CacheLookup
	WebElement Mndate_M;

	@FindBy(xpath="(//td[text()='30'])[2]")
	@CacheLookup
	WebElement Midate_M;

	@FindBy(name="time")
	@CacheLookup
	WebElement TimeSlot_M;



	@FindBy(xpath="//input[@id='attach0']")
	@CacheLookup
	WebElement IDProof_M;




	@FindBy(xpath="//label[@for='tnc']")
	@CacheLookup
	WebElement IacceptCommunity_M;


	@FindBy(xpath="//a[text()='Submit']")
	@CacheLookup
	WebElement SubmitBtn_M;







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

	public void clickMyRequest_M()
	{
		btnMyRequest_M.click();
	}

	public void clickMyServices_M()
	{
		btnMyServices_M.click();
	}

	public void clickSelectaService_M()
	{
		SelectaService_M.click();
	}

	public void clickMoveinRequest_M()
	{
		MoveinRequest_M.click();
	}

	public void clickSelectCommunity_M()
	{

		SelectCommunity_M.click();
	}	

	public void clickSunSky_M()
	{
		SunSky_M.click();
	}	

	public void clickPrecinct_M()
	{
		Precinct_M.click();

	}	

	public void clickSkyResidential_M()
	{
		SkyResidential_M.click();
	}	


	public void clickUnitNumber_M()
	{
		UnitNumber_M.click();

	}	

	public void clickSkyUnit4101_M()
	{
		SkyUnit4101_M.click();
	}	


	public void clickNext_M()
	{
		Next_M.click();
	}	

	public void setElectricityWaterReceipt_M(String string)
	{
		ElectricityWaterReceipt_M.sendKeys(string);
	}

	public void setDistrictCoolingReceipt_M(String string)
	{
		DistrictCoolingReceipt_M.sendKeys(string);
	}


	public void clickNextD_M()
	{
		NextD_M.click();
	}	


	public void setAdult_M(String text)
	{
		Adult_M.sendKeys(text);
	}

	public void clickNextbtn_M()
	{
		Nextbtn_M.click();
	}


	public void clickBtnNextF_M() throws InterruptedException
	{
		SelectaService_M.click();
		Thread.sleep(2000);
		SelectaService_M.click();
		Thread.sleep(4000);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,1000)");
		
		Actions a=new Actions(driver);
		a.moveToElement(BtnNextE_M);
		
		Thread.sleep(2000);
		BtnNextE_M.click();
	}



	public void clickMndate_M()
	{
		Mndate_M.click();
	}

	public void clickMidate_M()
	{
		Midate_M.click();
	}

	public void setTimeSlot_M(String string)
	{
		TimeSlot_M.sendKeys(string);
	}


	public void setIDProof_M(String file)
	{
		//Actions a=new Actions(driver);
		//a.scrollToElement(IDProof);
		//Actions a=new Actions(driver);  
		//a.moveToElement(IDProof);
		IDProof_M.sendKeys(file);
	}


	public void clickIacceptCommunity_M()
	{
		IacceptCommunity_M.click();
	}

	public void clickSubmitBtn_M()
	{
		SubmitBtn_M.click();
	}

}
