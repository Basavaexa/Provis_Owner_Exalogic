Feature:  ADD TRIP for Owner
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "c5029c@mail188.com" and password as "EX@(c&#e)93$"
And Click on login
Then page title should be "Provis"
And user click on close
And Click  myrequest on add trip for Owner
And click  Add Trip for Owner
Then click on Add trip link for Owner
Then Click on Community drop down under on Add Trip for Owner 
And Select any one option Under Community on Add Trip for Owner
Then Click on Precinct drop down on Add Trip for Owner
And Select any one option under precinct on Add Trip for Owner
Then Click on Unit Number drop down on Add Trip for Owner
And Select any one option under unit number on Add Trip for Owner
Then click on Expected Start Date on Add Trip for Owner
Then select any date for Expected start on Add Trip for Owner 
Then enter on Expected Time on Add Trip for Owner "10:30"
Then click on Expected Last Date on Add Trip for Owner
Then select any date for Expected last on Add Trip for Owner 
Then enter on Expected End Time on Add Trip for Owner "12:30"
Then enter Emergency Contact Name on Add Trip for Owner "Test"
Then enter Emergency Contact Number on Add Trip for Owner "501236544"
Then enter Emergency Contact Email on Add Trip for Owner "rajesh@gmail.com"
Then enter Emergency Contact Emirates Id on Add Trip for Owner "654789012345678"
Then enter Comment on Add Trip for Owner "Testing"
Then click on submit on Add Trip for Owner 
Then User can see the conformation message
Then close browser