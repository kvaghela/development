#noinspection CucumberUndefinedStep
Feature: Tweeting

  Scenario: Send a tweet
    Given I go to “http://www.twitter.com”
    And I enter in the “username” field “myusername”
    And I enter in the “password” field “password1”
    And I click on “Sign In”
#    And I am on the twitter home page
#    When I click on the “Compose new Tweet...” text field
#    And I enter in the message “Hello, this is my first message”
#    And I click “Tweet”
#    When I wait for a few seconds
#    Then I should see “Hello, this is my first message”

