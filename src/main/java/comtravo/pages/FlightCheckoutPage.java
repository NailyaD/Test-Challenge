package comtravo.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * FlightCheckoutPage
 * Class implements the methods and fields of the Fligt Checkout Page.
 */

public class FlightCheckoutPage {

    /* Elements */
    public static final By headerText = By.xpath("//h3[contains(text(),'Flight checkout')]");
    public static final By travelerName = By.xpath("//body/app-root[1]/ctr-main-container[1]/div[1]/ctr-flight-checkout[1]/form[1]/ctr-layout[1]/div[1]/div[2]/aside[1]/ctr-checkout-summary-wrapper-flight[1]/ctr-checkout-summary[1]/div[1]/ctr-card[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ctr-checkout-traveler[1]/div[1]/span[1]");
    public static final By bookTripBtn = By.xpath("/html[1]/body[1]/app-root[1]/ctr-main-container[1]/div[1]/ctr-flight-checkout[1]/form[1]/ctr-form-action[1]/footer[1]/div[1]/button[1]");

    /* Methods */
    public void assertHeaderText(String txt){
        $(headerText).shouldHave(text(txt));
    }

    public void assertTravelerName(String trName){
        $(travelerName).shouldHave(text(trName));
    }

    public void clickBookTripBtn(){
        $(bookTripBtn).click();
    }
}
