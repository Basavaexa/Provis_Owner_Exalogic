package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUnit_POM_OWNER 
{

	public WebDriver driver;
	public AddUnit_POM_OWNER(WebDriver driver1)
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
	WebElement btnMyRequest_ADD;

	@FindBy(xpath="//span[text()='My Services']")
	@CacheLookup
	WebElement btnMyServices_ADD;

	@FindBy(xpath="//div[text()='Select category']/../../..")
	@CacheLookup
	WebElement SelectaService_ADD;
	
	@FindBy(xpath="//span[text()='Add Unit']")
	@CacheLookup
	WebElement AddUnit_ADD;
	
	@FindBy(xpath = "//label[contains(@for,'tenUser')]")
	@CacheLookup
	WebElement RadioButton_ADD;
	
	@FindBy(xpath="//a[text()='Next']")
	@CacheLookup
	WebElement btnNext_ADD;

	@FindBy(xpath="(//button[contains(@data-id,'OMcommunity')])[1]")
	@CacheLookup
	WebElement SelectCommunity_ADD;
	
	@FindBy(xpath="//span[text()=' Al Bandar ']")
	@CacheLookup
	WebElement AlBandar_ADD;
	
	@FindBy(xpath="(//button[contains(@title,'Select Precinct')])[1]")
	@CacheLookup
	WebElement SelectPrecinct_ADD;
	
	@FindBy(xpath="(//span[text()='Al Barza'])[1]")
	@CacheLookup
	WebElement AlBarza_ADD;
	
	@FindBy(xpath="(//button[contains(@title,'Select Unit Number')])[1]")
	@CacheLookup
	WebElement SelectUnitNumber_ADD;
	
	@FindBy(xpath="(//span[text()='Al Barza - 1 - 01'])[1]")
	@CacheLookup
	WebElement AlBarza101_ADD;
	
	@FindBy(xpath="//a[text()='Next']")
	@CacheLookup
	WebElement btnNextU_ADD;
	

	@FindBy(id="name1")
	@CacheLookup
	WebElement RName_ADD;

	@FindBy(id="contactNo")
	@CacheLookup
	WebElement ContactNumber_ADD;

	@FindBy(id="email1")
	@CacheLookup
	WebElement EmailAddress_ADD;
	
	@FindBy(xpath="(//div[@class='filter-option-inner-inner'])[7]")
	@CacheLookup
	WebElement Nationality_ADD;
	
	@FindBy(xpath="//span[text()=' Afghan ']")
	@CacheLookup
	WebElement Afghan_ADD;
	
	@FindBy(xpath="(//div[@class='filter-option-inner-inner'])[8]")
	@CacheLookup
	WebElement btnOccupation_ADD;
	
	@FindBy(xpath="//span[text()='Legal professionals']")
	@CacheLookup
	WebElement Legal_ADD;
	
	@FindBy(xpath="//a[text()='Next']")
	@CacheLookup
	WebElement btnNextR_ADD;
	
	@FindBy(id="tsdate")
	@CacheLookup
	WebElement TenancyStartDate_ADD;

	@FindBy(xpath="//td[text()='22']")
	@CacheLookup
	WebElement TSDate_ADD;
	
	@FindBy(id="tedate")
	@CacheLookup
	WebElement TenancyEndDate_ADD;

	@FindBy(xpath="(//td[text()='7'])[2]")
	@CacheLookup
	WebElement TEDate_ADD;
	
	@FindBy(xpath="//input[@id='attach0']")
	@CacheLookup
	WebElement IDProof_ADD;
	
	
	@FindBy(xpath="//input[@id='agreement']")
	@CacheLookup
	WebElement ContractCopy_ADD;
	
	
	@FindBy(xpath="//*[@id=\"form-total-p-4\"]/div/div[3]/div")
	@CacheLookup
	WebElement IacceptCommunity_ADD;
	
	@FindBy(xpath="//a[text()='Submit']")
	@CacheLookup
	WebElement btnSubmit_ADD;
	
	
	
	
	
	
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

	public void clickMyRequest_ADD()
	{
		btnMyRequest_ADD.click();
	}

	public void clickMyServices_ADD()
	{
		btnMyServices_ADD.click();
	}

	public void clickSelectaService_ADD()
	{
		SelectaService_ADD.click();
	}
	
	public void clickAddUnit_ADD()
	{
		AddUnit_ADD.click();
	}

	public void clickRadioButton_ADD()
	{
		RadioButton_ADD.click();
	}
	
	public void clickbtnNext_ADD()
	{
		btnNext_ADD.click();
	}
	
	public void clickSelectCommunity_ADD()
	{
		SelectCommunity_ADD.click();
		SelectCommunity_ADD.click();
	}
	
	public void clickAlBandar_ADD()
	{
		AlBandar_ADD.click();
	}
	
	public void clickSelectPrecinct_ADD()
	{
		SelectPrecinct_ADD.click();
		SelectPrecinct_ADD.click();
	}
	
	public void clickAlBarza_ADD()
	{
		AlBarza_ADD.click();
	}
	
	public void clickSelectUnitNumber_ADD()
	{
		SelectUnitNumber_ADD.click();
		SelectUnitNumber_ADD.click();
	}
	
	public void clickAlBarza101_ADD()
	{
		AlBarza101_ADD.click();
	}
	
	public void clickbtnNextU_ADD()
	{
		btnNextU_ADD.click();
	}
	
	public void setRName_ADD(String Name) 
	{
		RName_ADD.clear();
		RName_ADD.sendKeys(Name);
	}

	public void setContactNumber_ADD(String Mobileno )
	{
		ContactNumber_ADD.clear();
		ContactNumber_ADD.sendKeys(Mobileno);
	}

	public void setEmailAddress_ADD(String VEmail)
	{
		EmailAddress_ADD.clear();
		EmailAddress_ADD.sendKeys(VEmail);
	}
	
	
	public void clickNationality_ADD()
	{
		Nationality_ADD.click();
		Nationality_ADD.click();
	}
	
	public void clickAfghan_ADD()
	{
		Afghan_ADD.click();
		//Afghan_ADD.click();
	}
	
	
	
	public void clickbtnOccupation_ADD()
	{
		btnOccupation_ADD.click();
		btnOccupation_ADD.click();
	}
	
	public void clickLegal_ADD() throws InterruptedException
	{
		Legal_ADD.click();
		Legal_ADD.click();
		
	}
	
	public void clickbtnNextR_ADD()
	{
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true);", btnNextR_ADD);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,1000)");		
				
		//Actions a=new Actions(driver);
		//a.scrollToElement(Next);
		btnNextR_ADD.click();
	}
	
	public void clickTenancyStartDate_ADD()
	{
		TenancyStartDate_ADD.click();
	}
	
	public void clickTSDate_ADD()
	{
		TSDate_ADD.click();
	}
	
	public void clickTenancyEndDate_ADD()
	{
		TenancyEndDate_ADD.click();
	}
	
	public void clickTEDate_ADD() 
	{
		TEDate_ADD.click();
	}
	
	public void setIDProof_ADD(String Image)
	{
		//Actions a=new Actions(driver);
		//a.scrollToElement(IDProof);
		IDProof_ADD.sendKeys(Image);
	}	
	
	public void setContractCopy_ADD(String Image) throws InterruptedException
	{
		ContractCopy_ADD.sendKeys(Image);
	   //Thread.sleep(5000);
	   //Actions a=new Actions(driver);
	   
	   //a.scrollToElement(ContractCopy);
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()=' Upload Contract / Agreement Copy ']")));
	   
		
//		File f=new File("C:\\Users\\Suvendu\\Downloads\\images.png");
//	   String absolute = f.getAbsolutePath();
//		ContractCopy.sendKeys(absolute);
	}	
		
	public void clickIacceptCommunity_ADD()
	{
		IacceptCommunity_ADD.click();
	}
	
	
	public void clickbtnSubmit_ADD()
	{
		btnSubmit_ADD.click();
	}	
	
}
