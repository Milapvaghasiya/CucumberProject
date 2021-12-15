Feature: Register
  As a user, I should able to register successfully
  So that, I can use all user features
  @test
  Scenario:  User should able to register successfully

    Given user is on registration page
    When user enter all required details
    And user click on register submit button
    Then user should able to register successfully