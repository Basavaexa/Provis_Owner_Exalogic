Feature: Move Out Request for Owner
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "c5029c@mail188.com" and password as "EX@(c&#e)93$"
And Click on login
Then page title should be "Provis"
And user click on close
And Click  myrequest on Move Out Request for Owner
And click  myservice on Move Out Request for Owner
And click  SelectaService dropdown on Move Out Request for Owner
And click  Move Out Request for Owner
Then Click on Community drop down under Move Out Request for Owner 
And Select any one option Under Community on Move Out Request for Owner
Then Click on Precinct drop down on Move Out Request for Owner
And Select any one option under precinct on Move Out Request for Owner
Then Click on Unit Number drop down on Move Out Request for Owner
And Select any one option under unit number on Move Out Request for Owner
Then Enter Reasons for Leaving for Owner "Job Transfor"
Then Enter Location you are moving to  for Owner "Dubai"
Then Click on Furniture Move out Date for Owner
And Select move out Date for Owner
And Enter Preferred time for Owner "13:40"
Then Click on Move out date Key handover date for Owner
And Select one date on Move out date Key handover date for Owner
And Enter Preferred time under handover date for Owner "14:40"
Then Upload ADDC Bill "C:\Users\Basavaraj\OneDrive - Exalogic Consulting\Documents\Lightshot\\Screenshot_1.png"
Then Upload District Cooling "C:\Users\Basavaraj\OneDrive - Exalogic Consulting\Documents\Lightshot\\Screenshot_1.png"
Then Click on TERMS AND CONDITIONS for Owner
#Then Click on Submit buton Move Out Request for Owner
Then User can see the cofomation mesage
Then close browser