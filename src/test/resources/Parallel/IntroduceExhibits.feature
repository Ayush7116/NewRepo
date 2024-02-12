@IntroduceExhibits
Feature: Testing the present functionality of caseUp

  Background: 
    Given user navigate to the caseup baseurl
    
    Scenario: Checking stamp exhibit functionality of caseUp(account owner)
    When login with account owner role
    Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the pdf file
    Then click in submit button
    Then click on present button
    Then click on upload icon
    And upload the image
    Then click on pdf file
    Then click on stamp toggle button
    Then click on stamp exhibit slide button
    Then click on introduce button
    And check the validation message for introduce exhibit
    Then verify stamp is applied or not
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted
    Scenario: Checking update stamp exhibit functionality of caseUp(account owner)
    When login with account owner role
    Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the pdf file
    Then click in submit button
    Then click on present button
    Then click on upload icon
    And upload the image
    Then click on pdf file
    Then click on stamp toggle button
    Then click on stamp exhibit slide button
    Then click on stamp setting icon
    And click on all checkbox in stamp setting
    And rename the stamp title
    Then click on update button for stamp setting
    Then click on introduce button
    And check the validation message for introduce exhibit
    Then verify stamp is applied or not
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted
    Scenario: Checking two step stamp exhibit functionality of caseUp(account owner)
    When login with account owner role
    Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the pdf file
    Then click in submit button
    Then click on present button
    Then click on upload icon
    And upload the image
    Then click on pdf file
    Then click on stamp toggle button
    Then click on stamp exhibit slide button
    Then click on stamp setting icon
    And click on two step icon
    Then click on update button for stamp setting
    Then click on add to stamp button
    Then click on introduce button
    And check the validation message for introduce exhibit
    Then verify stamp is applied or not
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted
    Scenario: Checking stamp applied or not in shared folder(account owner)
    When login with account owner role
    Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the pdf file
    Then click in submit button
    Then click on present button
    Then click on upload icon
    And upload the image
    Then click on pdf file
    Then click on stamp toggle button
    Then click on stamp exhibit slide button
    Then click on stamp setting icon
    And click on two step icon
    Then click on update button for stamp setting
    Then click on add to stamp button
    Then click on introduce button
    And check the validation message for introduce exhibit
    Then verify stamp is applied or not
    Then click on shared button
    Then verify stamp is applied or not
    Then click on cancle button for shared section
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted
     Scenario: Checking color change stamp exhibit functionality of caseUp(account owner)
    When login with account owner role
    Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the pdf file
    Then click in submit button
    Then click on present button
    Then click on upload icon
    And upload the image
    Then click on pdf file
    Then click on stamp toggle button
    Then click on stamp exhibit slide button
    Then click on stamp setting icon
    And click on all checkbox in stamp setting
    And rename the stamp title
    And click on green color icon
    Then click on update button for stamp setting
    Then click on introduce button
    And check the validation message for introduce exhibit
    Then verify stamp is applied or not
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted
    Scenario: Checking stamp exhibit functionality of caseUp(admin)
    When login with admin role
    Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the pdf file
    Then click in submit button
    Then click on present button
    Then click on upload icon
    And upload the image
    Then click on pdf file
    Then click on stamp toggle button
    Then click on stamp exhibit slide button
    Then click on introduce button
    And check the validation message for introduce exhibit
    Then verify stamp is applied or not
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted
    Scenario: Checking update stamp exhibit functionality of caseUp(admin)
    When login with admin role
    Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the pdf file
    Then click in submit button
    Then click on present button
    Then click on upload icon
    And upload the image
    Then click on pdf file
    Then click on stamp toggle button
    Then click on stamp exhibit slide button
    Then click on stamp setting icon
    And click on all checkbox in stamp setting
    And rename the stamp title
    Then click on update button for stamp setting
    Then click on introduce button
    And check the validation message for introduce exhibit
    Then verify stamp is applied or not
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted
    Scenario: Checking two step stamp exhibit functionality of caseUp(admin)
    When login with admin role
    Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the pdf file
    Then click in submit button
    Then click on present button
    Then click on upload icon
    And upload the image
    Then click on pdf file
    Then click on stamp toggle button
    Then click on stamp exhibit slide button
    Then click on stamp setting icon
    And click on two step icon
    Then click on update button for stamp setting
    Then click on add to stamp button
    Then click on introduce button
    And check the validation message for introduce exhibit
    Then verify stamp is applied or not
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted
    Scenario: Checking stamp applied or not in shared folder(admin)
When login with admin role
    Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the pdf file
    Then click in submit button
    Then click on present button
    Then click on upload icon
    And upload the image
    Then click on pdf file
    Then click on stamp toggle button
    Then click on stamp exhibit slide button
    Then click on stamp setting icon
    And click on two step icon
    Then click on update button for stamp setting
    Then click on add to stamp button
    Then click on introduce button
    And check the validation message for introduce exhibit
    Then verify stamp is applied or not
    Then click on shared button
    Then verify stamp is applied or not
    Then click on cancle button for shared section
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted
     Scenario: Checking color change stamp exhibit functionality of caseUp(admin)
    When login with admin role
    Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the pdf file
    Then click in submit button
    Then click on present button
    Then click on upload icon
    And upload the image
    Then click on pdf file
    Then click on stamp toggle button
    Then click on stamp exhibit slide button
    Then click on stamp setting icon
    And click on all checkbox in stamp setting
    And rename the stamp title
    And click on green color icon
    Then click on update button for stamp setting
    Then click on introduce button
    And check the validation message for introduce exhibit
    Then verify stamp is applied or not
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted