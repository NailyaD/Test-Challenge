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
    public static final By selectTravelersField = By.xpath("//body/app-root[1]/ctr-main-container[1]/div[1]/ctr-flight-search[1]/ctr-layout[1]/div[1]/div[1]/ctr-search-collapse-container[1]/div[1]/ctr-card[1]/div[1]/div[2]/ctr-animate-height[1]/div[2]/ctr-card-content[1]/div[1]/ctr-flight-form[1]/div[1]/div[1]/ctr-traveler-select[1]/div[1]/label[1]/ctr-chips[1]/div[1]/label[1]/div[1]/div[1]/div[2]/input[1]");
    public static final By travellerDropdownMenuItem = By.xpath("//p[contains(text(),'Sophie lie')]");
    public static final By departureField = By.xpath("//body/app-root[1]/ctr-main-container[1]/div[1]/ctr-flight-search[1]/ctr-layout[1]/div[1]/div[1]/ctr-search-collapse-container[1]/div[1]/ctr-card[1]/div[1]/div[2]/ctr-animate-height[1]/div[2]/ctr-card-content[1]/div[1]/ctr-flight-form[1]/div[1]/ctr-flight-type[1]/div[1]/div[1]/div[1]/ctr-autocomplete[1]/div[1]/label[1]/div[1]/input[1]");
    public static final By departureDropdownMenuItem = By.xpath("//div[contains(text(),'BER')]");
    public static final By destinationField = By.xpath("//body/app-root[1]/ctr-main-container[1]/div[1]/ctr-flight-search[1]/ctr-layout[1]/div[1]/div[1]/ctr-search-collapse-container[1]/div[1]/ctr-card[1]/div[1]/div[2]/ctr-animate-height[1]/div[2]/ctr-card-content[1]/div[1]/ctr-flight-form[1]/div[1]/ctr-flight-type[1]/div[1]/div[1]/div[1]/ctr-autocomplete[2]/div[1]/label[1]/div[1]/input[1]");
    public static final By destinationDropdownMenuItem = By.xpath("//div[contains(text(),'MUC')]");
    public static final By dateField = By.xpath("//body/app-root[1]/ctr-main-container[1]/div[1]/ctr-flight-search[1]/ctr-layout[1]/div[1]/div[1]/ctr-search-collapse-container[1]/div[1]/ctr-card[1]/div[1]/div[2]/ctr-animate-height[1]/div[2]/ctr-card-content[1]/div[1]/ctr-flight-form[1]/div[1]/ctr-flight-type[1]/div[1]/label[1]/div[1]");
    public static final By startDate = By.xpath("//body/div[1]/div[2]/div[1]/ctr-overlay[1]/div[1]/div[2]/ctr-datepicker[1]/div[1]/div[1]/div[1]/ctr-calendar[1]/div[1]/ctr-month[1]/div[17]/button[1]");
    public static final By calendarRightArrow = By.xpath("//body[1]/div[1]/div[2]/div[1]/ctr-overlay[1]/div[1]/div[2]/ctr-datepicker[1]/div[1]/div[1]/div[2]/ctr-calendar[1]/div[1]/ctr-header[1]/div[1]/div[4]/button[1]");
    public static final By endDate = By.xpath("//body/div[1]/div[2]/div[1]/ctr-overlay[1]/div[1]/div[2]/ctr-datepicker[1]/div[1]/div[1]/div[2]/ctr-calendar[1]/div[1]/ctr-month[1]/div[15]/button[1]");
    public static final By searchFlightsBtn = By.xpath("//button[contains(text(),'Search flights')]");

    /* Methods */
    public void assertTabText(String tabText){
        $(bookATripTab).shouldHave(text(tabText));
    }

    public void travellerNameInput(String name) {
        $(selectTravelersField).setValue(name);
    }

    public void travellerNameSelect() {
        $(travellerDropdownMenuItem).click();
    }

    public void departureInput(String departure) {
        $(departureField).setValue(departure);
    }

    public void departureSelect() {
        $(departureDropdownMenuItem).click();
    }

    public void destinationInput(String destination) {
        $(destinationField).setValue(destination);
    }

    public void destinationSelect() {
        $(destinationDropdownMenuItem).click();
    }

    public void dateFieldClick() {
        $(dateField).click();
    }

    public void startAndEndDateSelect() {
        $(startDate).click();
        $(calendarRightArrow).click();
        $(endDate).click();
    }

    public void searchBtnClick() {
        $(searchFlightsBtn).click();
    }
}
