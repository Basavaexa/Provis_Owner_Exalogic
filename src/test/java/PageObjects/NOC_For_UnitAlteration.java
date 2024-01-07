package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;

public class NOC_For_UnitAlteration {

	public WebDriver driver;
	public NOC_For_UnitAlteration(WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}



	public void select_NOC_for_unit_alteration() {
		driver.findElement(By.xpath("//span[text()='NOC for Unit Alteration']")).click();
	}



	public void click_and_select_the_community() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Select Community']")).click();
		driver.findElement(By.xpath("(//span[text()='Gate & Arc'])[2]")).click();
	}

	public void click_and_select_the_precinct() {
		driver.findElement(By.xpath("//div[text()='Select Precinct']")).click();
		driver.findElement(By.xpath("//span[text()='The Gate']")).click();
	}

	public void click_and_select_the_Unit() {
		driver.findElement(By.xpath("//div[text()='Select Unit']")).click();
		driver.findElement(By.xpath("//span[text()='Gate - T3 - 1804']")).click();
	}



	public void enter_Type_of_alteration(String string) {
		driver.findElement(By.id("type_of_alterations")).sendKeys(string);
	}

	public void enter_Name_of_contractor(String string) {
		driver.findElement(By.id("cName")).sendKeys(string);

	}

	public void enter_Contact_person_name(String string) {
		driver.findElement(By.id("cContactPname")).sendKeys(string);

	}

	public void enter_Contact_pereson_number(String string) {
		driver.findElement(By.id("cContactPnumber")).sendKeys(string);

	}

	public void enter_email_Address(String string) {
		driver.findElement(By.id("cContactPEMail")).sendKeys(string);

	}

	public void enter_consultant_name(String string) {
		driver.findElement(By.id("cContactCname")).sendKeys(string);

	}

	public void upload_Architecture_layout(String string) {
		driver.findElement(By.id("attachment")).sendKeys(string);

	}

	public void uploads_Trade_liscence_of_appointed_contractor(String string) {
		driver.findElement(By.id("attachment_2")).sendKeys(string);

	}

	public void enter_the_Additional_note(String string) {



		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys(string);

		driver.switchTo().defaultContent();


	}

	public void click_on_submit() {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}



}
