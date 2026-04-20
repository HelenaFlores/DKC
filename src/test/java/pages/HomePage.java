package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    private final SelenideElement loginInButton = $("a[href='#authorization']");
    private final SelenideElement emailInput = $("[name='USER_LOGIN']");
    private final SelenideElement passwordInput = $("[name='USER_PASSWORD']");
    private final SelenideElement authButton = $("[name='Login']");

    @Step("Open registration page /automation-practice-form")
    public HomePage openPage() {
        open("/automation-practice-form");

        return this;
    }

    @Step("Click button log in")
    public HomePage clickLoginInButton() {
        loginInButton.click();

        return this;
    }

    @Step("Type email \"{value}\"")
    public HomePage setEmail(String value) {
        emailInput.setValue(value);

        return this;
    }

    @Step("Type password \"{value}\"")
    public HomePage setPassword(String value) {
        passwordInput.setValue(value);

        return this;
    }

    @Step("Click button auth")
    public HomePage clickAuthButton() {
        authButton.click();

        return this;
    }
}