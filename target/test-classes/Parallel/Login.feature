@Login
Feature: Testing the Login functionality of caseup

  Scenario Outline: Checking Login functionality with negative input
    When user navigate to the caseup baseurl
    When enter the email "<Email>"
    Then click on submit buttonn
    And check the validation message

    Examples: 
      | Email            |
      | .test@gmail.com  |
      | .test.@gmail.com |
      |                  |

  Scenario Outline: Checking Login functionality with Invalid credentials
    When enter the email "<Email>"
    Then click on submit buttonn
    And check the validation alert

    Examples: 
      | Email              |
      | Load.user@test.com |

  Scenario Outline: Checking Login functionality with valid Email with wrong password
    When enter the email "<Email>"
    Then click on submit buttonn
    And enter the password "<Password>"
    Then click on login button
    And check the validation message for wrong password.

    Examples: 
      | Email               | Password |
      | Load.user51@test.com |    12345 |

  Scenario Outline: Checking Login functionality with valid credential
    When enter the email "<Email>"
    Then click on submit buttonn
    And enter the password "<Password>"
    Then click on login button

    Examples: 
      | Email           | Password |
      | qa.guest@mailinator.com | Test@123 |
