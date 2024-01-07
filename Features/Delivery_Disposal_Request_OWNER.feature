Feature: Delivery Disposal Request Owner
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "c5029c@mail188.com" and password as "EX@(c&#e)93$"
And Click on login
Then page title should be "Provis"
And user click on close
And Click on myrequest on DeliveryDisposalRequest for owner 
And click on myservice on DeliveryDisposalRequest for owner
And click on SelectaService dropdown on DeliveryDisposalRequest for owner
And click on DeliveryDisposalRequest for owner
Then Click on Community drop down under DeliveryDisposalRequest for owner
And Click any one Community under DeliveryDisposalRequest for owner
Then Click on Precinct drop down under DeliveryDisposalRequest for owner
And Click any one Precinct under DeliveryDisposalRequest for owner
Then Click on Unit Number drop down under DeliveryDisposalRequest for owner
And Click any one Unit Number under DeliveryDisposalRequest for owner
Then Click on Type of Request under DeliveryDisposalRequest for owner
And Click any one Type of Request under DeliveryDisposalRequest for owner
Then Enter Number of Items under DeliveryDisposalRequest for owner "2"
Then Enter Items Description under DeliveryDisposalRequest for owner "Testing"
Then Click on DeliveryDisposal Date and select a date for owner
Then Enter Contact Person Name for owner " Test"
Then Enter Contact Person Number  for owner"501238596"
Then Enter Submit button for owner
Then User can see the confomation message
Then close browser