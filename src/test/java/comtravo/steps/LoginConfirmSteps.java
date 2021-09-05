package comtravo.steps;

import comtravo.pages.LoginPage;
import comtravo.pages.TripBookingPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.open;
import static comtravo.utils.Constants.loginPage;
import static comtravo.utils.Constants.tabTxt;

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

        When("I enter user credentials:", (DataTable table) -> {
            List<Map<String, String>> dataTable = table.asMaps();

            String email = dataTable.get(0).get("email");
            String password = dataTable.get(0).get("password");

            qaLoginPage.signInInput(email, password);
        });

        And("I click on the SignIn button", qaLoginPage::clickSignInBtn);

        Then("I see the Book a trip tab", () -> {
            tripBookingPage.assertTabText(tabTxt);
        });
    }

}
