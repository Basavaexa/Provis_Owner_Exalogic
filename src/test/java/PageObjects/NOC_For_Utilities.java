package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;

public class NOC_For_Utilities {
	
	public WebDriver driver;
	public NOC_For_Utilities(WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	
	public void click_and_Select_the_NOC_for_utilities() {
	   driver.findElement(By.xpath("//span[text()='NOC for Utilities']")).click();
	}

	public void upload_title_deed_document(String string) {
		
		driver.findElement(By.id("title_deed")).sendKeys(string);
	}

	public void upload_ADDC_clearance_document(String string) {
		driver.findElement(By.id("addc_filename")).sendKeys(string);

		   
	}

	public void upload_owner_EID_Passport_front_copy(String string) {
		
		driver.findElement(By.id("owner_eid")).sendKeys(string);

		   
	}

	public void upload_owner_EID_Passport_back_copy(String string) {
		driver.findElement(By.id("owner_eid_back")).sendKeys(string);

		   
	}

	public void select_the_checkbox() {
	   driver.findElement(By.xpath("//label[text()='I hereby confirm that I have understood the terms and conditions mentioned herein and I agree to abide by the Community Rules.']")).click();
	}

	public void click_on_Submit_for_NFU() {
	    driver.findElement(By.id("btnsubmit")).click();
	}


	

}
