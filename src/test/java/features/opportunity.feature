Feature: Creating the Opportunity

#Background: Login with postitive data
#Given enter the username 'hari.radhakrishnan@qeagle.com'
#And enter the password  'Testleaf$321'
#When click on submit button
#Then Home page should be displayed

Scenario: TC_001 creating the opportunity
Given Click on toggle menu button from the left corner
And Click view All
And click Sales from App Launcher
And Click on Opportunity tab 
And Click on New button
And Enter Opportunity name
And Choose close date as Today
And Select Stage
When click Save
Then VerifyOpportunity Name


Scenario: TC_002 Edit the Opportunity
Given Click on toggle menu button from the left corner
And Click view All
And click Sales from App Launcher
And Click on Opportunity tab 
And  Search the Opportunity by name
And Click on the Dropdown icon
And Select Edit
And Choose close date as Tomorrow date
And Select Stage as Perception Analysis
And Select Deliver Status as In Progress
And Enter Description as SalesForce
When Click on Save
Then Verify edited opportunity
