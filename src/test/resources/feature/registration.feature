Feature: Registration scenarios

Background: user navigates to registration link
When user is in home page
And user clicks on the sign in field
And user click on Register your account hyperlink
Then user is navigated to registration url "https://practicesoftwaretesting.com/auth/register"

Scenario: User able to register with all mandatory fields
  When user enters registration details
    | firstname   | RIJU                        |
    | lastname    | ISSAC                       |
    | dob         | 1987-03-12                  |
    | street      | 71 ONEWA RD                 |
    | postalCode  | 0627                        |
    | city        | Auckland                    |
    | phone       | 0223466062                  |
    | state       | Auckland                    |
    | country     | New Zealand                 |
    | email       | riju_anjilikkal@yahoo.com   |
    | password    | Anjilikkal@123              |
  And user clicks on the Register button
  Then application navigates to login page URL "https://practicesoftwaretesting.com/auth/login"

Scenario: User fails to register when email is missing
  When user enters registration details
    | firstname   | RIJU                      |
    | lastname    | ISSAC                     |
    | dob         | 1987-03-12                |
    | street      | 71 ONEWA RD               |
    | postalCode  | 0627                      |
    | city        | Auckland                  |
    | phone       | 0223466062                |
    | state       | Auckland                  |
    | country     | New Zealand               |
    | password    | Anjilikkal@123            |
  And user clicks on the Register button
  Then user sees an error message "Email is required"

Scenario: user fails to register with Email and Phone Number missing
  When user enters registration details
    | firstname   | RIJU                      |
    | lastname    | ISSAC                     |
    | dob         | 1987-03-12                |
    | street      | 71 ONEWA RD               |
    | postalCode  | 0627                      |
    | city        | Auckland                  |
    | state       | Auckland                  |
    | country     | New Zealand               |
    | password    | Anjilikkal@123            |
  And user clicks on the Register button
  Then user sees an error message "Email is required" & "Phone is required."
