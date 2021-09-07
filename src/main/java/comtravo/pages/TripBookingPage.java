package comtravo.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * TripBookingPage
 * Class implements the methods and fields of the Trip booking page.
 */

public class TripBookingPage {

    /* Elements */
    public static final By bookATripTab = By.xpath("//span[contains(text(),'Book a trip')]");
    public static final By selectTravelersField = By.cssSelector(".ctr-chips__input");
    public static final By travellerDropdownMenuItem = By.xpath("//div[2]/p");
    public static final By departureField = By.xpath("//label/div/input");
    public static final By departureDropdownMenuItem = By.xpath("//label/div/div[2]/div");
    public static final By destinationField = By.xpath("//ctr-autocomplete[2]/div/label/div/input");
    public static final By destinationDropdownMenuItem = By.xpath("//label/div/div[2]/div");
    public static final By dateField = By.cssSelector(".ctr-input-datepicker");
    public static final By startDate = By.xpath("//div[18]/button");
    public static final By calendarRightArrow = By.xpath("(//button[@type='button'])[50]");
    public static final By endDate = By.xpath("(//button[@type='button'])[66]");
    public static final By searchFlightsBtn = By.cssSelector(".search-form__search-button");

    /* Methods */
    public void assertTabText(String tabText){
        $(bookATripTab).shouldHave(text(tabText));
    }

    public void selectTravellerName(String name) {
        $(selectTravelersField).setValue(name);
        $(travellerDropdownMenuItem).click();
    }

    public void selectDeparture(String departure) {
        $(departureField).setValue(departure);
        $(departureDropdownMenuItem).click();
    }

    public void selectDestination(String destination) {
        $(destinationField).setValue(destination);
        $(destinationDropdownMenuItem).click();
    }

    public void selectStartAndEndDate() {
        $(dateField).click();
        $(startDate).click();
        $(calendarRightArrow).click();
        $(endDate).click();
    }

    public void searchBtnClick() {
        $(searchFlightsBtn).click();
    }
}
