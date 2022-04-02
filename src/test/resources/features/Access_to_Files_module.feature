Feature: As a user, I should be able to access to Files module.

  Story: As a user, I should be able to access to Files module.

  Scenario: Verify users can access to Files module

    Given User on the dashboard page
    When  The user clicks the -Files module
    Then  Verify the page title is "Files - Trycloud QA.”

  Scenario: Verify users can select all the uploaded files from the page

    Given User on the dashboard page
    When The user clicks the -Files module
    And  User click the top-left checkbox of the table
    Then Verify all the files are selected