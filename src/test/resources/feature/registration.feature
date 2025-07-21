@regression
Feature: Registration Scenarios

Background: User navigates to the registration page
  Given user is on the home page
  When user clicks on the Sign in link
  And user clicks on the Register your account hyperlink
  Then user should be navigated to the registration URL "https://practicesoftwaretesting.com/auth/register"

Scenario: Successful registration with all mandatory fields
  When user enters registration details:
    | firstname   | RIJU                      |
    | lastname    | ISSAC                     |
    | dob         | 1987-03-12                |
    | street      | 71 ONEWA RD               |
    | postalCode  | 0627                      |
    | city        | Auckland                  |
    | phone       | 0223466062                |
    | state       | Auckland                  |
    | country     | New Zealand               |
    | email       | riju_anjilikkal@yahoo.com |
    | password    | Anjilikkal@123            |
  And user clicks on the Register button
  Then user should be navigated to the login page URL "https://practicesoftwaretesting.com/auth/login"

Scenario: Registration fails when email is missing
  When user enters registration details:
    | firstname   | RIJU           |
    | lastname    | ISSAC          |
    | dob         | 1987-03-12     |
    | street      | 71 ONEWA RD    |
    | postalCode  | 0627           |
    | city        | Auckland       |
    | phone       | 0223466062     |
    | state       | Auckland       |
    | country     | New Zealand    |
    | password    | Anjilikkal@123 |
  And user clicks on the Register button
  Then user should see error messages:
    |Email is required|

Scenario: Registration fails when email and phone are missing
  When user enters registration details:
    | firstname   | RIJU           |
    | lastname    | ISSAC          |
    | dob         | 1987-03-12     |
    | street      | 71 ONEWA RD    |
    | postalCode  | 0627           |
    | city        | Auckland       |
    | state       | Auckland       |
    | country     | New Zealand    |
    | password    | Anjilikkal@123 |
  And user clicks on the Register button
  Then user should see error messages:
    |Email is required|
    |Phone is required.|