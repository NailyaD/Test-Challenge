package comtravo.steps;

import comtravo.pages.LoginPage;
import comtravo.pages.TripBookingPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.open;
import static comtravo.utils.Constants.*;

/**
 * LoginConfirmSteps
 * Class implements the step definitions for testing the confirmation of a user login success.
 */

public class LoginConfirmSteps implements En {

    public LoginConfirmSteps() {

        LoginPage qaLoginPage = new LoginPage();
        TripBookingPage tripBookingPage = new TripBookingPage();

        Given("I am on the Login page", () -> {
            open(loginPage);
        });

        When("I log into the system with valid user credentials", () -> {
            qaLoginPage.logIn(workingEmail, password);
        });

        Then("I see the Book a trip tab", () -> {
            tripBookingPage.assertTabText(tabTxt);
        });
    }

}
