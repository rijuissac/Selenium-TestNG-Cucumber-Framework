Feature: Login to the application

  @regression 
  Scenario: login to the application as an admin
    Given user navigate to url for login
    When user enters username <username> and password <password>
    And user clicks on submit
    Then user successfully lands to dashboard page with url "https://practicesoftwaretesting.com/admin/dashboard"
    Examples:
    |username|password|
		|admin@practicesoftwaretesting.com|welcome01|
	
	@regression
	Scenario: login to the application as customer
		Given user navigate to url for login
    When user enters username <username> and password <password>
    And user clicks on submit
    Then user successfully lands to dashboard page with url "https://practicesoftwaretesting.com/account"
    Examples:
    |username|password|
		|customer@practicesoftwaretesting.com|welcome01|
	