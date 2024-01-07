$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/AccessPassRequest.feature");
formatter.feature({
  "name": "Access Pass Request Owner",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"d255d6@maila42.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Provis\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on close",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_close()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on MyRequest for AccessPassRequest of owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_MyRequest_for_AccessPassRequest_of_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on MyService on AccessPassRequest of owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_MyService_on_AccessPassRequest_of_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Service drop down on AccessPassRequest of owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Service_drop_down_on_AccessPassRequest_of_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on AccessPassRequest under Select a Service drop down of owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_AccessPassRequest_under_Select_a_Service_drop_down_of_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Community drop down under AccessPassRequest of owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Community_drop_down_under_AccessPassRequest_of_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any one option Under Community on AccessPassRequest of owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_any_one_option_Under_Community_on_AccessPassRequest_of_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Precinct drop down on AccessPassRequest of owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Precinct_drop_down_on_AccessPassRequest_of_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any one option under precinct on AccessPassRequest of owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_any_one_option_under_precinct_on_AccessPassRequest_of_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Unit Number drop down on AccessPassRequest of owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Unit_Number_drop_down_on_AccessPassRequest_of_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any one option under unit number on AccessPassRequest of owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_any_one_option_under_unit_number_on_AccessPassRequest_of_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Number of Cards of owner \"2\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Number_of_Cards_of_owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Reason for Request for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Reason_for_Request_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Remarks of owner \"sdgfedygtedffdchffhfgdhfdrfeddtrddfdccgfccdcgf\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Remarks_of_owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Terms and Condition of owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Terms_and_Condition_of_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Submit\u0026Pay of owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Submit_Pay_of_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view the confmtion mesage \"Stored Card Details\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_the_confmtion_mesage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/Add_Trip.feature");
formatter.feature({
  "name": "ADD TRIP for Owner",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"c5029c@mail188.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Provis\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on close",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_close()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click  myrequest on add trip for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_myrequest_on_add_trip_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click  Add Trip for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_Add_Trip_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Add trip link for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Add_trip_link_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Community drop down under on Add Trip for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Community_drop_down_under_on_Add_Trip_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any one option Under Community on Add Trip for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_any_one_option_Under_Community_on_Add_Trip_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Precinct drop down on Add Trip for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Precinct_drop_down_on_Add_Trip_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any one option under precinct on Add Trip for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_any_one_option_under_precinct_on_Add_Trip_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Unit Number drop down on Add Trip for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Unit_Number_drop_down_on_Add_Trip_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any one option under unit number on Add Trip for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_any_one_option_under_unit_number_on_Add_Trip_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Expected Start Date on Add Trip for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Expected_Start_Date_on_Add_Trip_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select any date for Expected start on Add Trip for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.select_any_date_for_Expected_start_on_Add_Trip_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter on Expected Time on Add Trip for Owner \"10:30\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_on_Expected_Time_on_Add_Trip_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Expected Last Date on Add Trip for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Expected_Last_Date_on_Add_Trip_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select any date for Expected last on Add Trip for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.select_any_date_for_Expected_last_on_Add_Trip_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter on Expected End Time on Add Trip for Owner \"12:30\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_on_Expected_End_Time_on_Add_Trip_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Emergency Contact Name on Add Trip for Owner \"Test\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Emergency_Contact_Name_on_Add_Trip_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Emergency Contact Number on Add Trip for Owner \"501236544\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Emergency_Contact_Number_on_Add_Trip_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Emergency Contact Email on Add Trip for Owner \"rajesh@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Emergency_Contact_Email_on_Add_Trip_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Emergency Contact Emirates Id on Add Trip for Owner \"654789012345678\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Emergency_Contact_Emirates_Id_on_Add_Trip_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Comment on Add Trip for Owner \"Testing\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Comment_on_Add_Trip_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on submit on Add Trip for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_submit_on_Add_Trip_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the conformation message",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_see_the_conformation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/AmenityBooking_OWNER.feature");
formatter.feature({
  "name": "Amenity Booking",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"d255d6@maila42.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Provis\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on close",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_close()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on My Comunity for owner Amenity Booking",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_My_Comunity_for_owner_Amenity_Booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Al Muneera for owner Amenity Booking",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Al_Muneera_for_owner_Amenity_Booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Amenity Booking for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Amenity_Booking_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Book button Amenity Booking",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Book_button_Amenity_Booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Unit drop down for Amenity Booking",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Unit_drop_down_for_Amenity_Booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select unit no for Amenity Booking",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_unit_no_for_Amenity_Booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Check In Date for Amenity Booking",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Check_In_Date_for_Amenity_Booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select one date in check in date for Amenity Booking",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_one_date_in_check_in_date_for_Amenity_Booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select Time Slot for Amenity Booking",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.select_Time_Slot_for_Amenity_Booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on pay book button under Amenity Booking for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_pay_book_button_under_Amenity_Booking_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Card Number for owner Amenity Booking \"5204740009900014\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Card_Number_for_owner_Amenity_Booking(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Expiry Month for owner Amenity Booking",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Expiry_Month_for_owner_Amenity_Booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the Month for owner Amenity Booking",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_the_Month_for_owner_Amenity_Booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Expiry Year for owner Amenity Booking",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Expiry_Year_for_owner_Amenity_Booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Year for owner Amenity Booking",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_Year_for_owner_Amenity_Booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter CVV for owner Amenity Booking \"123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_CVV_for_owner_Amenity_Booking(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Make Payment for owner Amenity Booking",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Make_Payment_for_owner_Amenity_Booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/Classes\u0026Offering_OWNER.feature");
formatter.feature({
  "name": "Classes \u0026 Offering",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"d255d6@maila42.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Provis\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on close",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_close()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on My Comunity for owner Classesoffering",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_My_Comunity_for_owner_Classesoffering()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Al Muneera for owner Classesoffering",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Al_Muneera_for_owner_Classesoffering()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on ClassesOffering for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_ClassesOffering_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on book now for Colorful Cuckoos Art Class for owner Classesoffering",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_book_now_for_Colorful_Cuckoos_Art_Class_for_owner_Classesoffering()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Select Your Package for Colorful Cuckoos Art Class",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Select_Your_Package_for_Colorful_Cuckoos_Art_Class()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Select Select Your Schedule for Colorful Cuckoos Art Class",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Select_Select_Your_Schedule_for_Colorful_Cuckoos_Art_Class()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on unit number drop down for owner Classesoffering",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_unit_number_drop_down_for_owner_Classesoffering()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the unit number for owner Classesoffering",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.select_the_unit_number_for_owner_Classesoffering()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the Applicant Name for owner Classesoffering \"Test\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_the_Applicant_Name_for_owner_Classesoffering(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the Applicant Age for owner Classesoffering \"25\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_the_Applicant_Age_for_owner_Classesoffering(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Terms Conditions for owner Classesoffering",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Terms_Conditions_for_owner_Classesoffering()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on PayBook for owner Classesoffering",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_PayBook_for_owner_Classesoffering()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Card Number for owner Classesoffering \"5204740009900014\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Card_Number_for_owner_Classesoffering(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Expiry Month for owner Classesoffering",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Expiry_Month_for_owner_Classesoffering()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the Month for owner Classesoffering",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_the_Month_for_owner_Classesoffering()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Expiry Year for owner Classesoffering",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Expiry_Year_for_owner_Classesoffering()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Year for owner Classesoffering",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_Year_for_owner_Classesoffering()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter CVV for owner Classesoffering \"123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_CVV_for_owner_Classesoffering(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Make Payment for owner Classesoffering",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Make_Payment_for_owner_Classesoffering()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/CommunityChat_OWNER.feature");
formatter.feature({
  "name": "Community Chat",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"d255d6@maila42.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Provis\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on close",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_close()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on My Comunity for owner Community Chat",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_My_Comunity_for_owner_Community_Chat()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Al Muneera for owner Community Chat",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Al_Muneera_for_owner_Community_Chat()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Community Chat for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Community_Chat_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Create Community Post for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Create_Community_Post_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Title for owner Community Chat \"Testing\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_Title_for_owner_Community_Chat(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter description for Community Chat owner \"Test\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_description_for_Community_Chat_owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Video URL for owner Community Chat \"https://www.google.com/\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_Video_URL_for_owner_Community_Chat(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Upload Image or PDF for owner Community Chat \"C:\\Users\\Basavaraj\\OneDrive - Exalogic Consulting\\Documents\\Lightshot\\\\Screenshot_1.png\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.upload_Image_or_PDF_for_owner_Community_Chat(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Save button for owner Community Chat",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Save_button_for_owner_Community_Chat()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the conformation mesage",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_see_the_conformation_mesage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/Delivery_Disposal_Request_OWNER.feature");
formatter.feature({
  "name": "Delivery Disposal Request Owner",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"c5029c@mail188.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Provis\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on close",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_close()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on myrequest on DeliveryDisposalRequest for owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_myrequest_on_DeliveryDisposalRequest_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on myservice on DeliveryDisposalRequest for owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_myservice_on_DeliveryDisposalRequest_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on SelectaService dropdown on DeliveryDisposalRequest for owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_SelectaService_dropdown_on_DeliveryDisposalRequest_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on DeliveryDisposalRequest for owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_DeliveryDisposalRequest_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Community drop down under DeliveryDisposalRequest for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Community_drop_down_under_DeliveryDisposalRequest_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click any one Community under DeliveryDisposalRequest for owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_any_one_Community_under_DeliveryDisposalRequest_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Precinct drop down under DeliveryDisposalRequest for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Precinct_drop_down_under_DeliveryDisposalRequest_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click any one Precinct under DeliveryDisposalRequest for owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_any_one_Precinct_under_DeliveryDisposalRequest_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Unit Number drop down under DeliveryDisposalRequest for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Unit_Number_drop_down_under_DeliveryDisposalRequest_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click any one Unit Number under DeliveryDisposalRequest for owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_any_one_Unit_Number_under_DeliveryDisposalRequest_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Type of Request under DeliveryDisposalRequest for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Type_of_Request_under_DeliveryDisposalRequest_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click any one Type of Request under DeliveryDisposalRequest for owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_any_one_Type_of_Request_under_DeliveryDisposalRequest_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Number of Items under DeliveryDisposalRequest for owner \"2\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Number_of_Items_under_DeliveryDisposalRequest_for_owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Items Description under DeliveryDisposalRequest for owner \"Testing\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Items_Description_under_DeliveryDisposalRequest_for_owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on DeliveryDisposal Date and select a date for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_DeliveryDisposal_Date_and_select_a_date_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Contact Person Name for owner \" Test\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Contact_Person_Name_for_owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Contact Person Number  for owner\"501238596\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Contact_Person_Number_for_owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Submit button for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Submit_button_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the confomation message",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_see_the_confomation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/MoveOutRequest_Web.feature");
formatter.feature({
  "name": "Move Out Request for Owner",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"c5029c@mail188.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Provis\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on close",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_close()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click  myrequest on Move Out Request for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_myrequest_on_Move_Out_Request_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click  myservice on Move Out Request for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_myservice_on_Move_Out_Request_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click  SelectaService dropdown on Move Out Request for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_SelectaService_dropdown_on_Move_Out_Request_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click  Move Out Request for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_Move_Out_Request_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Community drop down under Move Out Request for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Community_drop_down_under_Move_Out_Request_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any one option Under Community on Move Out Request for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_any_one_option_Under_Community_on_Move_Out_Request_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Precinct drop down on Move Out Request for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Precinct_drop_down_on_Move_Out_Request_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any one option under precinct on Move Out Request for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_any_one_option_under_precinct_on_Move_Out_Request_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Unit Number drop down on Move Out Request for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Unit_Number_drop_down_on_Move_Out_Request_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any one option under unit number on Move Out Request for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_any_one_option_under_unit_number_on_Move_Out_Request_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Reasons for Leaving for Owner \"Job Transfor\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Reasons_for_Leaving_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Location you are moving to  for Owner \"Dubai\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Location_you_are_moving_to_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Furniture Move out Date for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Furniture_Move_out_Date_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select move out Date for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_move_out_Date_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Preferred time for Owner \"13:40\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_Preferred_time_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Move out date Key handover date for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Move_out_date_Key_handover_date_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select one date on Move out date Key handover date for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_one_date_on_Move_out_date_Key_handover_date_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Preferred time under handover date for Owner \"14:40\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_Preferred_time_under_handover_date_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Upload ADDC Bill \"C:\\Users\\Basavaraj\\OneDrive - Exalogic Consulting\\Documents\\Lightshot\\\\Screenshot_1.png\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.upload_ADDC_Bill(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Upload District Cooling \"C:\\Users\\Basavaraj\\OneDrive - Exalogic Consulting\\Documents\\Lightshot\\\\Screenshot_1.png\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.upload_District_Cooling(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on TERMS AND CONDITIONS for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_TERMS_AND_CONDITIONS_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the cofomation mesage",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_see_the_cofomation_mesage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/MoveinWithinBuilding_OWNER.feature");
formatter.feature({
  "name": "Movein Within Building Owner",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"c5029c@mail188.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Provis\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on close",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_close()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on myRequest on MoveinWithinBuilding for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_myRequest_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on myservice on MoveinWithinBuilding for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_myservice_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on service dropdown on MoveinWithinBuilding for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_service_dropdown_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on MoveinWithinBuilding under Select a Service drop down for owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_MoveinWithinBuilding_under_Select_a_Service_drop_down_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Community drop down under MoveinWithinBuilding for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Community_drop_down_under_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any one option Under Community on MoveinWithinBuilding for owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_any_one_option_Under_Community_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Precinct drop down on MoveinWithinBuilding for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Precinct_drop_down_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any one option under precinct on MoveinWithinBuilding for owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_any_one_option_under_precinct_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Unit Number drop down on MoveinWithinBuilding for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Unit_Number_drop_down_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any one option under unit number on MoveinWithinBuilding for owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_any_one_option_under_unit_number_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on next btn on MoveinWithinBuilding for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_next_btn_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter number of Adults on MoveinWithinBuilding for owner \"2\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_number_of_Adults_on_MoveinWithinBuilding_for_owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Nationality dropdown on MoveinWithinBuilding for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Nationality_dropdown_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select Afghan on MoveinWithinBuilding for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.select_Afghan_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Occupation dropdown on MoveinWithinBuilding for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Occupation_dropdown_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select Legal professionals on MoveinWithinBuilding for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.select_Legal_professionals_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on NextButton on MoveinWithinBuilding for owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_NextButton_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Name on MoveinWithinBuilding for owner \"Prakesk\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Name_on_MoveinWithinBuilding_for_owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Email on MoveinWithinBuilding for owner \"prakesk@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Email_on_MoveinWithinBuilding_for_owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter phone no on MoveinWithinBuilding for owner \"501234567\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_phone_no_on_MoveinWithinBuilding_for_owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Emirate of Residence on MoveinWithinBuilding for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Emirate_of_Residence_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select Abu Dhabi on MoveinWithinBuilding for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.select_Abu_Dhabi_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Next button on Emergency Contact page on MoveinWithinBuilding for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Next_button_on_Emergency_Contact_page_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Tenancy Start Date on Occupancy Details page on MoveinWithinBuilding for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Tenancy_Start_Date_on_Occupancy_Details_page_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select one date in Tenancy Start Date on MoveinWithinBuilding for owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_one_date_in_Tenancy_Start_Date_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Tenancy End Date on Occupancy Details page on MoveinWithinBuilding for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Tenancy_End_Date_on_Occupancy_Details_page_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select one date in Tenancy End Date on MoveinWithinBuilding for owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_one_date_in_Tenancy_End_Date_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Confirmed Move-in Date on Occupancy Details page on MoveinWithinBuilding for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Confirmed_Move_in_Date_on_Occupancy_Details_page_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select one date in Confirmed Move-in Date on MoveinWithinBuilding for owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_one_date_in_Confirmed_Move_in_Date_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Time Slot for Lift Booking on MoveinWithinBuilding for owner \"13:40\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_Time_Slot_for_Lift_Booking_on_MoveinWithinBuilding_for_owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "give your ID Proofs on MoveinWithinBuilding for owner \"C:\\Users\\Basavaraj\\OneDrive - Exalogic Consulting\\Documents\\Lightshot\\\\Screenshot_1.png\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.give_your_ID_Proofs_on_MoveinWithinBuilding_for_owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "give your Contract Agreement Copy on MoveinWithinBuilding for owner \"C:\\Users\\Basavaraj\\OneDrive - Exalogic Consulting\\Documents\\Lightshot\\\\Screenshot_1.png\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.give_your_Contract_Agreement_Copy_on_MoveinWithinBuilding_for_owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Rules and Regulations check box on MoveinWithinBuilding for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Rules_and_Regulations_check_box_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on SubmitButtn on MoveinWithinBuilding for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_SubmitButtn_on_MoveinWithinBuilding_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the cofomation message",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_see_the_cofomation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/NOCforTrafficPoliceDamagetoProperty_OWNER.feature");
formatter.feature({
  "name": "NOC for Traffic Police Damage to Property for Owner",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"c5029c@mail188.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Provis\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on close",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_close()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click  myrequest on NOC for Traffic Police Damage to Property for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_myrequest_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click  myservice on NOC for Traffic Police Damage to Property for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_myservice_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click  SelectaService dropdown on NOC for Traffic Police Damage to Property for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_SelectaService_dropdown_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click  NOC for Traffic Police Damage to Property for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_NOC_for_Traffic_Police_Damage_to_Property_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Community drop down under NOC for Traffic Police Damage to Property for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Community_drop_down_under_NOC_for_Traffic_Police_Damage_to_Property_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any one option Under Community on NOC for Traffic Police Damage to Property for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_any_one_option_Under_Community_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Precinct drop down on NOC for Traffic Police Damage to Property for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Precinct_drop_down_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any one option under precinct on NOC for Traffic Police Damage to Property for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_any_one_option_under_precinct_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Unit Number drop down on NOC for Traffic Police Damage to Property for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Unit_Number_drop_down_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any one option under unit number on NOC for Traffic Police Damage to Property for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_any_one_option_under_unit_number_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Upload Driving License on NOC for Traffic Police Damage to Property for Owner \"C:\\Users\\Basavaraj\\OneDrive - Exalogic Consulting\\Documents\\Lightshot\\\\Screenshot_1.png\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.upload_Driving_License_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Upload Local Authority on NOC for Traffic Police Damage to Property for Owner \"C:\\Users\\Basavaraj\\OneDrive - Exalogic Consulting\\Documents\\Lightshot\\\\Screenshot_1.png\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.upload_Local_Authority_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Upload Vehicle Registration Copy on NOC for Traffic Police Damage to Property for Owner \"C:\\Users\\Basavaraj\\OneDrive - Exalogic Consulting\\Documents\\Lightshot\\\\Screenshot_1.png\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.upload_Vehicle_Registration_Copy_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Upload Proof of Payment on NOC for Traffic Police Damage to Property for Owner \"C:\\Users\\Basavaraj\\OneDrive - Exalogic Consulting\\Documents\\Lightshot\\\\Screenshot_1.png\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.upload_Proof_of_Payment_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Comments on NOC for Traffic Police Damage to Property for Owner \"Testing\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Comments_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Submit on NOC for Traffic Police Damage to Property for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Submit_on_NOC_for_Traffic_Police_Damage_to_Property_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view the confrmtion mesage \"413 Request Entity Too Large\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_the_confrmtion_mesage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/Provis.feature");
formatter.feature({
  "name": "Login to Provis ",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"d255d6@maila42.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Provis\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on close",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_close()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on account",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on logout",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page2 title should be \"Login to Provis\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page2_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/ReportanIssueAgainstAnotherUnit_OWNER.feature");
formatter.feature({
  "name": "Report an Issue Against Another Unit owner",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"d255d6@maila42.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Provis\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on close",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_close()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Report an Issue for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Report_an_Issue_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Select Issue Type for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Select_Issue_Type_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Report an Issue Against Another Unit for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Report_an_Issue_Against_Another_Unit_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Complaint Category drop down for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Complaint_Category_drop_down_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Parking for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.select_Parking_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Community for Report an Issue Against Another Unit for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Community_for_Report_an_Issue_Against_Another_Unit_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select Gate\u0026Arc for Report an Issue Against Another Unit for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.select_Gate_Arc_for_Report_an_Issue_Against_Another_Unit_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Precinct for Report an Issue Against Another Unit for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Precinct_for_Report_an_Issue_Against_Another_Unit_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select The Gate for Report an Issue Against Another Unit for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.select_The_Gate_for_Report_an_Issue_Against_Another_Unit_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Unit Number for Report an Issue Against Another Unit for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Unit_Number_for_Report_an_Issue_Against_Another_Unit_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Gatet for Report an Issue Against Another Unit for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.select_Gatet_for_Report_an_Issue_Against_Another_Unit_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select Attachment for Report an Issue Against Another Unit for owner \"C:\\Users\\Basavaraj\\OneDrive - Exalogic Consulting\\Documents\\Lightshot\\\\Screenshot_1.png\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.select_Attachment_for_Report_an_Issue_Against_Another_Unit_for_owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Additional Notes for Report an Issue Against Another Unit for owner \"Testing hdzxjhgufdghmz h mhdsxdcjmdxckugfxcvvfgfgjghfjgytgvbvcvbvmnyjrfggcgjbkcvvvmbbvsdvbkujhgesxgcvjhfz nn\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Additional_Notes_for_Report_an_Issue_Against_Another_Unit_for_owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Submit for Report an Issue Against Another Unit for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Submit_for_Report_an_Issue_Against_Another_Unit_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view the confrmation message \" Request added successfully!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_the_confrmation_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/ReportanIssueinCommonArea_OWNER.feature");
formatter.feature({
  "name": "Report an Issue in Common Area Owner",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"d255d6@maila42.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Provis\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on close",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_close()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Report an Issu for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Report_an_Issu_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Select Issue Typ for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Select_Issue_Typ_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Report an Issue in Common Area for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Report_an_Issue_in_Common_Area_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Community for Report an Issue in Common Area for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Community_for_Report_an_Issue_in_Common_Area_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select GateArc on Community for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.select_GateArc_on_Community_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Precinct drop down for Report an Issue in Common Area for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Precinct_drop_down_for_Report_an_Issue_in_Common_Area_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Arc Retail under precinct for Report an Issue in Common Area for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.select_Arc_Retail_under_precinct_for_Report_an_Issue_in_Common_Area_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Floor drop down for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Floor_drop_down_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select Retails second ground floor for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.select_Retails_second_ground_floor_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Common Area drop down for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Common_Area_drop_down_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select Pizza Express for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.select_Pizza_Express_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Asset Name for owner \"Aditya\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Asset_Name_for_owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Upload a photo for Report an Issue in Common Area for owner \"C:\\Users\\Basavaraj\\OneDrive - Exalogic Consulting\\Documents\\Lightshot\\\\Screenshot_1.png\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.upload_a_photo_for_Report_an_Issue_in_Common_Area_for_owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Additional Note for Report an Issue in Common Area for owner\" Testing vgghfghgukhk yhjgugugu jhffugu jfjggug  hfhff  hftftfv jghggjy fhjfhfhg jgjgg hffj  fhfggg\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Additional_Note_for_Report_an_Issue_in_Common_Area_for_owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on submit for Report an Issue in Common Area for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_submit_for_Report_an_Issue_in_Common_Area_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view the conformation message \" Request added successfully!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_the_conformation_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/StaroftheMonthNomination_OWNER.feature");
formatter.feature({
  "name": "Star of the Month Nomination",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"d255d6@maila42.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Provis\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on close",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_close()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on My Comunity for owner Star of the Month Nomination",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_My_Comunity_for_owner_Star_of_the_Month_Nomination()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Al Muneera for owner Star of the Month Nomination",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Al_Muneera_for_owner_Star_of_the_Month_Nomination()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on StaroftheMonthNomination for owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_StaroftheMonthNomination_for_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Name of the Employee for Star of the Month Nomination \"subhaa\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_Name_of_the_Employee_for_Star_of_the_Month_Nomination(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Department drop down for Star of the Month Nomination",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Department_drop_down_for_Star_of_the_Month_Nomination()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Administration for Star of the Month Nomination",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_Administration_for_Star_of_the_Month_Nomination()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Reason for Nomination for Star of the Month Nomination \"Testing tgtdtrfkhytrsdghgjfgd drdtrfthj ndtdtgf\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Reason_for_Nomination_for_Star_of_the_Month_Nomination(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on submit button for StaroftheMonthNomination owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_submit_button_for_StaroftheMonthNomination_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/Visitor_Registration.feature");
formatter.feature({
  "name": "Visitor Registration for Owner",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"c5029c@mail188.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Provis\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on close",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_close()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click  myrequest on Visitor Registration for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_myrequest_on_Visitor_Registration_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click  myservice on Visitor Registration for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_myservice_on_Visitor_Registration_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click  SelectaService dropdown on Visitor Registration for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_SelectaService_dropdown_on_Visitor_Registration_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click  Visitor Registration for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_Visitor_Registration_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Visitor Name on Visitor Registration for Owner \"Rajesh\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Visitor_Name_on_Visitor_Registration_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Visitor Mobile Number on Visitor Registration for Owner \"586012366\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Visitor_Mobile_Number_on_Visitor_Registration_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Visitor Email on Visitor Registration for Owner \"rajesh@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Visitor_Email_on_Visitor_Registration_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "upload Visitor ID Proof on Visitor Registration for Owner \"C:\\Users\\Basavaraj\\OneDrive - Exalogic Consulting\\Documents\\Lightshot\\\\Screenshot_1.png\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.upload_Visitor_ID_Proof_on_Visitor_Registration_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Community drop down under on Visitor Registration for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Community_drop_down_under_on_Visitor_Registration_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any one option Under Community on Visitor Registration for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_any_one_option_Under_Community_on_Visitor_Registration_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Precinct drop down on Visitor Registration for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Precinct_drop_down_on_Visitor_Registration_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any one option under precinct on Visitor Registration for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_any_one_option_under_precinct_on_Visitor_Registration_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Unit Number drop down on Visitor Registration for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Unit_Number_drop_down_on_Visitor_Registration_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any one option under unit number on Visitor Registration for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_any_one_option_under_unit_number_on_Visitor_Registration_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Check In Date on Visitor Registration for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Check_In_Date_on_Visitor_Registration_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select any date on Check In Date on Visitor Registration for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_any_date_on_Check_In_Date_on_Visitor_Registration_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Check In Time on Visitor Registration for Owner \"1230PM\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Check_In_Time_on_Visitor_Registration_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Expected Check Out Date on Visitor Registration for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Expected_Check_Out_Date_on_Visitor_Registration_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select any date on Expected Check Out Date on Visitor Registration for Owner",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_any_date_on_Expected_Check_Out_Date_on_Visitor_Registration_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Additional Notes on Visitor Registration for Owner \"Testing\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Additional_Notes_on_Visitor_Registration_for_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Submit on Visitor Registration for Owner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Submit_on_Visitor_Registration_for_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view the cofomation message",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_the_cofomation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});