@ManagerRole
Feature: Testing the create deposition functionality of CaseUp through Manager Role

  Background: 
    Given user navigate to the caseup baseurl
    When login with account manager role

  Scenario Outline: Checking create deposition functionality with invalid credential
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

  Scenario: Checking Update deposition functionality with invalid credential
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


  Scenario: Checking create deposition functionality with valid credential
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

    Scenario: Checking the upload functionality of CaseUp
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


  Scenario: Checking introduce exhibit functionality of caseUp
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
    And check the validation message for exhibit removed
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button

  Scenario: Checking undo shared functionality of caseUp
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
    And check the validation message for exhibit removed
    Then click on cancle button for shared section
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button

  Scenario: Checking edit exhibit functionality of caseUp
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

  Scenario: Checking rename exhibit functionality of caseUp
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

  Scenario: Checking rename exhibit functionality with empty data of caseUp
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

  Scenario: Checking previous exhibit functionality of caseUp
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
    And check the validation message for exhibit removed
    Then click on cancle button for shared section
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: Checking download functionality of caseUp 
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


  Scenario: Checking sync and preview exhibit functionality of caseUp
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


  Scenario: Checking Invite link functionality of caseUp
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

    Scenario: Checking the introduce functionality[Depositions] with invite as owner and folder access basic
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on present button
    Then click on introduce button
    And check the validation message for introduce exhibit
    Then click on cancle button
    Then logout current user
    When login with account manager role
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: Checking the undo functionality[Depositions] with invite as owner and folder access basic
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on present button
    Then click on introduce button
    And check the validation message for introduce exhibit
    When click on dotted dropped menu of selected file
    Then click on undo exhibit button
    And click on yes button for undo deposition
    And check the validation message for exhibit removed
    Then click on cancle button
    Then logout current user
    When login with account manager role
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: Checking the invite collaborator again[Depositions] with invite as owner and folder access basic
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite again
    Then click on dropdown arrow
    And select introducer limited radio button
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with account manager role
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: Checking the setting functionality[Depositions] with invite as owner and folder access basic
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    When click on dotted dropped menu of created deposition
    And click on setting button in invite tab
    Then update witness name
    Then click on update button
    Then logout current user
    When login with account manager role
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: Checking the invite collaborator[Depositions] with invite as owner and folder access basic
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on present button
    Then click on introduce button
    And check the validation message for introduce exhibit
    When click on dotted dropped menu of selected file
    Then click on undo exhibit button
    And click on yes button for undo deposition
    And check the validation message for exhibit removed
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite again
    Then click on dropdown arrow
    And select introducer limited radio button
    Then click on send button
    Then check the validation message for invitation sent
    When click on dotted dropped menu of created deposition
    And click on setting button in invite tab
    Then update witness name
    Then click on update button
    Then logout current user
    When login with account manager role
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: Checking the copy invitation functionality[Depositions] with invite as owner and folder access basic
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on present button
    Then click on introduce button
    And check the validation message for introduce exhibit
    Then click on cancle button
    When click on dotted dropped menu of created deposition
    Then click on copy invitation button
    And click on copy link button and open new window
    Then open new window
    And click on view exhibits button
    Then enter your name
    And press continue button
    Then enter your email
    And press continue button
    Then Download the file
    Then Cancle the current window and go to pevious window
    Then Click on cancle button for invite link button
    Then logout current user
    When login with account manager role
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  @Test1
  Scenario: Rename file in invite collaborator[Files] with invite as owner and folder access owner
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select owner radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on manage button
    When click on dotted dropped menu of selected folder
    Then click on rename button
    And change the file name
    Then click on update button to save file
    Then check the validation message for rename folder name
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: Download file in invite collaborator[Files] with invite as owner and folder access owner
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select owner radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on manage button
    When click on dotted dropped menu of selected folder
    And click on download button
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: Delete file in invite collaborator[Files]with invite as owner and folder access owner
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select owner radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on manage button
    When click on dotted dropped menu of selected folder
    And click on delete button
    Then click on yes button for folder
    Then check the validation message for folder delete
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: file Request in invite collaborator[Files] with invite as owner and folder access owner
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select owner radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on manage button
    When click on dotted dropped menu of selected folder
    And click on file request button
    Then click on preview button file request
    And Enter email for file request
    And click on select file to upload
    Then click on submit button for file request
    Then click on save button for file request
    Then check the validation message for file request
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: All functionality for folder in invite collaborator[Files] with invite as owner and folder access coowner
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select coowner radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on dotted dropped menu of selected folder
    Then click on rename button
    And change the file name
    Then click on update button to save file
    Then check the validation message for rename folder name
    When click on dotted dropped menu of selected folder
    And click on download button
    When click on dotted dropped menu of selected folder
    And click on file request button
    Then click on preview button file request
    And Enter email for file request
    And click on select file to upload
    Then click on submit button for file request
    Then click on save button for file request
    Then check the validation message for file request
    When click on dotted dropped menu of selected folder
    And click on delete button
    Then click on yes button for folder
    Then check the validation message for folder delete
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: All functionality for folder in invite collaborator[Files] with invite as owner and folder access manager
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select manager radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on dotted dropped menu of selected folder
    Then click on rename button
    And change the file name
    Then click on update button to save file
    Then check the validation message for rename folder name
    When click on dotted dropped menu of selected folder
    And click on download button
    When click on dotted dropped menu of selected folder
    And click on file request button
    Then click on preview button file request
    And Enter email for file request
    And click on select file to upload
    Then click on submit button for file request
    Then click on save button for file request
    Then check the validation message for file request
    When click on dotted dropped menu of selected folder
    And click on delete button
    Then click on yes button for folder
    Then check the validation message for folder delete
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: All functionality for folder in invite collaborator[Files] with invite as owner and folder access basic
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select basic radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on dotted dropped menu of selected folder
    Then check for rename button ,file request button and delete button
    When click on dotted dropped menu of selected folder
    And click on download button
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: All functionality for folder in invite collaborator[Files] with invite as owner and folder access downloader
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select downloader radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on dotted dropped menu of selected folder
    Then check for rename button ,file request button and delete button
    When click on dotted dropped menu of selected folder
    And click on download button
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: All functionality for folder in invite collaborator[Files] with invite as owner and folder access viewer
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select viewer radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on dotted dropped menu of selected folder
    Then check for rename button ,file request button and delete button
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: All functionality for folder in invite collaborator[Files] with invite as owner and folder access editor
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select downloader radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on dotted dropped menu of selected folder
    Then check for rename button ,file request button and delete button
    When click on dotted dropped menu of selected folder
    And click on download button
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: All functionality for files in folder in invite collaborator[Files] with invite as owner and folder access owner
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select owner radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on selected folder
    When click on dotted dropped menu of selected folder
    Then click on rename button
    And change the file name
    Then click on update button to save file
    When click on dotted dropped menu of selected folder
    And click on download button
    When click on dotted dropped menu of selected folder
    And click on delete button
    Then click on yes button for folder
    Then check the validation message for folder delete
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: All functionality for files in folder in invite collaborator[Files] with invite as owner and folder access coowner
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select coowner radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on selected folder
    When click on dotted dropped menu of selected folder
    Then click on rename button
    And change the file name
    Then click on update button to save file
    When click on dotted dropped menu of selected folder
    And click on download button
    When click on dotted dropped menu of selected folder
    And click on delete button
    Then click on yes button for folder
    Then check the validation message for folder delete
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: All functionality for files in folder in invite collaborator[Files] with invite as owner and folder access manager
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select manager radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on selected folder
    When click on dotted dropped menu of selected folder
    Then click on rename button
    And change the file name
    Then click on update button to save file
    When click on dotted dropped menu of selected folder
    And click on download button
    When click on dotted dropped menu of selected folder
    And click on delete button
    Then click on yes button for folder
    Then check the validation message for folder delete
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: All functionality for files in folder in invite collaborator[Files] with invite as owner and folder access editor
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select editor radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on selected folder
    When click on dotted dropped menu of selected folder
    Then click on rename button
    And change the file name
    Then click on update button to save file
    When click on dotted dropped menu of selected folder
    And click on download button
    When click on dotted dropped menu of selected folder
    And click on delete button
    Then click on yes button for folder
    Then check the validation message for folder delete
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: All functionality for files in folder in invite collaborator[Files] with invite as owner and folder access basic
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select basic radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on selected folder
    When click on dotted dropped menu of selected folder
    Then check for rename button ,file request button and delete button
    And click on download button
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: All functionality for files in folder in invite collaborator[Files] with invite as owner and folder access downloader
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select downloader radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on selected folder
    When click on dotted dropped menu of selected folder
    Then check for rename button ,file request button and delete button
    And click on download button
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as owner and folder access owner
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select introducer radio button
    Then click on dropdown arrow for folder
    And select owner radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on dotted dropped menu of selected shared folder
    And click on download button for shared
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as owner and folder access coowner
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select coowner radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on dotted dropped menu of selected shared folder
    And click on download button for shared
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as owner and folder access manager
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select manager radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on dotted dropped menu of selected shared folder
    And click on download button for shared
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as owner and folder access editor
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select editor radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on dotted dropped menu of selected shared folder
    And click on download button for shared
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as owner and folder access basic
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select basic radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on dotted dropped menu of selected shared folder
    And click on download button for shared
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as owner and folder access downloader
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select downloader radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on dotted dropped menu of selected shared folder
    And click on download button for shared
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button


  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as owner and folder access viewer
   Then delete all previous files
    When click on create new button
    Then enter witness name
    And enter noticing firm name
    And enter case name
    Then click on create button
    Then click on upload file button
    And upload the file
    Then click in submit button
    When click on dotted dropped menu of created deposition
    Then click on InviteCollaborator button
    Then enter email for invite
    Then click on dropdown arrow
    And select owner radio button
    Then click on dropdown arrow for folder
    And select viewer radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on dotted dropped menu of selected folder
    And click on download button
    Then logout current user
    When login with account manager role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button