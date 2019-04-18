
Feature: Smoke test pack for john lewis

  @smoke
  Scenario: User can search an item

    Given user enter url
    When user search item in search field
    Then user should see the search results

