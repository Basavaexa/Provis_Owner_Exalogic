Feature: Movein Within Building Owner
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "c5029c@mail188.com" and password as "EX@(c&#e)93$"
And Click on login
Then page title should be "Provis"
And user click on close
Then click on myRequest on MoveinWithinBuilding for owner 
Then Click on myservice on MoveinWithinBuilding for owner
Then Click on service dropdown on MoveinWithinBuilding for owner
And Click on MoveinWithinBuilding under Select a Service drop down for owner
Then Click on Community drop down under MoveinWithinBuilding for owner 
And Select any one option Under Community on MoveinWithinBuilding for owner
Then Click on Precinct drop down on MoveinWithinBuilding for owner
And Select any one option under precinct on MoveinWithinBuilding for owner
Then Click on Unit Number drop down on MoveinWithinBuilding for owner
And Select any one option under unit number on MoveinWithinBuilding for owner
Then click on next btn on MoveinWithinBuilding for owner
Then Enter number of Adults on MoveinWithinBuilding for owner "2" 
Then click on Nationality dropdown on MoveinWithinBuilding for owner
Then select Afghan on MoveinWithinBuilding for owner
Then click on Occupation dropdown on MoveinWithinBuilding for owner
Then select Legal professionals on MoveinWithinBuilding for owner
And Click on NextButton on MoveinWithinBuilding for owner
Then Enter Name on MoveinWithinBuilding for owner "Prakesk"
Then enter Email on MoveinWithinBuilding for owner "prakesk@gmail.com"
Then Enter phone no on MoveinWithinBuilding for owner "501234567"
Then click on Emirate of Residence on MoveinWithinBuilding for owner 
Then select Abu Dhabi on MoveinWithinBuilding for owner
Then click on Next button on Emergency Contact page on MoveinWithinBuilding for owner
Then Click on Tenancy Start Date on Occupancy Details page on MoveinWithinBuilding for owner
And Select one date in Tenancy Start Date on MoveinWithinBuilding for owner
Then Click on Tenancy End Date on Occupancy Details page on MoveinWithinBuilding for owner
And Select one date in Tenancy End Date on MoveinWithinBuilding for owner
Then Click on Confirmed Move-in Date on Occupancy Details page on MoveinWithinBuilding for owner
And Select one date in Confirmed Move-in Date on MoveinWithinBuilding for owner
And Enter Time Slot for Lift Booking on MoveinWithinBuilding for owner "13:40"
Then give your ID Proofs on MoveinWithinBuilding for owner "C:\Users\Basavaraj\OneDrive - Exalogic Consulting\Documents\Lightshot\\Screenshot_1.png"
Then give your Contract Agreement Copy on MoveinWithinBuilding for owner "C:\Users\Basavaraj\OneDrive - Exalogic Consulting\Documents\Lightshot\\Screenshot_1.png"
Then click on Rules and Regulations check box on MoveinWithinBuilding for owner
Then Click on SubmitButtn on MoveinWithinBuilding for owner
Then User can see the cofomation message
Then close browser