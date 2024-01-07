Feature: Report an Issue Against Another Unit owner
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "d255d6@maila42.com" and password as "EX@(c&#e)93$"
And Click on login
Then page title should be "Provis"
And user click on close
Then click on Report an Issue for owner
Then click on Select Issue Type for owner
Then click on Report an Issue Against Another Unit for owner
Then click on Complaint Category drop down for owner
Then Select Parking for owner
Then click on Community for Report an Issue Against Another Unit for owner
Then select Gate&Arc for Report an Issue Against Another Unit for owner
Then click on Precinct for Report an Issue Against Another Unit for owner
Then select The Gate for Report an Issue Against Another Unit for owner
Then click on Unit Number for Report an Issue Against Another Unit for owner
Then Select Gatet for Report an Issue Against Another Unit for owner
Then select Attachment for Report an Issue Against Another Unit for owner "C:\Users\Basavaraj\OneDrive - Exalogic Consulting\Documents\Lightshot\\Screenshot_1.png"
Then Enter Additional Notes for Report an Issue Against Another Unit for owner "Testing hdzxjhgufdghmz h mhdsxdcjmdxckugfxcvvfgfgjghfjgytgvbvcvbvmnyjrfggcgjbkcvvvmbbvsdvbkujhgesxgcvjhfz nn"
Then Click on Submit for Report an Issue Against Another Unit for owner
Then User can view the confrmation message " Request added successfully!"
Then close browser