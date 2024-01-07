Feature: NOC for Traffic Police Damage to Property for Owner
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "c5029c@mail188.com" and password as "EX@(c&#e)93$"
And Click on login
Then page title should be "Provis"
And user click on close

And Click  myrequest on NOC for Traffic Police Damage to Property for Owner

And click  myservice on NOC for Traffic Police Damage to Property for Owner
And click  SelectaService dropdown on NOC for Traffic Police Damage to Property for Owner
And click  NOC for Traffic Police Damage to Property for Owner
Then Click on Community drop down under NOC for Traffic Police Damage to Property for Owner 
And Select any one option Under Community on NOC for Traffic Police Damage to Property for Owner
Then Click on Precinct drop down on NOC for Traffic Police Damage to Property for Owner
And Select any one option under precinct on NOC for Traffic Police Damage to Property for Owner
Then Click on Unit Number drop down on NOC for Traffic Police Damage to Property for Owner
And Select any one option under unit number on NOC for Traffic Police Damage to Property for Owner
Then Upload Driving License on NOC for Traffic Police Damage to Property for Owner "C:\Users\Basavaraj\OneDrive - Exalogic Consulting\Documents\Lightshot\\Screenshot_1.png"
Then Upload Local Authority on NOC for Traffic Police Damage to Property for Owner "C:\Users\Basavaraj\OneDrive - Exalogic Consulting\Documents\Lightshot\\Screenshot_1.png"
Then Upload Vehicle Registration Copy on NOC for Traffic Police Damage to Property for Owner "C:\Users\Basavaraj\OneDrive - Exalogic Consulting\Documents\Lightshot\\Screenshot_1.png"
Then Upload Proof of Payment on NOC for Traffic Police Damage to Property for Owner "C:\Users\Basavaraj\OneDrive - Exalogic Consulting\Documents\Lightshot\\Screenshot_1.png"
Then Enter Comments on NOC for Traffic Police Damage to Property for Owner "Testing"
Then Click on Submit on NOC for Traffic Police Damage to Property for Owner
Then User can view the confrmtion mesage "413 Request Entity Too Large"
Then close browser


