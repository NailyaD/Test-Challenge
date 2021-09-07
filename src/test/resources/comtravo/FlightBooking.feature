@flightbooking
Feature: Booking a flight
  As a Traveler
  I should be able to complete the Flight Booking Form and to book a flight successfully

  Scenario: Searching and booking a flight
    Given I am on the Login page
    When I log into the system with valid user credentials
    Then I see the Book a trip tab

    When I type and select traveler name in the Select traveler field
    And I type and select desired town from the Departure field
    And I type and select desired town from the Destination field
    And I select a start and end date 2 months in the future
    And I click on Search flights button
    Then I see that flight result is present

    When I select a suitable flight
    Then I see the header text and traveler name in the box near flight details

    When I click Book this trip button
    Then I see the flight booking success message


