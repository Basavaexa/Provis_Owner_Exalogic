package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportanIssueAgainstAnotherUnit_POM_OWNER
{

	
	public WebDriver driver;
	public ReportanIssueAgainstAnotherUnit_POM_OWNER(WebDriver driver1)
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
	

	@FindBy(xpath="//span[text()='Report An Issue']")
	@CacheLookup
	WebElement ReportanIssue_R;
	
	
	@FindBy(xpath="//div[text()='Select']/../../..")
	@CacheLookup
	WebElement SelectIssueType_R;
	
	
	@FindBy(xpath="//span[text()='Report an Issue Against Another Unit']")
	@CacheLookup
	WebElement ReportanIssueAgainstAnotherUnit_R;
	
	@FindBy(xpath="(//button[@class='btn dropdown-toggle btn-light'])[2]")
	@CacheLookup
	WebElement ComplaintCategory_R;
	
	
	@FindBy(xpath="//span[text()='Parking']")
	@CacheLookup
	WebElement Parking_R;
	
	@FindBy(xpath="//div[text()='Select Community']/../../..")
	@CacheLookup
	WebElement Community_R;
	
	@FindBy(xpath="(//span[text()='Gate & Arc'])[2]")
	@CacheLookup
	WebElement GateArc_R;
	
	
	@FindBy(xpath="//div[text()='Select Precinct']/../../..")
	@CacheLookup
	WebElement Precinct_R;
	
	@FindBy(xpath="//span[text()='The Gate']")
	@CacheLookup
	WebElement TheGate_R;
	
	@FindBy(xpath="//div[text()='Select Unit Number']/../../..")
	@CacheLookup
	WebElement UnitNumber_R;
	
	
	@FindBy(xpath="//span[text()='181']")
	@CacheLookup
	WebElement Gate106_R;
	
	@FindBy(id="file_atach")
	@CacheLookup
	WebElement image_R;

	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")
	@CacheLookup
	WebElement AdditionalNotes_R;
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement subbtn_R;
	
	
	
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

	public void clickReportanIssue_R()
	{
		ReportanIssue_R.click();
	}
	
	public void clickSelectIssueType()
	{
		SelectIssueType_R.click();
	}
	
	
	public void clickReportanIssueAgainstAnotherUnit_R()
	{
		ReportanIssueAgainstAnotherUnit_R.click();
	}
	
	
	public void clickComplaintCategory_R()
	{
		ComplaintCategory_R.click();
	}
	
	public void clickParking_R()
	{
		Parking_R.click();
	}
	
	public void clickCommunity_R()
	{
		Community_R.click();
	}
	
	public void clickGateArc_R()
	{
		GateArc_R.click();
	}
	
	public void clickPrecinct_R()
	{
		Precinct_R.click();
	}
	
	public void clickTheGate_R()
	{
		TheGate_R.click();
	}
	
	public void clickUnitNumber_R()
	{
		UnitNumber_R.click();
	}
	
	public void clickGate106_R()
	{
		Gate106_R.click();
	}
	
	
	public void setimage_R(String img)
	{
		image_R.sendKeys(img);
	}
	
	public void setAdditionalNotes_R(String text)
	{
		driver.switchTo().frame(0);
		AdditionalNotes_R.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	
	public void clicksubbtn_R()
	{
		subbtn_R.click();
	}
	
}
