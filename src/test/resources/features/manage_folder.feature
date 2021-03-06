Feature: As a user, I should be able to remove files from the favorites and upload a file directly
  Agile Story: As a user, I should be able to manage folders.
Scenario: Verify users can add the folder
Given user on the dashboard page
When the user clicks the "Files" module
And user clicks the add icon on the top
And user click "new folder”
And user write a folder name
When the user click submit icon
Then Verify the folder is displayed on the page
  Then user clicks on actions menu button of created folder
    Then user choose the "Delete folder" option
    And user delete created folder permanently

