Feature: Elements22

  Scenario: Validate test1
    Given I am on the Google Homepage
    When I search for Spark Networks
    Then I should see the Spark Networks homepage as the first result
