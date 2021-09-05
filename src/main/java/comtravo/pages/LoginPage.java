package comtravo.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * LoginPage
 * Class implements the methods and fields of the Login page.
 */

public class LoginPage {

    /* Elements */
    public static final By inputEmail = By.xpath("//body/app-root[1]/ctr-onboarding[1]/div[1]/ctr-auth-login[1]/form[1]/label[1]/div[1]/input[1]");
    public static final By inputPassword = By.xpath("//body/app-root[1]/ctr-onboarding[1]/div[1]/ctr-auth-login[1]/form[1]/label[2]/div[2]/input[1]");
    public static final By loginBtn = By.xpath("/html[1]/body[1]/app-root[1]/ctr-onboarding[1]/div[1]/ctr-auth-login[1]/form[1]/button[1]");

    /* Methods */
    public void signInInput(String email, String pwd) {
        $(inputEmail).setValue(email);
        $(inputPassword).setValue(pwd);
    }

    public void clickSignInBtn(){
        $(loginBtn).click();
    }
}
