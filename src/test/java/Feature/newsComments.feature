Feature: NewsComment
  As a user  I want to Add news details on DemoNopeCommerce website
  So that, I can use all User features

  @test
  Scenario:  User should be able to add News Comment Successfully

    Given  user is on newsCommentPage
    When  User Enter All the Requiement Details In the News Comment Page
    And click on News Comment Submit Button
    Then user add news comment successfully
