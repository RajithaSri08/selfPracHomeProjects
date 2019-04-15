
@sanity
Feature: Smoke test pack for john lewis



@temp
Scenario: Check item can be added to the basket

Given user is in home page
When I search for "Computers"
And added an item to the basket with title "Buy HP Envy 15-AE002NA Laptop PC, Intel Core i7, 12GB RAM, 256GB,15.6"
Then an item should be available in basket
