Feature: Customers 

Scenario: Add new customer
	Given user launch chrome browser
	When user opens url "http://admin-demo.nopcommerce.com/login"
	And user enters Email as "admin@yourstore.com" and Password as "admin"
	And click on login
	Then user can view dashboard
	When user click on customers menu
	And click on customers menu item
	And click on add new button
	Then user can view add new customer page
	When user enter customer info
	And click on save button
	Then user can view confirmation message "The new customer has been added successfully."
	And close browser
	
#Scenario: Search Customer by Email ID
#
#	Given user launch chrome browser
#	When user opens url "http://admin-demo.nopcommerce.com/login"
#	And user enters Email as "admin@yourstore.com" and Password as "admin"
#	And click on login
#	Then user can view dashboard
#	When user click on customers menu
#	And click on customers menu item
#	And Enter Customer Email
#	When click on search button
#	Then user should found Email in the search table
#	And close browser
	