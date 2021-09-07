package comtravo.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * LoginPage
 * Class implements the methods and fields of the Login page.
 */

public class LoginPage {

    /* Elements */
    public static final By inputEmail = By.xpath("//input[@type='email']");
    public static final By inputPassword = By.name("password");
    public static final By loginBtn = By.cssSelector(".button");

    /* Methods */
    public void logIn(String email, String pwd) {
        $(inputEmail).setValue(email);
        $(inputPassword).setValue(pwd);
        $(loginBtn).click();
    }

}
