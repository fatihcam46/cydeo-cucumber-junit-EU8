Feature: User should be able to login using correct credentials

  Background: user is on the login page
   Given user is on the login page of web table app

  Scenario: Positive login scenario
   ## Given user is on the login page of web table app
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks to login button
    Then user should see url contains orders
#after change cukesRunner: @wip>> after run>> after copy information about given when then and and

#  @wip
  Scenario: Positive login scenario
   ## Given user is on the login page of web table app
    When user enters username "Test" password "Tester" and logins
    Then user should see url contains orders

    #1-implement this new step
  #2-create login method in WebTableLoginPage
  #this login method

  Scenario: User should be able to see all 12 months in months dropdown
   ## Given user is on the login page of web table app
    When user enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then user should see url contains orders