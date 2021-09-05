package comtravo.steps;

import comtravo.pages.FlightCheckoutPage;
import comtravo.pages.FlightConfirmationPage;
import io.cucumber.java8.En;

import static comtravo.utils.Constants.flightSuccessMsg;

/**
 * FlightBookingConfirmSteps
 * Class implements the step definitions for testing the success of a flight booking.
 */

public class FlightBookingConfirmSteps implements En {

    public FlightBookingConfirmSteps() {

        FlightCheckoutPage flightCheckoutPage = new FlightCheckoutPage();
        FlightConfirmationPage flightConfirmationPage = new FlightConfirmationPage();

        When("I click Book this trip button", flightCheckoutPage::clickBookTripBtn);
        Then("I see the flight booking success message", () -> {
            flightConfirmationPage.assertBookingSuccessMsg(flightSuccessMsg);
        });
    }
}
