Feature: Report an Issue in Common Area Owner
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "d255d6@maila42.com" and password as "EX@(c&#e)93$"
And Click on login
Then page title should be "Provis"
And user click on close
Then click on Report an Issu for owner
Then click on Select Issue Typ for owner
Then click on Report an Issue in Common Area for owner
Then click on Community for Report an Issue in Common Area for owner
Then Select GateArc on Community for owner
Then click on Precinct drop down for Report an Issue in Common Area for owner
Then Select Arc Retail under precinct for Report an Issue in Common Area for owner
Then click on Floor drop down for owner
Then select Retails second ground floor for owner
Then click on Common Area drop down for owner
Then select Pizza Express for owner
Then enter Asset Name for owner "Aditya"
Then Upload a photo for Report an Issue in Common Area for owner "C:\Users\Basavaraj\OneDrive - Exalogic Consulting\Documents\Lightshot\\Screenshot_1.png" 
Then Enter Additional Note for Report an Issue in Common Area for owner" Testing vgghfghgukhk yhjgugugu jhffugu jfjggug  hfhff  hftftfv jghggjy fhjfhfhg jgjgg hffj  fhfggg"
Then click on submit for Report an Issue in Common Area for owner
Then User can view the conformation message " Request added successfully!"
Then close browser