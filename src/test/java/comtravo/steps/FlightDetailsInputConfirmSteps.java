package comtravo.steps;

import comtravo.pages.FligtsListPage;
import comtravo.pages.TripBookingPage;
import io.cucumber.java8.En;

import static comtravo.utils.Constants.*;

/**
 * FlightDetailsInputConfirmSteps
 * Class implements the step definitions for testing the confirmation of a flight details input.
 */

public class FlightDetailsInputConfirmSteps implements En {

    public FlightDetailsInputConfirmSteps() {

        TripBookingPage tripBookingPage = new TripBookingPage();
        FligtsListPage fligtsListPage = new FligtsListPage();

        When("I type and select traveler name in the Select traveler field", () -> {
                    tripBookingPage.selectTravellerName(nameInput);
                });
        And("I type and select desired town from the Departure field", () -> {
                    tripBookingPage.selectDeparture(departureTown);
                });
        And("I type and select desired town from the Destination field", () -> {
                    tripBookingPage.selectDestination(destinationTown);
                });
        And("I select a start and end date 2 months in the future", tripBookingPage::selectStartAndEndDate);
        And("I click on Search flights button", tripBookingPage::searchBtnClick);

        Then("I see that flight result is present", () -> {
            fligtsListPage.assertValidationMsg(flightResultText);
        });

    }
}
