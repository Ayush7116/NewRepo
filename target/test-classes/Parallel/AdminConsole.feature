@Admin_console
Feature: Testing the Admin Console functionality of caseUp

  Background: 
    Given user navigate to the caseup baseurl
    When login with account owner role
    Then delete all previous files
    When click on my profile logo
    And click on the admin Console button
    And click on the users button
    Then remove invited user if user already invitited
    Then logout current user
    Scenario: Verify the Invite User and Remove User functionalities through the Admin Console specifically for users with the Manager role
    When login with account manager role
    Then delete all previous files
    When click on my profile logo
    And click on the admin Console button
    And click on the users button
    Then invite user and accecpt invite in mailinator
    Then create user window open then enter full name
    And click on password button and enter password 
    Then click on confirm password button and same password
    Then check the term and condition 
    And click on create account
    Then logout current user
    When login with account owner role
    When click on my profile logo
    And click on the admin Console button
    And click on the users button
    Then click on the toggle button for invited email
    Then click on remove button in toggle button
    Then click on no,remove user button
    Scenario: Verify the Invite User and Assign to New User functionalities through the Admin Console specifically for users with the Manager role.
    When login with account manager role
    Then delete all previous files
    When click on my profile logo
    And click on the admin Console button
    And click on the users button
    Then invite user and accecpt invite in mailinator
    Then create user window open then enter full name
    And click on password button and enter password 
    Then click on confirm password button and same password
    Then check the term and condition 
    And click on create account
    Then logout current user
    When login with account owner role
    When click on my profile logo
    And click on the admin Console button
    And click on the users button
    Then click on the toggle button for invited email
    Then click on remove button in toggle button
    Then click on yes assign new user button
    Then enter email to assign deposition
    Scenario: Verify the Invite User and Remove User functionalities through the Admin Console specifically for users with the Account owner role
    When login with account owner role
    Then delete all previous files
    When click on my profile logo
    And click on the admin Console button
    And click on the users button
    Then invite user and accecpt invite in mailinator
    Then create user window open then enter full name
    And click on password button and enter password 
    Then click on confirm password button and same password
    Then check the term and condition 
    And click on create account
    Then logout current user
    When login with account owner role
    When click on my profile logo
    And click on the admin Console button
    And click on the users button
    Then click on the toggle button for invited email
    Then click on remove button in toggle button
    Then click on no,remove user button
    Scenario: Verify the Invite User and Assign to new User functionalities through the Admin Console specifically for users with the Account owner role
    When login with account owner role
    Then delete all previous files
    When click on my profile logo
    And click on the admin Console button
    And click on the users button
    Then invite user and accecpt invite in mailinator
    Then create user window open then enter full name
    And click on password button and enter password 
    Then click on confirm password button and same password
    Then check the term and condition 
    And click on create account
    Then logout current user
    When login with account owner role
    When click on my profile logo
    And click on the admin Console button
    And click on the users button
    Then click on the toggle button for invited email
    Then click on remove button in toggle button
    Then click on yes assign new user button
    Then enter email to assign deposition
    Scenario: Verify the Invite User and Remove User functionalities through the Admin Console specifically for users with the Admin role
    When login with admin role
    Then delete all previous files
    When click on my profile logo
    And click on the admin Console button
    And click on the users button
    Then invite user and accecpt invite in mailinator
    Then create user window open then enter full name
    And click on password button and enter password 
    Then click on confirm password button and same password
    Then check the term and condition 
    And click on create account
    Then logout current user
    When login with account owner role
    When click on my profile logo
    And click on the admin Console button
    And click on the users button
    Then click on the toggle button for invited email
    Then click on remove button in toggle button
    Then click on no,remove user button
    Scenario: Verify the Invite User functionalities through the Admin Console with invalid crediantial
    When login with account owner role
    Then delete all previous files
    When click on my profile logo
    And click on the admin Console button
    And click on the users button
    Then click on add new user and write user name
    And click on invite user button
    And check the validation message for user invited
    Scenario: Verify the Invite User and Assign to new User functionalities through the Admin Console specifically for users with the Admin role
    When login with admin role
    Then delete all previous files
    When click on my profile logo
    And click on the admin Console button
    And click on the users button
    Then invite user and accecpt invite in mailinator
    Then create user window open then enter full name
    And click on password button and enter password 
    Then click on confirm password button and same password
    Then check the term and condition 
    And click on create account
    Then logout current user
    When login with account owner role
    When click on my profile logo
    And click on the admin Console button
    And click on the users button
    Then click on the toggle button for invited email
    Then click on remove button in toggle button
    Then click on yes assign new user button
    Then enter email to assign deposition