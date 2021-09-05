package comtravo.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

/**
 * FligtsListPage
 * Class implements the methods and fields of the Fligts List Page.
 */

public class FligtsListPage {

    /* Elements */
    public static final By validationMsg = By.xpath("/html[1]/body[1]/app-root[1]/ctr-main-container[1]/div[1]/ctr-flight-search[1]/div[1]/ctr-layout[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ctr-flight-filters[1]/div[1]/div[1]/ctr-flight-filter-times[1]/ctr-flight-filter-wrapper[1]/div[1]/div[2]/div[1]/div[1]/p[1]");
    public static final By selectOptionBtn = By.xpath("//body/app-root[1]/ctr-main-container[1]/div[1]/ctr-flight-search[1]/div[1]/ctr-layout[1]/div[1]/div[2]/div[2]/div[1]/ctr-item-card[1]/ctr-card[1]/div[1]/div[2]/div[1]/div[1]/ctr-item-card-info[1]/div[1]/div[2]/button[1]");

    /* Methods */
    public void assertValidationMsg(String msg){
        $(validationMsg).waitUntil(visible, 40000);
        $(validationMsg).shouldHave(text(msg));
    }

    public void clickSelectOptionBtn(){
        $(selectOptionBtn).click();
    }
}
