package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TenancyContractExtensionRequest_POM_OWNER 
{

	public WebDriver driver;
	public TenancyContractExtensionRequest_POM_OWNER(WebDriver driver1)
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
	WebElement btnMyRequest_TC;

	@FindBy(xpath="//span[text()='My Services']")
	@CacheLookup
	WebElement btnMyServices_TC;

	@FindBy(xpath="//div[text()='Select category']/../../..")
	@CacheLookup
	WebElement SelectaService_TC;
	
	
	@FindBy(xpath="(//span[text()='Tenancy Contract Extension'])[1]")
	@CacheLookup
	WebElement TenancyContractExtension_TC;
	
	
	@FindBy(id="start_date")
	@CacheLookup
	WebElement ContractStartDate_TC;
	
	@FindBy(xpath="//td[text()='18']")
	@CacheLookup
	WebElement SDate_TC;
	
	@FindBy(id="end_date")
	@CacheLookup
	WebElement ContractEndDate_TC;
	
	@FindBy(xpath="//td[text()='20']")
	@CacheLookup
	WebElement EDate_TC;
	
	@FindBy(id="attachment2")
	@CacheLookup
	WebElement TawtheeqContract_TC;
	
	@FindBy(id="attachment")
	@CacheLookup
	WebElement TenancyContract_TC;
	
	@FindBy(xpath="//label[text()='I hereby confirm that I have understood the terms and conditions mentioned herein and I agree to abide by the Community Rules.']")
	@CacheLookup
	WebElement Termsandconditions_TC;
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement Submit_TC;
	
	
	
	
	
	
	
	
	
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

	public void clickMyRequest_TC()
	{
		btnMyRequest_TC.click();
	}

	public void clickMyServices_TC()
	{
		btnMyServices_TC.click();
	}

	public void clickSelectaService_TC()
	{
		SelectaService_TC.click();
	}

	public void clickTenancyContractExtension_TC()
	{
		TenancyContractExtension_TC.click();
	}
	
	public void clickContractStartDate_TC()
	{
		ContractStartDate_TC.click();
	}
	
	public void clickSDate_TC()
	{
		SDate_TC.click();
	}
	
	public void clickContractEndDate_TC()
	{
		ContractEndDate_TC.click();
	}
	
	public void clickEDate_TC()
	{
		EDate_TC.click();
	}
	
	public void setTawtheeqContract_TC(String image)
	{
		
		TawtheeqContract_TC.sendKeys(image);
	}

	public void setTenancyContract_TC(String image)
	{
		
		TenancyContract_TC.sendKeys(image);
	}

	public void clickTermsandconditions_TC()
	{
		Termsandconditions_TC.click();
	}
	
	public void clickSubmit_TC()
	{
		Submit_TC.click();
	}
	
	
	
	
	
	
}
