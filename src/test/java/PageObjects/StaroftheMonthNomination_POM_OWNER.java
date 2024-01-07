package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaroftheMonthNomination_POM_OWNER 
{

	public WebDriver driver;
	public StaroftheMonthNomination_POM_OWNER(WebDriver driver1)
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
	WebElement MyCommunity_S;
	

	@FindBy(xpath="//span[text()='Al Muneera']")
	@CacheLookup
	WebElement AlMuneera_S;
	
	
	@FindBy(xpath="(//a[text()='Star Of The Month Nomination'])[5]")
	@CacheLookup
	WebElement StaroftheMonthNomination_S;
	

	@FindBy(id="employee")
	@CacheLookup
	WebElement Employee_S;
	
	
	@FindBy(xpath="//button[@class='btn dropdown-toggle btn-light bs-placeholder']")
	@CacheLookup
	WebElement Department_S;
	
	@FindBy(xpath="//span[text()='Administration']")
	@CacheLookup
	WebElement Administration_S;
	
	
	@FindBy(xpath="//*[@class='cke_editable cke_editable_themed cke_contents_ltr']")
	@CacheLookup
	WebElement ReasonforNomination_S;
	
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement submitt_button_S;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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

	public void clickMyCommunity_S()
	{
		MyCommunity_S.click();
	}
	
	
	public void clickAlMuneera_S()
	{
		AlMuneera_S.click();
	}
	
	public void clickStaroftheMonthNomination_S()
	{
		StaroftheMonthNomination_S.click();
	}
	
	public void setEmployee_S(String text)
	{
		
		Employee_S.sendKeys(text);
	}
	
	public void clickDepartment_S()
	{
		Department_S.click();
	}
	
	public void clickAdministration_S()
	{
		Administration_S.click();
	}
	
	
	public void setReasonforNomination_S(String text)
	{
		driver.switchTo().frame(0);
		ReasonforNomination_S.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	
	public void clicksubmitt_button_S()
	{
		submitt_button_S.click();
	}
	
}
