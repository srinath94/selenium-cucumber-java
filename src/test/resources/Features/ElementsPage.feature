Feature: Elements

  Background:
    Given I have accessed the ELEMENTS Module from DemoQA Homepage

  Scenario: Validate the text boxes
    Given I click on TextBox option
    When I enter text in all the available fields
    Then I should be able to save it by clicking on submit
