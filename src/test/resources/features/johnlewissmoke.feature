@smoke
Feature: Smoke test pack for john lewis


  Scenario Outline: User can find store

    Given user open a browser
    When he open an all the shops
    Then the branch "<Branch>" should be shown
    And he opens the branch
    Then the details of the branch should be shown

    Examples:
      | Branch  |
      | Glasgow |