package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessPassRequest_POM_OWNER 
{

	public WebDriver driver;
	public AccessPassRequest_POM_OWNER(WebDriver driver1)
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

	//My Requests
	
	@FindBy(xpath="//span[contains(text(),'My Requests')]")
	@CacheLookup
	WebElement btnMyRequest_A;
     
	//My Services
	@FindBy(xpath="//span[text()='My Services']")
	@CacheLookup
	WebElement btnMyServices_A;
    
	//Click on Select a Service drop 
	@FindBy(xpath="//div[text()='Select category']/../../..")
	@CacheLookup
	WebElement SelectaService_A;
	
	// select AccessPassRequest
	
	@FindBy(xpath="//span[text()='Access Pass Request']")
	@CacheLookup
	WebElement AccessPassRequest_A;
	
	//Select Community
	@FindBy(xpath="//button[@title='Select Community']")
	@CacheLookup
	WebElement SelectCommunity_A;
	
	@FindBy(xpath="(//span[text()='Gate & Arc'])[2]")
	@CacheLookup
	WebElement GateArc_A;
	
	// Select Precinct
	@FindBy(xpath="//button[contains(@title,'Select Precinct')]")
	@CacheLookup
	WebElement SelectPrecinct_A;
	
	@FindBy(xpath="//span[text()='The Gate']")
	@CacheLookup
	WebElement TheGate_A;
	
	//SelectUnitNumber
	@FindBy(xpath="//body/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[5]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/button[1]")
	@CacheLookup
	WebElement SelectUnitNumber_A;
	
	@FindBy(xpath="//span[text()='Ansam 1 - 104']")
	@CacheLookup
	WebElement GateT14111_A;

	@FindBy(xpath="//input[@id='number_of_card']")
	@CacheLookup
	WebElement NumberofCards_A;
	
	@FindBy(xpath="//label[@for='idCat_64']")
	@CacheLookup
	WebElement Damage_A;
	
	//Remarks
	@FindBy(xpath="//body[@class=\"cke_editable cke_editable_themed cke_contents_ltr\"]")
	@CacheLookup
	WebElement Remarks_A;
	
	//Terms and Conditions
	@FindBy(xpath="//label[@class='accept_comm']")
	@CacheLookup
	WebElement TermsandConditions_A;
	
	// Submit & Pay
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement Submit_A;
	
	
	
	
	
	
	
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

	public void clickMyRequest_A()
	{
		btnMyRequest_A.click();
	}

	public void clickMyServices_A()
	{
		btnMyServices_A.click();
	}

	public void clickSelectaService_A()
	{
		SelectaService_A.click();
	}
	
	public void clickAccessPassRequest_A()
	{
		AccessPassRequest_A.click();
	}
	
	
	public void ClickSelectCommunity_A()
	{
		SelectCommunity_A.click();
	}
	
	public void clickGateArc_A()
	{
		GateArc_A.click();
	}
	
	
	public void ClickSelectPrecinct_A()
	{
		SelectPrecinct_A.click();
	}
	
	
	public void clickTheGate_A() throws InterruptedException
	{
		TheGate_A.click();
		Thread.sleep(4000);
	}
	
	public void ClickSelectUnitNumber_A()
	{
		SelectUnitNumber_A.click();
	}
	
	public void clickGateT14111_A()
	{
		GateT14111_A.click();
	}
	
	public void Damage_A() throws InterruptedException
	{
		///Thread.sleep(2000);
		Damage_A.click();
		Thread.sleep(4000);
	}
	
	public void setNumberofCards_A(String No)
	{
		NumberofCards_A.sendKeys(No);
	}
	
	public void setRemarks_A(String Text)
	{
		driver.switchTo().frame(0);
		Remarks_A.sendKeys(Text);
		driver.switchTo().defaultContent();
	}
	
	public void ClickTermsandConditions_A()
	{
		TermsandConditions_A.click();
	}
	
	public void ClickSubmit_A() throws InterruptedException
	{
		Damage_A.click();
		Thread.sleep(4000);
		NumberofCards_A.sendKeys("2");
		
		Submit_A.click();
	}
		
	
	
	
	
}
