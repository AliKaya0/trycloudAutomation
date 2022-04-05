Feature: As a user, I should be accessing all the main modules of the app.
  Scenario: Verify users accessing all the main modules of the app.
    Given user on the dashboard page
    Then Verify the user see the following modules
      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Talk      |
      | Mail      |
      | Contacts  |
      | Circles   |
      | Calendar  |
      | Deck      |



