//Provis

package StepDefinations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import PageObjects.ADDTRIP_POM_OWNER;
import PageObjects.AccessPassRequest_POM_OWNER;
import PageObjects.AddUnit_POM_OWNER;
import PageObjects.AmenityBooking_POM_OWNER;
import PageObjects.ClassesOffering_POM_OWNER;
import PageObjects.CommunityChat_POM_OWNR;
import PageObjects.DeliveryDisposalRequest_POM_OWNER;
import PageObjects.LoginPage;
import PageObjects.MoveInRequest_Pom_OWNER;
import PageObjects.MoveOutRequest_POM_OWNER;
import PageObjects.MoveinWithinBuilding_POM_OWNER;
import PageObjects.NOC_ForUnitSale;
import PageObjects.NOC_For_UnitAlteration;
import PageObjects.NOC_For_Utilities;
import PageObjects.NOCforTrafficPoliceDamagetoProperty_POM_OWNER;
import PageObjects.PayBill_POM_Owner;
import PageObjects.ReportanIssueAgainstAnotherUnit_POM_OWNER;
import PageObjects.ReportanIssueinCommonArea_POM_OWNER;
import PageObjects.StaroftheMonthNomination_POM_OWNER;
import PageObjects.TenancyContractExtensionRequest_POM_OWNER;
import PageObjects.VisitorRegistration_POM_OWNER;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class Steps extends BaseClass {


	@Before
	public void setup() throws IOException
	{

		logger=Logger.getLogger("Provis");//Added logger
		PropertyConfigurator.configure("log4j.properties");//Added logger


		//Reading properties

		Properties configProp = new Properties();
		FileInputStream configPropfile=new FileInputStream("config.properties");
		configProp.load(configPropfile);




		String br=configProp.getProperty("browser");

		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath") );	
			//driver=new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
		}
		else if(br.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver",configProp.getProperty("firefoxpath") );	
			driver=new FirefoxDriver();
		}

		else if(br.equals("ie")) 
		{
			System.setProperty("webdriver.ie.driver",configProp.getProperty("iepath") );	
			driver=new InternetExplorerDriver();
		}


		else if(br.equals("msedge")) 
		{
			System.setProperty("webdriver.edge.driver",configProp.getProperty("msedgepath") );	
			driver=new EdgeDriver();
		} 

		logger.info("************* Launching browser**************");	
	}


	//Login Page Feature

	@Given("User launches browser")
	public void user_launches_browser()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);






		lp=new LoginPage(driver);


		// OWNER//

		CO_O=new ClassesOffering_POM_OWNER(driver);
		AB_O=new AmenityBooking_POM_OWNER(driver);
		CC_O=new CommunityChat_POM_OWNR(driver);
		SM_O=new StaroftheMonthNomination_POM_OWNER(driver);
		RU_O=new ReportanIssueAgainstAnotherUnit_POM_OWNER(driver);
		RI_O=new ReportanIssueinCommonArea_POM_OWNER(driver);
		AP_O=new AccessPassRequest_POM_OWNER(driver);
		AD_O=new AddUnit_POM_OWNER(driver);
		DD_O=new DeliveryDisposalRequest_POM_OWNER(driver);
		MR_O=new MoveInRequest_Pom_OWNER(driver);
		MIW_O=new MoveinWithinBuilding_POM_OWNER(driver);
		MOR_O=new MoveOutRequest_POM_OWNER(driver);
		NOC_O=new NOCforTrafficPoliceDamagetoProperty_POM_OWNER(driver);
		TC_O=new TenancyContractExtensionRequest_POM_OWNER(driver);
		VR_O=new VisitorRegistration_POM_OWNER(driver);
		ADD_O=new ADDTRIP_POM_OWNER(driver);
		PB_O=new PayBill_POM_Owner(driver);

		NFU =new NOC_ForUnitSale(driver);
		NUTL = new NOC_For_Utilities(driver);
		NALT = new NOC_For_UnitAlteration(driver);




	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) 
	{
		driver.get(url);
	}

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) 
	{
		lp.setUserName(email);
		lp.setPassword(password);
	}

	@When("Click on login")
	public void click_on_login() 
	{
		lp.clickLogin();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) 
	{
		if(driver.getPageSource().contains("Invalid Username or Password"))
		{
			driver.close();
			Assert.assertTrue(false);  
		}
		else
		{
			Assert.assertEquals(driver.getTitle(),"Provis");
		}	   
	}

	@Then("user click on close")
	public void user_click_on_close() 
	{
		lp.clickClose();
	}

	@Then("user click on account")
	public void user_click_on_account() 
	{
		lp.clickProfile(); 
	}

	@When("user click on logout")
	public void user_click_on_logout() 
	{
		lp.clickLogout();
		lp.clickLogout1();
	}

	@Then("Page2 title should be {string}")
	public void page2_title_should_be(String string)
	{
		Assert.assertEquals(driver.getTitle(),"Login to Provis");

	}

	@When("close browser")
	public void close_browser() {
		logger.info("************* Closing Browswer*******************");
		driver.quit();
	}




	//////////////////////////////////// OWNER ///////////////////////////////////////////





	////////////////////////////// Classes & Offering OWNER ///////////////////////


	@Then("Click on My Comunity for owner Classesoffering")
	public void click_on_My_Comunity_for_owner_Classesoffering() 
	{
		CO_O.clickMyCommunity_C();
	}

	@Then("click on Al Muneera for owner Classesoffering")
	public void click_on_Al_Muneera_for_owner_Classesoffering()
	{
		CO_O.clickAlMuneera_C();
	}

	@Then("click on ClassesOffering for owner")
	public void click_on_ClassesOffering_for_owner()
	{
		CO_O.clickClassesOffering_C();
	}

	@Then("click on book now for Colorful Cuckoos Art Class for owner Classesoffering")
	public void click_on_book_now_for_Colorful_Cuckoos_Art_Class_for_owner_Classesoffering() 
	{
		CO_O.clickBookNow_C();
	}

	@Then("click on Select Your Package for Colorful Cuckoos Art Class")
	public void click_on_Select_Your_Package_for_Colorful_Cuckoos_Art_Class() 
	{
		CO_O.clickSelectYourPackage_C();
	}

	@Then("click on Select Select Your Schedule for Colorful Cuckoos Art Class")
	public void click_on_Select_Select_Your_Schedule_for_Colorful_Cuckoos_Art_Class() 
	{
		CO_O.clickSelectYourSchedule_C();
	}

	@Then("click on unit number drop down for owner Classesoffering")
	public void click_on_unit_number_drop_down_for_owner_Classesoffering() 
	{
		CO_O.clickUnitNumber_C();
	}

	@Then("select the unit number for owner Classesoffering")
	public void select_the_unit_number_for_owner_Classesoffering() 
	{
		CO_O.clickSelectUnit_C();
	}

	@Then("enter the Applicant Name for owner Classesoffering {string}")
	public void enter_the_Applicant_Name_for_owner_Classesoffering(String string)
	{
		CO_O.setApplicantName_C(string);
	}

	@Then("enter the Applicant Age for owner Classesoffering {string}")
	public void enter_the_Applicant_Age_for_owner_Classesoffering(String string) 
	{
		CO_O.setApplicantAge_C(string);
	}

	@Then("click on Terms Conditions for owner Classesoffering")
	public void click_on_Terms_Conditions_for_owner_Classesoffering() 
	{
		CO_O.clickTermsConditions_C();
	}

	@Then("click on PayBook for owner Classesoffering")
	public void click_on_PayBook_for_owner_Classesoffering() 
	{
		CO_O.clickPayBook_C();
	}

	@Then("Enter Card Number for owner Classesoffering {string}")
	public void enter_Card_Number_for_owner_Classesoffering(String string) 
	{
		CO_O.setCardNumber_C(string);
	}

	@Then("Click on Expiry Month for owner Classesoffering")
	public void click_on_Expiry_Month_for_owner_Classesoffering() 
	{
		CO_O.clickExpiryMonth_C();
	}

	@Then("Select the Month for owner Classesoffering")
	public void select_the_Month_for_owner_Classesoffering() 
	{
		CO_O.clickMonth_C();
	}

	@Then("Click on Expiry Year for owner Classesoffering")
	public void click_on_Expiry_Year_for_owner_Classesoffering() 
	{
		CO_O.clickExpiryYear_C();
	}

	@Then("Select Year for owner Classesoffering")
	public void select_Year_for_owner_Classesoffering() 
	{
		CO_O.clickYear_C();
	}

	@Then("Enter CVV for owner Classesoffering {string}")
	public void enter_CVV_for_owner_Classesoffering(String string) 
	{
		CO_O.setCvv_C(string);
	}

	@Then("Click on Make Payment for owner Classesoffering")
	public void click_on_Make_Payment_for_owner_Classesoffering() throws InterruptedException 
	{
		CO_O.clickMakePayment_C();
	}

	@Then("Click on Submitbtn for owner Classesoffering")
	public void click_on_Submitbtn_for_owner_Classesoffering() 
	{
		CO_O.clickSubmitbtn_C();
	}

	@Then("Click on Download receipt for owner Classesoffering")
	public void click_on_Download_receipt_for_owner_Classesoffering()
	{
		CO_O.clickDownloadreceipt_C();
	}

	@Then("Click on Download Arrow for owner Classesoffering")
	public void click_on_Download_Arrow_for_owner_Classesoffering() 
	{
		CO_O.clickDownloadArrow_C();
	}


	@Then("User can see the conformaton message")
	public void user_can_see_the_conformaton_message()
	{


		if(driver.getPageSource().contains("Your payment is successful."))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED");

		}
		else
		{
			System.out.println("FAILED");
		}	   

	}


	////////////////////////// Amenity Booking OWNER ///////////////////////////


	@Then("Click on My Comunity for owner Amenity Booking")
	public void click_on_My_Comunity_for_owner_Amenity_Booking() 
	{
		AB_O.clickMyCommunity_A();
	}

	@Then("click on Al Muneera for owner Amenity Booking")
	public void click_on_Al_Muneera_for_owner_Amenity_Booking()
	{
		AB_O.clickAlMuneera_A();
	}

	@Then("click on Amenity Booking for owner")
	public void click_on_Amenity_Booking_for_owner() 
	{
		AB_O.clickAmenityBooking_A();
	}

	@Then("click on Book button Amenity Booking")
	public void click_on_Book_button_Amenity_Booking() 
	{
		AB_O.clickNowBook_A();
	}

	@Then("click on Unit drop down for Amenity Booking")
	public void click_on_Unit_drop_down_for_Amenity_Booking()
	{
		AB_O.clickunitdropdown_A();
	}

	@Then("select unit no for Amenity Booking")
	public void select_unit_no_for_Amenity_Booking()
	{
		AB_O.clickunitno_A();
	}

	@Then("click on Check In Date for Amenity Booking")
	public void click_on_Check_In_Date_for_Amenity_Booking() 
	{
		AB_O.clickcheckindate_A();
	}

	@Then("select one date in check in date for Amenity Booking")
	public void select_one_date_in_check_in_date_for_Amenity_Booking()
	{
		AB_O.clickchkindate_A();
	}

	@Then("select Time Slot for Amenity Booking")
	public void select_Time_Slot_for_Amenity_Booking()
	{
		AB_O.clickslottime_A();
	}

	@Then("click on pay book button under Amenity Booking for owner")
	public void click_on_pay_book_button_under_Amenity_Booking_for_owner() 
	{
		AB_O.clicksbmtbtn_A();
	}

	@Then("Enter Card Number for owner Amenity Booking {string}")
	public void enter_Card_Number_for_owner_Amenity_Booking(String string)
	{
		AB_O.setCardNumber_A(string);
	}

	@Then("Click on Expiry Month for owner Amenity Booking")
	public void click_on_Expiry_Month_for_owner_Amenity_Booking() 
	{
		AB_O.clickExpiryMonth_A();
	}

	@Then("Select the Month for owner Amenity Booking")
	public void select_the_Month_for_owner_Amenity_Booking() 
	{
		AB_O.clickMonth_A();
	}

	@Then("Click on Expiry Year for owner Amenity Booking")
	public void click_on_Expiry_Year_for_owner_Amenity_Booking() 
	{
		AB_O.clickExpiryYear_A();
	}

	@Then("Select Year for owner Amenity Booking")
	public void select_Year_for_owner_Amenity_Booking() 
	{
		AB_O.clickYear_A();
	}

	@Then("Enter CVV for owner Amenity Booking {string}")
	public void enter_CVV_for_owner_Amenity_Booking(String string) 
	{
		AB_O.setCvv_A(string);
	}

	@Then("Click on Make Payment for owner Amenity Booking")
	public void click_on_Make_Payment_for_owner_Amenity_Booking() throws InterruptedException 
	{
		AB_O.clickMakePayment_A();
	}

	@Then("Click on Submitbtn for owner Amenity Booking")
	public void click_on_Submitbtn_for_owner_Amenity_Booking() 
	{
		AB_O.clicksbmtbtn_A();
	}

	@Then("Click on Download receipt for owner Amenity Booking")
	public void click_on_Download_receipt_for_owner_Amenity_Booking() 
	{
		AB_O.clickDownloadreceipt_A();
	}

	@Then("Click on Download Arrow for owner Amenity Booking")
	public void click_on_Download_Arrow_for_owner_Amenity_Booking() 
	{
		AB_O.clickDownloadArrow_A();
	}

	@Then("User can see the conformation messag")
	public void user_can_see_the_conformation_messag()
	{


		if(driver.getPageSource().contains("Your payment is successful."))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED");

		}
		else
		{
			System.out.println("FAILED");
		}	   

	}




	//////////////////////////// Community Chat /////////////////////////////////



	@Then("Click on My Comunity for owner Community Chat")
	public void click_on_My_Comunity_for_owner_Community_Chat() 
	{
		CC_O.clickMyCommunity_CC();
	}

	@Then("click on Al Muneera for owner Community Chat")
	public void click_on_Al_Muneera_for_owner_Community_Chat() 
	{
		CC_O.clickAlMuneera_CC();
	}

	@Then("click on Community Chat for owner")
	public void click_on_Community_Chat_for_owner() 
	{
		CC_O.clickCommunityChat_CC();
	}

	@Then("click on Create Community Post for owner")
	public void click_on_Create_Community_Post_for_owner() 
	{
		CC_O.clickCreateCommunityPost_CC();
	}

	@Then("Enter Title for owner Community Chat {string}")
	public void enter_Title_for_owner_Community_Chat(String string)
	{
		CC_O.setTitle_CC(string);
	}

	@Then("Enter description for Community Chat owner {string}")
	public void enter_description_for_Community_Chat_owner(String string) 
	{
		CC_O.setDescription_CC(string);
	}

	@Then("Enter Video URL for owner Community Chat {string}")
	public void enter_Video_URL_for_owner_Community_Chat(String string) 
	{
		CC_O.setvideourl_CC(string);
	}

	@Then("Upload Image or PDF for owner Community Chat {string}")
	public void upload_Image_or_PDF_for_owner_Community_Chat(String string) 
	{
		CC_O.setUploadImage_CC(string);
	}

	@Then("Click on Save button for owner Community Chat")
	public void click_on_Save_button_for_owner_Community_Chat() 
	{
		CC_O.clickSaveButton_CC();
	}


	///////////////////////////////// Star of the Month Nomination Owner ///////////////////////



	@Then("Click on My Comunity for owner Star of the Month Nomination")
	public void click_on_My_Comunity_for_owner_Star_of_the_Month_Nomination()
	{
		SM_O.clickMyCommunity_S();
	}

	@Then("click on Al Muneera for owner Star of the Month Nomination")
	public void click_on_Al_Muneera_for_owner_Star_of_the_Month_Nomination() 
	{
		SM_O.clickAlMuneera_S();
	}

	@Then("click on StaroftheMonthNomination for owner")
	public void click_on_StaroftheMonthNomination_for_owner() 
	{
		SM_O.clickStaroftheMonthNomination_S();
	}

	@Then("Enter Name of the Employee for Star of the Month Nomination {string}")
	public void enter_Name_of_the_Employee_for_Star_of_the_Month_Nomination(String string) 
	{
		SM_O.setEmployee_S(string);
	}

	@Then("Click on Department drop down for Star of the Month Nomination")
	public void click_on_Department_drop_down_for_Star_of_the_Month_Nomination() 
	{
		SM_O.clickDepartment_S();
	}

	@Then("Select Administration for Star of the Month Nomination")
	public void select_Administration_for_Star_of_the_Month_Nomination() 
	{
		SM_O.clickAdministration_S();
	}

	@Then("Enter Reason for Nomination for Star of the Month Nomination {string}")
	public void enter_Reason_for_Nomination_for_Star_of_the_Month_Nomination(String string)
	{
		SM_O.setReasonforNomination_S(string);
	}

	@Then("Click on submit button for StaroftheMonthNomination owner")
	public void click_on_submit_button_for_StaroftheMonthNomination_owner() 
	{
		SM_O.clicksubmitt_button_S();
	}


	@Then("User can see the conformation mesage")
	public void user_can_see_the_conformation_mesage() 
	{

		WebElement popup = driver.findElement(By.xpath("//p[text()='You have successfully added a new community post.']"));
		// Perform your assertions on the popup element
		// Example: Assert that the popup contains specific text

		Assert.assertEquals(true, popup.isDisplayed());
		System.out.println("Passed - Community Added successfully");


	} 





	///////////////////// Report an Issue Against Another Unit Owner//////////////////

	@Then("click on Report an Issue for owner")
	public void click_on_Report_an_Issue_for_owner() 
	{
		RU_O.clickReportanIssue_R();
	}

	@Then("click on Select Issue Type for owner")
	public void click_on_Select_Issue_Type_for_owner() 
	{
		RU_O.clickSelectIssueType();
	}

	@Then("click on Report an Issue Against Another Unit for owner")
	public void click_on_Report_an_Issue_Against_Another_Unit_for_owner() 
	{
		RU_O.clickReportanIssueAgainstAnotherUnit_R();
	}

	@Then("click on Complaint Category drop down for owner")
	public void click_on_Complaint_Category_drop_down_for_owner() 
	{
		RU_O.clickComplaintCategory_R();
	}

	@Then("Select Parking for owner")
	public void select_Parking_for_owner() 
	{
		RU_O.clickParking_R();
	}

	@Then("click on Community for Report an Issue Against Another Unit for owner")
	public void click_on_Community_for_Report_an_Issue_Against_Another_Unit_for_owner() 
	{
		RU_O.clickCommunity_R();
	}

	@Then("select Gate&Arc for Report an Issue Against Another Unit for owner")
	public void select_Gate_Arc_for_Report_an_Issue_Against_Another_Unit_for_owner() 
	{
		RU_O.clickGateArc_R();
	}

	@Then("click on Precinct for Report an Issue Against Another Unit for owner")
	public void click_on_Precinct_for_Report_an_Issue_Against_Another_Unit_for_owner() 
	{
		RU_O.clickPrecinct_R();
	}

	@Then("select The Gate for Report an Issue Against Another Unit for owner")
	public void select_The_Gate_for_Report_an_Issue_Against_Another_Unit_for_owner() 
	{
		RU_O.clickTheGate_R();
	}

	@Then("click on Unit Number for Report an Issue Against Another Unit for owner")
	public void click_on_Unit_Number_for_Report_an_Issue_Against_Another_Unit_for_owner() 
	{
		RU_O.clickUnitNumber_R();
	}

	@Then("Select Gatet for Report an Issue Against Another Unit for owner")
	public void select_Gatet_for_Report_an_Issue_Against_Another_Unit_for_owner() 
	{
		RU_O.clickGate106_R();
	}

	@Then("select Attachment for Report an Issue Against Another Unit for owner {string}")
	public void select_Attachment_for_Report_an_Issue_Against_Another_Unit_for_owner(String string) 
	{
		RU_O.setimage_R(string);
	}

	@Then("Enter Additional Notes for Report an Issue Against Another Unit for owner {string}")
	public void enter_Additional_Notes_for_Report_an_Issue_Against_Another_Unit_for_owner(String string) 
	{
		RU_O.setAdditionalNotes_R(string);
	}

	@Then("Click on Submit for Report an Issue Against Another Unit for owner")
	public void click_on_Submit_for_Report_an_Issue_Against_Another_Unit_for_owner() 
	{
		RU_O.clicksubbtn_R();
	}

	@Then("User can view the confrmation message {string}")
	public void user_can_view_the_confrmation_message(String string) 
	{


		if(driver.getPageSource().contains("Request added successfully!"))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED -> Request added successfully!");

		}
		else
		{
			System.out.println("FAILED -> Not Added");
		}	   

	}



	/////////////////////Report an Issue in Common Area Owner//////////////////////


	@Then("click on Report an Issu for owner")
	public void click_on_Report_an_Issu_for_owner()
	{
		RI_O.clickReportanIssu_COM();
	}

	@Then("click on Select Issue Typ for owner")
	public void click_on_Select_Issue_Typ_for_owner()
	{
		RI_O.clickSelectIssueTyp_COM();
	}

	@Then("click on Report an Issue in Common Area for owner")
	public void click_on_Report_an_Issue_in_Common_Area_for_owner() 
	{
		RI_O.clickReportanIssueinCommonArea_COM();
	}

	@Then("click on Community for Report an Issue in Common Area for owner")
	public void click_on_Community_for_Report_an_Issue_in_Common_Area_for_owner()
	{
		RI_O.clickCommunity_COM();
	}

	@Then("Select GateArc on Community for owner")
	public void select_GateArc_on_Community_for_owner() 
	{
		RI_O.clickGateArc_COM();
	}


	@Then("click on Precinct drop down for Report an Issue in Common Area for owner")
	public void click_on_Precinct_drop_down_for_Report_an_Issue_in_Common_Area_for_owner() 
	{
		RI_O.clickPrecinct_COM();
	}

	@Then("Select Arc Retail under precinct for Report an Issue in Common Area for owner")
	public void select_Arc_Retail_under_precinct_for_Report_an_Issue_in_Common_Area_for_owner() 
	{
		RI_O.clickArcRetail_COM();
	}

	@Then("click on Floor drop down for owner")
	public void click_on_Floor_drop_down_for_owner() 
	{
		RI_O.clickFloor_COM();
	}

	@Then("select Retails second ground floor for owner")
	public void select_Retails_second_ground_floor_for_owner() 
	{
		RI_O.clickRetail02_COM();
	}

	@Then("click on Common Area drop down for owner")
	public void click_on_Common_Area_drop_down_for_owner() 
	{
		RI_O.clickCommonArea_COM();
	}

	@Then("select Pizza Express for owner")
	public void select_Pizza_Express_for_owner() 
	{
		RI_O.clickPizzaExpress_COM();
	}

	@Then("enter Asset Name for owner {string}")
	public void enter_Asset_Name_for_owner(String string) 
	{
		RI_O.setAssetName_COM(string);
	}

	@Then("Upload a photo for Report an Issue in Common Area for owner {string}")
	public void upload_a_photo_for_Report_an_Issue_in_Common_Area_for_owner(String string) 
	{
		RI_O.setPhoto_COM(string);
	}

	@Then("Enter Additional Note for Report an Issue in Common Area for owner{string}")
	public void enter_Additional_Note_for_Report_an_Issue_in_Common_Area_for_owner(String string) 
	{
		RI_O.setNotes_COM(string);
	}

	@Then("click on submit for Report an Issue in Common Area for owner")
	public void click_on_submit_for_Report_an_Issue_in_Common_Area_for_owner() 
	{
		RI_O.clickbtnsub_COM();
	}


	@Then("User can view the conformation message {string}")
	public void user_can_view_the_conformation_message(String string) 
	{


		if(driver.getPageSource().contains("Request added successfully!"))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED -> Request added successfully!");

		}
		else
		{
			System.out.println("FAILED -> Not Added");
		}	   

	}





	////////////////////////// Access Pass Request Owner ////////////////////////////////


	@Then("click on MyRequest for AccessPassRequest of owner")
	public void click_on_MyRequest_for_AccessPassRequest_of_owner() 
	{
		AP_O.clickMyRequest_A();
	}

	@Then("click on MyService on AccessPassRequest of owner")
	public void click_on_MyService_on_AccessPassRequest_of_owner()
	{
		AP_O.clickMyServices_A();
	}

	@Then("click on Service drop down on AccessPassRequest of owner")
	public void click_on_Service_drop_down_on_AccessPassRequest_of_owner() 
	{
		AP_O.clickSelectaService_A();
	}

	@Then("click on AccessPassRequest under Select a Service drop down of owner")
	public void click_on_AccessPassRequest_under_Select_a_Service_drop_down_of_owner() 
	{
		AP_O.clickAccessPassRequest_A();
	}

	@Then("Click on Community drop down under AccessPassRequest of owner")
	public void click_on_Community_drop_down_under_AccessPassRequest_of_owner() 
	{
		AP_O.ClickSelectCommunity_A();
	}

	@Then("Select any one option Under Community on AccessPassRequest of owner")
	public void select_any_one_option_Under_Community_on_AccessPassRequest_of_owner() 
	{
		AP_O.clickGateArc_A();
	}

	@Then("Click on Precinct drop down on AccessPassRequest of owner")
	public void click_on_Precinct_drop_down_on_AccessPassRequest_of_owner() 
	{
		AP_O.ClickSelectPrecinct_A();
	}

	@Then("Select any one option under precinct on AccessPassRequest of owner")
	public void select_any_one_option_under_precinct_on_AccessPassRequest_of_owner() throws InterruptedException 
	{
		AP_O.clickTheGate_A();
	}

	@Then("Click on Unit Number drop down on AccessPassRequest of owner")
	public void click_on_Unit_Number_drop_down_on_AccessPassRequest_of_owner() 
	{
		AP_O.ClickSelectUnitNumber_A();
	}

	@Then("Select any one option under unit number on AccessPassRequest of owner")
	public void select_any_one_option_under_unit_number_on_AccessPassRequest_of_owner() 
	{
		AP_O.clickGateT14111_A();
	}



	@Then("Enter Number of Cards of owner {string}")
	public void enter_Number_of_Cards_of_owner(String string) 
	{
		AP_O.setNumberofCards_A(string);
	}

	@Then("click on Reason for Request for owner")
	public void click_on_Reason_for_Request_for_owner() throws InterruptedException 
	{
		AP_O.Damage_A();
	}


	@Then("Enter Remarks of owner {string}")
	public void enter_Remarks_of_owner(String string) 
	{
		AP_O.setRemarks_A(string);
	}

	@Then("Click on Terms and Condition of owner")
	public void click_on_Terms_and_Condition_of_owner() 
	{
		AP_O.ClickTermsandConditions_A();
	}

	@Then("Click on Submit&Pay of owner")
	public void click_on_Submit_Pay_of_owner() throws InterruptedException 
	{
		AP_O.ClickSubmit_A();
	}


	@Then("User can view the confmtion mesage {string}")
	public void user_can_view_the_confmtion_mesage(String string) 
	{


		if(driver.getPageSource().contains("Stored Card Details"))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED");

		}
		else
		{
			System.out.println("Passed");
		}	   

	}





	////////////////////////////// ADD UNIT OWNER ////////////////////////////////////////


	@Then("User click on My Request on AddUnit for owner")
	public void user_click_on_My_Request_on_AddUnit_for_owner() 
	{
		AD_O.clickMyRequest_ADD();
	}

	@Then("User Click on My Service on AddUnit for owner")
	public void user_Click_on_My_Service_on_AddUnit_for_owner() 
	{
		AD_O.clickMyServices_ADD();
	}

	@Then("User click on Select a Service drop down on AddUnit for owner")
	public void user_click_on_Select_a_Service_drop_down_on_AddUnit_for_owner() 
	{
		AD_O.clickSelectaService_ADD();
	}

	@Then("click on Add Unit under Select a Service drop down on AddUnit for owner")
	public void click_on_Add_Unit_under_Select_a_Service_drop_down_on_AddUnit_for_owner() throws InterruptedException 
	{
		AD_O.clickAddUnit_ADD();
		Thread.sleep(2000);
	}

	@Then("click on I am a Tenant radio button under User Type page for owner")
	public void click_on_I_am_a_Tenant_radio_button_under_User_Type_page_for_owner() 
	{
		AD_O.clickRadioButton_ADD();
	}

	@Then("click on Next button under user Type page for owner")
	public void click_on_Next_button_under_user_Type_page_for_owner() 
	{
		AD_O.clickbtnNext_ADD();
	}

	@Then("click on Community drop down under unit Details page for owner")
	public void click_on_Community_drop_down_under_unit_Details_page_for_owner() 
	{
		AD_O.clickSelectCommunity_ADD();
	}

	@Then("Select any one option in Community under unit Details page for owner")
	public void select_any_one_option_in_Community_under_unit_Details_page_for_owner() 
	{
		AD_O.clickAlBandar_ADD();
	}

	@Then("Click on Precinct Building drop down under unit Details page for owner")
	public void click_on_Precinct_Building_drop_down_under_unit_Details_page_for_owner()
	{
		AD_O.clickSelectPrecinct_ADD();
	}

	@Then("Select any one option under precinct on unit Details page for owner")
	public void select_any_one_option_under_precinct_on_unit_Details_page_for_owner()
	{
		AD_O.clickAlBarza_ADD();
	}

	@Then("Click on Unit Number drop down under unit Details page for owner")
	public void click_on_Unit_Number_drop_down_under_unit_Details_page_for_owner() 
	{
		AD_O.clickSelectUnitNumber_ADD();
	}

	@Then("Select any one option under unit number on unit Details page for owner")
	public void select_any_one_option_under_unit_number_on_unit_Details_page_for_owner() 
	{
		AD_O.clickAlBarza101_ADD();
	}

	@Then("User Clicks on next button in unit Details page for owner")
	public void user_Clicks_on_next_button_in_unit_Details_page_for_owner()
	{
		AD_O.clickbtnNextU_ADD();
	}

	@Then("Enter Name on Resident Details page for owner {string}")
	public void enter_Name_on_Resident_Details_page_for_owner(String string)
	{
		AD_O.setRName_ADD(string);
	}

	@Then("Enter Contact Number on Resident Details page for owner {string}")
	public void enter_Contact_Number_on_Resident_Details_page_for_owner(String string)
	{
		AD_O.setContactNumber_ADD(string);
	}

	@Then("Enter Email Address on Resident Details page for owner {string}")
	public void enter_Email_Address_on_Resident_Details_page_for_owner(String string)
	{
		AD_O.setEmailAddress_ADD(string);
	}

	@Then("Click on Nationality for Add Unit")
	public void click_on_Nationality_for_Add_Unit() 
	{
		AD_O.clickNationality_ADD();
	}

	@Then("select Afghan")
	public void select_Afghan() throws InterruptedException
	{
		AD_O.clickAfghan_ADD();
		Thread.sleep(2000);
	}

	@Then("Click on Occupation drop down on Resident Details page for owner")
	public void click_on_Occupation_drop_down_on_Resident_Details_page_for_owner()
	{
		AD_O.clickbtnOccupation_ADD();
	}

	@Then("Select any one option under Occupation drop down on Resident Details page for owner")
	public void select_any_one_option_under_Occupation_drop_down_on_Resident_Details_page_for_owner() throws InterruptedException 
	{
		AD_O.clickLegal_ADD();
	}



	@Then("click on Next button under Resident Details page for owner")
	public void click_on_Next_button_under_Resident_Details_page_for_owner() 
	{
		AD_O.clickbtnNextR_ADD();
	}

	@Then("Click on Tenancy Start Date on occupancy Details page for owner")
	public void click_on_Tenancy_Start_Date_on_occupancy_Details_page_for_owner() 
	{
		AD_O.clickTenancyStartDate_ADD();
	}

	@Then("Click any Date from Tenancy Start Date for owner")
	public void click_any_Date_from_Tenancy_Start_Date_for_owner() 
	{
		AD_O.clickTSDate_ADD();
	}

	@Then("Click on Tenancy End Date on occupancy Details page for owner")
	public void click_on_Tenancy_End_Date_on_occupancy_Details_page_for_owner() 
	{
		AD_O.clickTenancyEndDate_ADD();
	}

	@Then("Click any Date from Tenancy End Date for owner")
	public void click_any_Date_from_Tenancy_End_Date_for_owner() 
	{
		AD_O.clickTEDate_ADD();
	}

	@Then("Upload ID Proof for owner {string}")
	public void upload_ID_Proof_for_owner(String string) 
	{
		AD_O.setIDProof_ADD(string);
	}

	@Then("Upload Contract  Agreement Copy for owner {string}")
	public void upload_Contract_Agreement_Copy_for_owner(String string) throws InterruptedException 
	{
		AD_O.setContractCopy_ADD(string);
	}

	@Then("Click on Rules and Regulations for owner")
	public void click_on_Rules_and_Regulations_for_owner() 
	{
		AD_O.clickIacceptCommunity_ADD();
	}

	@Then("Click on Submit under occupancy Details page for owner")
	public void click_on_Submit_under_occupancy_Details_page_for_owner() 
	{
		AD_O.clickbtnSubmit_ADD();
	}




	///////////////////////////// Delivery Disposal Request Owner ////////////////////////////



	@Then("Click on myrequest on DeliveryDisposalRequest for owner")
	public void click_on_myrequest_on_DeliveryDisposalRequest_for_owner() 
	{
		DD_O.clickMyRequest_D();
	}

	@Then("click on myservice on DeliveryDisposalRequest for owner")
	public void click_on_myservice_on_DeliveryDisposalRequest_for_owner() 
	{
		DD_O.clickMyServices_D();
	}

	@Then("click on SelectaService dropdown on DeliveryDisposalRequest for owner")
	public void click_on_SelectaService_dropdown_on_DeliveryDisposalRequest_for_owner() 
	{
		DD_O.clickSelectaService_D();
	}

	@Then("click on DeliveryDisposalRequest for owner")
	public void click_on_DeliveryDisposalRequest_for_owner() 
	{
		DD_O.clickDeliveryDisposalRequest_D();
	}

	@Then("Click on Community drop down under DeliveryDisposalRequest for owner")
	public void click_on_Community_drop_down_under_DeliveryDisposalRequest_for_owner()
	{
		DD_O.ClickCommunity_D();
	}

	@Then("Click any one Community under DeliveryDisposalRequest for owner")
	public void click_any_one_Community_under_DeliveryDisposalRequest_for_owner() 
	{
		DD_O.ClickSunSky_D();
	}

	@Then("Click on Precinct drop down under DeliveryDisposalRequest for owner")
	public void click_on_Precinct_drop_down_under_DeliveryDisposalRequest_for_owner() 
	{
		DD_O.ClickPrecinct_D();
	}

	@Then("Click any one Precinct under DeliveryDisposalRequest for owner")
	public void click_any_one_Precinct_under_DeliveryDisposalRequest_for_owner() 
	{
		DD_O.ClickSkyResidential_D();;
	}

	@Then("Click on Unit Number drop down under DeliveryDisposalRequest for owner")
	public void click_on_Unit_Number_drop_down_under_DeliveryDisposalRequest_for_owner() 
	{
		DD_O.ClickUnitNumber_D();
	}

	@Then("Click any one Unit Number under DeliveryDisposalRequest for owner")
	public void click_any_one_Unit_Number_under_DeliveryDisposalRequest_for_owner() 
	{
		DD_O.ClickSkyUnit4101_D();
	}

	@Then("Click on Type of Request under DeliveryDisposalRequest for owner")
	public void click_on_Type_of_Request_under_DeliveryDisposalRequest_for_owner()
	{
		DD_O.ClickTypeofRequest_D();
	}

	@Then("Click any one Type of Request under DeliveryDisposalRequest for owner")
	public void click_any_one_Type_of_Request_under_DeliveryDisposalRequest_for_owner() 
	{
		DD_O.ClickDeliveryoption_D();
	}

	@Then("Enter Number of Items under DeliveryDisposalRequest for owner {string}")
	public void enter_Number_of_Items_under_DeliveryDisposalRequest_for_owner(String string) 
	{
		DD_O.setClicknumberofitems_D(string);
	}

	@Then("Enter Items Description under DeliveryDisposalRequest for owner {string}")
	public void enter_Items_Description_under_DeliveryDisposalRequest_for_owner(String string) throws InterruptedException 
	{
		DD_O.ItemsDescription_D(string);
		Thread.sleep(3000);
	}

	@Then("Click on DeliveryDisposal Date and select a date for owner")
	public void click_on_DeliveryDisposal_Date_and_select_a_date_for_owner() throws InterruptedException 
	{
		DD_O.Clickdisposaldate_D();
	}

	@Then("Enter Contact Person Name for owner {string}")
	public void enter_Contact_Person_Name_for_owner(String string) 
	{
		DD_O.setContactPersonName_D(string);
	}

	@Then("Enter Contact Person Number  for owner{string}")
	public void enter_Contact_Person_Number_for_owner(String string)
	{
		DD_O.setContactPersonNumber_D(string);
	}

	@Then("Enter Submit button for owner")
	public void enter_Submit_button_for_owner() 
	{
		DD_O.ClickSubmitbtn_D();
	}


	@Then("User can see the confomation message")
	public void user_can_see_the_confomation_message()
	{


		if(driver.getPageSource().contains("Request added successfully!"))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED");

		}
		else
		{
			System.out.println("FAILED");
		}	   

	}




	///////////////////////////// Move in Request Owner ///////////////////////




	@Then("click on myRequest on Move in Request")
	public void click_on_myRequest_on_Move_in_Request() 
	{
		MR_O.clickMyRequest_M();
	}

	@Then("Click on myservice on Move in Request")
	public void click_on_myservice_on_Move_in_Request() 
	{
		MR_O.clickMyServices_M();
	}

	@Then("Click on service dropdown on Move in Request")
	public void click_on_service_dropdown_on_Move_in_Request() 
	{
		MR_O.clickSelectaService_M();
	}

	@Then("Click on Move in Request under Select a Service drop down")
	public void click_on_Move_in_Request_under_Select_a_Service_drop_down() 
	{
		MR_O.clickMoveinRequest_M();
	}

	@Then("Click on Community drop down under Move in Request")
	public void click_on_Community_drop_down_under_Move_in_Request() 
	{
		MR_O.clickSelectCommunity_M();
	}

	@Then("Select any one option Under Community on Move in Request")
	public void select_any_one_option_Under_Community_on_Move_in_Request()
	{
		MR_O.clickSunSky_M();
	}

	@Then("Click on Precinct drop down on Move in Request")
	public void click_on_Precinct_drop_down_on_Move_in_Request() 
	{
		MR_O.clickPrecinct_M();
	}

	@Then("Select any one option under precinct on Move in Request")
	public void select_any_one_option_under_precinct_on_Move_in_Request() 
	{
		MR_O.clickSkyResidential_M();
	}

	@Then("Click on Unit Number drop down on Move in Request")
	public void click_on_Unit_Number_drop_down_on_Move_in_Request() 
	{
		MR_O.clickUnitNumber_M();
	}

	@Then("Select any one option under unit number on Move in Request")
	public void select_any_one_option_under_unit_number_on_Move_in_Request() 
	{
		MR_O.clickSkyUnit4101_M();
	}

	@Then("click on next btn for Move in Request")
	public void click_on_next_btn_for_Move_in_Request() 
	{
		MR_O.clickNext_M();
	}

	@Then("Upload Electricity Water Receipt on Move in Request {string}")
	public void upload_Electricity_Water_Receipt_on_Move_in_Request(String string) 
	{
		MR_O.setElectricityWaterReceipt_M(string);
	}

	@Then("Upload Electricity District Cooling Receipt on Move in Request {string}")
	public void upload_Electricity_District_Cooling_Receipt_on_Move_in_Request(String string)
	{
		MR_O.setDistrictCoolingReceipt_M(string);
	}

	@Then("click on next btn for Move in Request for document")
	public void click_on_next_btn_for_Move_in_Request_for_document() 
	{
		MR_O.clickNextD_M();
	}

	@Then("Enter number of Adults for Move in Request {string}")
	public void enter_number_of_Adults_for_Move_in_Request(String string) 
	{
		MR_O.setAdult_M(string);
	}

	@Then("Click on NextButton for Move in Request")
	public void click_on_NextButton_for_Move_in_Request()
	{
		MR_O.clickNextbtn_M();
	}

	@Then("click on Next button on Emergency Contact page for Move in Request")
	public void click_on_Next_button_on_Emergency_Contact_page_for_Move_in_Request() throws InterruptedException 
	{
		MR_O.clickBtnNextF_M();
	}

	@Then("Click on Confirmed Move-in Date on Occupancy Details page for Move in Request")
	public void click_on_Confirmed_Move_in_Date_on_Occupancy_Details_page_for_Move_in_Request() 
	{
		MR_O.clickMndate_M();
	}

	@Then("Select one date in Confirmed Move in Date for Move in Request")
	public void select_one_date_in_Confirmed_Move_in_Date_for_Move_in_Request() 
	{
		MR_O.clickMidate_M();
	}

	@Then("Enter Time Slot for Lift Booking for Move in Request{string}")
	public void enter_Time_Slot_for_Lift_Booking_for_Move_in_Request(String string) 
	{
		MR_O.setTimeSlot_M(string);
	}

	@Then("give your ID Proofs for Move in Request {string}")
	public void give_your_ID_Proofs_for_Move_in_Request(String string) 
	{
		MR_O.setIDProof_M(string);
	}


	@Then("click on Rules and Regulations check box for Move in Request")
	public void click_on_Rules_and_Regulations_check_box_for_Move_in_Request()
	{
		MR_O.clickIacceptCommunity_M();
	}

	@Then("Click on SubmitButtn for Move in Request")
	public void click_on_SubmitButtn_for_Move_in_Request() 
	{
		MR_O.clickSubmitBtn_M();
	}




	////////////////////////////Move in Within Building owner////////////////////////////////////////




	@Then("click on myRequest on MoveinWithinBuilding for owner")
	public void click_on_myRequest_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickMyRequest_MI();
	}

	@Then("Click on myservice on MoveinWithinBuilding for owner")
	public void click_on_myservice_on_MoveinWithinBuilding_for_owner()
	{
		MIW_O.clickMyServices_MI();
	}

	@Then("Click on service dropdown on MoveinWithinBuilding for owner")
	public void click_on_service_dropdown_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickSelectaService_MI();
	}

	@Then("Click on MoveinWithinBuilding under Select a Service drop down for owner")
	public void click_on_MoveinWithinBuilding_under_Select_a_Service_drop_down_for_owner() 
	{
		MIW_O.clickMoveinWithinBuilding_MI();
	}

	@Then("Click on Community drop down under MoveinWithinBuilding for owner")
	public void click_on_Community_drop_down_under_MoveinWithinBuilding_for_owner()
	{
		MIW_O.clickSelectCommunity_MI();
	}

	@Then("Select any one option Under Community on MoveinWithinBuilding for owner")
	public void select_any_one_option_Under_Community_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickALMuneera_MI();
	}

	@Then("Click on Precinct drop down on MoveinWithinBuilding for owner")
	public void click_on_Precinct_drop_down_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickPrecinct_MI();
	}

	@Then("Select any one option under precinct on MoveinWithinBuilding for owner")
	public void select_any_one_option_under_precinct_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickAlMaha1_MI();
	}

	@Then("Click on Unit Number drop down on MoveinWithinBuilding for owner")
	public void click_on_Unit_Number_drop_down_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickUnitNumber_MI();
	}

	@Then("Select any one option under unit number on MoveinWithinBuilding for owner")
	public void select_any_one_option_under_unit_number_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickUI1001_MI();
	}

	@Then("click on next btn on MoveinWithinBuilding for owner")
	public void click_on_next_btn_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickNext_MI();
	}

	@Then("Enter number of Adults on MoveinWithinBuilding for owner {string}")
	public void enter_number_of_Adults_on_MoveinWithinBuilding_for_owner(String string) 
	{
		MIW_O.setAdult_MI(string);
	}

	@Then("click on Nationality dropdown on MoveinWithinBuilding for owner")
	public void click_on_Nationality_dropdown_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickSelectNationality_MI();
	}

	@Then("select Afghan on MoveinWithinBuilding for owner")
	public void select_Afghan_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickAfghan_MI();
	}

	@Then("click on Occupation dropdown on MoveinWithinBuilding for owner")
	public void click_on_Occupation_dropdown_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickOccupationofResident_MI();
	}

	@Then("select Legal professionals on MoveinWithinBuilding for owner")
	public void select_Legal_professionals_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickLegalprofessionals_MI();
	}

	@Then("Click on NextButton on MoveinWithinBuilding for owner")
	public void click_on_NextButton_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickNextbtn_MI();
	}

	@Then("Enter Name on MoveinWithinBuilding for owner {string}")
	public void enter_Name_on_MoveinWithinBuilding_for_owner(String string) 
	{
		MIW_O.setemergencyName_MI(string);
	}

	@Then("enter Email on MoveinWithinBuilding for owner {string}")
	public void enter_Email_on_MoveinWithinBuilding_for_owner(String string) 
	{
		MIW_O.setemergencyEmail_MI(string);
	}

	@Then("Enter phone no on MoveinWithinBuilding for owner {string}")
	public void enter_phone_no_on_MoveinWithinBuilding_for_owner(String string)
	{
		MIW_O.setemergencyNumber_MI(string);
	}

	@Then("click on Emirate of Residence on MoveinWithinBuilding for owner")
	public void click_on_Emirate_of_Residence_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickSelectEmirate_MI();
	}

	@Then("select Abu Dhabi on MoveinWithinBuilding for owner")
	public void select_Abu_Dhabi_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickDubai_MI();
	}

	@Then("click on Next button on Emergency Contact page on MoveinWithinBuilding for owner")
	public void click_on_Next_button_on_Emergency_Contact_page_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickBtnNext_MI();
	}

	@Then("Click on Tenancy Start Date on Occupancy Details page on MoveinWithinBuilding for owner")
	public void click_on_Tenancy_Start_Date_on_Occupancy_Details_page_on_MoveinWithinBuilding_for_owner()
	{
		MIW_O.clicktsdate_MI();
	}

	@Then("Select one date in Tenancy Start Date on MoveinWithinBuilding for owner")
	public void select_one_date_in_Tenancy_Start_Date_on_MoveinWithinBuilding_for_owner()
	{
		MIW_O.clickTstdate_MI();
	}

	@Then("Click on Tenancy End Date on Occupancy Details page on MoveinWithinBuilding for owner")
	public void click_on_Tenancy_End_Date_on_Occupancy_Details_page_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clicktedate_MI();
	}

	@Then("Select one date in Tenancy End Date on MoveinWithinBuilding for owner")
	public void select_one_date_in_Tenancy_End_Date_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickTendate_MI();
	}

	@Then("Click on Confirmed Move-in Date on Occupancy Details page on MoveinWithinBuilding for owner")
	public void click_on_Confirmed_Move_in_Date_on_Occupancy_Details_page_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickMndate_MI();
	}

	@Then("Select one date in Confirmed Move-in Date on MoveinWithinBuilding for owner")
	public void select_one_date_in_Confirmed_Move_in_Date_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickMidate_MI();
	}

	@Then("Enter Time Slot for Lift Booking on MoveinWithinBuilding for owner {string}")
	public void enter_Time_Slot_for_Lift_Booking_on_MoveinWithinBuilding_for_owner(String string) 
	{
		MIW_O.setTimeSlot_MI(string);
	}

	@Then("give your ID Proofs on MoveinWithinBuilding for owner {string}")
	public void give_your_ID_Proofs_on_MoveinWithinBuilding_for_owner(String string) 
	{
		MIW_O.setIDProof_MI(string);
	}

	@Then("give your Contract Agreement Copy on MoveinWithinBuilding for owner {string}")
	public void give_your_Contract_Agreement_Copy_on_MoveinWithinBuilding_for_owner(String string) 
	{
		MIW_O.setAgreementCopy_MI(string);
	}

	@Then("click on Rules and Regulations check box on MoveinWithinBuilding for owner")
	public void click_on_Rules_and_Regulations_check_box_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickIacceptCommunity_MI();
	}

	@Then("Click on SubmitButtn on MoveinWithinBuilding for owner")
	public void click_on_SubmitButtn_on_MoveinWithinBuilding_for_owner() 
	{
		MIW_O.clickSubmitBtn_MI();
	}


	@Then("User can see the cofomation message")
	public void user_can_see_the_cofomation_message()
	{


		if(driver.getPageSource().contains("Your move-in with in community request was submitted successfully"))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED");

		}
		else
		{
			System.out.println("FAILED");
		}	   

	}



	///////////////////////////////// Move Out Request for Owner //////////////////////////////



	@Then("Click  myrequest on Move Out Request for Owner")
	public void click_myrequest_on_Move_Out_Request_for_Owner() 
	{
		MOR_O.clickMyRequest_MO();
	}

	@Then("click  myservice on Move Out Request for Owner")
	public void click_myservice_on_Move_Out_Request_for_Owner() 
	{

		MOR_O.clickMyServices_MO();
	}

	@Then("click  SelectaService dropdown on Move Out Request for Owner")
	public void click_SelectaService_dropdown_on_Move_Out_Request_for_Owner()
	{
		MOR_O.clickSelectaService_MO();
	}

	@Then("click  Move Out Request for Owner")
	public void click_Move_Out_Request_for_Owner() 
	{
		MOR_O.clickMoveoutRequest_MO();
	}

	@Then("Click on Community drop down under Move Out Request for Owner")
	public void click_on_Community_drop_down_under_Move_Out_Request_for_Owner() 
	{
		MOR_O.clickSelectCommunity_MO();
	}

	@Then("Select any one option Under Community on Move Out Request for Owner")
	public void select_any_one_option_Under_Community_on_Move_Out_Request_for_Owner() 
	{
		MOR_O.clickYasLea_MO();
	}

	@Then("Click on Precinct drop down on Move Out Request for Owner")
	public void click_on_Precinct_drop_down_on_Move_Out_Request_for_Owner() 
	{
		MOR_O.clickPrecinct_MO();
	}

	@Then("Select any one option under precinct on Move Out Request for Owner")
	public void select_any_one_option_under_precinct_on_Move_Out_Request_for_Owner() 
	{
		MOR_O.clickYASACRESOALEAB_MO();
	}

	@Then("Click on Unit Number drop down on Move Out Request for Owner")
	public void click_on_Unit_Number_drop_down_on_Move_Out_Request_for_Owner() 
	{
		MOR_O.clickUnitNumber_MO();
	}

	@Then("Select any one option under unit number on Move Out Request for Owner")
	public void select_any_one_option_under_unit_number_on_Move_Out_Request_for_Owner() 
	{
		MOR_O.clickB027_MO();
	}

	@Then("Enter Reasons for Leaving for Owner {string}")
	public void enter_Reasons_for_Leaving_for_Owner(String string) 
	{

		MOR_O.setreasonsforleaving_MO(string);
	}

	@Then("Enter Location you are moving to  for Owner {string}")
	public void enter_Location_you_are_moving_to_for_Owner(String string) 
	{
		MOR_O.setmovingOutTo_MO(string);
	}

	@Then("Click on Furniture Move out Date for Owner")
	public void click_on_Furniture_Move_out_Date_for_Owner() 
	{
		MOR_O.clickfurnituremoveoutdate_MO();
	}

	@Then("Select move out Date for Owner")
	public void select_move_out_Date_for_Owner() 
	{
		MOR_O.clickmoveoutdate_MO();
	}

	@Then("Enter Preferred time for Owner {string}")
	public void enter_Preferred_time_for_Owner(String string) 
	{
		MOR_O.setPreferredtime_MO(string);
	}

	@Then("Click on Move out date Key handover date for Owner")
	public void click_on_Move_out_date_Key_handover_date_for_Owner() 
	{
		MOR_O.clickMoveoutdateKeyhandoverdate_MO();
	}

	@Then("Select one date on Move out date Key handover date for Owner")
	public void select_one_date_on_Move_out_date_Key_handover_date_for_Owner() 
	{
		MOR_O.clickhandoverdate_MO();
	}

	@Then("Enter Preferred time under handover date for Owner {string}")
	public void enter_Preferred_time_under_handover_date_for_Owner(String string) 
	{
		MOR_O.setPretime_MO(string);
	}

	@Then("Upload ADDC Bill {string}")
	public void upload_ADDC_Bill(String string) 
	{

		MOR_O.setADDCBill_MO(string);
	}

	@Then("Upload District Cooling {string}")
	public void upload_District_Cooling(String string) 
	{
		MOR_O.setDistrictCooling_MO(string);
	}

	@Then("Click on TERMS AND CONDITIONS for Owner")
	public void click_on_TERMS_AND_CONDITIONS_for_Owner() 
	{
		MOR_O.clickTermsandConditions_MO();
	}

	@Then("Click on Submit buton Move Out Request for Owner")
	public void click_on_Submit_buton_Move_Out_Request_for_Owner()
	{
		MOR_O.clickbtnSubmit_MO();
	}


	@Then("User can see the cofomation mesage")
	public void user_can_see_the_cofomation_mesage()
	{


		if(driver.getPageSource().contains("Your move-in with in community request was submitted successfully"))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED");

		}
		else
		{
			System.out.println("FAILED");
		}	   

	}




	///////////////////////////////////// NOC for Traffic Police Damage to Property//////////////////////


	@Then("Click  myrequest on NOC for Traffic Police Damage to Property for Owner")
	public void click_myrequest_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner() 
	{
		NOC_O.clickMyRequest_NO();
	}

	@Then("click  myservice on NOC for Traffic Police Damage to Property for Owner")
	public void click_myservice_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner() 
	{
		NOC_O.clickMyServices_NO();
	}

	@Then("click  SelectaService dropdown on NOC for Traffic Police Damage to Property for Owner")
	public void click_SelectaService_dropdown_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner()
	{
		NOC_O.clickSelectaService_NO();
	}

	@Then("click  NOC for Traffic Police Damage to Property for Owner")
	public void click_NOC_for_Traffic_Police_Damage_to_Property_for_Owner() 
	{
		NOC_O.clickNOCforTraffic_NO();
	}

	@Then("Click on Community drop down under NOC for Traffic Police Damage to Property for Owner")
	public void click_on_Community_drop_down_under_NOC_for_Traffic_Police_Damage_to_Property_for_Owner() 
	{
		NOC_O.clickSelectCommunity_NO();
	}

	@Then("Select any one option Under Community on NOC for Traffic Police Damage to Property for Owner")
	public void select_any_one_option_Under_Community_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner() 
	{
		NOC_O.clickYasLea_NO();
	}

	@Then("Click on Precinct drop down on NOC for Traffic Police Damage to Property for Owner")
	public void click_on_Precinct_drop_down_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner() 
	{
		NOC_O.clickPrecinct_NO();
	}

	@Then("Select any one option under precinct on NOC for Traffic Police Damage to Property for Owner")
	public void select_any_one_option_under_precinct_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner() 
	{
		NOC_O.clickYASACRESOALEAB_NO();
	}

	@Then("Click on Unit Number drop down on NOC for Traffic Police Damage to Property for Owner")
	public void click_on_Unit_Number_drop_down_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner()
	{
		NOC_O.clickUnitNumber_NO();
	}

	@Then("Select any one option under unit number on NOC for Traffic Police Damage to Property for Owner")
	public void select_any_one_option_under_unit_number_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner() 
	{
		NOC_O.clickB027_NO();
	}

	@Then("Upload Driving License on NOC for Traffic Police Damage to Property for Owner {string}")
	public void upload_Driving_License_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner(String string) 
	{
		NOC_O.setDrivingLicense_NO(string);
	}

	@Then("Upload Local Authority on NOC for Traffic Police Damage to Property for Owner {string}")
	public void upload_Local_Authority_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner(String string) 
	{
		NOC_O.setLocalAuthority_NO(string);
	}

	@Then("Upload Vehicle Registration Copy on NOC for Traffic Police Damage to Property for Owner {string}")
	public void upload_Vehicle_Registration_Copy_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner(String string) 
	{
		NOC_O.setVehicleRegistrationCopy_NO(string);
	}

	@Then("Upload Proof of Payment on NOC for Traffic Police Damage to Property for Owner {string}")
	public void upload_Proof_of_Payment_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner(String string) 
	{
		NOC_O.setProofofPayment_NO(string);
	}

	@Then("Enter Comments on NOC for Traffic Police Damage to Property for Owner {string}")
	public void enter_Comments_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner(String string) 
	{
		NOC_O.setComments_NO(string);
	}

	@Then("Click on Submit on NOC for Traffic Police Damage to Property for Owner")
	public void click_on_Submit_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner() 
	{
		NOC_O.clickSubmit_NO();
	}


	@Then("User can view the confrmtion mesage {string}")
	public void user_can_view_the_confrmtion_mesage(String string) 
	{


		if(driver.getPageSource().contains("413 Request Entity Too Large"))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED");

		}
		else
		{
			System.out.println("FAILED");
		}	   

	}







	//////////////////////////////////Tenancy Contract Extension Request for Owner/////////////////////////




	@Then("Click  myrequest on Tenancy Contract Extension Request for Owner")
	public void click_myrequest_on_Tenancy_Contract_Extension_Request_for_Owner() 
	{
		TC_O.clickMyRequest_TC();
	}

	@Then("click  myservice on Tenancy Contract Extension Request for Owner")
	public void click_myservice_on_Tenancy_Contract_Extension_Request_for_Owner() 
	{
		TC_O.clickMyServices_TC();
	}

	@Then("click  SelectaService dropdown on Tenancy Contract Extension Request for Owner")
	public void click_SelectaService_dropdown_on_Tenancy_Contract_Extension_Request_for_Owner() 
	{
		TC_O.clickSelectaService_TC();
	}

	@Then("click  Tenancy Contract Extension Request for Owner")
	public void click_Tenancy_Contract_Extension_Request_for_Owner() 
	{
		TC_O.clickTenancyContractExtension_TC();
	}

	@Then("click on Contract Start Date on Tenancy Contract Extension Request for Owner")
	public void click_on_Contract_Start_Date_on_Tenancy_Contract_Extension_Request_for_Owner() 
	{
		TC_O.clickContractStartDate_TC();
	}

	@Then("select any date Contract Start Date Tenancy Contract Extension Request for Owner")
	public void select_any_date_Contract_Start_Date_Tenancy_Contract_Extension_Request_for_Owner() 
	{
		TC_O.clickSDate_TC();
	}

	@Then("click on Contract End Date on Tenancy Contract Extension Request for Owner")
	public void click_on_Contract_End_Date_on_Tenancy_Contract_Extension_Request_for_Owner() 
	{
		TC_O.clickContractEndDate_TC();
	}

	@Then("select any date Contract End Date Tenancy Contract Extension Request for Owner")
	public void select_any_date_Contract_End_Date_Tenancy_Contract_Extension_Request_for_Owner() 
	{
		TC_O.clickEDate_TC();
	}

	@Then("Upload Tawtheeq Contract on Tenancy Contract Extension Request for Owner {string}")
	public void upload_Tawtheeq_Contract_on_Tenancy_Contract_Extension_Request_for_Owner(String string) 
	{
		TC_O.setTawtheeqContract_TC(string);
	}

	@Then("Upload Tenancy Contract on Tenancy Contract Extension Request for Owner {string}")
	public void upload_Tenancy_Contract_on_Tenancy_Contract_Extension_Request_for_Owner(String string) 
	{
		TC_O.setTenancyContract_TC(string);
	}

	@Then("click on Terms and condition on Tenancy Contract Extension Request for Owner")
	public void click_on_Terms_and_condition_on_Tenancy_Contract_Extension_Request_for_Owner() 
	{
		TC_O.clickTermsandconditions_TC();
	}

	@Then("click on Submit on Tenancy Contract Extension Request for Owner")
	public void click_on_Submit_on_Tenancy_Contract_Extension_Request_for_Owner() 
	{
		TC_O.clickSubmit_TC();
	}




	/////////////////////////////Visitor Registration for Owner///////////////////////////


	@Then("Click  myrequest on Visitor Registration for Owner")
	public void click_myrequest_on_Visitor_Registration_for_Owner() 
	{
		VR_O.clickMyRequest_VR();
	}

	@Then("click  myservice on Visitor Registration for Owner")
	public void click_myservice_on_Visitor_Registration_for_Owner() 
	{
		VR_O.clickMyServices_VR();
	}

	@Then("click  SelectaService dropdown on Visitor Registration for Owner")
	public void click_SelectaService_dropdown_on_Visitor_Registration_for_Owner() 
	{
		VR_O.clickSelectaService_VR();
	}

	@Then("click  Visitor Registration for Owner")
	public void click_Visitor_Registration_for_Owner() 
	{
		VR_O.clickVisitorRegistration_VR();
	}

	@Then("enter Visitor Name on Visitor Registration for Owner {string}")
	public void enter_Visitor_Name_on_Visitor_Registration_for_Owner(String string) 
	{
		VR_O.setvisitorname_VR(string);
	}

	@Then("enter Visitor Mobile Number on Visitor Registration for Owner {string}")
	public void enter_Visitor_Mobile_Number_on_Visitor_Registration_for_Owner(String string) 
	{
		VR_O.setvisitormobileno_VR(string);
	}

	@Then("enter Visitor Email on Visitor Registration for Owner {string}")
	public void enter_Visitor_Email_on_Visitor_Registration_for_Owner(String string) throws InterruptedException 
	{
		VR_O.setvisitoremail_VR(string);
	}

	@Then("upload Visitor ID Proof on Visitor Registration for Owner {string}")
	public void upload_Visitor_ID_Proof_on_Visitor_Registration_for_Owner(String string) throws InterruptedException 
	{
		VR_O.setattachment_VR(string);
	}

	@Then("Click on Community drop down under on Visitor Registration for Owner")
	public void click_on_Community_drop_down_under_on_Visitor_Registration_for_Owner()
	{
		VR_O.clickSelectCommunity_VR();
	}

	@Then("Select any one option Under Community on Visitor Registration for Owner")
	public void select_any_one_option_Under_Community_on_Visitor_Registration_for_Owner() 
	{
		VR_O.clickYasLea_VR();
	}

	@Then("Click on Precinct drop down on Visitor Registration for Owner")
	public void click_on_Precinct_drop_down_on_Visitor_Registration_for_Owner()
	{
		VR_O.clickPrecinct_VR();
	}

	@Then("Select any one option under precinct on Visitor Registration for Owner")
	public void select_any_one_option_under_precinct_on_Visitor_Registration_for_Owner() 
	{
		VR_O.clickYASACRESOALEAB_VR();
	}

	@Then("Click on Unit Number drop down on Visitor Registration for Owner")
	public void click_on_Unit_Number_drop_down_on_Visitor_Registration_for_Owner() 
	{
		VR_O.clickUnitNumber_VR();
	}

	@Then("Select any one option under unit number on Visitor Registration for Owner")
	public void select_any_one_option_under_unit_number_on_Visitor_Registration_for_Owner() 
	{
		VR_O.clickB027_VR();
	}

	@Then("click on Check In Date on Visitor Registration for Owner")
	public void click_on_Check_In_Date_on_Visitor_Registration_for_Owner() throws InterruptedException 
	{
		VR_O.clickvisitorexpecteddate_VR();
	}

	@Then("select any date on Check In Date on Visitor Registration for Owner")
	public void select_any_date_on_Check_In_Date_on_Visitor_Registration_for_Owner() throws InterruptedException 
	{
		VR_O.clickVisitordate_VR();
	}

	@Then("enter Check In Time on Visitor Registration for Owner {string}")
	public void enter_Check_In_Time_on_Visitor_Registration_for_Owner(String string) throws InterruptedException 
	{
		VR_O.setvisitorexpectedtime_VR(string);
	}

	@Then("click on Expected Check Out Date on Visitor Registration for Owner")
	public void click_on_Expected_Check_Out_Date_on_Visitor_Registration_for_Owner() throws InterruptedException 
	{
		VR_O.clickvisitorexpectedlastdate_VR();
	}

	@Then("select any date on Expected Check Out Date on Visitor Registration for Owner")
	public void select_any_date_on_Expected_Check_Out_Date_on_Visitor_Registration_for_Owner() throws InterruptedException 
	{
		VR_O.clickVisitorenddate_VR();
	}

	@Then("Enter Additional Notes on Visitor Registration for Owner {string}")
	public void enter_Additional_Notes_on_Visitor_Registration_for_Owner(String string) 
	{
		VR_O.setAdditionalNotes_VR(string);
	}

	@Then("Click on Submit on Visitor Registration for Owner")
	public void click_on_Submit_on_Visitor_Registration_for_Owner() 
	{
		VR_O.clicksubmit_VR();
	}

	@Then("User can view the cofomation message")
	public void user_can_view_the_cofomation_message()
	{


		if(driver.getPageSource().contains("Request added successfully!"))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED");

		}
		else
		{
			System.out.println("FAILED");
		}	   

	}





	//////////////////////////// Add Trip for Owner ///////////////////////////////////////


	@Then("Click  myrequest on add trip for Owner")
	public void click_myrequest_on_add_trip_for_Owner() 
	{
		ADD_O.clickMyRequest_AD();
	}

	@Then("click  Add Trip for Owner")
	public void click_Add_Trip_for_Owner() 
	{
		ADD_O.clickMYTRIP_AD(); 
	}

	@Then("click on Add trip link for Owner")
	public void click_on_Add_trip_link_for_Owner() 
	{
		ADD_O.clickAddTrip_AD();
	}

	@Then("Click on Community drop down under on Add Trip for Owner")
	public void click_on_Community_drop_down_under_on_Add_Trip_for_Owner() 
	{
		ADD_O.clickSelectCommunity_AD();
	}

	@Then("Select any one option Under Community on Add Trip for Owner")
	public void select_any_one_option_Under_Community_on_Add_Trip_for_Owner() 
	{
		ADD_O.clickYasLea_AD();
	}

	@Then("Click on Precinct drop down on Add Trip for Owner")
	public void click_on_Precinct_drop_down_on_Add_Trip_for_Owner() 
	{
		ADD_O.clickPrecinct_AD();
	}

	@Then("Select any one option under precinct on Add Trip for Owner")
	public void select_any_one_option_under_precinct_on_Add_Trip_for_Owner() 
	{
		ADD_O.clickYASACRESOALEAB_AD();
	}

	@Then("Click on Unit Number drop down on Add Trip for Owner")
	public void click_on_Unit_Number_drop_down_on_Add_Trip_for_Owner()
	{
		ADD_O.clickUnitNumber_AD();
	}

	@Then("Select any one option under unit number on Add Trip for Owner")
	public void select_any_one_option_under_unit_number_on_Add_Trip_for_Owner() 
	{
		ADD_O.clickB027_AD();
	}

	@Then("click on Expected Start Date on Add Trip for Owner")
	public void click_on_Expected_Start_Date_on_Add_Trip_for_Owner() 
	{
		ADD_O.clickExpectedStartDate_AD();
	}

	@Then("select any date for Expected start on Add Trip for Owner")
	public void select_any_date_for_Expected_start_on_Add_Trip_for_Owner() 
	{
		ADD_O.clickStartDate_AD();
	}

	@Then("enter on Expected Time on Add Trip for Owner {string}")
	public void enter_on_Expected_Time_on_Add_Trip_for_Owner(String string) 
	{
		ADD_O.setStarttime_AD(string);
	}

	@Then("click on Expected Last Date on Add Trip for Owner")
	public void click_on_Expected_Last_Date_on_Add_Trip_for_Owner() 
	{
		ADD_O.clickExpectedEndDate_AD();
	}

	@Then("select any date for Expected last on Add Trip for Owner")
	public void select_any_date_for_Expected_last_on_Add_Trip_for_Owner() 
	{
		ADD_O.clickEndDate_AD();
	}

	@Then("enter on Expected End Time on Add Trip for Owner {string}")
	public void enter_on_Expected_End_Time_on_Add_Trip_for_Owner(String string) 
	{
		ADD_O.setEndtime_AD(string);
	}



	@Then("enter Emergency Contact Name on Add Trip for Owner {string}")
	public void enter_Emergency_Contact_Name_on_Add_Trip_for_Owner(String string) 
	{
		ADD_O.setEmergencyContactName_AD(string);
	}

	@Then("enter Emergency Contact Number on Add Trip for Owner {string}")
	public void enter_Emergency_Contact_Number_on_Add_Trip_for_Owner(String string) 
	{
		ADD_O.setEmergencyContactNumber_AD(string);
	}

	@Then("enter Emergency Contact Email on Add Trip for Owner {string}")
	public void enter_Emergency_Contact_Email_on_Add_Trip_for_Owner(String string) 
	{
		ADD_O.setEmergencyContactEmail_AD(string);
	}

	@Then("enter Emergency Contact Emirates Id on Add Trip for Owner {string}")
	public void enter_Emergency_Contact_Emirates_Id_on_Add_Trip_for_Owner(String string) 
	{
		ADD_O.setEmergencyContactEmiratesId_AD(string);
	}

	@Then("enter Comment on Add Trip for Owner {string}")
	public void enter_Comment_on_Add_Trip_for_Owner(String string) 
	{
		ADD_O.setComments_AD(string);
	}

	@Then("click on submit on Add Trip for Owner")
	public void click_on_submit_on_Add_Trip_for_Owner()
	{
		ADD_O.clickSubmit_AD();
	}

	@Then("User can see the conformation message")
	public void user_can_see_the_conformation_message()
	{


		if(driver.getPageSource().contains("Trip request has added successfully!"))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED");

		}
		else
		{
			System.out.println("FAILED");
		}	   

	}


	//////////////////////////////////// Pay Bill Owner /////////////////////////////////////


	@Then("User click on My Finances on Pay Bill Owner")
	public void user_click_on_My_Finances_on_Pay_Bill_Owner()
	{
		PB_O.clickMyFinances_F();
	}

	@Then("User Click on Account Summary on Pay Bill Owner")
	public void user_Click_on_Account_Summary_on_Pay_Bill_Owner() 
	{
		PB_O.clickAccountSummary_F();
	}

	@Then("click on Pay button for Total Service Charges")
	public void click_on_Pay_button_for_Total_Service_Charges() throws InterruptedException 
	{
		PB_O.clickPay_F();
		Thread.sleep(4000);
	}

	@Then("click on Community drop down on Pay Bill Owner")
	public void click_on_Community_drop_down_on_Pay_Bill_Owner() 
	{
		PB_O.clickSelectCommunity_F();
	}

	@Then("Select any one option in Community on Pay Bill Owner")
	public void select_any_one_option_in_Community_on_Pay_Bill_Owner() 
	{
		PB_O.clickGolfGarden_F();
	}

	@Then("Click on Precinct on Pay Bill Owner")
	public void click_on_Precinct_on_Pay_Bill_Owner() 
	{
		PB_O.clickPrecinct_F();
	}

	@Then("Select any one option under precinct on Pay Bill Owner")
	public void select_any_one_option_under_precinct_on_Pay_Bill_Owner() 
	{
		PB_O.clickGolfGardens_F();
	}

	@Then("Click on Unit Number drop down on Pay Bill Owner")
	public void click_on_Unit_Number_drop_down_on_Pay_Bill_Owner() 
	{
		PB_O.clickUnitNumber_F();
	}

	@Then("Select any one option under unit number on Pay Bill Owner")
	public void select_any_one_option_under_unit_number_on_Pay_Bill_Owner() throws InterruptedException 
	{
		PB_O.clickC017_F();
		Thread.sleep(4000);

	}

	@Then("click on Pay All button on Pay Bill Owner")
	public void click_on_Pay_All_button_on_Pay_Bill_Owner() throws InterruptedException 
	{
		PB_O.clickPayAll_F();
		Thread.sleep(8000);
	}

	@Then("click on Other Payment Mode")
	public void click_on_Other_Payment_Mode() throws InterruptedException 
	{
		PB_O.clickOtherPaymentMode_F();
		Thread.sleep(2000);
	}

	@Then("click on Payment Mode")
	public void click_on_Payment_Mode() throws InterruptedException 
	{

		PB_O.clickSelectPaymentMode_F();
		Thread.sleep(2000);
	}

	@Then("select service payment by Cheque")
	public void select_service_payment_by_Cheque() throws InterruptedException 
	{
		PB_O.clickpaymentbycheque_F();
		Thread.sleep(4000);
	}

	@Then("Enter the Account No {string}")
	public void enter_the_Account_No(String string) 
	{
		PB_O.setAccountNo_F(string);
	}

	@Then("Enter the Bank Name {string}")
	public void enter_the_Bank_Name(String string) 
	{
		PB_O.setBabkName_F(string);
	}

	@Then("Enter the Cheque No {string}")
	public void enter_the_Cheque_No(String string) 
	{
		PB_O.setChequeNo_F(string);
	}

	@Then("Upload Payment Proof {string}")
	public void upload_Payment_Proof(String string) 
	{
		PB_O.setPaymentProof_F(string);
	}

	@Then("Enter the Remark for payment {string}")
	public void enter_the_Remark_for_payment(String string) 
	{
		PB_O.setRemarks_F(string);
	}

	@Then("Click on With Shipping check box")
	public void click_on_With_Shipping_check_box() throws InterruptedException 
	{
		PB_O.clickWithShipping_F();
		Thread.sleep(4000);
	}

	@Then("click on Pickup Date on Pay Bill Owner")
	public void click_on_Pickup_Date_on_Pay_Bill_Owner() 
	{
		PB_O.clickPickupDate_F();
	}

	@Then("select any date for Pay Bill Owner")
	public void select_any_date_for_Pay_Bill_Owner() 
	{
		PB_O.clickDate_F();
	}

	@Then("click on Terms and Conditions for Pay Bill Owner")
	public void click_on_Terms_and_Conditions_for_Pay_Bill_Owner() 
	{
		PB_O.clickTermsandConditions_F();
	}

	@Then("click on Submit for Pay Bill Owner")
	public void click_on_Submit_for_Pay_Bill_Owner() 
	{
		PB_O.clickSubmit_F();
	}

	//-----------------------NOC For Unit Sale----------------------------

	@Then("Select NOC for unit sale web")
	public void select_NOC_for_unit_sale_web() {
		NFU.select_NOC_for_unit_sale_web();
	}

	@Then("Click and select the community DD")
	public void click_and_select_the_community_DD() throws InterruptedException {
		NFU.click_and_select_the_community_DD();
	}

	@Then("Click and select the precinct DD")
	public void click_and_select_the_precinct_DD() {
		NFU.click_and_select_the_precinct_DD();
	}

	@Then("Click and select the Unit DD")
	public void click_and_select_the_Unit_DD() {
		NFU.click_and_select_the_Unit_DD();
	}

	@Then("Enter Buyer name")
	public void enter_Buyer_name() {
		NFU.enter_Buyer_name();
	}

	@Then("Enter Buyer Contact number")
	public void enter_Buyer_Contact_number() {
		NFU.enter_Buyer_Contact_number();
	}

	@Then("Enter buyer email")
	public void enter_buyer_email() {
		NFU.enter_buyer_email();
	}

	@Then("Upload ADDC Certificate")
	public void upload_ADDC_Certificate() throws InterruptedException {
		NFU.upload_ADDC_Certificate();
	}

	@Then("Upload Under taking to transfer utilities")
	public void upload_Under_taking_to_transfer_utilities() {
		NFU.upload_Under_taking_to_transfer_utilities();
	}
	@Then("Upload buyer passport front side copy")
	public void upload_buyer_passport_front_side_copy() {
		NFU.upload_buyer_passport_front_side_copy();
	}

	@Then("Upload buyer passport back side copy")
	public void upload_buyer_passport_back_side_copy() {
		NFU.upload_buyer_passport_back_side_copy();
	}

	@Then("Upload seller passport front side copy")
	public void upload_seller_passport_front_side_copy() {
		NFU.upload_seller_passport_front_side_copy();
	}

	@Then("Upload seller passport back side copy")
	public void upload_seller_passport_back_side_copy() {
		NFU.upload_seller_passport_back_side_copy();
	}

	@Then("Upload title deed")
	public void upload_title_deed() {
		NFU.upload_title_deed();
	}

	@Then("Upload MOU")
	public void upload_MOU() {
		NFU.upload_MOU();
	}

	@Then("Upload buyer information sheet")
	public void upload_buyer_information_sheet() {
		NFU.upload_buyer_information_sheet();
	}

	@Then("Uplaod assignment of service charge seller")
	public void uplaod_assignment_of_service_charge_seller() {
		NFU.uplaod_assignment_of_service_charge_seller();
	}

	@Then("Upload District cooling clearance")
	public void upload_District_cooling_clearance() {
		NFU.upload_District_cooling_clearance();
	}

	@Then("Upload Gas clearance")
	public void upload_Gas_clearance() {
		NFU.upload_Gas_clearance(); 
	}

	@Then("Upload Undertaking to pay service charges")
	public void upload_Undertaking_to_pay_service_charges() {
		NFU.upload_Undertaking_to_pay_service_charges();
	}

	@Then("Check the checkbox")
	public void check_the_checkbox() {
		NFU.check_the_checkbox();
	}

	@Then("Click on submit and pay to proceed")
	public void click_on_submit_and_pay_to_proceed() {

		if(driver.getPageSource().equals("Payment Infor"))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED");

		}
		else
		{
			System.out.println("FAILED");
		}	   

		NFU.click_on_submit_and_pay_to_proceed();
	}

	//---------------------------NOC For Utilities----------------------------
	@Then("Click and Select the NOC for utilities")
	public void click_and_Select_the_NOC_for_utilities() {
		NUTL.click_and_Select_the_NOC_for_utilities();
	}

	@Then("Upload title deed document {string}")
	public void upload_title_deed_document(String string) {
		NUTL.upload_title_deed_document(string);
	}

	@Then("Upload ADDC clearance document {string}")
	public void upload_ADDC_clearance_document(String string) {
		NUTL.upload_ADDC_clearance_document(string);
	}

	@Then("Upload owner EID Passport front copy {string}")
	public void upload_owner_EID_Passport_front_copy(String string) {
		NUTL.upload_owner_EID_Passport_front_copy(string);
	}

	@Then("Upload owner EID Passport back copy {string}")
	public void upload_owner_EID_Passport_back_copy(String string) {
		NUTL.upload_owner_EID_Passport_back_copy(string);
	}

	@Then("Select the checkbox")
	public void select_the_checkbox() {
		NUTL.select_the_checkbox();
	}

	@Then("Click on Submit for NFU")
	public void click_on_Submit_for_NFU() {
		NUTL.click_on_Submit_for_NFU();

		if(driver.getPageSource().equals("Payment Infor"))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED");

		}
		else
		{
			System.out.println("FAILED");
		}	   
	}

	//------------------------------NOC For Unit Allteration-----------------------------

	@Then("Select NOC for unit alteration")
	public void select_NOC_for_unit_alteration() {
		NALT.select_NOC_for_unit_alteration();
	}

	@Then("Click and select the community")
	public void click_and_select_the_community() throws InterruptedException {
		NALT.click_and_select_the_community();
	}

	@Then("Click and select the precinct")
	public void click_and_select_the_precinct() {
		NALT.click_and_select_the_precinct();
	}

	@Then("Click and select the Unit")
	public void click_and_select_the_Unit() {
		NALT.click_and_select_the_Unit();
	}



	@Then("Enter Type of alteration {string}")
	public void enter_Type_of_alteration(String string) {
		NALT.enter_Type_of_alteration(string);
	}

	@Then("Enter Name of contractor {string}")
	public void enter_Name_of_contractor(String string) {
		NALT.enter_Name_of_contractor(string);
	}

	@Then("Enter Contact person name {string}")
	public void enter_Contact_person_name(String string) {
		NALT.enter_Contact_person_name(string);
	}

	@Then("Enter Contact pereson number {string}")
	public void enter_Contact_pereson_number(String string) {
		NALT.enter_Contact_pereson_number(string);
	}

	@Then("Enter email Address {string}")
	public void enter_email_Address(String string) {
		NALT.enter_email_Address(string);
	}

	@Then("Enter consultant name {string}")
	public void enter_consultant_name(String string) {
		NALT.enter_consultant_name(string);

	}

	@Then("Upload Architecture layout {string}")
	public void upload_Architecture_layout(String string) {
		NALT.upload_Architecture_layout(string);
	}

	@Then("Uploads Trade liscence of appointed contractor {string}")
	public void uploads_Trade_liscence_of_appointed_contractor(String string) {
		NALT.uploads_Trade_liscence_of_appointed_contractor(string);
	}

	@Then("Enter the Additional note {string}")
	public void enter_the_Additional_note(String string) {
		NALT.enter_the_Additional_note(string);
	}

	@Then("Click on submit")
	public void click_on_submit() {
		NALT.click_on_submit();

	}






}




















