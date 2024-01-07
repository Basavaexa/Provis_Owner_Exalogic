package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoveinWithinBuilding_POM_OWNER 

{

	public WebDriver driver;
	public MoveinWithinBuilding_POM_OWNER(WebDriver driver1)
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
	WebElement btnMyRequest_MI;

	@FindBy(xpath="//span[text()='My Services']")
	@CacheLookup
	WebElement btnMyServices_MI;

	@FindBy(xpath="//div[text()='Select category']/../../..")
	@CacheLookup
	WebElement SelectaService_MI;

	@FindBy(xpath="//span[text()='Move-in Within Building']")
	@CacheLookup
	WebElement MoveinWithinBuilding_MI;
	
	@FindBy(xpath="//button[@title='Select Community']")
	@CacheLookup
	WebElement SelectCommunity_MI;
	
	@FindBy(xpath="//span[text()=' Al Muneera ']")
	@CacheLookup
	WebElement ALMuneera_MI;	

	@FindBy(xpath="//button[@title='Select Precinct']")
	@CacheLookup
	WebElement Precinct_MI;

	@FindBy(xpath="//span[text()='Al Maha 1']")
	@CacheLookup
	WebElement AlMaha1_MI;	

	@FindBy(xpath="//div[text()='Select Unit Number']")
	@CacheLookup
	WebElement UnitNumber_MI;

	@FindBy(xpath="//span[text()='1001']")
	@CacheLookup
	WebElement UI1001_MI;
	
	@FindBy(xpath="//a[text()='Next']")
	@CacheLookup
	WebElement Next_MI;
	
	@FindBy(id="adult")
	@CacheLookup
	WebElement Adult_MI;
	
	@FindBy(xpath="(//div[text()='Select Nationality'])[1]")
	@CacheLookup
	WebElement SelectNationality_MI;
	
	@FindBy(xpath="//span[text()=' Afghan ']")
	@CacheLookup
	WebElement Afghan_MI;
	
	@FindBy(xpath="//div[text()='Occupation of Resident 1']")
	@CacheLookup
	WebElement OccupationofResident_MI;
	
	@FindBy(xpath="//span[text()='Legal professionals']")
	@CacheLookup
	WebElement Legalprofessionals_MI;
	
	@FindBy(xpath="//a[text()='Next']")
	@CacheLookup
	WebElement Nextbtn_MI;
	
	
	@FindBy(id="emergencyName")
	@CacheLookup
	WebElement emergencyName_MI;
	
	@FindBy(id="emergencyEmail")
	@CacheLookup
	WebElement emergencyEmail_MI;
	
	@FindBy(id="emergencyNumber")
	@CacheLookup
	WebElement emergencyNumber_MI;
	
	@FindBy(xpath="(//*[text()='Select Emirate'])[2]")
	@CacheLookup
	WebElement SelectEmirate_MI;
	
	@FindBy(xpath="(//*[text()='Dubai'])[2]")
	@CacheLookup
	WebElement Dubai_MI;
	
	
	@FindBy(xpath="//a[text()='Next']")
	@CacheLookup
	WebElement BtnNext_MI;
	
	
	@FindBy(id="tsdate")
	@CacheLookup
	WebElement tsdate_MI;
	
	@FindBy(xpath="//td[text()='27']")
	@CacheLookup
	WebElement Tstdate_MI;
	
	
	@FindBy(xpath="//input[@id='tedate']")
	@CacheLookup
	WebElement tedate_MI;
	
	//@FindBy(id="tedate")
	//@CacheLookup
	//WebElement tedate;
	
	@FindBy(xpath="(//td[text()='29'])[2]")
	@CacheLookup
	WebElement Tendate_MI;
	
	@FindBy(id="date")
	@CacheLookup
	WebElement Mndate_MI;
	
	@FindBy(xpath="(//td[text()='28'])[2]")
	@CacheLookup
	WebElement Midate_MI;
	
	@FindBy(name="time")
	@CacheLookup
	WebElement TimeSlot_MI;
	
	
	
	@FindBy(xpath="//input[@id='attach0']")
	@CacheLookup
	WebElement IDProof_MI;
	
	
	@FindBy(xpath="//input[@id='agreement']")
	@CacheLookup
	WebElement AgreementCopy_MI;
	
	
	@FindBy(xpath="//label[text()=' I accept Community ']")
	@CacheLookup
	WebElement IacceptCommunity_MI;
	
	
	@FindBy(xpath="//a[text()='Submit']")
	@CacheLookup
	WebElement SubmitBtn_MI;
	
	
	
	
	
	
	
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

	public void clickMyRequest_MI()
	{
		btnMyRequest_MI.click();
	}

	public void clickMyServices_MI()
	{
		btnMyServices_MI.click();
	}

	public void clickSelectaService_MI()
	{
		SelectaService_MI.click();
	}

	public void clickMoveinWithinBuilding_MI()
	{
		MoveinWithinBuilding_MI.click();
	}
	
	public void clickSelectCommunity_MI()
	{
		SelectCommunity_MI.click();
		SelectCommunity_MI.click();
	}	
	
	public void clickALMuneera_MI()
	{
		ALMuneera_MI.click();
	}	
	
	public void clickPrecinct_MI()
	{
		Precinct_MI.click();
		Precinct_MI.click();
	}	
	
	public void clickAlMaha1_MI()
	{
		AlMaha1_MI.click();
	}	
	
	
	public void clickUnitNumber_MI()
	{
		UnitNumber_MI.click();
		UnitNumber_MI.click();
	}	
	
	public void clickUI1001_MI()
	{
		UI1001_MI.click();
	}	
	
	
	public void clickNext_MI()
	{
		Next_MI.click();
	}	
	
	
	public void setAdult_MI(String text)
	{
		Adult_MI.sendKeys(text);
	}
	
	public void clickSelectNationality_MI()
	{
		SelectNationality_MI.click();
		SelectNationality_MI.click();
	}
	
	public void clickAfghan_MI()
	{
		Afghan_MI.click();
	}
	
	public void clickOccupationofResident_MI()
	{
		OccupationofResident_MI.click();
		OccupationofResident_MI.click();
	}
	
	public void clickLegalprofessionals_MI()
	{
		Legalprofessionals_MI.click();
	}
	
	
	public void clickNextbtn_MI()
	{
		Nextbtn_MI.click();
	}
	
	
	public void setemergencyName_MI(String Name)
	{
		emergencyName_MI.sendKeys(Name);
	}
	
	public void setemergencyEmail_MI(String Email)
	{
		emergencyEmail_MI.sendKeys(Email);
	}
	
	public void setemergencyNumber_MI(String Number)
	{
		emergencyNumber_MI.sendKeys(Number);
	}
	
	public void clickSelectEmirate_MI()
	{
		SelectEmirate_MI.click();
		SelectEmirate_MI.click();
	}
	
	
	public void clickDubai_MI()
	{
		Dubai_MI.click();
	}
	
	public void clickBtnNext_MI()
	{
		BtnNext_MI.click();
	}
	
	
	public void clicktsdate_MI()
	{
		tsdate_MI.click();
	}
	
	public void clickTstdate_MI()
	{
		Tstdate_MI.click();
	}
	
	
	public void clicktedate_MI()
	{
		tedate_MI.click();
	}
	
	public void clickTendate_MI()
	{
		Tendate_MI.click();
	}
	
	
	public void clickMndate_MI()
	{
		Mndate_MI.click();
	}
	
	public void clickMidate_MI()
	{
		Midate_MI.click();
	}
	
	public void setTimeSlot_MI(String string)
	{
		TimeSlot_MI.sendKeys(string);
	}
	
	
	public void setIDProof_MI(String file)
	{
		//Actions a=new Actions(driver);
		//a.scrollToElement(IDProof);
		//Actions a=new Actions(driver);  
		//a.moveToElement(IDProof);
		IDProof_MI.sendKeys(file);
	}
	
	
	public void setAgreementCopy_MI(String string)
	{
		//Actions a=new Actions(driver);
		//a.scrollToElement(AgreementCopy);
		AgreementCopy_MI.sendKeys(string);
	}
	
	
	public void clickIacceptCommunity_MI()
	{
		IacceptCommunity_MI.click();
	}
	
	public void clickSubmitBtn_MI()
	{
		SubmitBtn_MI.click();
	}
	
	
}

	
