@InviteCollaborator_Cocreator
Feature: Testing an InviteCollaborator functionality of caseUp

  Background: 
    Given user navigate to the caseup baseurl
    When login with account owner role
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

  Scenario: Checking the introduce functionality[Depositions] with invite as co-creator and folder access basic
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on present button
    Then click on introduce button
    And check the validation message for introduce exhibit
    Then click on cancle button
    Then logout current user
    When login with account owner role
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: Checking the copy invitation functionality[Depositions] with invite as cocreator and folder access basic
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: Checking the undo functionality[Depositions] with invite as cocreator and folder access basic
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: Checking the invite collaborator again[Depositions] with invite as cocreator and folder access basic
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: Checking the setting functionality[Depositions] with invite as cocreator and folder access basic
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    When click on dotted dropped menu of created deposition
    And click on setting button in invite tab
    Then update witness name
    Then click on update button
    Then logout current user
    When login with account owner role
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: Checking the invite collaborator[Depositions] with invite as co-creater and folder access basic
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: Rename file in invite collaborator[Files] with invite as cocreator and folder access owner
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
    Then click on dropdown arrow for folder
    And select owner radio button for folder
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
    Then logout current user
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: Download file in invite collaborator[Files] with invite as cocreator and folder access owner
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
    Then click on dropdown arrow for folder
    And select owner radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on dotted dropped menu of selected folder
    And click on download button
    Then logout current user
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: Delete file in invite collaborator[Files]with invite as cocreator and folder access owner
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
    Then click on dropdown arrow for folder
    And select owner radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on dotted dropped menu of selected folder
    And click on delete button
    Then click on yes button for folder
    Then check the validation message for folder delete
    Then logout current user
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: file Request in invite collaborator[Files] with invite as co-creator and folder access owner
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
    Then click on dropdown arrow for folder
    And select owner radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on dotted dropped menu of selected folder
    And click on file request button
    Then click on preview button file request
    And Enter email for file request
    And click on select file to upload
    Then click on submit button for file request
    Then click on save button for file request
    Then check the validation message for file request
    Then logout current user
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for folder in invite collaborator[Files] with invite as cocreator and folder access owner
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
    Then click on dropdown arrow for folder
    And select owner radio button for folder
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for folder in invite collaborator[Files] with invite as cocreator and folder access coowner
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for folder in invite collaborator[Files] with invite as cocreator and folder access manager
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for folder in invite collaborator[Files] with invite as cocreator and folder access basic
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for folder in invite collaborator[Files] with invite as cocreator and folder access downloader
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for folder in invite collaborator[Files] with invite as cocreator and folder access viewer
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for folder in invite collaborator[Files] with invite as cocreator and folder access editor
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for files in folder in invite collaborator[Files] with invite as cocreator and folder access coowner
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    Then click on share button for file
    Then enter the email for send
    And click on dropdown button
    And select editor radio button
    Then click on send button
    When click on dotted dropped menu of selected folder
    And click on delete button
    Then click on yes button for folder
    Then check the validation message for folder delete
    Then logout current user
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for files in folder in invite collaborator[Files] with invite as cocreator and folder access manager
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    Then click on share button for file
    Then enter the email for send
    And click on dropdown button
    And select editor radio button
    Then click on send button
    When click on dotted dropped menu of selected folder
    And click on delete button
    Then click on yes button for folder
    Then check the validation message for folder delete
    Then logout current user
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for files in folder in invite collaborator[Files] with invite as cocreator and folder access editor
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    Then click on share button for file
    Then enter the email for send
    And click on dropdown button
    And select viewer radio button for share
    Then click on send button
    When click on dotted dropped menu of selected folder
    And click on delete button
    Then click on yes button for folder
    Then check the validation message for folder delete
    Then logout current user
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for files in folder in invite collaborator[Files] with invite as cocreator and folder access basic
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for files in folder in invite collaborator[Files] with invite as cocreator and folder access downloader
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for files in folder in invite collaborator[Files] with invite as cocreator and folder access viewer
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
    Then click on dropdown arrow for folder
    And select viewer radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then logout current user
    When login with basic role
    Then click on files button
    When click on selected folder
    When check for dotted dropped menu of selected folder
    Then check for rename button ,file request button and delete button
    Then logout current user
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as cocreator and folder access owner
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as cocreator and folder access coowner
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as cocreator and folder access manager
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as cocreator and folder access editor
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as cocreator and folder access basic
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as cocreator and folder access downloader
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as cocreator and folder access viewer
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as cocreator and folder access owner
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as cocreator and folder access coowner
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as cocreator and folder access manager
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as cocreator and folder access editor
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as cocreator and folder access basic
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as cocreator and folder access downloader
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: All functionality for shared folder in invite collaborator[Files] with invite as cocreator and folder access viewer
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
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
    When login with account owner role
    Then click on depositions button
    When click on dotted dropped menu of created deposition
    And click on delete button
    Then click on yes button
    And check the validation message for deposition deleted

  Scenario: Remove functionality for shared folder in invite collaborator[Files] with invite as cocreator and folder access viewer
    Then enter email for invite
    Then click on dropdown arrow
    And select cocreator radio button
    Then click on dropdown arrow for folder
    And select viewer radio button for folder
    Then click on send button
    Then check the validation message for invitation sent
    Then click on shared user
    Then click on dropdown menu for selected shared user
    Then click on remove button	
    Then click on yes button for shared user
    Then logout current user
    When login with basic role
    Then check for deposition is removed from basic role
