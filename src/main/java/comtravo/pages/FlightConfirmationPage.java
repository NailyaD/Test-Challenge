package comtravo.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

/**
 * FlightConfirmationPage
 * Class implements the methods and fields of the Flight Booking Confirmation Page.
 */

public class FlightConfirmationPage {

    /* Elements */
    public static final By confirmationTxt = By.xpath("//span[contains(text(),'We received your booking.')]");

    /* Methods */
    public void assertBookingSuccessMsg(String successMsg){
        $(confirmationTxt).waitUntil(visible, 10000);
        $(confirmationTxt).shouldHave(text(successMsg));
    }
}
