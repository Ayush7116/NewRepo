@Present
Feature: Testing the present functionality of caseUp

  Background: 
    Given user navigate to the caseup baseurl

  #Scenario: Checking the upload functionality of CaseUp with account owner
    #When login with account owner role
    #When click on create new button
    #Then enter witness name
    #And enter noticing firm name
    #And enter case name
    #Then click on create button
    #Then click on upload file button
    #Then click in submit button
    #Then click on present button
    #Then click on upload click button
    #Then click on cancle button
    #When click on dotted dropped menu of created deposition
    #And click on delete button
    #Then click on yes button
#
  #Scenario: Checking introduce exhibit functionality of caseUp with account owner
    #When login with account owner role
    #When click on create new button
    #Then enter witness name
    #And enter noticing firm name
    #And enter case name
    #Then click on create button
    #Then click on upload file button
    #And upload the file
    #Then click in submit button
    #Then click on present button
    #Then click on introduce button
    #And check the validation message for introduce exhibit
    #When click on dotted dropped menu of selected file
    #Then click on undo exhibit button
    #And click on yes button for undo deposition
    #Then click on cancle button
    #When click on dotted dropped menu of created deposition
    #And click on delete button
    #Then click on yes button
#
  #Scenario: Checking introduce exhibit functionality for blank exhibit number of caseUp with account owner
    #When login with account owner role
    #When click on create new button
    #Then enter witness name
    #And enter noticing firm name
    #And enter case name
    #Then click on create button
    #Then click on upload file button
    #And upload the file
    #Then click in submit button
    #Then click on present button
    #And change the exhibit number to empty
    #Then click on introduce button
    #And check the validation message for introduce exhibit with empty value
    #And change the exhibit number to value
    #Then click on introduce button
    #And check the validation message for introduce exhibit
    #When click on dotted dropped menu of selected file
    #Then click on undo exhibit button
    #And click on yes button for undo deposition
    #Then click on cancle button
    #When click on dotted dropped menu of created deposition
    #And click on delete button
    #Then click on yes button
#
  #Scenario: Checking undo shared functionality of caseUp with account owner
    #When login with account owner role
    #When click on create new button
    #Then enter witness name
    #And enter noticing firm name
    #And enter case name
    #Then click on create button
    #Then click on upload file button
    #And upload the file
    #Then click in submit button
    #Then click on present button
    #Then click on introduce button
    #And check the validation message for introduce exhibit
    #Then click on shared button
    #When click on dotted dropped menu of selected file
    #Then click on undo exhibit button
    #And click on yes button for undo deposition
    #Then click on cancle button for shared section
    #When click on dotted dropped menu of created deposition
    #And click on delete button
    #Then click on yes button
#
  #Scenario: Checking edit exhibit functionality of caseUp with account owner
    #When login with account owner role
    #When click on create new button
    #Then enter witness name
    #And enter noticing firm name
    #And enter case name
    #Then click on create button
    #Then click on upload file button
    #And upload the file
    #Then click in submit button
    #Then click on present button
    #Then click on introduce button
    #And check the validation message for introduce exhibit
    #When click on dotted dropped menu of selected file
    #Then click on edit exhibit button
    #And change the exhibit number
    #Then click on save button
    #And check the validation message for change exhibit number
    #Then click on cancle button
    #When click on dotted dropped menu of created deposition
    #And click on delete button
    #Then click on yes button
#
  #Scenario: Checking rename exhibit functionality of caseUp with account owner
    #When login with account owner role
    #When click on create new button
    #Then enter witness name
    #And enter noticing firm name
    #And enter case name
    #Then click on create button
    #Then click on upload file button
    #And upload the file
    #Then click in submit button
    #Then click on present button
    #Then click on introduce button
    #And check the validation message for introduce exhibit
    #When click on dotted dropped menu of selected file
    #Then click on rename button
    #And change the file name
    #Then click on update button to save file
    #And check the validation message for change file name
    #Then click on cancle button
    #When click on dotted dropped menu of created deposition
    #And click on delete button
    #Then click on yes button
#
  #Scenario: Checking rename exhibit functionality with empty data of caseUp with account owner
    #When login with account owner role
    #When click on create new button
    #Then enter witness name
    #And enter noticing firm name
    #And enter case name
    #Then click on create button
    #Then click on upload file button
    #And upload the file
    #Then click in submit button
    #Then click on present button
    #Then click on introduce button
    #And check the validation message for introduce exhibit
    #When click on dotted dropped menu of selected file
    #Then click on rename button
    #And change the file name to empty
    #Then click on update button to save file
    #And check the validation message for change file name with empty data
    #And change the file name
    #Then click on update button to save file
    #And check the validation message for change file name
    #Then click on cancle button
    #When click on dotted dropped menu of created deposition
    #And click on delete button
    #Then click on yes button
#
  #Scenario: Checking previous exhibit functionality of caseUp with account owner
    #When login with account owner role
    #When click on create new button
    #Then enter witness name
    #And enter noticing firm name
    #And enter case name
    #Then click on create button
    #Then click on upload file button
    #And upload the file
    #Then click in submit button
    #Then click on present button
    #Then click on new button
    #And click on previous exhibit button
    #Then click on share button
    #Then click on shared button
    #When click on dotted dropped menu of selected file
    #Then click on undo exhibit button
    #And click on yes button for undo deposition
    #Then click on cancle button for shared section
    #When click on dotted dropped menu of created deposition
    #And click on delete button
    #Then click on yes button
#
  #Scenario: Checking download functionality of caseUp with account owner
    #When login with account owner role
    #When click on create new button
    #Then enter witness name
    #And enter noticing firm name
    #And enter case name
    #Then click on create button
    #Then click on upload file button
    #And upload the file
    #Then click in submit button
    #Then click on present button
    #When click on dotted dropped menu of selected file
    #And click on download button
    #Then click on introduce button
    #Then click on shared button
    #When click on dotted dropped menu of selected file
    #And click on download button
    #Then click on cancle button for shared section
    #When click on dotted dropped menu of created deposition
    #And click on delete button
    #Then click on yes button
#
  #Scenario: Checking sync and preview exhibit functionality of caseUp with account owner
    #When login with account owner role
    #When click on create new button
    #Then enter witness name
    #And enter noticing firm name
    #And enter case name
    #Then click on create button
    #Then click on upload file button
    #And upload the file
    #Then click in submit button
    #Then click on present button
    #Then click on introduce button
    #And check the validation message for introduce exhibit
    #Then click on DropDown Toggle show
    #And click on select dropdown
    #Then click on sync button
    #When click on dotted dropped menu of selected file
    #Then click on DropDown Toggle show
    #And click on select dropdown
    #Then click on preview button
    #When click on dotted dropped menu of selected file
    #Then click on DropDown Toggle show
    #Then click on switch Previewer Status button
    #Then click on cancle button
    #When click on dotted dropped menu of created deposition
    #And click on delete button
    #Then click on yes button
#
  #Scenario: Checking Invite link functionality of caseUp with account owner
    #When login with account owner role
    #When click on create new button
    #Then enter witness name
    #And enter noticing firm name
    #And enter case name
    #Then click on create button
    #Then click on upload file button
    #And upload the file
    #Then click in submit button
    #Then click on present button
    #Then click on introduce button
    #And check the validation message for introduce exhibit
    #Then click on invite link button
    #And click on copy link button and open new window
    #Then open new window
    #And click on view exhibits button
    #Then enter your name
    #And press continue button
    #Then enter your email
    #And press continue button
    #Then Download the file
    #Then Cancle the current window and go to pevious window
    #Then Click on cancle button of invite link button
    #Then click on cancle button
    #When click on dotted dropped menu of created deposition
    #And click on delete button
    #Then click on yes button
#
  #Scenario: Checking introduce exhibit functionality of caseUp with admin
    #When login with admin role
    #When click on create new button
    #Then enter witness name
    #And enter noticing firm name
    #And enter case name
    #Then click on create button
    #Then click on upload file button
    #And upload the file
    #Then click in submit button
    #Then click on present button
    #Then click on upload icon
    #And upload the image
    #Then click on search button
    #And select the inputbox and type what you want to search
    #Then check file is present or not
    #Then click on cancle button
    #When click on dotted dropped menu of created deposition
    #And click on delete button
    #Then click on yes button
#
  #Scenario: Checking the upload functionality of CaseUp with admin
    #When login with admin role
    #When click on create new button
    #Then enter witness name
    #And enter noticing firm name
    #And enter case name
    #Then click on create button
    #Then click on upload file button
    #Then click in submit button
    #Then click on present button
    #Then click on upload click button
    #Then click on cancle button
    #When click on dotted dropped menu of created deposition
    #And click on delete button
    #Then click on yes button
#
  #Scenario: Checking introduce exhibit functionality of caseUp with admin
    #When login with admin role
    #When click on create new button
    #Then enter witness name
    #And enter noticing firm name
    #And enter case name
    #Then click on create button
    #Then click on upload file button
    #And upload the file
    #Then click in submit button
    #Then click on present button
    #Then click on introduce button
    #And check the validation message for introduce exhibit
    #When click on dotted dropped menu of selected file
    #Then click on undo exhibit button
    #And click on yes button for undo deposition
    #Then click on cancle button
    #When click on dotted dropped menu of created deposition
    #And click on delete button
    #Then click on yes button
#
  #Scenario: Checking introduce exhibit functionality for blank exhibit number of caseUp with admin
    #When login with admin role
    #When click on create new button
    #Then enter witness name
    #And enter noticing firm name
    #And enter case name
    #Then click on create button
    #Then click on upload file button
    #And upload the file
    #Then click in submit button
    #Then click on present button
    #And change the exhibit number to empty
    #Then click on introduce button
    #And check the validation message for introduce exhibit with empty value
    #And change the exhibit number to value
    #Then click on introduce button
    #And check the validation message for introduce exhibit
    #When click on dotted dropped menu of selected file
    #Then click on undo exhibit button
    #And click on yes button for undo deposition
    #Then click on cancle button
    #When click on dotted dropped menu of created deposition
    #And click on delete button
    #Then click on yes button
#
  #Scenario: Checking undo shared functionality of caseUp with admin
    #When login with admin role
    #When click on create new button
    #Then enter witness name
    #And enter noticing firm name
    #And enter case name
    #Then click on create button
    #Then click on upload file button
    #And upload the file
    #Then click in submit button
    #Then click on present button
    #Then click on introduce button
    #And check the validation message for introduce exhibit
    #Then click on shared button
    #When click on dotted dropped menu of selected file
    #Then click on undo exhibit button
    #And click on yes button for undo deposition
    #Then click on cancle button for shared section
    #When click on dotted dropped menu of created deposition
    #And click on delete button
    #Then click on yes button
#
  #Scenario: Checking edit exhibit functionality of caseUp with admin
    #When login with admin role
    #When click on create new button
    #Then enter witness name
    #And enter noticing firm name
    #And enter case name
    #Then click on create button
    #Then click on upload file button
    #And upload the file
    #Then click in submit button
    #Then click on present button
    #Then click on introduce button
    #And check the validation message for introduce exhibit
    #When click on dotted dropped menu of selected file
    #Then click on edit exhibit button
    #And change the exhibit number
    #Then click on save button
    #And check the validation message for change exhibit number
    #Then click on cancle button
    #When click on dotted dropped menu of created deposition
    #And click on delete button
    #Then click on yes button
#
  #Scenario: Checking rename exhibit functionality of caseUp with admin
    #When login with admin role
    #When click on create new button
    #Then enter witness name
    #And enter noticing firm name
    #And enter case name
    #Then click on create button
    #Then click on upload file button
    #And upload the file
    #Then click in submit button
    #Then click on present button
    #Then click on introduce button
    #And check the validation message for introduce exhibit
    #When click on dotted dropped menu of selected file
    #Then click on rename button
    #And change the file name
    #Then click on update button to save file
    #And check the validation message for change file name
    #Then click on cancle button
    #When click on dotted dropped menu of created deposition
    #And click on delete button
    #Then click on yes button
#
  #Scenario: Checking rename exhibit functionality with empty data of caseUp with admin
    #When login with admin role
    #When click on create new button
    #Then enter witness name
    #And enter noticing firm name
    #And enter case name
    #Then click on create button
    #Then click on upload file button
    #And upload the file
    #Then click in submit button
    #Then click on present button
    #Then click on introduce button
    #And check the validation message for introduce exhibit
    #When click on dotted dropped menu of selected file
    #Then click on rename button
    #And change the file name to empty
    #Then click on update button to save file
    #And check the validation message for change file name with empty data
    #And change the file name
    #Then click on update button to save file
    #And check the validation message for change file name
    #Then click on cancle button
    #When click on dotted dropped menu of created deposition
    #And click on delete button
    #Then click on yes button

  Scenario: Checking previous exhibit functionality of caseUp with admin
    When login with admin role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    Then click on present button
    Then click on new button
    And click on previous exhibit button
    Then click on share button
    Then click on shared button
    When click on dotted dropped menu of selected file
    Then click on undo exhibit button
    And click on yes button for undo deposition
    Then click on cancle button for shared section
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button

  Scenario: Checking download functionality of caseUp with admin
    When login with admin role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    Then click on present button
    When click on dotted dropped menu of selected file
    And click on download button
    Then click on introduce button
    Then click on shared button
    When click on dotted dropped menu of selected file
    And click on download button
    Then click on cancle button for shared section
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button

  Scenario: Checking sync and preview exhibit functionality of caseUp with admin
    When login with admin role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    Then click on present button
    Then click on introduce button
    And check the validation message for introduce exhibit
    Then click on DropDown Toggle show
    And click on select dropdown
    Then click on sync button
    When click on dotted dropped menu of selected file
    Then click on DropDown Toggle show
    And click on select dropdown
    Then click on preview button
    When click on dotted dropped menu of selected file
    Then click on DropDown Toggle show
    Then click on switch Previewer Status button
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button

  Scenario: Checking Invite link functionality of caseUp with admin
    When login with admin role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    Then click on present button
    Then click on introduce button
    And check the validation message for introduce exhibit
    Then click on invite link button
    And click on copy link button and open new window
    Then open new window
    And click on view exhibits button
    Then enter your name
    And press continue button
    Then enter your email
    And press continue button
    Then Download the file
    Then Cancle the current window and go to pevious window
    Then Click on cancle button of invite link button
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button

  Scenario: Checking guest functionality of caseUp
    When login with guest role
    When check create button is visible or not

  Scenario: Checking basic functionality of caseUp
    When login with basic role
    When check create button is visible

  Scenario: Checking introduce exhibit functionality of caseUp with basic
    When login with basic role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    Then click on present button
    Then click on upload icon
    And upload the image
    Then click on search button
    And select the inputbox and type what you want to search
    Then check file is present or not
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button

  Scenario: Checking the upload functionality of CaseUp with basic
    When login with basic role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    Then click in submit button
    Then click on present button
    Then click on upload click button
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button

  Scenario: Checking introduce exhibit functionality of caseUp with basic
    When login with basic role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    Then click on present button
    Then click on introduce button
    And check the validation message for introduce exhibit
    When click on dotted dropped menu of selected file
    Then click on undo exhibit button
    And click on yes button for undo deposition
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button

  Scenario: Checking introduce exhibit functionality for blank exhibit number of caseUp with basic
    When login with basic role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    Then click on present button
    And change the exhibit number to empty
    Then click on introduce button
    And check the validation message for introduce exhibit with empty value
    And change the exhibit number to value
    Then click on introduce button
    And check the validation message for introduce exhibit
    When click on dotted dropped menu of selected file
    Then click on undo exhibit button
    And click on yes button for undo deposition
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button

  Scenario: Checking undo shared functionality of caseUp with basic
    When login with basic role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    Then click on present button
    Then click on introduce button
    And check the validation message for introduce exhibit
    Then click on shared button
    When click on dotted dropped menu of selected file
    Then click on undo exhibit button
    And click on yes button for undo deposition
    Then click on cancle button for shared section
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button

  Scenario: Checking edit exhibit functionality of caseUp with basic
    When login with basic role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    Then click on present button
    Then click on introduce button
    And check the validation message for introduce exhibit
    When click on dotted dropped menu of selected file
    Then click on edit exhibit button
    And change the exhibit number
    Then click on save button
    And check the validation message for change exhibit number
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button

  Scenario: Checking rename exhibit functionality of caseUp with basic
    When login with basic role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    Then click on present button
    Then click on introduce button
    And check the validation message for introduce exhibit
    When click on dotted dropped menu of selected file
    Then click on rename button
    And change the file name
    Then click on update button to save file
    And check the validation message for change file name
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button

  Scenario: Checking rename exhibit functionality with empty data of caseUp with basic
    When login with basic role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    Then click on present button
    Then click on introduce button
    And check the validation message for introduce exhibit
    When click on dotted dropped menu of selected file
    Then click on rename button
    And change the file name to empty
    Then click on update button to save file
    And check the validation message for change file name with empty data
    And change the file name
    Then click on update button to save file
    And check the validation message for change file name
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button

  Scenario: Checking previous exhibit functionality of caseUp with basic
    When login with basic role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    Then click on present button
    Then click on new button
    And click on previous exhibit button
    Then click on share button
    Then click on shared button
    When click on dotted dropped menu of selected file
    Then click on undo exhibit button
    And click on yes button for undo deposition
    Then click on cancle button for shared section
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button

  Scenario: Checking download functionality of caseUp with basic
    When login with basic role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    Then click on present button
    When click on dotted dropped menu of selected file
    And click on download button
    Then click on introduce button
    Then click on shared button
    When click on dotted dropped menu of selected file
    And click on download button
    Then click on cancle button for shared section
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button

  Scenario: Checking sync and preview exhibit functionality of caseUp with basic
    When login with basic role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    Then click on present button
    Then click on introduce button
    And check the validation message for introduce exhibit
    Then click on DropDown Toggle show
    And click on select dropdown
    Then click on sync button
    When click on dotted dropped menu of selected file
    Then click on DropDown Toggle show
    And click on select dropdown
    Then click on preview button
    When click on dotted dropped menu of selected file
    Then click on DropDown Toggle show
    Then click on switch Previewer Status button
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button

  Scenario: Checking Invite link functionality of caseUp with basic
    When login with basic role
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    Then click on present button
    Then click on introduce button
    And check the validation message for introduce exhibit
    Then click on invite link button
    And click on copy link button and open new window
    Then open new window
    And click on view exhibits button
    Then enter your name
    And press continue button
    Then enter your email
    And press continue button
    Then Download the file
    Then Cancle the current window and go to pevious window
    Then Click on cancle button of invite link button
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
