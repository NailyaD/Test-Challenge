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

        When("I click in Select travelers field and type traveler name in the field", () -> {
                    tripBookingPage.travellerNameInput(nameInput);
                });
        And("I select traveler name from the result list", tripBookingPage::travellerNameSelect);

        When("I click in Departure field and type desired town of departure in the field", () -> {
                    tripBookingPage.departureInput(departureTown);
                });
        And("I select desired departure airport name from the result list", tripBookingPage::departureSelect);

        When("I click in Destination field and type desired town of destination in the field", () -> {
                    tripBookingPage.destinationInput(destinationTown);
                });
        And("I select desired destination airport name from the result list", tripBookingPage::destinationSelect);
        When("I click on the calendar button", tripBookingPage::dateFieldClick);
        And("I select a start and end date 2 months in the future", tripBookingPage::startAndEndDateSelect);
        And("I click on Search flights button", tripBookingPage::searchBtnClick);

        Then("I see that flight result is present", () -> {
            fligtsListPage.assertValidationMsg(flightResultText);
        });

    }
}
