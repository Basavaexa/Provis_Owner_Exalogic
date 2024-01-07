Feature: NOC for Unit sale
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


And Select NOC for unit sale web
And Click and select the community DD
And Click and select the precinct DD
And Click and select the Unit DD

And Enter Buyer name
And Enter Buyer Contact number
And Enter buyer email
And Upload ADDC Certificate
And Upload Under taking to transfer utilities
And Upload buyer passport front side copy
And Upload buyer passport back side copy
And Upload seller passport front side copy
And Upload seller passport back side copy
And Upload title deed
And Upload MOU
And Upload buyer information sheet
And Uplaod assignment of service charge seller
And Upload District cooling clearance
And Upload Gas clearance
And Upload Undertaking to pay service charges
And Check the checkbox
And Click on submit and pay to proceed

#-----------------------------Payemnt---------------------
Then Enter Card Number for owner Amenity Booking "5204740009900014"
And Click on Expiry Month for owner Amenity Booking
And Select the Month for owner Amenity Booking
And Click on Expiry Year for owner Amenity Booking
And Select Year for owner Amenity Booking
And Enter CVV for owner Amenity Booking "123"
Then Click on Make Payment for owner Amenity Booking
#//-------------------------------------------------------------------//

