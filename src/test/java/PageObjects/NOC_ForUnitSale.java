package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;

public class NOC_ForUnitSale {
	
	public WebDriver driver;
	public NOC_ForUnitSale(WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	
	@Then("Select NOC for unit sale SR")
	public void select_NOC_for_unit_sale_web() {
	    driver.findElement(By.xpath("//span[text()='NOC for Unit Sale']")).click();
	}

	public void click_and_select_the_community_DD() throws InterruptedException {
	    driver.findElement(By.xpath("//div[text()='Select Community']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"prevDue\"]/div/div/div/div/div/div[1]/div[1]/div/div/div/div[2]/ul/li[2]/a/span")).click();


	}

	public void click_and_select_the_precinct_DD() {
		driver.findElement(By.xpath("//div[text()='Select Precinct']")).click();
	    driver.findElement(By.xpath("//span[text()='The Gate']")).click();

	}

	public void click_and_select_the_Unit_DD() {
		driver.findElement(By.xpath("//div[text()='Select Unit']")).click();
	    driver.findElement(By.xpath("//span[text()='Gate - T3 - 1804']")).click();

	}

	public void enter_Buyer_name() {
	   driver.findElement(By.id("buyer_name")).sendKeys("Basava");
	}

	public void enter_Buyer_Contact_number() {
		   driver.findElement(By.id("buyer_phone")).sendKeys("500000000");

	}

	public void enter_buyer_email() {
		   driver.findElement(By.id("buyer_email")).sendKeys("vest@gmail.com");

	}

	public void upload_ADDC_Certificate() throws InterruptedException {
		driver.findElement(By.id("addc-cert")).sendKeys("C:\\Users\\Basavaraj\\Downloads\\AAAAAA.pdf");
		     //driver.findElement(By.xpath("//*[@id=\"form_submit_owner\"]/div[3]/div/div/div[4]/div/label")).sendKeys("C:\\Users\\Basavaraj\\Downloads\\AAAAAA.pdf");
		    // sendKeys("C:\\Users\\Basavaraj\\OneDrive - Exalogic Consulting\\Desktop\\Screenshot_1.png");

	}

	public void upload_Under_taking_to_transfer_utilities() {
		driver.findElement(By.id("transfer-ut")).sendKeys("C:\\Users\\Basavaraj\\Downloads\\AAAAAA.pdf");

	}

	public void upload_buyer_passport_front_side_copy() {
		driver.findElement(By.id("buyer-pass")).sendKeys("C:\\Users\\Basavaraj\\Downloads\\AAAAAA.pdf");

	}

	public void upload_buyer_passport_back_side_copy() {
		driver.findElement(By.id("buyer-pass-back")).sendKeys("C:\\Users\\Basavaraj\\Downloads\\AAAAAA.pdf");

	}

	public void upload_seller_passport_front_side_copy() {
		driver.findElement(By.id("seller-pass")).sendKeys("C:\\Users\\Basavaraj\\Downloads\\AAAAAA.pdf");

	}

	public void upload_seller_passport_back_side_copy() {
		driver.findElement(By.id("seller-pass-back")).sendKeys("C:\\Users\\Basavaraj\\Downloads\\AAAAAA.pdf");

	}

	public void upload_title_deed() {
		driver.findElement(By.id("title-deed")).sendKeys("C:\\Users\\Basavaraj\\Downloads\\AAAAAA.pdf");

	}

	public void upload_MOU() {
		driver.findElement(By.id("mou-doc")).sendKeys("C:\\Users\\Basavaraj\\Downloads\\AAAAAA.pdf");

	}

	public void upload_buyer_information_sheet() {
		driver.findElement(By.id("buyer-info")).sendKeys("C:\\Users\\Basavaraj\\Downloads\\AAAAAA.pdf");

	}

	public void uplaod_assignment_of_service_charge_seller() {
		driver.findElement(By.id("assign-service")).sendKeys("C:\\Users\\Basavaraj\\Downloads\\AAAAAA.pdf");

	}

	public void upload_District_cooling_clearance() {
		driver.findElement(By.id("district-col")).sendKeys("C:\\Users\\Basavaraj\\Downloads\\AAAAAA.pdf");

	}

	public void upload_Gas_clearance() {
		driver.findElement(By.id("gas-clearance")).sendKeys("C:\\Users\\Basavaraj\\Downloads\\AAAAAA.pdf");

	}

	public void upload_Undertaking_to_pay_service_charges() {
		driver.findElement(By.id("ser-form")).sendKeys("C:\\Users\\Basavaraj\\Downloads\\AAAAAA.pdf");

	}

	public void check_the_checkbox() {
	   driver.findElement(By.xpath("//label[text()='I hereby confirm that I have understood the terms and conditions mentioned herein and I agree to abide by the Community Rules.']")).click();
	}

	public void click_on_submit_and_pay_to_proceed() {
	    driver.findElement(By.id("btnsubmit")).click();
	}

	
	

}
