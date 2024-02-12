@CreateDeposition
Feature: Testing the create deposition functionality of CaseUp

  Background: 
    Given user navigate to the caseup baseurl

  Scenario Outline: Checking create deposition functionality with invalid credential and an account owner role
    When login with account owner role
    When click on create new button
    Then enter witness name "<WitnessName>"
    And enter noticing firm name "<NoticingFirmname>"
    And enter case name "<CaseName>"
    Then click on create button for not valid data

    Examples: 
      | WitnessName | NoticingFirmname | CaseName |
      | wname   @   | nname            | casename |
      | wname   @   |                  | casename |
      |             |                  |          |

  Scenario: Checking Update deposition functionality with invalid credential and an account owner role
    When login with account owner role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    And click on setting button
    Then update witness name with invalid data
    Then click on update button
    And Check the validation message for invalid data
    Then update witness name with blank data
    Then click on update button
    And Check the validation message for invalid data
    Then update witness name
    Then click on update button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: Checking create deposition functionality with valid credential and an account owner role
    When login with account owner role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    And click on setting button
    Then update witness name
    Then click on update button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario Outline: Checking create deposition functionality with invalid credential and an admin role
    When login with admin role
    When click on create new button
    Then enter witness name "<WitnessName>"
    And enter noticing firm name "<NoticingFirmname>"
    And enter case name "<CaseName>"
    Then click on create button for not valid data

    Examples: 
      | WitnessName | NoticingFirmname | CaseName |
      | wname   @   | nname            | casename |
      | wname   @   |                  | casename |
      |             |                  |          |

  Scenario: Checking Update deposition functionality with invalid credential and an admin role
    When login with admin role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    And click on setting button
    Then update witness name with invalid data
    Then click on update button
    And Check the validation message for invalid data
    Then update witness name with blank data
    Then click on update button
    And Check the validation message for invalid data
    Then update witness name
    Then click on update button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: Checking create deposition functionality with valid credential and an admin role
    When login with admin role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    And click on setting button
    Then update witness name
    Then click on update button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted
    Scenario Outline: Checking create deposition functionality with invalid credential and an basic role
    When login with basic role
    When click on create new button
    Then enter witness name "<WitnessName>"
    And enter noticing firm name "<NoticingFirmname>"
    And enter case name "<CaseName>"
    Then click on create button for not valid data

    Examples: 
      | WitnessName | NoticingFirmname | CaseName |
      | wname   @   | nname            | casename |
      | wname   @   |                  | casename |
      |             |                  |          |

  Scenario: Checking Update deposition functionality with invalid credential and an basic role
    When login with basic role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    And click on setting button
    Then update witness name with invalid data
    Then click on update button
    And Check the validation message for invalid data
    Then update witness name with blank data
    Then click on update button
    And Check the validation message for invalid data
    Then update witness name
    Then click on update button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: Checking create deposition functionality with valid credential and an basic role
    When login with basic role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    And click on setting button
    Then update witness name
    Then click on update button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted
    
