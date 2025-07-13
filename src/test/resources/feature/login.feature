Feature: Login to the application

  @regression
  Scenario Outline: login to the application
    Given user navigate to url for login
    When user enters username <username> and password <password>
    And clicks on submit
    Then user sucessfully lands to dashboard page
    Examples:
    |username	|password		|
		|admin		|admin			|
		|user1		|asd123456	|	