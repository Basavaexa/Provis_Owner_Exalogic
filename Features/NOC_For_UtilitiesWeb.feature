Feature: NOC for Traffic Police Damage to Property for Owner
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


And Click and Select the NOC for utilities
And Click and select the community DD
And Click and select the precinct DD
And Click and select the Unit DD

And Upload title deed document "C:\Users\Basavaraj\Downloads\\AAAAAA.pdf"
And Upload ADDC clearance document "C:\Users\Basavaraj\Downloads\\AAAAAA.pdf"
And Upload owner EID Passport front copy "C:\Users\Basavaraj\Downloads\\AAAAAA.pdf"
And Upload owner EID Passport back copy "C:\Users\Basavaraj\Downloads\\AAAAAA.pdf"
And Select the checkbox
And Click on Submit for NFU

#-----------------------------Payemnt---------------------
Then Enter Card Number for owner Amenity Booking "5204740009900014"
And Click on Expiry Month for owner Amenity Booking
And Select the Month for owner Amenity Booking
And Click on Expiry Year for owner Amenity Booking
And Select Year for owner Amenity Booking
And Enter CVV for owner Amenity Booking "123"
Then Click on Make Payment for owner Amenity Booking
#//-------------------------------------------------------------------//
