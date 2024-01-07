Feature: Star of the Month Nomination
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "d255d6@maila42.com" and password as "EX@(c&#e)93$"
And Click on login
Then page title should be "Provis"
And user click on close
Then Click on My Comunity for owner Star of the Month Nomination
Then click on Al Muneera for owner Star of the Month Nomination
Then click on StaroftheMonthNomination for owner
And Enter Name of the Employee for Star of the Month Nomination "subhaa"
And Click on Department drop down for Star of the Month Nomination
And Select Administration for Star of the Month Nomination
Then Enter Reason for Nomination for Star of the Month Nomination "Testing tgtdtrfkhytrsdghgjfgd drdtrfthj ndtdtgf"
And Click on submit button for StaroftheMonthNomination owner
Then close browser