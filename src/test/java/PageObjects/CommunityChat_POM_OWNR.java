package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommunityChat_POM_OWNR
{

	public WebDriver driver;
	public CommunityChat_POM_OWNR(WebDriver driver1)
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
	WebElement MyCommunity_CC;
	

	@FindBy(xpath="//span[text()='Al Muneera']")
	@CacheLookup
	WebElement AlMuneera_CC;
	
	@FindBy(xpath="(//a[text()='Community Chat'])[5]")
	@CacheLookup
	WebElement CommunityChat_CC;
	
	@FindBy(xpath="//a[contains(text(),'Create Community Post')]")
	@CacheLookup
	WebElement CreateCommunityPost_CC;
	
	@FindBy(name="topic")
	@CacheLookup
	WebElement Title_CC;

	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")
	@CacheLookup
	WebElement Description_CC;
	
	
	@FindBy(id="video_url")
	@CacheLookup
	WebElement videourl_CC;
	
	@FindBy(id="inputImage")
	@CacheLookup
	WebElement UploadImage_CC;
	
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement SaveButton_CC;

	
	
	
	
	
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

	public void clickMyCommunity_CC()
	{
		MyCommunity_CC.click();
	}
	
	
	public void clickAlMuneera_CC()
	{
		AlMuneera_CC.click();
	}
	
	public void clickCommunityChat_CC()
	{
		CommunityChat_CC.click();
	}
	
	public void clickCreateCommunityPost_CC()
	{
		CreateCommunityPost_CC.click();
	}
	
	public void setTitle_CC(String text)
	{
		Title_CC.sendKeys(text);
	}
	
	public void setDescription_CC(String text)
	{
		driver.switchTo().frame(0);
		Description_CC.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	public void setvideourl_CC(String url)
	{
		videourl_CC.sendKeys(url);
	}
	
	public void setUploadImage_CC(String pic)
	{
		UploadImage_CC.sendKeys(pic);
	}
	
	public void clickSaveButton_CC()
	{
		SaveButton_CC.click();
	}
	
	
}

	

