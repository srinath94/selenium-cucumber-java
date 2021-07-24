Feature: Elements

  Background:
    Given I am on the elements page

  Scenario: Validate text box fields
    Given I click on TextBox option
    When I enter text in all the available fields
    Then I should be able to save it by clicking on submit

#  Scenario Outline: Validate the checkbox
#    Given I click on check box option
#    When I expend the Home option
#    Then I should be able to select any of the <check box> in the page
#    Examples:
#      | check box |
#      | Notes     |