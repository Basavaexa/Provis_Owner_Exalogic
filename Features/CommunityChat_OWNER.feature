Feature: Community Chat
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "d255d6@maila42.com" and password as "EX@(c&#e)93$"
And Click on login
Then page title should be "Provis"
And user click on close
Then Click on My Comunity for owner Community Chat
Then click on Al Muneera for owner Community Chat
Then click on Community Chat for owner
Then click on Create Community Post for owner
And Enter Title for owner Community Chat "Testing"
And Enter description for Community Chat owner "Test"
And Enter Video URL for owner Community Chat "https://www.google.com/"
And Upload Image or PDF for owner Community Chat "C:\Users\Basavaraj\OneDrive - Exalogic Consulting\Documents\Lightshot\\Screenshot_1.png"
And Click on Save button for owner Community Chat
Then User can see the conformation mesage
Then close browser