Feature: Classes & Offering
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "d255d6@maila42.com" and password as "EX@(c&#e)93$"
And Click on login
Then page title should be "Provis"
And user click on close
Then Click on My Comunity for owner Classesoffering
Then click on Al Muneera for owner Classesoffering
Then click on ClassesOffering for owner
Then click on book now for Colorful Cuckoos Art Class for owner Classesoffering
Then click on Select Your Package for Colorful Cuckoos Art Class
Then click on Select Select Your Schedule for Colorful Cuckoos Art Class
Then click on unit number drop down for owner Classesoffering
Then select the unit number for owner Classesoffering
Then enter the Applicant Name for owner Classesoffering "Test"
Then enter the Applicant Age for owner Classesoffering "25"
Then click on Terms Conditions for owner Classesoffering
Then click on PayBook for owner Classesoffering
Then Enter Card Number for owner Classesoffering "5204740009900014"
And Click on Expiry Month for owner Classesoffering
And Select the Month for owner Classesoffering
And Click on Expiry Year for owner Classesoffering
And Select Year for owner Classesoffering
And Enter CVV for owner Classesoffering "123"
Then Click on Make Payment for owner Classesoffering
#Then Click on Submitbtn for owner Classesoffering
#Then Click on Download receipt for owner Classesoffering
#And Click on Download Arrow for owner Classesoffering
#Then User can see the conformaton message
Then close browser



 