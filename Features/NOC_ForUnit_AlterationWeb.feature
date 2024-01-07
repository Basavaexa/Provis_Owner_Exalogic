Feature: NOC for Unit Alteration
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "f2726e@mail7a1.com" and password as "EX@(c&#e)93$"
And Click on login
Then page title should be "Provis"
And user click on close
And Click  myrequest on NOC for Traffic Police Damage to Property for Owner
And click  myservice on NOC for Traffic Police Damage to Property for Owner
And click  SelectaService dropdown on NOC for Traffic Police Damage to Property for Owner


And Select NOC for unit alteration
And Click and select the community
And Click and select the precinct
And Click and select the Unit

And Enter Type of alteration "Enlarging hall"
And Enter Name of contractor "Basava"
And Enter Contact person name "QA"
And Enter Contact pereson number "500000000"
And Enter email Address "Testtest@gmail.com"
And Enter consultant name "Basava Bhanji"
And Upload Architecture layout "C:\Users\Basavaraj\Downloads\\AAAAAA.pdf"
And Uploads Trade liscence of appointed contractor "C:\Users\Basavaraj\Downloads\\AAAAAA.pdf"
And Enter the Additional note "Testing"
And Click on submit
