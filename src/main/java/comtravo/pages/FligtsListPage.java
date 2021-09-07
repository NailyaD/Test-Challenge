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
    public static final By validationMsg = By.xpath("//div/p");
    public static final By selectOptionBtn = By.xpath("//button[contains(.,'Select option')]");

    /* Methods */
    public void assertValidationMsg(String msg){
        $(validationMsg).waitUntil(visible, 60000);
        $(validationMsg).shouldHave(text(msg));
    }

    public void selectFlight(){
        $(selectOptionBtn).click();
    }
}
