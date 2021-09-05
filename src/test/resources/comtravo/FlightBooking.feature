@flightbooking
Feature: Booking a flight
  As a Traveler
  I should be able to complete the Flight Booking Form and to book a flight successfully

  Background:
    Given I am on the Login page
    When I enter user credentials:
      | email | password  |
      |       |           |
    And I click on the SignIn button
    Then I see the Book a trip tab

    #email and password are specified in the test challenge document

  @flightsearchandbooking
  Scenario: Searching and booking a flight
    When I click in Select travelers field and type traveler name in the field
    And I select traveler name from the result list

    When I click in Departure field and type desired town of departure in the field
    And I select desired departure airport name from the result list

    When I click in Destination field and type desired town of destination in the field
    And I select desired destination airport name from the result list

    When I click on the calendar button
    And I select a start and end date 2 months in the future
    And I click on Search flights button
    Then I see that flight result is present

    When I select a suitable flight and click on Select option button
    Then I see the validation text in a header
    Then I see traveler name in the box near flight details

    When I click Book this trip button
    Then I see the flight booking success message


