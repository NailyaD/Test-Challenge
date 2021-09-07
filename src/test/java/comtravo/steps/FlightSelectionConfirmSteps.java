package comtravo.steps;

import comtravo.pages.FlightCheckoutPage;
import comtravo.pages.FligtsListPage;
import io.cucumber.java8.En;

import static comtravo.utils.Constants.headerTxt;
import static comtravo.utils.Constants.travelerName;

/**
 * FlightSelectionConfirmSteps
 * Class implements the step definitions for testing the confirmation of a flight selection.
 */

public class FlightSelectionConfirmSteps implements En {

    public FlightSelectionConfirmSteps() {

        FligtsListPage fligtsListPage = new FligtsListPage();
        FlightCheckoutPage flightCheckoutPage = new FlightCheckoutPage();

        When("I select a suitable flight", fligtsListPage::selectFlight);
        Then("I see the header text and traveler name in the box near flight details", () -> {
            flightCheckoutPage.assertHeaderTextAndTravelerName(headerTxt, travelerName);
        });

    }
}
