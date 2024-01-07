Feature: Access Pass Request Owner
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "d255d6@maila42.com" and password as "EX@(c&#e)93$"
And Click on login
Then page title should be "Provis"
And user click on close
Then click on MyRequest for AccessPassRequest of owner
Then click on MyService on AccessPassRequest of owner
Then click on Service drop down on AccessPassRequest of owner
And click on AccessPassRequest under Select a Service drop down of owner
Then Click on Community drop down under AccessPassRequest of owner
And Select any one option Under Community on AccessPassRequest of owner
Then Click on Precinct drop down on AccessPassRequest of owner
And Select any one option under precinct on AccessPassRequest of owner
Then Click on Unit Number drop down on AccessPassRequest of owner
And Select any one option under unit number on AccessPassRequest of owner
Then Enter Number of Cards of owner "2"
Then click on Reason for Request for owner
Then Enter Remarks of owner "sdgfedygtedffdchffhfgdhfdrfeddtrddfdccgfccdcgf"
And Click on Terms and Condition of owner
Then Click on Submit&Pay of owner
Then User can view the confmtion mesage "Stored Card Details"
Then close browser
