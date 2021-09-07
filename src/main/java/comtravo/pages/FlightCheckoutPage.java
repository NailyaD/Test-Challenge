package comtravo.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * FlightCheckoutPage
 * Class implements the methods and fields of the Flight Checkout Page.
 */

public class FlightCheckoutPage {

    /* Elements */
    public static final By headerText = By.xpath("//h3[contains(text(),'Flight checkout')]");
    public static final By travelerName = By.xpath("//ctr-checkout-traveler/div/span");
    public static final By bookTripBtn = By.cssSelector(".primary");

    /* Methods */
    public void assertHeaderTextAndTravelerName(String txt, String name){
        $(headerText).shouldHave(text(txt));
        $(travelerName).shouldHave(text(name));
    }

    public void clickBookTripBtn(){
        $(bookTripBtn).click();
    }
}
