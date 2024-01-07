package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassesOffering_POM_OWNER

{

	public WebDriver driver;
	public ClassesOffering_POM_OWNER (WebDriver driver1)
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
	

	@FindBy(xpath="//span[text()='My Community']")
	@CacheLookup
	WebElement MyCommunity_C;
	
	@FindBy(xpath="//span[text()='Al Muneera']")
	@CacheLookup
	WebElement AlMuneera_C;
	
	@FindBy(xpath="(//a[text()='Classes & Offering'])[5]")
	@CacheLookup
	WebElement ClassesOffering_C;
	
	@FindBy(xpath="(//a[text()='Book Now'])[4]")
	@CacheLookup
	WebElement BookNow_C;
	
	@FindBy(xpath="//label[@for='id_package0']")
	@CacheLookup
	WebElement SelectYourPackage_C;
	
	@FindBy(xpath="//label[@for='id_schedule0']")
	@CacheLookup
	WebElement SelectYourSchedule_C;
	
	@FindBy(id="id_unit")
	@CacheLookup
	WebElement UnitNumber_C;
	
	@FindBy(xpath="//option[contains(@value,'12660')]")
	@CacheLookup
	WebElement SelectUnit_C;
	
	@FindBy(id="applicant_name0")
	@CacheLookup
	WebElement ApplicantName_C;
	
	@FindBy(id="applicant_age0")
	@CacheLookup
	WebElement ApplicantAge_C;
     
	@FindBy(xpath="//label[@for='tnc_assest']")
	@CacheLookup
	WebElement TermsConditions_C;
	
	@FindBy(id="submit")
	@CacheLookup
	WebElement PayBook_C;
	
	@FindBy(id="creditCardNumber")
	@CacheLookup
	WebElement CardNumber_C;
	
	
	@FindBy(id="expiryMonthCreditCard")
	@CacheLookup
	WebElement ExpiryMonth_C;
	
	
	@FindBy(xpath="//option[text()='Dec (12)']")
	@CacheLookup
	WebElement Month_C;
	
	@FindBy(id="expiryYearCreditCard")
	@CacheLookup
	WebElement ExpiryYear_C;
	
	
	@FindBy(xpath="//option[text()='2029']")
	@CacheLookup
	WebElement Year_C;
	
	@FindBy(id="CVVNumberCreditCard")
	@CacheLookup
	WebElement Cvv_C;
	
	@FindBy(xpath="//span[text()='Make Payment']")
	@CacheLookup
	WebElement MakePayment_C;
	
	
	@FindBy(xpath="//input[@type='submit']")
	@CacheLookup
	WebElement Submitbtn_C;
	
	@FindBy(xpath="//a[@class='btn btn-primary mt-2 mt-md-0']")
	@CacheLookup
	WebElement Downloadreceipt_C;
	
	
	@FindBy(id="icon")
	@CacheLookup
	WebElement DownloadArrow_C;
	
	
	
	
	
	
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

	public void clickMyCommunity_C()
	{
		MyCommunity_C.click();
	}
	
	
	public void clickAlMuneera_C()
	{
		AlMuneera_C.click();
	}
	
	public void clickClassesOffering_C()
	{
		ClassesOffering_C.click();
	}
	
	public void clickBookNow_C()
	{
		BookNow_C.click();
	}
	
	public void clickSelectYourPackage_C()
	{
		SelectYourPackage_C.click();
	}

	public void clickSelectYourSchedule_C()
	{
		SelectYourSchedule_C.click();
	}
	
	public void clickUnitNumber_C()
	{
		UnitNumber_C.click();
	}
	
	public void clickSelectUnit_C()
	{
		SelectUnit_C.click();
	}
	
	
	public void setApplicantName_C(String name)
	{
		ApplicantName_C.sendKeys(name);
	}
	
	public void setApplicantAge_C(String age)
	{
		ApplicantAge_C.sendKeys(age);
	}
	
	public void clickPayBook_C()
	{
		PayBook_C.click();
	}
	
	
	public void clickTermsConditions_C()
	{
		TermsConditions_C.click();
	}
	
	public void setCardNumber_C(String cardno)
	{
		CardNumber_C.sendKeys(cardno);
	}
	
	public void clickExpiryMonth_C()
	{
		ExpiryMonth_C.click();
	}
	
	public void clickMonth_C()
	{
		Month_C.click();
	}
	
	public void clickExpiryYear_C()
	{
		ExpiryYear_C.click();
	}
	
	public void clickYear_C()
	{
		Year_C.click();
	}
	
	public void setCvv_C(String cvv)
	{
		Cvv_C.sendKeys(cvv);
	}
	
	public void clickMakePayment_C() throws InterruptedException
	{
		MakePayment_C.click();
		Thread.sleep(4000);
	}
	
	public void clickSubmitbtn_C()
	{
		Submitbtn_C.click();
	}
	
	public void clickDownloadreceipt_C()
	{
		Downloadreceipt_C.click();
	}
	
	public void clickDownloadArrow_C()
	{
		String tab = driver.getWindowHandle();
		//driver.switchTo().window(tab);
		//driver.findElement(By.xpath());
       DownloadArrow_C.click();
	}
	
	
	
	
}
