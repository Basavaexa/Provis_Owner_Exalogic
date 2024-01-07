Feature: Amenity Booking
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "d255d6@maila42.com" and password as "EX@(c&#e)93$"
And Click on login
Then page title should be "Provis"
And user click on close
Then Click on My Comunity for owner Amenity Booking
Then click on Al Muneera for owner Amenity Booking
Then click on Amenity Booking for owner
And click on Book button Amenity Booking
Then click on Unit drop down for Amenity Booking
And select unit no for Amenity Booking
Then click on Check In Date for Amenity Booking
And select one date in check in date for Amenity Booking
Then select Time Slot for Amenity Booking
Then click on pay book button under Amenity Booking for owner
Then Enter Card Number for owner Amenity Booking "5204740009900014"
And Click on Expiry Month for owner Amenity Booking
And Select the Month for owner Amenity Booking
And Click on Expiry Year for owner Amenity Booking
And Select Year for owner Amenity Booking
And Enter CVV for owner Amenity Booking "123"
Then Click on Make Payment for owner Amenity Booking
#Then Click on Submitbtn for owner Amenity Booking
#Then Click on Download receipt for owner Amenity Booking
#And Click on Download Arrow for owner Amenity Booking
#Then User can see the conformation messag
Then close browser
