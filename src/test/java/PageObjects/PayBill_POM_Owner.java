package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBill_POM_Owner 
{

	public WebDriver driver;
	public PayBill_POM_Owner(WebDriver driver1)
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
	
	@FindBy(xpath="//span[text()='My Finances']")
	@CacheLookup
	WebElement MyFinances_F;
	
	@FindBy(xpath="//span[text()='Account Summary']")
	@CacheLookup
	WebElement AccountSummary_F;
	
	@FindBy(xpath="(//a[@class='btn btn-secondary-outline btn-block'])[1]")
	@CacheLookup
	WebElement Pay_F;
	
	@FindBy(xpath="//div[text()='Select Community']")
	@CacheLookup
	WebElement SelectCommunity_F;
	
	@FindBy(xpath="//span[text()='Golf Garden ']")
	@CacheLookup
	WebElement GolfGarden_F;	

	@FindBy(xpath="//*[@title='Select Precinct Name']")
	@CacheLookup
	WebElement Precinct_F;

	@FindBy(xpath="(//*[text()='Golf Gardens'])[2]")
	@CacheLookup
	WebElement GolfGardens_F;	

	@FindBy(xpath="(//*[text()='Select Unit Name'])[2]")
	@CacheLookup
	WebElement UnitNumber_F;

	@FindBy(xpath="(//*[text()='C - 017'])[4]")
	@CacheLookup
	WebElement C017_F;
	
	@FindBy(id="btn_pay_all")
	@CacheLookup
	WebElement PayAll_F;
	
	
	@FindBy(xpath="//*[text()='Other Payment Mode ']")
	@CacheLookup
	WebElement OtherPaymentMode_F;
	
	
	@FindBy(xpath="(//*[@class='btn dropdown-toggle btn-light bs-placeholder'])[1]")
	@CacheLookup
	WebElement SelectPaymentMode_F;
	
	@FindBy(xpath="(//*[text()='Service payment by cheque'])[2]")
	@CacheLookup
	WebElement paymentbycheque_F;
	
	@FindBy(id="account_no")
	@CacheLookup
	WebElement AccountNo_F;
	
	@FindBy(id="bank_name")
	@CacheLookup
	WebElement BabkName_F;
	
	@FindBy(id="chq_no")
	@CacheLookup
	WebElement ChequeNo_F;
	
	@FindBy(id="chequePhoto")
	@CacheLookup
	WebElement  PaymentProof_F;
	
	
	@FindBy(xpath="//*[@class='cke_editable cke_editable_themed cke_contents_ltr']")
	@CacheLookup
	WebElement Remarks_F;
	
	
	@FindBy(xpath="//*[text()='With Shipping ']")
	@CacheLookup
	WebElement WithShipping_F;
	
	@FindBy(id="shipment_date")
	@CacheLookup
	WebElement PickupDate_F;
	
	@FindBy(xpath="//*[text()='20']")
	@CacheLookup
	WebElement Date_F;
	
	
	@FindBy(xpath="//*[@class='accept_comm']")
	@CacheLookup
	WebElement  TermsandConditions_F;
	

	@FindBy(id="btnsbmt")
	@CacheLookup
	WebElement Submit_F;
	
	
	
	
	
	
	
	
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

	public void clickMyFinances_F()
	{
		MyFinances_F.click();
	}
	
	public void clickAccountSummary_F()
	{
		AccountSummary_F.click();
	}
	
	
	public void clickPay_F()
	{
		Pay_F.click();
	}
	
	public void clickSelectCommunity_F()
	{
		SelectCommunity_F.click();
	}
	
	
	public void clickGolfGarden_F()
	{
		GolfGarden_F.click();
	}
	
	public void clickPrecinct_F()
	{
		Precinct_F.click();
	}
	
	
	public void clickGolfGardens_F()
	{
		GolfGardens_F.click();
	}
	
	public void clickUnitNumber_F()
	{
		UnitNumber_F.click();
	}
	
	
	public void clickC017_F()
	{
		C017_F.click();
	}
	
	
	public void clickPayAll_F()
	{
		PayAll_F.click();
	}
	
	public void clickOtherPaymentMode_F()
	{
		OtherPaymentMode_F.click();
	}
	
	
	public void clickSelectPaymentMode_F()
	{
		OtherPaymentMode_F.click();
	}
	
	
	public void clickpaymentbycheque_F()
	{
		paymentbycheque_F.click();
	}
	
	public void setAccountNo_F(String AccountNo)
	{
		AccountNo_F.clear();
		AccountNo_F.sendKeys(AccountNo);
	}

	public void setBabkName_F(String BankName)
	{
		BabkName_F.clear();
		BabkName_F.sendKeys(BankName);
	}
	
	public void setChequeNo_F(String ChequeNo)
	{
		ChequeNo_F.clear();
		ChequeNo_F.sendKeys(ChequeNo);
	}
	
	public void setPaymentProof_F(String img)
	{
		PaymentProof_F.clear();
		PaymentProof_F.sendKeys(img);
	}
	
	public void setRemarks_F(String text)
	{
		driver.switchTo().frame(0);
		Remarks_F.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	public void clickWithShipping_F()
	{
		WithShipping_F.click();
	}
	
	public void clickPickupDate_F()
	{
		PickupDate_F.click();
	}
	
	public void clickDate_F()
	{
		Date_F.click();
	}
	
	public void clickTermsandConditions_F()
	{
		TermsandConditions_F.click();
	}
	
	public void clickSubmit_F()
	{
		Submit_F.click();
	}
	
	
	
}
