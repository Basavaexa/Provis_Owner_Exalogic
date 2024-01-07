package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportanIssueinCommonArea_POM_OWNER 
{

	
	public WebDriver driver;
	public ReportanIssueinCommonArea_POM_OWNER (WebDriver driver1)
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
	WebElement ReportanIssu_COM;
	
	
	@FindBy(xpath="//div[text()='Select']/../../..")
	@CacheLookup
	WebElement SelectIssueTyp_COM;
	
	
	@FindBy(xpath="//span[text()='Report an Issue in Common Area']")
	@CacheLookup
	WebElement ReportanIssueinCommonArea_COM;
	
	
	@FindBy(xpath="//*[text()='Select Community']")
	@CacheLookup
	WebElement Community_COM;
	
	@FindBy(xpath="(//*[text()='Gate & Arc'])[3]")
	@CacheLookup
	WebElement GateArc_COM;
	
	@FindBy(xpath="(//button[@class='btn dropdown-toggle bs-placeholder btn-light'])[3]")
	@CacheLookup
	WebElement Precinct_COM;
	
	
	@FindBy(xpath="//span[text()='Arc Retail']")
	@CacheLookup
	WebElement ArcRetail_COM;
	
	@FindBy(xpath="//div[text()='Select Floor']/../../..")
	@CacheLookup
	WebElement Floor_COM;
	
	
	@FindBy(xpath="//span[text()='Retail - 02 - Ground Floor']")
	@CacheLookup
	WebElement Retail02_COM;
	
	@FindBy(xpath="//div[text()='Select Common Area']/../../..")
	@CacheLookup
	WebElement CommonArea_COM;
	
	
	@FindBy(xpath="//span[text()='Pizza Express']")
	@CacheLookup
	WebElement PizzaExpress_COM;
	
	@FindBy(id="asset_name")
	@CacheLookup
	WebElement AssetName_COM;
	
	@FindBy(id="file_atach")
	@CacheLookup
	WebElement Photo_COM;
	
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")
	@CacheLookup
	WebElement Notes_COM;
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement btnsub_COM;
	
	
	
	
	
	
	
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

	public void clickReportanIssu_COM()
	{
		ReportanIssu_COM.click();
	}
	
	public void clickSelectIssueTyp_COM()
	{
		SelectIssueTyp_COM.click();
	}
	
	
	public void clickReportanIssueinCommonArea_COM()
	{
		ReportanIssueinCommonArea_COM.click();
	}
	
	public void clickCommunity_COM()
	{
		Community_COM.click();
	}
	
	
	public void clickGateArc_COM()
	{
		GateArc_COM.click();
	}
	
	
	public void clickPrecinct_COM()
	{
		Precinct_COM.click();
	}
	
	public void clickArcRetail_COM()
	{
		ArcRetail_COM.click();
	}
	
	public void clickFloor_COM()
	{
		Floor_COM.click();
	}
	
	public void clickRetail02_COM()
	{
		Retail02_COM.click();
	}
	
	public void clickCommonArea_COM()
	{
		CommonArea_COM.click();
	}
	

	public void clickPizzaExpress_COM()
	{
		PizzaExpress_COM.click();
	}
	
	public void setAssetName_COM(String password)
	{
		AssetName_COM.sendKeys(password);
	}
	
	public void clickAssetName_COM()
	{
		AssetName_COM.click();
	}
	
	public void setPhoto_COM(String img)
	{
		
		Photo_COM.sendKeys(img);
	}
	
	public void setNotes_COM(String text)
	{
		driver.switchTo().frame(0);
		Notes_COM.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	public void clickbtnsub_COM()
	{
		btnsub_COM.click();
	}
	
}
	
	
	
