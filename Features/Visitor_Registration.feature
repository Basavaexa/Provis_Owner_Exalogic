Feature:  Visitor Registration for Owner
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "c5029c@mail188.com" and password as "EX@(c&#e)93$"
And Click on login
Then page title should be "Provis"
And user click on close
And Click  myrequest on Visitor Registration for Owner
And click  myservice on Visitor Registration for Owner
And click  SelectaService dropdown on Visitor Registration for Owner
And click  Visitor Registration for Owner
Then enter Visitor Name on Visitor Registration for Owner "Rajesh"
Then enter Visitor Mobile Number on Visitor Registration for Owner "586012366"
Then enter Visitor Email on Visitor Registration for Owner "rajesh@gmail.com"
Then upload Visitor ID Proof on Visitor Registration for Owner "C:\Users\Basavaraj\OneDrive - Exalogic Consulting\Documents\Lightshot\\Screenshot_1.png"
Then Click on Community drop down under on Visitor Registration for Owner 
And Select any one option Under Community on Visitor Registration for Owner
Then Click on Precinct drop down on Visitor Registration for Owner
And Select any one option under precinct on Visitor Registration for Owner
Then Click on Unit Number drop down on Visitor Registration for Owner
And Select any one option under unit number on Visitor Registration for Owner
Then click on Check In Date on Visitor Registration for Owner
And select any date on Check In Date on Visitor Registration for Owner
Then enter Check In Time on Visitor Registration for Owner "1230PM"
Then click on Expected Check Out Date on Visitor Registration for Owner
And select any date on Expected Check Out Date on Visitor Registration for Owner
Then Enter Additional Notes on Visitor Registration for Owner "Testing"
Then Click on Submit on Visitor Registration for Owner 
Then User can view the cofomation message
Then close browser