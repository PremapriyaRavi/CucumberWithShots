Feature: To validate the login functionality of CrazySales Application
#It executes before every scenario
#common for both scenario
Background:
   	Given The user has to be in the CrazySales login page
Scenario: To validate the login functionality with invalid credentials
		When The user fill the username and password
		And click login
		Then The user should navigate to the invalid login page
	
Scenario Outline: To validate the registration functionality 
		When The user fill the "<email>" and "<password>" and "<confirmpw>"
		And  click on create new button
		Then The user registered sucessfully
  Examples:
     |	email	|	password	|	confirmpw	|
     |	Shobi	|	123456		|	123456		|
     #|	Pinky	|	asdf			|	asdf			|